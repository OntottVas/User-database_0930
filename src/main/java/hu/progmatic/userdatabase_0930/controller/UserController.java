package hu.progmatic.userdatabase_0930.controller;

import hu.progmatic.userdatabase_0930.model.User;
import hu.progmatic.userdatabase_0930.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public String getUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "users";
    }

    @GetMapping("/todo/{id}")
    public String getToDos(Model model, @PathVariable("id") Long id) {
        model.addAttribute("todos", userService.getToDoByUserId(id));
        return "todo";
    }

}
