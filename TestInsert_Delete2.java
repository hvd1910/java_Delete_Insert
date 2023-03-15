package SQL.s1;

import java.sql.*;
import java.util.Scanner;

public class TestInsert_Delete2 {
    public static void main(String[] args) throws SQLException {
        try (
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop", "root", "");
        Statement stmt = cn.createStatement();
        ) {
            String sqlDelete = "Delete FROM books WHERE id > 8000";
            System.out.println("The SQL statement is:  " +sqlDelete+"\n");
            int countDelete = stmt.executeUpdate(sqlDelete);
            System.out.println(countDelete+ "records delete");

            String sqlInsert = "Insert INTO books VALUES(8001, 'Java Core', 'Dang Kim Thi', 15.55, 55) , (8002, 'Java Advanced', 'James " +
                    "Gosling', 25.55, 55)";
            System.out.println("The SQL statement is: " +sqlInsert + "\n");
            int countInsert = stmt.executeUpdate(sqlInsert);
            System.out.println(countInsert + "records insert");

            sqlInsert = "Insert INTO  books VALUES (2001, 'Java JDBC MySQL', 'ThiDK',22.18,2)";
            System.out.println("The SQL statement is: " +sqlInsert + "\n");
            countInsert = stmt.executeUpdate(sqlInsert);
            System.out.println(countInsert + "records insert");

            sqlDelete = "delete  from books WHERE  id = 2001";
            System.out.println("The SQL statement is:  " +sqlDelete+"\n");
            countDelete = stmt.executeUpdate(sqlDelete);
            System.out.println(countDelete+ "records delete");

            String Samples = "Insert INTO  books VALUES ";
            String AddBooks, Inserts;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Định Dạng Book(id, title, author, price, qty)");
            System.out.print("Vui Lòng Nhập Thông Tin Book: ");
            Inserts = scanner.nextLine();
            AddBooks = Samples + Inserts;
            System.out.println("The SQL statement is: " +sqlInsert + "\n");
            countInsert = stmt.executeUpdate(AddBooks);
            System.out.println(countInsert + "records insert");

        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
