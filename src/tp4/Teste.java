package tp4;

import java.util.Scanner;

public class Teste {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		double somme=0;
		System.out.println("Conversion de Dollar vers Dollar:");
		System.out.println("Donner la somme en Dollar:");
		somme = sc.nextDouble();
		Devise devise = new Dollars(somme);
		System.out.println("Conversion de Dollar vers Dollar:");
		System.out.println(devise);
		devise = new Dollars(devise);
		System.out.println(devise);
		System.out.println("Conversion de Dollar vers Euro:");
		System.out.println(devise);
		devise = new Euros(devise);
		System.out.println(devise);
		System.out.println("Conversion d'Euro vers dollar:");
		System.out.println(devise);
		devise = new Dollars(devise);
		System.out.println(devise);
		System.out.println("Conversion de dollar vers livre:");
		System.out.println(devise);
		devise = new Livres(devise);
		System.out.println(devise);
		
		
		System.out.println("Conversion d'Euro vers Dollar:");
		System.out.println("Donner la somme en Euro:");
		somme = sc.nextDouble();
		devise = new Euros(somme);
		System.out.println("Conversion de Euro vers Euro:");
		System.out.println(devise);
		devise = new Euros(devise);
		System.out.println(devise);
		System.out.println("Conversion de Euro vers Dollar:");
		System.out.println(devise);
		devise = new Dollars(devise);
		System.out.println(devise);
		devise = new Euros(devise);
		
		System.out.println("Conversion d'Euro vers livre:");
		System.out.println(devise);
		devise = new Livres(devise);
		System.out.println(devise);
		
	}
}
