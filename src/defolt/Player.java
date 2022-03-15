package defolt;

public class Player {
	//ここにフィールドを宣言
	String name;
	Map map=new Map();
	Board board = new Board();
	
	
	public void standerdRaiseTemprature(){
		board.MC-=14;//お金を払って
		System.out.println("MCが14減って"+board.MC+"になりました");
		map.raiseTemprature();//気温を上げた
	}
}
