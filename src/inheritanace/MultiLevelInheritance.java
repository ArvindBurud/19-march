package inheritanace;

public class MultiLevelInheritance {

	public static void main(String[] args) {
		GrandMother gd= new GrandMother(); //
		
		Mother m= new Mother();
		
		Child c= new Child();
		
		gd.reciepe();
		GrandMother.story();
		m.reciepe();
		m.story();
		m.nature();
		m.care();
		c.reciepe();
		c.story();
		c.nature();
		c.care();
		c.mobile();
		c.laptop();
		

	}

}
