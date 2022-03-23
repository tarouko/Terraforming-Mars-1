package defolt;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Player shunta = new Player();
		Player satoshi = new Player();
		
		shunta.name = "しゅんた";
		satoshi.name = "さとし";
		

		
		
		shunta.standerdRaiseTemprature();
		satoshi.standerdRaiseEnergy();
		satoshi.standerdRaiseTemprature();
		
		
		System.out.println("行いたいアクションを入力してください");
		Scanner sc =new Scanner(System.in);
		int action =sc.nextInt();
		sc.close();
		if(action == 1) {
			shunta.standerdPutOcean();
		}
		
		//
	}
	
	

}
