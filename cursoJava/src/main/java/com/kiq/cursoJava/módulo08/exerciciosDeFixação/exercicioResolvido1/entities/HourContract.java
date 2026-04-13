package com.kiq.cursoJava.módulo08.exerciciosDeFixação.exercicioResolvido1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor // gera um construtor vazio
@AllArgsConstructor // gera um construtor com todos os atributos declarados
public class HourContract {
    private Date date;
    private Double valuePerHour;
    private Integer hours;
    
    public Double totalValue() {
        return valuePerHour * hours;
    }
}
