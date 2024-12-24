package com.Registration.demo.controller;


import com.Registration.demo.entity.Registration;
import com.Registration.demo.service.RegistrationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/registration")

public class RegistrationController {

    private RegistrationService registrationService;

    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    //http://localhost:8080/api/v1/registration

 @PostMapping

    public String addRegistration(@RequestBody Registration registration){

        registrationService.createRegistration(registration);

        return  "done";

 }

 }
