package org.arquillian.wildfly.example;

import java.io.PrintStream;

public class Greeter {

    public void greet(PrintStream to, String name) {
        to.println(createGreeting(name));
    }

    public String createGreeting(String name) {
        return "Hello, " + name + "!";
    }
}