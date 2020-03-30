package note;
/*
 * Event Handler : 이벤트
 * 1. Event 관련 패키지와 적용범위
 *   1) Event Handler란? (java.awt.event)
 *     - 각 컴포넌트에 대해 특정 행위를 하였을 때에 대한 작업을 처리할 수 있는 걱
 *   2) 각 컴포넌트별 처리 이벤트
 *     - add로 시작하여 Listener로 끝나는 메서드를 이용한다.  
 *   3) 이벤트 관련 클래스
 *     - Listener 인터페이스 : 
 *     - Adapter 클래스 : abstract class
 *     - Event 클래스 : Event 객체 정보를 가지고 있는 클래스
 *     
 *       Event < Adapter < Listener ..
 *       
 * 2. Event 작성법
 *   1) Event Handler 클래스 생성하는 방법 - 4가지
 *     - Listener 인터페이스를 구현하는 방법
 *     - Adapter 클래스를 상속받아 구현하는 방법
 *     - Frame 클래스에 Listener 인터페이스를 상속으로 구현하는 방법
 *     - 익명의 중첩 클래스를 사용하는 방법
 *     
 *   2) Event 작성법
 *     - 처리하고자 하는 종류의 Event 클래스 생성
 *     - 컴포넌트에 대해 관련 Event를 추가
 *     
 * 3. 자주 사용되는 Event 클래스
 *   Event 활용범위
 *   1) ActionListener : 버튼 클릭, 메뉴선택 등
 *   2) WindowAdapter와 WindowListener : Frame 관련
 *   3) MouseAdapter와 MouseListener : 마우스 클릭 등 마우스 관련
 *   4) MouseMotionAdapter와 MousseMotionListener : 마우스 움직임 관련
 *   5) KeyAdapter와 KeyListener : 키 관련
 *   6) FocusAdaper와 FocusListener : 포커스 관련
 *   7) ItemListener : List나 Choice에서의 아이템 관련
 */
public class Note_02 {

}
