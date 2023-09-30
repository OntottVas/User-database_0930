package hu.progmatic.userdatabase_0930.service;

import hu.progmatic.userdatabase_0930.model.ToDo;
import hu.progmatic.userdatabase_0930.model.User;
import hu.progmatic.userdatabase_0930.repository.ToDoRepository;
import hu.progmatic.userdatabase_0930.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    private final ToDoRepository toDoRepository;

    public UserService(UserRepository userRepository, ToDoRepository toDoRepository) {
        this.userRepository = userRepository;
        this.toDoRepository = toDoRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public List<ToDo> getAllToDos() {
        return toDoRepository.findAll();
    }


    public Optional<ToDo> getToDoByUserId(Long id) {
        return toDoRepository.findById(id);
    }
}
