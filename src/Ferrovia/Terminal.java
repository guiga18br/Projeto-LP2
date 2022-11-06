package Ferrovia;

import java.util.Scanner;
import java.util.Stack;

public class Terminal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locomotiva l1 = new Locomotiva('1');
		Locomotiva l2 = new Locomotiva('2');
		Stack<Object> viaFerreaMin = new Stack<>();
		Stack<Object> viaFerreaGra = new Stack<>();
		viaFerreaMin.add(l1);
		viaFerreaGra.add(l2);

		for (int i =0; i<=13; i++) {
			
			System.out.println("Informe o endereco do Vagao: ");
			char ende = sc.next().charAt(0);
			
			System.out.println("Informe para qual locomotiva o vagao ir�: [1] Min�rios [2]Gr�os ");
			int loc = sc.nextInt();
			
			System.out.println("Informe o peso do vagao: ");
			double peso = sc.nextDouble();
			
			System.out.println("Qual commoditie o vagao esta levando? ");
			String cm = sc.next();
			
			Vagao vagao = new Vagao(ende, loc, peso, cm);
			
			if(loc == 1) {
				viaFerreaMin.add(vagao);
			}else if (loc == 2){
				viaFerreaGra.add(vagao);
			}
		
		}

	}	
	
}
