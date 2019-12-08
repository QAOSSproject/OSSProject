package Javaprogrames;

class myclass01{//supper class
	void m1(){
		System.out.println("Manual Testing");
	}		
}
class myclass02 extends myclass01{//supper class
	void m2(){
		System.out.println("Automation Testing");
	}
}
class myclass03 extends myclass02{//sub class=j
	void m3(){
		System.out.println("Webdriver with Java");
	}
}
public class ExampInheritance {
	public static void main(String[] args) {
		myclass03 obj=new myclass03();
		obj.m1();
		obj.m2();
		obj.m3();
		
		
		
		
		
		
		
		
	}

}
