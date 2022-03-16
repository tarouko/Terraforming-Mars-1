package defolt;

public class Map {
	 static int temprature = -30;
	 static int oceansOnMap;
	 static int oxygenOnMap;

	public void putOcean(String name) {
		
		System.out.println(name+"は海を置いた！");
	}
	public void raiseTemprature() {
		Map.temprature+=2;
		
		System.out.println("気温が2℃上昇して"+Map.temprature+"℃になりました。");
	}
	
	
	public static void main(String[] args) {
		
	}
}
