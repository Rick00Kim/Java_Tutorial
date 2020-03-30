package java_basic;
class A{
	public String x(){
		return "x";
	}
}
class B extends A{
	public String x(){
		return "B-x";
	}
	public String y(){
		return "y";
	}
}
class B2 extends A{
	public String x(){
		return "B2-x";
	}
}
public class Polymorphism {
	public static void main(String[] ar){
		A obj =new B();
		A obj2 =new B2();
		System.out.println(obj.x());
		System.out.println(obj2.x());
	}
}