package Javaprogrames;

class myconstructor{
	
	myconstructor(){
		System.out.println("Welcome");
	}
	myconstructor(int x){
		System.out.println(x);
	}
	myconstructor(String a){
		System.out.println(a);
	}
	myconstructor(int x,int y){
		System.out.println(x+y);
	}
	myconstructor(boolean b){
		System.out.println(b);
	}
	myconstructor(String a,String b){
		System.out.println(a+b);
	}
}
public class MyconstrauctorExp {

	public static void main(String[] args) {

		myconstructor obj1=new myconstructor();	
		
		
		
	}

}
