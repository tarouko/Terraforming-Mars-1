package defolt;

public class Player {
	//ここにフィールドを宣言
	String name;
	int TR;
	Map map=new Map();
	Board board = new Board();
	
	
	public void standerdRaiseTemprature(){
		if(board.MC<14) {
			System.out.println("お金が足りないよ！！");
			return;
		}
		board.MC-=14;//お金を払って
		System.out.println("MCが14減って"+board.MC+"MCになりました。");
		map.raiseTemprature();//気温を上げた
		this.TR+=1;//TRも上がった
		System.out.println("TRが1上昇して"+this.TR+"になりました。");
		System.out.println("");
	}
}
