/*
 * Thread(스레드)와 예외(Exception) 그리고 Collection(컬렉션)
 * 1. Thread(스레드) Multi - Programming Multi - Tasking 다중프로그래밍
 *    - 시작점과 진행 그리고 종료점을 가지고 인련된 하나의 작업 단위(흐름)
 *    - 단일프로그래밍 = 단일스레드 (main이 하나라면 메인 또한 단일스레드)
 *    - callback 메서드 (시스템 관할에 의해 호출)
 *    - Time Sharing System(TSS) : 시분할처리 Round-Robin(RR)
 *    1) Thread 생성하는 방법 : Thread 클래스와 Runnable 인터페이스
 * 	  - 임의의 클래스를 생성한 후 Thread를 상속받는다.
 *    - run() 메서드를 오버라이딩(재정의)한다. 
 *    - main()에서 해당 클래스의 객체를 생성한 후, Thread를 호출하는 메서드(start())를 실행.
 *    
 *    2) Runnable 인터페이스를 이용하는 방법
 *    - 임의의 클래스를 생성한 후 Runnable를 상속받아 구현.
 *    - run() 메서드를 오버라이딩 한다.
 *    - Runnable은 start() 메서드를 가지고 있지 않아 임의의 Thread 객체를 생성한 후 매개변수로
 *      Runnable 객체를 담아 start() 실행한다.
 *      
 * 2. Multi-Thread(멀티스레드) : 동기화
 *    종속, 독립(안드로이드 앱-백그라운드)
 *    
 */

class A extends Thread{
	public void run(){ // main()메서드와 같은 역할 수행
		System.out.println("AAA");
	}
}
class B extends Object implements Runnable{
	public void run(){
		System.out.println("BBB");
	}
}
public class Exam_01 {
	public static void main(String[] ar){
		A ap=new A();
		B bp=new B();
		
		ap.run(); // 메서드 호출
		ap.start();//Thread 호출
		new Thread(bp).start();
		
		for(int i=1;i<101;i++){
			System.out.print(i);
			if(i%10==0) System.out.println();
			else System.out.print("\t");
		}
		
	}
}
