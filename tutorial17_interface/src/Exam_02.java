/*
 * interface �ȿ��� ������ ��� ����� public static final��...
 * 2. interface�� ���԰����� ���
 *   - public static final ��� �ʵ� - #define
 *   - public abstract ��� �޼���   - �߻�
 *   - public static inner Ŭ����   - ��ø
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
