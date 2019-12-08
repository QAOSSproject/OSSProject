package Javaprogrames;

class myclass{//this is class
	
	protected  void m1(){//method1
		System.out.println("Welcome to Automation World");
	}
	void m2(){//method2
		int x=10, y=20;
		System.out.println(x+y);
	}	
}
class myclass2{
	void m3(){
		System.out.println("Automation Testing");
	}
	void m4(){
		System.out.println("Selenium With Java");
	}
}
public class demo3 {

	public static void main(String[] args) {
		myclass obj=new myclass();//create object
		myclass2 obj2=new myclass2();
		obj.m1();//calling method1
		obj.m2();//method method2
		obj2.m3();
		obj2.m4();
		
		
		
	}

}
