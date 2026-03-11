package javaPractice;


class A1 // parent class 
{
	void display()
	{
		System.out.println("HI");
	}
}

class A2 extends A1 // child class
{
	void test()
	{
		System.out.println("Bharath");
	}
}
	
public class InheritanceEx1 {
	public static void main(String[] args) {
		A2 obj=new A2();
		
		obj.display();
		obj.test();
		

	}

}
