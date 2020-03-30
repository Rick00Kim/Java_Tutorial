
public class Exam_01_1 {
	public static void star(int x){
		System.out.println("*****************");
		for(int i=0;i<x;i++)
			System.out.print("*");
		System.out.println();
	}
	public static void main(String[] ar){
		star(2); // Call by Name
		System.out.println("ÅºÇÙ");
		System.out.println("¹Ú±ÙÇýÅºÇÙ");
		star(3);
		System.out.println("ÅºÇÙµÇ´Ù");
		star(2);
		System.out.println("¶°³ª°¡¶ó ~ Ã»¿Í´ë");
		star(1);
		System.out.println("±Ý¿äÀÏ");
		System.out.println("ºÒ±Ý");
		star(0);
	}

}
