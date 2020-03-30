/*
 * Clone
 */
public class Exam_02 {
	public static void main(String[] ar){
		int[] src={5,6,7,8,9,0};
//		int[] trg={100,200,300,400,500,600,700};
//		System.arraycopy(src, 2, trg, 3, 4);
		int[] targ=src.clone();
		for(int i=0;i<targ.length;i++){
			System.out.println("targ["+i+"] - "+targ[i]);
		}
	}
}
