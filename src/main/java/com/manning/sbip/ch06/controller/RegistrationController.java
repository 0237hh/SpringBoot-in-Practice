package com.manning.sbip.ch06.controller;

import com.manning.sbip.ch06.dto.UserDto;
import com.manning.sbip.ch06.service.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

public class RegistrationController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping ("/adduser")
    public String register(Model model) {
        model.addAttribute("user", new UserDto());
        return "add-user";
    }

    @PostMapping ("/adduser")
    public String register(@Valid @ModelAttribute("user") UserDto userDto, BindingResult result) {
        if (result.hasErrors()) {return "add-user";}

        userRepository.createUser(userDto);
        return "redirect:/adduser?success";
    }
}
