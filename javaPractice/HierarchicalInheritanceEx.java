package javaPractice;

class A5
{
	void display ()
	{
		System.out.println("Hellow");
	}
}

class A6 extends A5
{
	void message()
	{
		System.out.println("hi");
	}
}
class A7 extends A5
{
	void shape() 
	{
		System.out.println("hey");
	}
}

public class HierarchicalInheritanceEx {
 
	public static void main(String[] args) {

		A7 obj =new A7();
		obj.shape();
		obj.display();
		
		A6 obj1 =new A6();
		obj1.message();
	}

}
