package com.kiq.cursoJava.módulo07.data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class aula03_convertendoDataHoraGlobal {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.parse("2016-12-08");
        LocalDateTime d02 = LocalDateTime.parse("2016-12-08T20:07:30");
        Instant i01 = Instant.parse("2016-12-08T01:07:30Z");
        
        LocalDate r1 = LocalDate.ofInstant(i01, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(i01, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(i01, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(i01, ZoneId.of("Europe/Moscow"));
        System.out.println("r1: " + r1);
        System.out.println("r2: " + r2);
        System.out.println("r3: " + r3);
        System.out.println("r4: " + r4);
        
        System.out.println("---------------------------------------");
        System.out.println("d01 dia: " + d01.getDayOfMonth());
        System.out.println("d01 mês: " + d01.getMonthValue());
        System.out.println("d01 ano: " + d01.getYear());
        System.out.println("---------------------------------------");
        System.out.println("d02 hora: " + d02.getHour());
        System.out.println("d02 minuto: " + d02.getMinute());
        System.out.println("d02 segundo: " + d02.getSecond());
    }
}
