package com.hazhir.exchange.services.greet;


import org.springframework.stereotype.Component;

@Component
public class GreetingService implements GreetingServiceInterface
{
    private String name;

    public String getName()
    {
        return name;
    }

    public String greet(String name)
    {
        this.name = name;
        return "Hello " + this.getName();
    }
}
