package defolt;

public class Main {
	
	public static void main(String[] args) {
		//mapインスタンスを生成
		Map map = new Map();
		map.temprature = -30;
		map.oceansOnMap = 0;
		map.oxygenOnMap = 0;
		
		Player shunta = new Player();
		shunta.board.MC = 42;
		
		shunta.standerdRaiseTemprature();
		//
	}
	
	

}
