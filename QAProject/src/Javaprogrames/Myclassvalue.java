package Javaprogrames;

class mycvalue{
	static int a=10;//Static
	static int b=20;//Static
	int c=30;//Non-static
		
	static void m1(){//Static method
		int d;//local
		d=a+b;
		System.out.println(d);	
	}
	void m2(){//non static method
		int e;//local
		e=b+c;
		System.out.println(e);
	}
	void m3(){//Non Static method
		int f;
		f=a+c;
		System.out.println(f);
	}
}
public class Myclassvalue {
	public static void main(String[] args) {
		mycvalue obj=new mycvalue();
		obj.m1();
		obj.m2();
		
		
		
	}

}
