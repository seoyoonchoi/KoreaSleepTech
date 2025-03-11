package Tistory;

class Parent {
    void showMessage() {
        System.out.println("부모 클래스 메시지");
    }
}

class Child extends Parent {
    // 실수로 매개변수를 추가함 -> 오버라이딩이 아니라 '새로운 메서드'가 됨
    void showMessage(String message) {
        System.out.println("자식 클래스에서 받은 메시지: " + message);
    }
}

public class OverrideErrorExample {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.showMessage();  // 부모 클래스의 메시지가 출력됨 (오버라이딩되지 않음)
    }
}

