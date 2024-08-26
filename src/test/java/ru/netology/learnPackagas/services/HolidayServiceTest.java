package ru.netology.learnPackagas.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class HolidayServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/holiday.csv")
    public void test(int expected, int income, int expenses, int threshold) {
        HolidayService service = new HolidayService();

        // вызываем целевой метод:
        int actual = service.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

}
