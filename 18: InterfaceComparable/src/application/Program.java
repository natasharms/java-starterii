package application;

import entities.Employee;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        // LISTA TXT
            /*
        List<String> list = new ArrayList<>();
        String path = "/home/natasha-carmo/Doc/lista";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String name = br.readLine();

            while (name != null) {
                list.add(name);
                name = br.readLine();
            }

            Collections.sort(list); // ordena a lista

            for (String s : list) {
                System.out.println(s);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        */

        // LISTA CSV
        List<Employee> list = new ArrayList<>();
        String path = "/home/natasha-carmo/Doc/lista";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String employeeCsv = br.readLine();

            while (employeeCsv != null) {
                String[] fields = employeeCsv.split(",");
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                employeeCsv = br.readLine();
            }

            Collections.sort(list); // employee precisa implementar a interface comparable e o método compareTo

            for (Employee emp : list) {
                System.out.println(emp.getName() + ", " + emp.getSalary());
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}