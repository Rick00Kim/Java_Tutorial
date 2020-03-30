package Ex;

import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.border.Border;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
 
class JListExam{
    private JFrame frm = new JFrame();
    private JLabel label = new JLabel();
    private String[] listStr = {"대한민국", "일본",  "미국", "러시아", "중국",
                                      "영국", "프랑스", "이탈리아", "사우디", "이스라엘"};
    private JList list = new JList();
    private Border border = BorderFactory.createTitledBorder("선택사항");
    private JScrollPane scroll = new JScrollPane();
    
    public JListExam()
    {
        //스크롤 셋팅
        scroll.setViewportView(list);
        scroll.setBorder(border); //경계 설정
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER); //가로바정책
        
        //list 셋팅
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.setListData(listStr); //리스트의 데이터가 될 목록 설정
        list.addListSelectionListener(new ListListen()); //이벤트리스너 장착
        
        //기본컴포넌트 셋팅
        label.setText("최고의 여행지는?");
        
        //프레임에 컴포넌트 장착
        frm.add(label, BorderLayout.NORTH);
        frm.add(scroll, BorderLayout.CENTER);
        
        //기본 프래임 셋팅
        frm.setTitle("리스트예제");
        frm.setLocation(120, 120);
        frm.setSize(400, 250);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true);
    }
    class ListListen implements ListSelectionListener{
    @Override
    public void valueChanged(ListSelectionEvent e) 
    {
        if(e.getSource() == list)
        {
            String str = (String)list.getSelectedValue();
            label.setText(str+"을 선택 하셨습니다");
        }
    }
}
	public static void main(String[] ar){
		new JListExam();
    }
}