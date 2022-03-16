package defolt;

public class Player {
	//ここにフィールドを宣言
	String name;
	int TR = 20;
	Map map=new Map();
	Board board = new Board();
	
	
	public void standerdRaiseTemprature(){
		if(board.MC<14) {
			System.out.println("お金が足りないよ！！");
			return;
		}
		board.MC-=14;//お金を払って
		System.out.println(this.name+"のMCが14減って"+board.MC+"MCになりました。");
		map.raiseTemprature();//気温を上げた
		this.TR+=1;//TRも上がった
		System.out.println(this.name+"のTRが1上昇して"+this.TR+"になりました。");
		System.out.println("");
	}
	public void standerdPutOcean(){
		if(board.MC<18) {
			System.out.println("お金が足りないよ！！");
			return;
		}
		board.MC-=18;//お金を払って
		System.out.println(this.name+"のMCが18減って"+board.MC+"MCになりました。");
		map.putOcean(this.name);//気温を上げた
		this.TR+=1;//TRも上がった
		System.out.println(this.name+"のTRが1上昇して"+this.TR+"になりました。");
		System.out.println("");
	}
	public void standerdRaiseEnergy(){
		if(board.MC<11) {
			System.out.println("お金が足りないよ！！");
			return;
		}
		board.MC-=11;//お金を払って
		System.out.println(this.name+"のMCが11減って"+board.MC+"MCになりました。");
		board.energy += 1;//気温を上げた
		this.TR+=1;//TRも上がった
		System.out.println(this.name+"の電力産出が1上昇して"+board.energy+"になりました。");
		System.out.println("");
	}
}
