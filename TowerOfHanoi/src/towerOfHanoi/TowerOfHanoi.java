package towerOfHanoi;

public class TowerOfHanoi {
	

	
	public void flyttDisker(int topN, char fra, char inter, char til) {
		if (topN == 1)
			print("Disk 1 fra " + fra + " til " + til);
	    
		else {
			flyttDisker(topN - 1, fra, til, inter);
			print("Disk " + topN + " fra " + fra + " til " + til);
			flyttDisker(topN - 1, inter, fra, til);
		}
	}
	
	public void print(String s){
		System.out.println(s);		
	}
	
	public static void main(String[] args) {
		TowerOfHanoi tower = new TowerOfHanoi();
		int nDisks = 3;
		tower.flyttDisker(nDisks, 'A', 'B', 'C');
	}
}
