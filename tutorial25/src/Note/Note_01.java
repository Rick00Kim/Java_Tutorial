package Note;

/*
 * Event(이벤트)
 * 1. Event Handler란?
 *
 *  
 * 2. Event 작성법
 *  1) Event Handler 클래스를 생성하는 방법 -4가지
 *    - Listener 인터페이스를 구현하는 방법
 *    - Adapter 클래스를 상속받아 구현하는 방법
 *    - Frame 클래스에 Listener를 상속받아 구현하는 방법
 *    - 익명 중첩 클래스를 사용하는 방법
 *  2) 각 컴포넌트 별로 처리할 이벤트를 등록시킨다.
 *    - 대상객체.add~Listener로 끝나는 메서드를 이용
 *    	
 *    
 *    
 *    
 *    
 *    
 *    
 *    
 *    
 *    
 *    
 *    
 *    	btn1.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// 눌러진 마우스 버튼이 떼어지는 순간
				btn1.setBackground(Color.green);
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// 마우스 버튼이 눌러지는 순간
				btn1.setBackground(Color.black);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// 마우스가 컴포넌트 위에서 내려오는 순간
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// 마우스가 컴포넌트 위에 올라가는 순간
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// 마우스가 클릭되는 순간
				System.exit(0);
			}
		});
 */
public class Note_01 {
	
}
