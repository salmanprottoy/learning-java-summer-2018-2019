import javax.swing.*; 
import java.awt.event.*;
class MyFrame extends JFrame implements ActionListener{
    
    JTextField jtf=new JTextField();
    JPasswordField jpf=new JPasswordField();

    JLabel unjl=new JLabel("Username");
    JLabel pwjl=new JLabel("Password");
    JButton jb=new JButton("Click");

    JCheckBox jCheckBox=new JCheckBox("Java");
    JRadioButton rb1=new JRadioButton("Tea");
    JRadioButton rb2=new JRadioButton("Coffee");
    JComboBox fruits=new JComboBox(new String[]{"Apple","Banana","Mango"});
    JLabel fruitLabel=new JLabel("Selected:");
    public MyFrame(){
        setSize(800,600);
        setTitle("GUI Example");
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        unjl.setBounds(50,160,80,40);
        add(unjl);
        
        jtf.setBounds(150,160,150,40);
        add(jtf);

        pwjl.setBounds(50,250,150,40);
        add(pwjl);
        jpf.setBounds(150,250,150,40);
        add(jpf);

        fruits.setBounds(150,350,150,40);
        add(fruits);

        jb.setBounds(350,160,80,40);
        add(jb);

        jCheckBox.setBounds(350,260,80,40);
        add(jCheckBox);
        //jCheckBox.addActionListener(this);

        ButtonGroup bg=new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        rb1.setBounds(350,350,80,40);
        add(rb1);
        rb2.setBounds(450,350,80,40);
        add(rb2);

        fruitLabel.setBounds(450,450,150,40);
        add(fruitLabel);
        fruits.addActionListener(this);

        //rb1.addActionListener(this);
        //rb2.addActionListener(this);

        //jb.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        //JOptionPane.showMessageDialog(this,"Username:"+jtf.getText()+" Password:"+jpf.getText(),"Example",JOptionPane.QUESTION_MESSAGE);
        // if(jCheckBox.isSelected()){
        //     JOptionPane.showMessageDialog(this,jCheckBox.getText(),"Example",JOptionPane.QUESTION_MESSAGE);
        // }

        // if(rb1.isSelected()){
        //     JOptionPane.showMessageDialog(this,rb1.getText(),"Example",JOptionPane.QUESTION_MESSAGE);
        // }
        // else if(rb2.isSelected()){
        //     JOptionPane.showMessageDialog(this,rb2.getText(),"Example",JOptionPane.QUESTION_MESSAGE);
        // }

        String s=fruits.getSelectedItem().toString();
        String t="Selected:";
        fruitLabel.setText(t+s);
        
    }
    
}