package inheritanace;

public class SingleLevel_InheritanceStdy {

	public static void main(String[] args)
	{
	//to call mother's property I need mother's object
		Mother m= new Mother();
	//to call child's property I need child's object
		Child c= new Child();
		m.nature();
		Mother.care();
		c.mobile();
		Child.laptop();
		c.nature();
		Child.care();
		
	}

}
