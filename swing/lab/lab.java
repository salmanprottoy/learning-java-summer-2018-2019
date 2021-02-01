import java.util.*;
import javax.swing.*;
import java.awt.event.*;

class LabTask extends JFrame implements ActionListener{
	JLabel jl1=new JLabel();
	JLabel jl2=new JLabel("Number 1: ");
	JLabel jl3=new JLabel("Number 2: ");
	JLabel jl4=new JLabel("Result:  ");


	JTextField Number1=new JTextField();
	JTextField Number2=new JTextField();
	ButtonGroup bg=new ButtonGroup();
    JButton b1=new JButton("clear");
    JButton b2=new JButton("+");
    JButton b3=new JButton("-");
    JButton b4=new JButton("*");
    JButton b5=new JButton("/");

	public LabTask(){
		    setSize(400,400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Basic Calculator");
		 jl1.setBounds(50, 50, 100, 20);
        add(jl1);
		Number1.setBounds(120, 100, 100, 20);
		add(Number1);
		jl2.setBounds(50, 100, 100, 20);
        add(jl2);
    Number2.setBounds(120, 150, 100, 20);
    		add(Number2);
    jl3.setBounds(50, 150, 100, 20);
        add(jl3);
		jl4.setBounds(50, 300, 100, 20);
		add(jl4);
		b1.setBounds(50, 200, 100, 20);
        add(b1);
		b2.setBounds(100, 250, 50, 20);
        add(b2);
		b3.setBounds(160, 250, 50, 20);
        add(b3);
		b4.setBounds(220, 250, 50, 20);
        add(b4);
		b5.setBounds(280, 250, 50, 20);
        add(b5);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {

		 int Number1;
		 int Number2;
		 int Result;
		 Scanner sc=new Scanner(System.in);
	   Number1=sc.nextInt();
		 Scanner sk=new Scanner(System.in);
		 Number2=sk.nextInt();
		 if(b2.isSelected()){
			 Result=Number1+Number2;
		 } else if(b3.isSelected()){
			 Result=Number1-Number2;
		 } else if(b4.isSelected()){
			 Result=Number1*Number2;
		 }else if(b5.isSelected()){
			if(Number1==0||Number2==0){
				 Result=0;
			 }else{
				 Result=Number1/Number2;
			 }
		 }



	}
	public static void main(String[] Args){
		LabTask l=new LabTask();



	}

}
