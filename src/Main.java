import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, x1, x2, delta;
		System.out.println("---- BHASKARA ----");
		
		System.out.print("Informe 'a', 'b' e 'c' (separados por espaço) e tecle enter: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		delta = Math.pow(b, 2.0) - 4*a*c;
		
		x1 = (-b + Math.sqrt(delta)) / (2*a);
		x2 = (-b - Math.sqrt(delta)) / (2*a);
		
		System.out.println("Valor de delta é: " + delta);
		System.out.println("Valor de x1 é: " + x1);
		System.out.println("Valor de x2 é: " + x2);
		
		sc.close();

	}

}
