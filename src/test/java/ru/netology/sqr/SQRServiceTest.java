package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @Test
    void shouldFindSqrInRange100() {
        SQRService sqrService = new SQRService();
        int expected = 3;
        int actual = sqrService.sqrInRange(200, 300);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindSqrInRange400() {
        SQRService sqrService = new SQRService();
        int expected = 9;
        int actual = sqrService.sqrInRange(300, 700);
        assertEquals(expected, actual);
    }
}