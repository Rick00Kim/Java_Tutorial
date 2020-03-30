package calendar;

import java.util.Calendar;

public class CalendarPrint {
    
    // Calendar �ν��Ͻ� ����
    Calendar cal = Calendar.getInstance();
    
    // ���� ǥ�� ���
    private String[] calHeader = {"��","��","ȭ","��","��","��","��"};
    // ��¥ ������ �迭
    private String[][] calDate = new String[6][7];

    private int width=calHeader.length; // �迭 ���� ����
    private int startDay;   // �� ���� ����
    private int lastDay;    // �� ������ ��¥
    private int inputDate=1;  // �Է� ��¥

    // ������ : ������ ����
    public CalendarPrint(int year, int month) throws Exception{
        
        // �Է� month(��) �� 1~12 ������ ���̴�.
        if(month<1 || month>12){
            System.out.println("���� 1~12 ������ �����Դϴ�.");
            throw new Exception();
        }else{
            
            // Calendar�� ��,��,�� ����
            cal.set(Calendar.YEAR, year);
            cal.set(Calendar.MONTH, month-1);
            cal.set(Calendar.DATE, 1);
            
            startDay = cal.get(Calendar.DAY_OF_WEEK); // �� ���� ���� 
            lastDay = cal.getActualMaximum(Calendar.DATE); // �� ������ ��¥
            
            // 2�� �迭�� ��¥ �Է�
            int row = 0;
            for(int i=1; inputDate<=lastDay; i++){
                
                // ���� ������ ���������� ���� ����
                if(i<startDay) calDate[row][i-1]="";
                else{
                    // ��¥ �迭�� �Է�
                    calDate[row][(i-1)%width]=Integer.toString(inputDate);
                    inputDate++;
                    
                    // ���� ������ ���� ���� �� �ٲ�
                    if(i%width==0) row++;
                }      
            }
        }
    }

    // �޷� ���
    public void printCal(){
        
        // �޷� ��� ��� "�Ͽ�ȭ�������"
        for(int i=0; i<width; i++){
            System.out.print(calHeader[i]+" ");
        }
        System.out.println();
        
        // ��¥ �迭 ���
        int row=0;
        for(int j=1 ; j<lastDay+startDay; j++){
            
            System.out.print(calDate[row][(j-1)%width]+" ");
            
            if((j-1)%width==width-1){
                System.out.println();
                row++;
            }
            
        }
    }

	public Calendar getCal() {
		return cal;
	}

	public void setCal(Calendar cal) {
		this.cal = cal;
	}

	public String[] getCalHeader() {
		return calHeader;
	}

	public void setCalHeader(String[] calHeader) {
		this.calHeader = calHeader;
	}

	public String[][] getCalDate() {
		return calDate;
	}

	public void setCalDate(String[][] calDate) {
		this.calDate = calDate;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getStartDay() {
		return startDay;
	}

	public void setStartDay(int startDay) {
		this.startDay = startDay;
	}

	public int getLastDay() {
		return lastDay;
	}

	public void setLastDay(int lastDay) {
		this.lastDay = lastDay;
	}

	public int getInputDate() {
		return inputDate;
	}

	public void setInputDate(int inputDate) {
		this.inputDate = inputDate;
	}

}