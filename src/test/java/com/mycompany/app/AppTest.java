package com.mycompany.app;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import java.util.Date; // Unused import
import java.util.logging.Logger; // Logger but not used

/**
 * Unit test for simple App.
 */
public class AppTest {
    // Hardcoded password (Security issue - SonarQube will flag it)
    private static final String PASSWORD = "12345"; 
    
    // Magic number (bad practice)
    private int timeout = 3000; 
    
    // Dead code (unused method)
    private void unusedMethod() {
        System.out.println("This method is never used"); // SonarQube will flag it
    }

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue("This test should pass", true); // Build will pass
    }

    /**
     * Method with commented-out code (SonarQube will flag it)
     */
    public void commentedOutCodeExample() {
        // System.out.println("This should be removed");
    }

    /**
     * Use of deprecated API (Sonar will flag it)
     */
    public void deprecatedAPIExample() {
        Date date = new Date(2020, 1, 1); // Date(int, int, int) is deprecated
        System.out.println(date);
    }
}
