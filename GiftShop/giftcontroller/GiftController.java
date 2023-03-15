package SQL.GiftShop.giftcontroller;

import SQL.GiftShop.giftmodel.Gift;

import java.sql.*;

public class GiftController {


    public boolean select() {
        try( Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop", "root", "");
                Statement stmt = cn.createStatement();
                ) {
            String ListSql = "Select * From booksshop";
            ResultSet rs = stmt.executeQuery(ListSql);
            System.out.println("---------------Gift Shop-------------------");
            int rowcount = 0;
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double price = rs.getDouble("price");
                int qty = rs.getInt("qty");
                System.out.println( id + ", " + name + ", " + price + ", " + qty);
                ++rowcount;
            }
            System.out.println("Tổng Số Bản Ghi = " +rowcount);

        }catch (SQLException e) {
            throw  new RuntimeException(e);
        }
        return false;
    }
    public static boolean Insert(Gift gf) {
        try(Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop", "root", "");
            Statement stmt = cn.createStatement();)
        {
            String Insert = "Insert Into booksshop(id, name, price, qty) values(" + gf.getId() + ", " + "'" + gf.getName() +"'"+ ", " + gf.getPrice() + ", " + gf.getQty() +")" ;
            int check = stmt.executeUpdate(Insert);
            System.out.println("Đã Thêm " + check + "Bản Ghi.");


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    public static boolean Delete(int id) throws SQLException {
        try(Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop", "root", "");
            Statement stmt = cn.createStatement();)
        {
            String Dlsql = "Delete FROM booksshop WHERE id = " + id;
            int check = stmt.executeUpdate(Dlsql);
            System.out.println("Đã xóa " + check + " bản ghi");


        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }


}
