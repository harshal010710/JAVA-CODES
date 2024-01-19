import java.sql.*;
class App
{
// 1
public static void main(String arg[]) throws Exception
{
    Class.forName("com.mysql.jdbc.Driver");

    String URL = "jdbc:mysql://localhost:3306/";
    String Username = "root";
    String Password = "2080";
    String Query = "select * from student";
    Connection cobj = DriverManager.getConnection (URL, Username, Password);
    // 2
    Statement sobj = cobj.createStatement();
    // 3
    ResultSet robj = sobj.executeQuery(Query);
    // 4
    while(robj.next())
    // 5
    {

        System.out.println("RID: "+robj.getInt("rno")); 
        System.out.println("Name: "+robj.getString("name")); 
        System.out.println("City: "+robj.getString("city")); 
        System.out.println("Marks: "+robj.getInt("marks"));
    }
}
}//
// execute()
// executeQuery() // executeUpdate()
//Create table select
//delete update alter insert
