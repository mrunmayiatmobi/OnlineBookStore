package com.example.onlinebookstore.controller;

import com.example.onlinebookstore.service.RegisterationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @Autowired
    RegisterationService registerationService;

}
