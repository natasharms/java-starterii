/*
Ler os dados de um trabalhador com N contratos (N fornecido pelo usuário). Depois, solicitar
do usuário um mês e mostrar qual foi o salário do funcionário nesse mês.
*/

package application;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // pra leitura da variável date

        System.out.print("Enter department's name: ");
        String departmentName = sc.nextLine();
        System.out.print("Enter worker data \n");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
        // Instanciou um novo objeto do tipo Worker, os dados desse objeto são: o nome, uma instância do WorkerLevel e o baseSalary.
        // Associado a esse objeto tem outro objeto do tipo Department e o nome desse objeto é o que eu digitei e instanciei.

        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            System.out.println("Enter contract #" + (i+1)+ " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next()); // variável do tipo date
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2)); // cria uma substring e converte para integer
        int year = Integer.parseInt(monthAndYear.substring(3)); // cria uma substring e converte para integer
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName()); // COMPOSIÇÃO DE OBJETOS (worker/department)
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

        sc.close();
    }
}
