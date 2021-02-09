import java.sql.*;
class Main{
    public static void main(String[] args) {
        try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myapp","root","");
            Statement stmt=con.createStatement();
            // ResultSet rs=stmt.executeQuery("SELECT * FROM users");
            // while(rs.next()){
            //     System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
            // }

            int i=stmt.executeUpdate("INSERT INTO users(username,password) VALUES('nahid','778')");
            System.out.println(i);
            
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}