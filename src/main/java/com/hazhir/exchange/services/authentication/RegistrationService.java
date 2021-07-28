package com.hazhir.exchange.services.authentication;

import com.hazhir.exchange.entities.User;
import com.hazhir.exchange.exceptions.BadRequestException;
import com.hazhir.exchange.exceptions.NotFoundException;
import com.hazhir.exchange.repositories.user.UserRepositoryInterface;
import com.hazhir.exchange.services.encoder.PasswordEncoderInterface;
import org.springframework.stereotype.Service;


@Service
public class RegistrationService
{
    private final UserRepositoryInterface userRepository;

    private final PasswordEncoderInterface passwordEncoder;

    public RegistrationService(UserRepositoryInterface userRepository, PasswordEncoderInterface passwordEncoder)
    {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public String register(String email, String password) throws Exception
    {
            User user = new User();
            user.setEmail(email);
            user.setPassword(this.passwordEncoder.encode(password));
            user.setVerificationCode();
            this.userRepository.save(user);
            return "hell yes";
    }
}
