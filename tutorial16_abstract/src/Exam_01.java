class A{
	public String toString(){
		return "AAA";
	}
}
class B{
	public String toString(){
		return"BBB";
	}
}
public class Exam_01 {
	public static void main(String[] ar){
		A ap=new A();
		B bp=new B();
		
		System.out.println(ap);
		System.out.println(bp);
		
		//���������� ǥ�� -  �θ�ü�� ���� �ڽİ�ü�� ��´�.
//		Object obj1=new A();
//		Object obj2=new B();
		
		Object[] obj=new Object[2];
		obj[0]=new A();
		obj[1]=new B();
		for(int i=0;i<obj.length;i++){
			System.out.println("obj["+i+"] : "+obj[i]);
		}
		
	}
}
