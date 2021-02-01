import javax.swing.*;
class MessageDialogBox{

  public static void main(String[] args) {

    ImageIcon img = new ImageIcon("warning.png");
    //JOptionPane.showMessageDialog(null,"Invalid Passowrd!");
    //JOptionPane.showMessageDialog(null,"Invalid Passowrd!",JOptionPane.ERROR_MESSAGE);
    JOptionPane.showMessageDialog(null,"Invalid Password!","Warning!",JOptionPane.PLAIN_MESSAGE,img);
  }
}
