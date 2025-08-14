package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();

		Product product = new Product(name, price);

		System.out.println();
		System.out.println("PRODUCT DATA: " + product);
		System.out.println();

		product.setName("Computador");
		System.out.println("Updated name: " + product.getName());
		product.setPrice(1200);
		System.out.println("Updated price: " + product.getPrice());

		System.out.println();
		System.out.println("PRODUCT DATA: " + product);

		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);

		System.out.println();
		System.out.println("UPDATED PRODUCT DATA: " + product);

		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);

		System.out.println();
		System.out.println("UPDATED PRODUCT DATA: " + product);

		sc.close();
	}
}
