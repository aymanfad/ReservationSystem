package com.exemple.reservationsystem.controller;

import com.exemple.reservationsystem.entities.User;
import com.exemple.reservationsystem.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class UserController {
    private UserRepository userRepository;

    @GetMapping("/index")
    public String user(Model model){
        List<User> users = userRepository.findAll();
        model.addAttribute("listUsers",users);
        return "users";
    }
}
