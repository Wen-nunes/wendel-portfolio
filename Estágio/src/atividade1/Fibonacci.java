package atividade1;

import java.util.Scanner;

public class Fibonacci {
		
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);

	  System.out.print("Digite um número: ");
	  int n = sc.nextInt();

	  if (isFibonacci(n)) {
		  
		   System.out.println("O número " + n + " faz parte da sequência de Fibonacci.");
		   
	  } else {
		   System.out.println("O número " + n + " não faz parte da sequência de Fibonacci.");
	  }

	  sc.close();
	}
	public static boolean isFibonacci(int n) {
		if (n < 0) {
		return false; 
		}

		int a = 0, b = 1;

		while (a <= n) {
			
			if (a == n) {
				
				return true;
		    }
			
		    int next = a + b;
		    a = b;
		    b = next;
		    
		    }return false;
		    
		 }

}
