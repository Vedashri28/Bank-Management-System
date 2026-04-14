package bank.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Connector {
    Connection connection;
    Statement statement;
    public Connector(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSys", "root", "12345");
            statement = connection.createStatement();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
