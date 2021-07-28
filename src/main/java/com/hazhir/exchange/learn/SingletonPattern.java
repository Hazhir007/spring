package com.hazhir.exchange.learn;

import org.springframework.stereotype.Component;

@Component
public class SingletonPattern
{
    private static SingletonPattern instance;

    public String name = "no name";

    private SingletonPattern(){}

    public static SingletonPattern getInstance()
    {
        if (instance != null) {
            return instance;
        }

        return instance = new SingletonPattern();
    }
}


