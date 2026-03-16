package com.kiq.cursoJava.módulo07.data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class aula04_calculosComDataHora {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2023-05-15");
        LocalDateTime d05 = LocalDateTime.parse("2023-05-15T01:30:26");
        Instant d06 = Instant.parse("2023-05-15T01:30:26Z");
        
        LocalDate pastWeekLocalDate =  d04.minusWeeks(1);
        LocalDate nextWeekLocalDate =  d04.plusWeeks(1);
        System.out.println("Past week LocalDate: " + pastWeekLocalDate);
        System.out.println("Next week LocalDate: " + nextWeekLocalDate);
        System.out.println("--------------------------------------");
        
        LocalDateTime pastWeekLocalDateTime =  d05.minusWeeks(1);
        LocalDateTime nextWeekLocalDateTime =  d05.plusWeeks(1);
        System.out.println("Past week LocalDateTime: " + pastWeekLocalDateTime);
        System.out.println("Next week LocalDateTime: " + nextWeekLocalDateTime);
        System.out.println("--------------------------------------");
        
        Instant pastWeekInstant =  d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant =  d06.plus(7, ChronoUnit.DAYS);
        System.out.println("Past week Instant: " + pastWeekInstant);
        System.out.println("Next week Instant: " + nextWeekInstant);
    }
}
