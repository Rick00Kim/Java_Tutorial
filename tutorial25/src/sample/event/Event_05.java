package sample.event;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
 * 스윙 GUI 프로그램 만드는 과정
 * 1. 프레임만들기
 * 2. 프레임에 스윙 컴퍼넌트 붙이기
 * 3. main() 메서드 작성
 * 4. 
 * 
 */
public class Event_05 extends JFrame{
	public Event_05(){
		this.setTitle("JFC 기본 프레임"); //제목설정
		
		this.setSize(300,200);// 프레임의 크기설정, 폭-넓이
		Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frm=this.getSize();
		
		this.setVisible(true);//프레임을 화면에 나타나도록 설정
	}
	
	public static void main(String[] ar){
		new Event_05();
	}
}
