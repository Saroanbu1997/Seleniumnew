package demo1;


public class Recurssuion {
	
	void rec() {
		System.out.println("print rec");
		rec();
	}

	public static void main(String[] args) {
		Recurssuion ob= new Recurssuion();
		ob.rec();
	}

}
