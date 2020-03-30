package collection.first;
/* 
 * Vector 클래스 예제
 * add() : 추가, get(index) : 추출, size() : 크기
 */
import java.util.Vector;
public class Exam_01_Vector {
	public static void main(String[] ar){
		Vector v1= new Vector();
		Vector<Integer> v2=new Vector<Integer>(); //제네릭
		int sum=0;
		//v1 객체에 자료 추가
		v1.add(new Integer(8));
		v1.add("장보고");
		v1.add(7);
		v1.add(3.14);
		
		
		int x=(int)v1.get(2);
		System.out.println("v1 객체의 2번째 : "+x);
		System.out.println(v1.size());
		String y=(String)v1.get(1);
		System.out.println(y);
		//v2객체에 자료추가
		v2.add(4);
		v2.add(9);
		v2.add(-10);
		System.out.println("v2의 크기 : "+v2.size());
		System.out.println("v2의 용량 : "+v2.capacity());
		
		//벡터 중간에 데이터 타입
		v2.add(2,300);
		pt(v2);
		//v2객체의 모든 요소를 더하여 그 결과를 출력하는 로직을 구현하시오.
		for(int i=0;i<v2.size();i++)
			sum+=v2.get(i);
		System.out.println(sum);
	}
	public static void pt(Vector vv){
		for(int i=0;i<vv.size();i++)
			System.out.println(vv.get(i));
	}
}
