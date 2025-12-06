package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VacationCalcServiceTest {

    @Test
    public void shouldCalcMax() {

        VacationCalcService service = new VacationCalcService();

        int expected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcMin() {

        VacationCalcService service = new VacationCalcService();

        int expected = 3;
        int actual = service.calculate(10_000, 3_000, 20_000);

        Assertions.assertEquals(expected, actual);
    }
}