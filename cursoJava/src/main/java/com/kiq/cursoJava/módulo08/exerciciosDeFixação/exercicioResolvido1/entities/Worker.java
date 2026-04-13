package com.kiq.cursoJava.módulo08.exerciciosDeFixação.exercicioResolvido1.entities;

import com.kiq.cursoJava.módulo08.exerciciosDeFixação.exercicioResolvido1.enums.WorkerLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Worker {
    // Atributos básicos
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    // Composição/associação
    private Department department;
    // Quando temos uma composição no estilo "TEM-MUITAS" não incluimos no construtor, simplesmente iniciamos a lista vazia por exemplo
    private List<HourContract> contracts = new ArrayList<>();

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public void addContract(HourContract contract) {
        contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }

    public Double income(int year, int month) {
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for (HourContract contract : contracts) {
            cal.setTime(contract.getDate());
            int contract_year = cal.get(Calendar.YEAR);
            int contract_month = 1 + cal.get(Calendar.MONTH);
            if (year == contract_year && month == contract_month) {
                sum += contract.totalValue();
            }
        }
        return sum;
    }
}
