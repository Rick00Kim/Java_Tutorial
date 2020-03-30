/*
 * 성적 처리 프로그램

 * 1단계 : 국어, 영어, 수학 점수를 입력받아 총점과 평균을 계산하여 출력하시오.
 *        처리조건1.
 *        평균은 소숫점이하 둘째자리까지 표현 + 5점
 * 2단계 : 
 *        처리조건2.
 *        평균을 이용하여 학점을 구현하되, 90점이상이면 'A'
 *        80점이상이면 'B' 70점이상이면 'C' 60점이상이면 'D' 나머지는 'F' + 10점
 *        switch~case문을 이용할 것 - 5점
 * 3단계 : 
 *        처리조건3.
 *        각 과목의 점수는 0~100사이만 입력, 벗어나면 다시 입력받도록 구현 + 10점
 * 4단계 :
 *        처리조건4.
 *        과목의 점수를 배열로 받아 처리할 것 +15점
 * 5단계 : 
 *        처리조건5.
 *        3명의 성적을 받아 총점과 평균을 계산하여 출력하는 프로그램으로 확장할것 +20점
 * 6단계 :
 *        처리조건6.
 *        한명의 성적을 계산하는 Student 클래스를 구현하여 성적처리 프로그램을 구현할 것 +20점
 * 7단계 : 
 *        처리조건7.
 *        다음과 같은 프로그램이 수행되도록 구현하시오.
 *        <성적처리프로그램>
 *        1. 학생등록
 *        2. 성적검색      
 *        3. 성적수정
 *        4. 전체학생 성적보기
 *        5. 프로그램 종료
 *        메뉴(1~5) = 1
 *        =====학생등록======
 *        학번 = 
 *        성명 = 홍길동
 *        국어 =
 *        영어 =
 *        수학 =
 *        홍길동군의 성적이 등록되었습니다.
 *        
 *        =====성적검색=====
 *        성적을 검색할 학생의 이름을 입력하시오.
 *        성명 = 
 *        
 *        학번  성명  국어  영어  수학  총점  평균  학점
 *        -------------------------------
 *          x   x   x    x    x   x  x.xx  x
 *        
 *        =====성적수정====
 *        성적을 수정할 학생의 이름을 입력하시오.
 *        성명 = 이길동
 *        
 *        이전 국어 = xxx, 수정 국어 = 
 *        이전 영어 = xxx, 수정 영어 =
 *        이전 수학 = xxx, 수정 수학 =
 *        
 *        =====전체 학생 성적보기====
 *        학번  성명  국어  영어  수학  총점  평균  학점
 *        -----------------------------------
 *          x   x   x    x    x   x  x.xx  x
 *          x   x   x    x    x   x  x.xx  x
 *          x   x   x    x    x   x  x.xx  x
 *         
 *        
 */
import java.io.*;

public class Test_01 {
	public static void main(String[] ar)throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int[][] subject=new int[3][4];
		float[] avg=new float[3];
		char[] grd=new char[3];
		String[]  sub_name=new String[]{"국어","영어","수학"};
		
		for(int i=0;i<subject.length;i++){//3명의 학생 점수 인가
			for(int j=0;j<3;j++){
				do{
				System.out.print(i+1+"번 학생 "+sub_name[j]+" - ");
				subject[i][j]=Integer.parseInt(in.readLine());
				}while(subject[i][j]>100 || subject[i][j]<0);
				subject[i][3]+=subject[i][j];
			}
			avg[i]=subject[i][3]/3.0f;
		}//등급 할당
		for(int i=0;i<avg.length;i++){
			switch((int)avg[i]/10)
			{
			case 10:
			case 9:
				grd[i]='A';
				break;
			case 8:
				grd[i]='B';
				break;
			case 7:
				grd[i]='C';
				break;
			case 6:
				grd[i]='D';
				break;
			default:
				grd[i]='F';	
				break;
			}
		}
		for(int i=0;i<subject.length;i++){
				System.out.println(i+1+"번 학생의 총점 : "+subject[i][3]);
				System.out.printf("%d번 학생의 평균 : %.2f\n", i+1,avg[i]);
				System.out.println(i+1+"번 학생의 등급 : "+grd[i]);
		}

	}
}
