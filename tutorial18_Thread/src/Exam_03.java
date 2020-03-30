/*
 * Thread의 동기화
 * 동기화를 시킬때와 시키지 않을 때 비교
 */
class Wash{
	public synchronized void door(String name){
		
		System.out.println(name +" 입장");
		for(int i=1;i<=10000;i++){
			if(i==1000){
				System.out.println(name+"는 볼일중...");
			}
		}
		System.out.println("시원하군!!!");
	}
}
class Family extends Thread{
	private Wash ws;
	private String name;
	public Family(String name,Wash ws){
		this.name=name;
		this.ws=ws;
	}
	public void run(){
		ws.door(name);
	}
}
public class Exam_03 {
	public static void main(String[] ar){
		Wash ws=new Wash();
		Family father = new Family("Father",ws);
		Family mother= new Family("Mother",ws);
		Family brother= new Family("Bro",ws);
		Family sister= new Family("Sis",ws);
		father.start();
		mother.start();
		brother.start();
		sister.start();
		
	}
}
