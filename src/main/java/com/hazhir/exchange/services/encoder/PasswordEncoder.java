package com.hazhir.exchange.services.encoder;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class PasswordEncoder implements PasswordEncoderInterface
{
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public PasswordEncoder(BCryptPasswordEncoder bCryptPasswordEncoder)
    {
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @Override
    public String encode(String stringToBeEncoded)
    {
        return this.bCryptPasswordEncoder.encode(stringToBeEncoded);
    }
}
