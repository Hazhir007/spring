package com.hazhir.exchange.services.greet;

import org.springframework.stereotype.Component;

@Component
public interface GreetingServiceInterface
{
    String greet(String name);
}
