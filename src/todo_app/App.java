package todo_app;

import todo_app.controller.ToDoListController;
import todo_app.controller.UserController;
import todo_app.dto.request.ToDoListRegisterRequestDto;
import todo_app.dto.request.UserSignUpRequestDto;
import todo_app.dto.response.ToDoListResponseDto;
import todo_app.dto.response.UserResponseDto;

import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserController userController = new UserController();
        ToDoListController toDoListController = new ToDoListController();

        String loginUserId = null; // 로그인한 사용자 ID (userId)
        String nickname = null; // 로그인한 사용자 닉네임 (반환 값)

        // UserController 서비스 연결
        userController.registerUser(); // 생성자에서 서비스 연결

        while (true) {
            if (loginUserId == null) {
                System.out.println("\n===== TODO APP =====");
                System.out.println("1. 회원가입");
                System.out.println("2. 로그인");
                System.out.println("3. 종료");
                System.out.print("메뉴를 선택하세요: ");
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1 -> {
                        System.out.println("\n===== 회원가입 =====");
                        System.out.print("아이디: ");
                        String userId = scanner.nextLine();
                        System.out.print("비밀번호: ");
                        String password = scanner.nextLine();
                        System.out.print("비밀번호 확인: ");
                        String passwordCheck = scanner.nextLine();
                        System.out.print("이름: ");
                        String username = scanner.nextLine();
                        System.out.print("닉네임: ");
                        String nicknameInput = scanner.nextLine();
                        System.out.print("이메일: ");
                        String email = scanner.nextLine();
                        System.out.print("전화번호: ");
                        String phone = scanner.nextLine();

                        UserSignUpRequestDto dto = new UserSignUpRequestDto(
                                userId, password, passwordCheck, username, nicknameInput, email, phone
                        );
                        userController.service.registerUser(dto);
                        System.out.println("회원가입이 완료되었습니다.");
                    }
                    case 2 -> {
                        System.out.println("\n===== 로그인 =====");
                        System.out.print("아이디: ");
                        String userId = scanner.nextLine();
                        System.out.print("비밀번호: ");
                        String password = scanner.nextLine();
                        UserResponseDto user = userController.getUsernumid(userId, password);
                        if (user != null) {
                            loginUserId = userId;
                            nickname = user.getNickname();
                            System.out.println("로그인 성공! 환영합니다, " + nickname + "님!");
                        } else {
                            System.out.println("로그인 실패! 아이디 또는 비밀번호를 확인하세요.");
                        }
                    }
                    case 3 -> {
                        System.out.println("프로그램을 종료합니다.");
                        System.exit(0);
                    }
                    default -> System.out.println("잘못된 선택입니다.");
                }
            } else {
                System.out.println("\n===== 할 일 관리 =====");
                System.out.println("1. 할 일 추가");
                System.out.println("2. 나의 할 일 목록 조회");
                System.out.println("3. 할 일 타입별 조회");
                System.out.println("4. 할 일 삭제");
                System.out.println("5. 로그아웃");
                System.out.print("메뉴를 선택하세요: ");
                int taskChoice = Integer.parseInt(scanner.nextLine());

                switch (taskChoice) {
                    case 1 -> {
                        System.out.println("\n===== 할 일 추가 =====");
                        System.out.print("할 일 타입 (예: 운동/독서/업무): ");
                        String typeOfList = scanner.nextLine();
                        System.out.print("마감일 (예: 2024-12-31): ");
                        String dueDate = scanner.nextLine();
                        System.out.print("할 일 내용: ");
                        String context = scanner.nextLine();

                        ToDoListRegisterRequestDto dto = new ToDoListRegisterRequestDto(
                                loginUserId, typeOfList, dueDate, context
                        );
                        toDoListController.createTask(dto);
                        System.out.println("할 일이 추가되었습니다!");
                    }
                    case 2 -> {
                        System.out.println("\n===== 나의 할 일 목록 =====");
                        List<ToDoListResponseDto> tasks = toDoListController.myTask(loginUserId);
                        if (tasks.isEmpty()) {
                            System.out.println("등록된 할 일이 없습니다.");
                        } else {
                            for (ToDoListResponseDto task : tasks) {
                                System.out.println("[" + task.getTypeOfList() + "] " + task.getContext() + " (마감일: " + task.getDueDate() + ")");
                            }
                        }
                    }
                    case 3 -> {
                        System.out.println("\n===== 타입별 할 일 조회 =====");
                        System.out.print("조회할 할 일 타입(운동/독서/업무): ");
                        String type = scanner.nextLine();
                        List<ToDoListResponseDto> tasks = toDoListController.myTaskTypes(loginUserId, type);
                        if (tasks.isEmpty()) {
                            System.out.println("해당 타입의 할 일이 없습니다.");
                        } else {
                            for (ToDoListResponseDto task : tasks) {
                                System.out.println("[" + task.getTypeOfList() + "] " + task.getContext() + " (마감일: " + task.getDueDate() + ")");
                            }
                        }
                    }
                    case 4 -> {
                        System.out.println("\n===== 할 일 삭제 =====");
                        System.out.print("삭제할 할 일 번호 (ID): ");
                        long id = Long.parseLong(scanner.nextLine());
                        toDoListController.deletetask(id);
                        System.out.println("할 일이 삭제되었습니다!");
                    }
                    case 5 -> {
                        loginUserId = null;
                        nickname = null;
                        System.out.println("로그아웃되었습니다.");
                    }
                    default -> System.out.println("잘못된 선택입니다.");
                }
            }
        }
    }
}