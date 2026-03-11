package javaPractice;
class shape
{
	void display()
	{
		System.out.println("iam displaying diagrams");
	
	}
}

class rectangle extends shape
{
	void test() {
		System.out.println("i have 4 sides");
	}
}
class Diagnoal extends rectangle
{
	
void message ()
{
	System.out.println("i bisect a rectangle");
}
{
	
}

public class InheritanceExample {

	public static void main(String[] args) {
  
		Diagnoal obj=new Diagnoal(); // always create a object of child class 
		obj.display();
		obj.test();
		obj.message();
	}

}
}
