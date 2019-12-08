package Javaprogrames;
class myclassv{
	void m1(){
	System.out.println("Welcome");
	}
   void m1(String x){
    System.out.println(x);
	}
   void m1(int a){
	System.out.println(a);
   }
   void m1(String x,String y){
	System.out.println(x+y);
   }
   void m1(int a,int b){
	System.out.println(a*b);
  }
  void m1(char r){
	System.out.println(r);
  }	
}
public class ExampMethodoverloading {
	public static void main(String[] args) {
		myclassv obj=new myclassv();
		obj.m1();
		obj.m1("Selenium");
		obj.m1(100);
		obj.m1("Selenium","Testing");
		obj.m1(100, 200);
		obj.m1('a');
		
		
		
		
	}

}
