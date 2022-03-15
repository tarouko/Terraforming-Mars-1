package defolt;

public class Main {
	
	public static void main(String[] args) {
		//mapインスタンスを生成
		
		Player shunta = new Player();
		
		shunta.TR = 20;
		shunta.board.MC = 42;
		shunta.board.MCPro = 0;
		shunta.board.plants = 0;
		shunta.board.plantsPro = 0;

		
		
		shunta.standerdRaiseTemprature();
		shunta.standerdRaiseTemprature();
		shunta.standerdRaiseTemprature();
		shunta.standerdRaiseTemprature();
		//
	}
	
	

}
