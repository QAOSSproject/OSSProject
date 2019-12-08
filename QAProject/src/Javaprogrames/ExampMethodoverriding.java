package Javaprogrames;

class mysubj{
	void m1(){
		System.out.println("Manual Testing");
	}
}
class mysubj2 extends mysubj{
	void m1(){
		System.out.println("Automation Testing");
	}
}
class mysubj3 extends mysubj2{
	void m1(){
		System.out.println("Webdrive java");
	}
}
public class ExampMethodoverriding {

	public static void main(String[] args) {
		mysubj3 obj=new mysubj3();
		obj.m1();
	}

}
