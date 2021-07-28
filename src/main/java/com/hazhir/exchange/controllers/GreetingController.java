package com.hazhir.exchange.controllers;

import com.fasterxml.jackson.databind.deser.BasicDeserializerFactory;
import com.hazhir.exchange.learn.SingletonPattern;
import com.hazhir.exchange.services.greet.GreetingServiceInterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * This is a simple controller
 *
 * @author Hazhir Ahmadzadeh
 * @see org.springframework.web.bind.annotation.RestController
 */
@RestController
public class GreetingController
{
    private final GreetingServiceInterface greetingService;

    /**
     * @param greetingService injecting GreetingService
     */
    public GreetingController(GreetingServiceInterface greetingService)
    {
        this.greetingService = greetingService;
    }

    /**
     * @param name it accepts a string as name
     * @return String
     */
    @GetMapping("/greet")
    public String greet(@RequestParam(value = "name", defaultValue = "World") String name)
    {
//        SingletonPattern instance = SingletonPattern.getInstance();
//        return instance.name;

        return this.greetingService.greet(name);
    }
}
