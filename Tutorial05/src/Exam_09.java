/*
 * ���
 * 1. ���ù� = ���ǹ� = ��/�Ǵܹ�
 *    - if, if~else, if~else if
 *    - switch~case~break;
 * 2. �ݺ���
 *    - for : ���� for��
 *    - while
 *    -do ~ while
 * 3.��Ÿ���
 *    - break;
 *    - continue; ���� ����, ���� �ǳ� ��.
 *    
 */
public class Exam_09 {
	public static void main(String[] ar){
		int i=0,j=0;
		for(i=0;i<5;i++){
			for(j=0;j<5;j++){
				System.out.print(" @");
			}
			System.out.println();
		}
		System.out.println();
		for(i=1;i<6;i++){
			for(j=0;j<5;j++)
				System.out.print(i);
			System.out.println();
		}
		System.out.println();
		for(i=1;i<6;i++){
			for(j=1;j<6;j++)
				System.out.print(j);
			System.out.println();
		}
		System.out.println();
		for(i=0;i<5;i++){				//�� ��
			for(j=i+1;j<=i+5;j++)
				System.out.print(j);  
			System.out.println();
		}
		System.out.println();
		for(i=6;i>1;i--){			
			for(j=i-1;j<=i+3;j++)
				System.out.print(j);    
			System.out.println();
		}
		System.out.println();
		for(i=0;i<5;i++){
			for(j=0;j<=i;j++){
				System.out.print(" #");
			}
			System.out.println();
		}
		System.out.println();
		for(i=1;i<6;i++){
			for(j=1;j<=6-i;j++)
				System.out.print(" %");
			System.out.println();
		}
		System.out.println();
		for(i=0;i<5;i++){
			for(j=0;j<5;j++){
				if(j<i){
					System.out.print("  ");
				}else
					System.out.print(" *");
			}
			System.out.println();
		}
		System.out.println();
		for(i=6;i<0;i--){
			for(j=0;j<5;j++){
				if(j<i){
					System.out.print(" ");
				}else
					System.out.print("*");
			}
			System.out.println();
		}
	}
}
