package com.assignment;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class AppTest {

    @Test
    void testGreetWorld() {
        App app = new App();
        assertEquals("Hello World", app.greet("World"));
    }

    @ParameterizedTest
    @CsvSource({
            "Java, Hello Java",
            "Maven, Hello Maven",
            "JUnit, Hello JUnit"
    })
    void testGreetMultipleInputs(String input, String expected) {
        App app = new App();
        assertEquals(expected, app.greet(input));
    }
}

