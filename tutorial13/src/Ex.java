import java.io.*;
public class Ex {
	//멤버필드
	private int num;
	private String name;
	private int[] subject=new int[4];
	private double avg;
	private char grd;
	private String[] sub_name={"국어","영어","수학"};
	private static BufferedReader in;
	static{
		in=new BufferedReader(new InputStreamReader(System.in));
	}
	//생성자 메서드
	public Ex()throws IOException{
		System.out.print("학번 = ");
		num=Integer.parseInt(in.readLine());
		System.out.print("성명 = ");
		name=in.readLine();
		for(int i=0;i<subject.length-1;i++){
			do{
			System.out.print(sub_name[i]+" = ");
			subject[i]=Integer.parseInt(in.readLine());
			}while(subject[i]>100 || subject[i]<0);
			subject[3]+=subject[i];
		}
			avg=subject[3]/3.0f;
			switch((int)avg/10)
			{
			case 10:case 9:
				grd='A';
				break;
			case 8:
				grd='B';
				break;
			case 7:
				grd='C';
				break;
			case 6:
				grd='D';
				break;
			default:
				grd='F';	
				break;
			}
			System.out.println(name+"의 성적이 등록되었습니다.");
	}
	public Ex(int num, String name, int kor, int eng, int math){
		this.num=num;
		this.name=name;
		subject[0]=kor;
		subject[1]=eng;
		subject[2]=math;
		
		calculator();
	}
	//멤버 메서드
	private void calculator(){
		for(int i=0;i<subject.length-1;i++){
			subject[3]+=subject[i];
		}
			avg=subject[3]/3.0f;
			switch((int)avg/10)
			{
			case 10:case 9:
				grd='A';
				break;
			case 8:
				grd='B';
				break;
			case 7:
				grd='C';
				break;
			case 6:
				grd='D';
				break;
			default:
				grd='F';	
				break;
			}
	}
	public void show(){
		
		System.out.println("num : "+num);
		System.out.println("name : "+name);
		System.out.println("kor : "+subject[0]);
		System.out.println("eng : "+subject[1]);
		System.out.println("math : "+subject[2]);
		System.out.println("total : "+subject[3]);
		System.out.printf("avg : %.2f\n", avg);
		System.out.println("grade : "+grd);
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getSubject() {
		return subject;
	}
	public void setSubject(int[] subject) {
		this.subject = subject;
	}
	
}
