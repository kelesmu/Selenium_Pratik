package JDBC;

import org.testng.Assert;

import java.sql.*;

public class DataBase {
    public static Statement statement;

    public static void main(String[] args) throws SQLException {

        //First we need to connect local database (For that we need to download "mysql-connector-java" library to pom xml)
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:8889/School", "root", "root");
        //To write sql statement we need statament object
        statement = conn.createStatement();
        testData();


    }

    public void insertData() throws SQLException {
        // to INSERT new data we use executeUpdate method in from Statement class
        statement.executeUpdate("insert into Teacher (TeacherName, TeacherFamilyName) values ('jhon', 'doe');");
        statement.executeUpdate("insert into Teacher (TeacherName, TeacherFamilyName, salary) values ('Mary', 'Jhonson', 123000);");

    }

    public static void getData() throws SQLException {
        //to GET the information from table we use executeQuery method from Statement Class
        //Than we store this data into variable from Result class
        ResultSet result = statement.executeQuery("select * from Teacher");
        //to print data we
        result.next();
        //ResultSet result1 = statement.executeQuery("INSERT INTO Teacher (FirstName,LastName) VALUES ('Lars','Monsen');");
        System.out.println(result.getString("name"));

    }

    public static void testData() throws SQLException {
        ResultSet newRes = statement.executeQuery("select* from Teacher");


        while (newRes.next()) {
//				System.out.println(result.getString("FirstName") + " " + result);
            System.out.println(newRes.getString("TeacherName"));
            Assert.assertEquals(newRes.getString("TeacherName"), "jhonn");

        }

    }
}





