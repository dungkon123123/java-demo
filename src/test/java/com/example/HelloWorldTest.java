package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloWorldTest {
    @Test
    public void testGreeting() {
        HelloWorld hw = new HelloWorld();
        assertEquals("Hello, World!", hw.getGreeting());
    }
}