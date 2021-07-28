package com.hazhir.exchange.controllers.authentication;

import com.hazhir.exchange.exceptions.BadRequestException;
import com.hazhir.exchange.exceptions.NotFoundException;
import com.hazhir.exchange.services.authentication.RegistrationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Registration Controller
 *
 */
@RestController
public class RegisterController
{

    private final RegistrationService registrationService;

    public RegisterController(RegistrationService registrationService)
    {
        this.registrationService = registrationService;
    }

    @PostMapping("/auth/register")
    public String register(@Valid @RequestParam String email, @Valid @RequestParam String password) throws Exception
    {
//        throw new NotFoundException("not found");
        this.registrationService.register(email, password);
        return "hell yes";
    }
}
