package com.mycompany.app;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import java.util.*; // Unused import
import java.io.IOException; // Unused import

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Public field without encapsulation (bad practice)
     */
    public int badPracticeField = 10;

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue("This test should fail", false); // Deliberately failing test
    }

    /**
     * Method with empty catch block (bad practice)
     */
    public void riskyMethod() {
        try {
            int x = 1 / 0; // Division by zero (potential runtime exception)
        } catch (Exception e) {
            // SonarQube will flag this empty catch block
        }
    }
}
