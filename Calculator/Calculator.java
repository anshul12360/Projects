import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Calculator extends JFrame
{
 JPanel pa=new JPanel();
 JButton [] bt=new JButton[20];
 JTextField tb=new JTextField("0");
 public Calculator()
 {
	super("Calculator");
	setSize(300,300);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLayout(null);
	addTextBox();
	addButtons();
	setVisible(true); 
 }
 void addTextBox()
 {
	tb.setBounds(10,5,270,50);   	
	tb.setEditable(false);
	tb.setBackground(Color.white);
	tb.setBorder(BorderFactory.createLineBorder(Color.black,1));
	tb.setHorizontalAlignment(JTextField.RIGHT);
	tb.setFont(new Font("arial",0,25));
	add(tb);
 }   
 void addButtons()
 {
 	pa.setBounds(10,65,270,190);	
	add(pa);
	pa.setLayout(new GridLayout(5,4,5,5));
	String []str={"Back","CE","C","%","7","8","9","/","4","5","6","*","1","2","3","-","0",".","=","+"};
	Font fo=new Font("arial",0,18);
	Insets margin=new Insets(0,0,0,0);
	CalListener listener=new CalListener();
	for(int i=0;i<20;i++)
	{
	  bt[i]=new JButton(str[i]);
	  bt[i].setFont(fo);
	  bt[i].setMargin(margin);
	  bt[i].setForeground(Color.blue);
	  bt[i].addActionListener(listener);
	  if(i==3 || i==7 || i==11 || i==15 || i==19 || i==18)
	    bt[i].setForeground(Color.red);	
	  pa.add(bt[i]);
	}
 } 
 class CalListener implements ActionListener
 {
   public void actionPerformed(ActionEvent evt)
   {
	JButton bc=(JButton)evt.getSource();
	String t1=bc.getText();
	String t2=tb.getText();
	if(bc==bt[4]||bc==bt[5]||bc==bt[6]||bc==bt[8]||bc==bt[9]||bc==bt[10]||bc==bt[12]||bc==bt[13]||bc==bt[14]||bc==bt[16])
	{
	  if(t2.equals("0"))
	    tb.setText(t1);
	  else
	    tb.setText(t2+t1);
	}
   }
 }  
 public static void main(String args[])
 {
	JFrame.setDefaultLookAndFeelDecorated(true);
	new Calculator();
 }
}







