package com.hazhir.exchange.entities;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Random;

/**
 * crete an immutable user to be inserted in database
 */
@Entity
public class User
{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @NotEmpty(message = "email is required")
    private String email;

    @NotEmpty(message = "password is required")
    private String password;

    private int verificationCode;

    public void setId(Integer id)
    {
        this.id = id;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setPassword(String password)
    {
        this.password =
        this.password = password;
    }

    public void setVerificationCode()
    {
        this.verificationCode = this.getRandomString();
    }

    public Integer getId()
    {
        return id;
    }

    public String getEmail()
    {
        return email;
    }

    public String getPassword()
    {
        return password;
    }

    public int getVerificationCode()
    {
        return verificationCode;
    }

    private int getRandomString()
    {
        Random verificationCode = new Random();
        return verificationCode.nextInt(999999);
    }
}
