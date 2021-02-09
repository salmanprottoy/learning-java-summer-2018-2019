import javax.swing.*;
import java.util.*;
import java.awt.event.*;

class Calculator extends JFrame implements ActionListener{
	
	JLabel jl1=new JLabel("Number 1 ");
	JLabel jl2=new JLabel("Number 2 ");
	JLabel jl3=new JLabel("Result:  ");
	JLabel jl4=new JLabel();
	
	JTextField jtn1=new JTextField();
	JTextField jtn2=new JTextField();
	
	ButtonGroup bg=new ButtonGroup();
	JButton jb1=new JButton("Clear");
    JButton jb2=new JButton("+");
    JButton jb3=new JButton("-");
    JButton jb4=new JButton("*");
    JButton jb5=new JButton("/");
	
	public Calculator(){
		
		setSize(400,400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("My Calculator");
		
		jl1.setBounds(50,100,100,20);
		add(jl1);
		jl2.setBounds(50,150,100,20);
		add(jl2);
		jl3.setBounds(50,200,100,20);
		add(jl3);
		jl4.setBounds(100,200,100,20);
		add(jl4);
		
		jtn1.setBounds(120,100,100,20);
		add(jtn1);
		jtn2.setBounds(120,150,100,20);
		add(jtn2);
		
		jb1.setBounds(50, 250, 100, 20);
        add(jb1);
		jb2.setBounds(50, 300, 50, 20);
        add(jb2);
		jb3.setBounds(110, 300, 50, 20);
        add(jb3);
		jb4.setBounds(170, 300, 50, 20);
        add(jb4);
		jb5.setBounds(230, 300, 50, 20);
        add(jb5);
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		jb5.addActionListener(this);
			
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==jb1){
			jl4.setText("");
		}
		else if(e.getSource()==jb2){
			String x=jtn1.getText();
			String y=jtn2.getText();
			int z;
			z=Integer.parseInt(x)+Integer.parseInt(y);
			String s=Integer.toString(z);
			jl4.setText(s);
		}
		else if(e.getSource()==jb3){
			String x=jtn1.getText();
			String y=jtn2.getText();
			int z;
			z=Integer.parseInt(x)-Integer.parseInt(y);
			String s=Integer.toString(z);
			jl4.setText(s);
		}
		else if(e.getSource()==jb4){
			String x=jtn1.getText();
			String y=jtn2.getText();
			int z;
			z=Integer.parseInt(x)*Integer.parseInt(y);
			String s=Integer.toString(z);
			jl4.setText(s);
		}
		else if(e.getSource()==jb5){
			String x=jtn1.getText();
			String y=jtn2.getText();
			int z;
			z=Integer.parseInt(x)/Integer.parseInt(y);
			String s=Integer.toString(z);
			jl4.setText(s);
		}
		
		
	}
	public static void main(String []args){
		Calculator c=new Calculator();
	}
}