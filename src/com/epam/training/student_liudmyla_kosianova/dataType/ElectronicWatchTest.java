package com.epam.training.student_liudmyla_kosianova.dataType;

import static org.junit.jupiter.api.Assertions.*;

class ElectronicWatchTest {
    ElectronicWatch time1;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        this.time1 = new ElectronicWatch();
    }

    @org.junit.jupiter.api.Test
    void convertFromSeconds() {
        time1.convertFromSeconds(0);
        assertEquals(0, time1.getHours());
        assertEquals(0,time1.getMinutes());
        assertEquals(0, time1.getSeconds());
        time1.convertFromSeconds(3599);
        assertEquals(0, time1.getHours());
        assertEquals(59, time1.getMinutes());
        assertEquals(59, time1.getSeconds());
    }

    @org.junit.jupiter.api.Test
    void getTime() {
        time1.convertFromSeconds(0);
        assertEquals("0:00:00", time1.getTime());
        time1.convertFromSeconds(86400);

    }
}