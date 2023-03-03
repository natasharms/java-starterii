package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;
import util.UpperCaseName;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		// Implementação da interface
		/*
		List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		// a operação map vai mapear minha lista e aplicar a função dada como parâmetro  em cada elemento, mas ela só funciona pra stream, não funciona pra List. Por isso converteu com o list.stream e depois converteu pra lista outra vez com o toList
		*/
		// Reference method com método estático
		/*
		List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
		*/
		// Reference method com método não estático
		/*
		List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
		*/
		// Expressão lambda declarada
		/*
		Function<Product, String> func = p -> p.getName().toUpperCase();
		List<String> names = list.stream().map(func).collect(Collectors.toList());
		*/
		// Expressão lambda inline

		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		
		names.forEach(System.out::println);
	}
}
