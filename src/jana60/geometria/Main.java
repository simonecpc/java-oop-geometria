package jana60.geometria;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int b;
		System.out.println("Inserire base:");
		b = scan.nextInt();
		int h;
		System.out.println("Inserire altezza:");
		h = scan.nextInt();
		Rettangolo r = new Rettangolo();
		r.base = b;
		r.altezza = h;
		
		System.out.println("Perimetro = " + r.perimetro());
		System.out.println("Area = " + r.area());
		
	}
	
}
