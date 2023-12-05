import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class App {
    public static void main(String[] args) throws Exception {
     
        String url= "jdbc:mysql://localhost:3306/adi_db";
        String username="root";
        String password="aditya";


      Connection connection= DriverManager.getConnection(url, username, password);
  

      PreparedStatement pStatement=connection.prepareStatement("insert into adi values('Pankaj DADA',1000)");
      int i=pStatement.executeUpdate();
      if(i>0){
        System.out.println("good");
      }
      else{
        System.out.println("bad");
      }
         
   



    }
}
