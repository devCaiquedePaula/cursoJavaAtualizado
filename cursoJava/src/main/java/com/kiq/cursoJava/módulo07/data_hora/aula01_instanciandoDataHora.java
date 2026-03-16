package com.kiq.cursoJava.módulo07.data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class aula01_instanciandoDataHora {
    public static void main(String[] args) {

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        
        LocalDate dataAtual = LocalDate.now();
        System.out.println("Data atual: " + dataAtual);

        LocalDateTime dataHoraAtual = LocalDateTime.now(); // sem fuso horário, apenas data e hora local
        System.out.println("Hora atual: " + dataHoraAtual);

        Instant instanteAtual = Instant.now(); // fuso horário GMT
        System.out.println("Instante atual: " + instanteAtual);
        
        LocalDate dataParser = LocalDate.parse("2023-05-15");
        System.out.println("Data parser: " + dataParser);
        
        LocalDateTime dataHoraParser = LocalDateTime.parse("2023-05-15T10:30:00");
        System.out.println("Data hora parser: " + dataHoraParser);
        
        Instant instanteParser = Instant.parse("2023-05-15T10:30:00-03:00");
        System.out.println("Instante parser: " + instanteParser);
        
        LocalDate dataFormatada = LocalDate.parse("15/05/2023", formatter1);
        System.out.println("Data formatada: " + dataFormatada);
        
        LocalDateTime dataHoraFormatada = LocalDateTime.parse("15/05/2023 10:30:00", formatter2);
        System.out.println("Data hora formatada: " + dataHoraFormatada);
        
        LocalDate dataIsolada = LocalDate.of(2023, 5, 15);
        System.out.println("Data isolada: " + dataIsolada);
        
        LocalDateTime dataHoraIsolada = LocalDateTime.of(2023, 5, 15, 10, 30, 0);
        System.out.println("Data hora isolada: " + dataHoraIsolada);
    }
}
