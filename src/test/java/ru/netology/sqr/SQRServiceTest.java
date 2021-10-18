package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"numberOfSquares,99,3"})
    void shouldNumberOfSquares(String testName, int number, int expected) {
        SQRService service = new SQRService();

        //int number = 99;
        //int expected = 3;

        int actual = service.numberOfSquares(number);

        assertEquals(expected, actual);

    }
}