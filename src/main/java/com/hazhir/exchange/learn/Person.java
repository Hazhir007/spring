package com.hazhir.exchange.learn;

public class Person
{
    public static int MAX_AGE;
    private static double WHATEVER;
    static String defaultName;

    private static String theDefaultName()
    {
        return "no name";
    }

    static
    {
        Person.MAX_AGE = 150;
        Person.WHATEVER = 200_000;
        Person.defaultName = Person.theDefaultName();
    }


}
