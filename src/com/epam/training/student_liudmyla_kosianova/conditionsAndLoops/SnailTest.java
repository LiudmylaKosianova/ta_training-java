package com.epam.training.student_liudmyla_kosianova.conditionsAndLoops;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SnailTest {
    Snail snail1;

    @BeforeEach
    void setUp() {
        this.snail1 = new Snail();
    }

    @Test
    void setMessage() {
        snail1.setMessage(4,4,1);
        assertEquals("1", snail1.getMessage());

        snail1.setMessage(4,4,10);
        assertNotEquals("1", snail1.getMessage());
        assertEquals("Impossible", snail1.getMessage());

        snail1.setMessage(4,3,10);
        assertEquals("7", snail1.getMessage());

        snail1.setMessage(4,2,14);
        assertEquals("6", snail1.getMessage());


    }
}