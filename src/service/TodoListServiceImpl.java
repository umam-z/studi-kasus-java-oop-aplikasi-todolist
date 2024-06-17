package service;

import entity.Todolist;
import repository.TodoListRepository;

public class TodoListServiceImpl implements TodoListService {

    private TodoListRepository todoListRepository;

    public TodoListServiceImpl(TodoListRepository todoListRepository) {
        this.todoListRepository = todoListRepository;
    }

    @Override
    public void addTodoList(String todo) {
        
    }

    @Override
    public void removeTodoList(Integer number) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void showTodoList() {
        Todolist[] model = todoListRepository.getAll();
        for (int i = 0; i < model.length; i++) {
            Todolist todolist = model[i];
            int no = i + 1;

            if (todolist != null) {
                System.out.println(no +". "+ todolist.getTodo());
            }
        }
    }

}
