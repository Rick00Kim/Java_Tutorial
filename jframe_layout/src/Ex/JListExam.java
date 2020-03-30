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
    private String[] listStr = {"���ѹα�", "�Ϻ�",  "�̱�", "���þ�", "�߱�",
                                      "����", "������", "��Ż����", "����", "�̽���"};
    private JList list = new JList();
    private Border border = BorderFactory.createTitledBorder("���û���");
    private JScrollPane scroll = new JScrollPane();
    
    public JListExam()
    {
        //��ũ�� ����
        scroll.setViewportView(list);
        scroll.setBorder(border); //��� ����
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER); //���ι���å
        
        //list ����
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.setListData(listStr); //����Ʈ�� �����Ͱ� �� ��� ����
        list.addListSelectionListener(new ListListen()); //�̺�Ʈ������ ����
        
        //�⺻������Ʈ ����
        label.setText("�ְ��� ��������?");
        
        //�����ӿ� ������Ʈ ����
        frm.add(label, BorderLayout.NORTH);
        frm.add(scroll, BorderLayout.CENTER);
        
        //�⺻ ������ ����
        frm.setTitle("����Ʈ����");
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
            label.setText(str+"�� ���� �ϼ̽��ϴ�");
        }
    }
}
	public static void main(String[] ar){
		new JListExam();
    }
}