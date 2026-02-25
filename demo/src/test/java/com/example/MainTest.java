package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MainTest {
    @Test
    void testMainPrintsHelloWorld() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
        try {
            Main.main(new String[]{});
            String output = baos.toString().trim();
            assertEquals("Hello world!", output);
        } finally {
            System.setOut(originalOut);
        }
    }
}