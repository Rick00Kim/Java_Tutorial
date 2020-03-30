/*
 * interface 안에서 선언한 모든 멤버는 public static final형...
 * 2. interface에 포함가능한 멤버
 *   - public static final 멤버 필드 - #define
 *   - public abstract 멤버 메서드   - 추상
 *   - public static inner 클래스   - 중첩
 */
public interface Exam_02 {
	public static final int x=10;
	public static int y=20;
	public int z=30;
	int w=40;
	public abstract void aaa();
	public void bbb();
	void ccc();
	
	public static class Inner{}
}
