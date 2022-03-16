package defolt;

public class Main {
	
	public static void main(String[] args) {
		//mapインスタンスを生成
		
		Player shunta = new Player();
		Player satoshi = new Player();
		
		shunta.name = "しゅんた";
		satoshi.name = "さとし";
		

		
		
		shunta.standerdRaiseTemprature();
		satoshi.standerdRaiseEnergy();
		shunta.standerdPutOcean();
		satoshi.standerdRaiseTemprature();
		//
	}
	
	

}
