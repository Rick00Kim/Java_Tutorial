package calendar;

import java.util.Scanner;


public class mainTest {

    public static void main(String[] args) {
        
        int year;
        int month;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("�⵵�� �Է��ϼ��� : ");
        year=sc.nextInt();
        System.out.println("���� �Է��ϼ��� : ");
        month=sc.nextInt();
        
        try{
            // �Է¹��� year�� month�� �Ű������� ��ü �� ������ ����
            CalendarPrint cal = new CalendarPrint(year, month);
            // System.out �ֿܼ� ���
            cal.printCal();
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
}