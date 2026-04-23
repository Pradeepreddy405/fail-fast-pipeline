package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testAddition() {
        assertEquals(5, App.add(2, 3));
    }

    @Test
    void failTest() {
        assertEquals(10, App.add(2, 3)); // ❌ This will FAIL
    }
}