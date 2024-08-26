package ru.netology;

import ru.netology.learnPackagas.services.HolidayService;

public class Main {
    public static void main(String[] args) {
        HolidayService service = new HolidayService();
        System.out.println(service.calculate(10_000, 3_000, 20_000));
    }
}