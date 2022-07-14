package inheritanace;

public class Hierachical_Inheritance {

	public static void main(String[] args) {
		Father f= new Father();
		Doughter d= new Doughter();
		Son s= new Son();
		
		f.emotions();
		d.emotions();
		d.scooty();
		s.emotions();
		s.bike();

	}

}
