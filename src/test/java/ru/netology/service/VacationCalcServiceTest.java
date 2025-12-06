package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class VacationCalcServiceTest {

    @ParameterizedTest
  /*  @CsvSource({
           "2, 100000, 60000, 150000",
           "3, 10000, 3000, 20000"
    })*/
    @CsvFileSource(files="src/test/resources/vacation.csv")
    public void shouldCalcMax(int expected, int income, int expenses, int threshold) {

        VacationCalcService service = new VacationCalcService();

        //int expected = 2;
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

    /*@Test
    public void shouldCalcMin() {

        VacationCalcService service = new VacationCalcService();

        int expected = 3;
        int actual = service.calculate(10_000, 3_000, 20_000);

        Assertions.assertEquals(expected, actual);
    }*/
}