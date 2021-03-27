package test;

import java.util.List;

public class Carte {
	
	public static void main(String[] args) {
		String code ="741.379.372.";
		for(int i=1;i<=10;i++){
			int a = (int) (Math.random()*32000);
			System.out.println(code + String.format("%05d", a));
		}
		println("this is awesome println ");
		print("hello this is perfect print ha ha ha");
		
		new Carte().test();
	}
	public static void print(String str) {
		System.out.print(str);
	}
	
	public static void println(String str) {
		System.out.println(str);
	}
	
	public void test() {
		print("\nthis goes here");
	}
}
