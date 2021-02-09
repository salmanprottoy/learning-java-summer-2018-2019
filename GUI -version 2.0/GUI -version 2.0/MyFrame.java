import javax.swing.*;
import java.awt.event.*;
class MyFrame extends JFrame implements ActionListener{
    JButton jb=new JButton("Click");
    JTextField username=new JTextField();
    JPasswordField password=new JPasswordField();
    JLabel jl1=new JLabel("Username");
    JLabel jl2=new JLabel("Password");
    JCheckBox jcb=new JCheckBox("Java");
    JRadioButton tea=new JRadioButton("Tea");
    JRadioButton coffee=new JRadioButton("Coffee");
    JComboBox fruits=new JComboBox(new String[]{"Apple","Mango","Orange","Jack fruit"});
    JLabel result=new JLabel("Result:");
    public MyFrame(){
        setTitle("My Application");
        setSize(800,600);
        setVisible(true);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        jl1.setBounds(80,100,100,30);
        add(jl1);
        username.setBounds(200,100,120,30);
        add(username);

        jl2.setBounds(80,150,100,30);
        add(jl2);
        password.setBounds(200,150,120,30);
        add(password);

        jcb.setBounds(200,200,100,30);
        add(jcb);
        jcb.addActionListener(this);

        ButtonGroup bg=new ButtonGroup();
        bg.add(tea);
        bg.add(coffee);
        tea.setBounds(200,250,100,30);
        add(tea);
        tea.addActionListener(this);

        coffee.setBounds(320,250,100,30);
        add(coffee);
        coffee.addActionListener(this);

        fruits.setBounds(200,350,110,30);
        add(fruits);
        fruits.addActionListener(this);

        result.setBounds(450,350,110,30);
        add(result);

        jb.setBounds(350,100,80,30);
        add(jb);
        jb.addActionListener(this);

        
    }

    public void actionPerformed(ActionEvent e){
        //System.out.println(e.getSource());
        //JOptionPane.showMessageDialog(this,"Hello World","GUI Example",JOptionPane.ERROR_MESSAGE);
        // String uname=username.getText();
        // String pw=password.getText();
        //JOptionPane.showMessageDialog(this,uname+"=>"+pw,"GUI Example",JOptionPane.ERROR_MESSAGE);
        // if(jcb.isSelected()){
        //     JOptionPane.showMessageDialog(this,jcb.getText(),"GUI Example",JOptionPane.INFORMATION_MESSAGE);
        // }

        // if(tea.isSelected()){
        //     JOptionPane.showMessageDialog(this,tea.getText()+" is selected","GUI Example",JOptionPane.INFORMATION_MESSAGE);
        // }
        // else if(coffee.isSelected()){
        //     JOptionPane.showMessageDialog(this,coffee.getText()+" is selected","GUI Example",JOptionPane.INFORMATION_MESSAGE);
        // }

        // String fruit=fruits.getSelectedItem().toString();
        // result.setText(fruit);

        //Actions for All the components
        if(e.getSource()==jb){
            // String uname=username.getText();
            // String pw=password.getText();
            // if(uname.equals("") || pw.equals("")){
            //     JOptionPane.showMessageDialog(this,"Username and Password required","GUI Example",JOptionPane.ERROR_MESSAGE);
            // }
            // else{
            //     JOptionPane.showMessageDialog(this,uname+"=>"+pw,"GUI Example",JOptionPane.INFORMATION_MESSAGE);
            // }

            //MyFrame mf1=new MyFrame();
            Home home=new Home(this);
            this.setVisible(false);
            
        }
        else if(e.getSource()==jcb){
                if(jcb.isSelected()){
                JOptionPane.showMessageDialog(this,jcb.getText(),"GUI Example",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else if(e.getSource()==tea || e.getSource()==coffee){
                if(tea.isSelected()){
                    JOptionPane.showMessageDialog(this,tea.getText()+" is selected","GUI Example",JOptionPane.INFORMATION_MESSAGE);
                }
                else if(coffee.isSelected()){
                    JOptionPane.showMessageDialog(this,coffee.getText()+" is selected","GUI Example",JOptionPane.INFORMATION_MESSAGE);
                }
        }
        else if(e.getSource()==fruits){
                String fruit=fruits.getSelectedItem().toString();
                result.setText(fruit);
        }

        
    }

}