import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement; //or preparedstatement ig



Connection con = DriverManager.getConnection("jdbc:sqlite:bank.db");  //connecting to the database
                  //use plain text passwords please


