import javax.swing.*;
import java.awt.event.*;
class Home extends JFrame{
    JLabel jl=new JLabel("Welcome");
    JButton jb=new JButton("Back");
    MyFrame mf;
    public Home(MyFrame mf){
        this.mf=mf;
        jl.setText(jl.getText()+" "+mf.username.getText());
        setTitle("Home");
        setSize(400,400);
        setVisible(true);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jl.setBounds(100,100,180,30);
        add(jl);

        jb.setBounds(100,200,80,30);
        add(jb);
        jb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                setVisible(false);
                mf.setVisible(true);
            }
        });
    }
}