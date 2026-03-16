package com.kiq.cursoJava.módulo07.data_hora;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class aula02_convertendoParaTexto {
    public static void main(String[] args) {
        Date data = new Date();
        System.out.println(data.toString());

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = sdf.format(data);
        System.out.println(dataFormatada);

        System.out.println("---------------------------------------"); 
        LocalDate d01 = LocalDate.parse("2016-12-08");
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(d01.format(fmt1));
        System.out.println(fmt1.format(d01));

        System.out.println("---------------------------------------");
        LocalDateTime d02 = LocalDateTime.parse("2016-12-08T20:07:30");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println(d02.format(fmt2));
        System.out.println(fmt2.format(d02));
    }
}
