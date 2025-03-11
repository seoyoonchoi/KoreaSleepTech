package todo_app.service;

import todo_app.dto.request.ToDoListRegisterRequestDto;
import todo_app.dto.request.ToDoListRequestDto;
import todo_app.dto.response.ToDoListResponseDto;

import java.util.List;

public interface ToDoListService {
    void createList(ToDoListRegisterRequestDto dto);
    List<ToDoListResponseDto> filterTaskByid(String id);
    List<ToDoListResponseDto> filterTaskByType(String id, String type);
    void deleteList(Long id);
}
