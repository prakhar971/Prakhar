package com.Registration.demo.service;

import com.Registration.demo.entity.Registration;
import com.Registration.demo.repository.RegistrationRepository;
import org.springframework.stereotype.Service;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    private RegistrationRepository registrationRepository;

    public RegistrationServiceImpl(RegistrationRepository registrationRepository) {
        this.registrationRepository = registrationRepository;
    }


    @Override
    public Registration createRegistration(Registration registration) {

        Registration savedEntity = registrationRepository.save(registration);

        return savedEntity ;

    }
}
