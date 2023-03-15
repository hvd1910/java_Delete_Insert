package SQL.GiftShop;

import SQL.GiftShop.giftcontroller.GiftController;
import SQL.GiftShop.giftmodel.Gift;
import com.mysql.cj.x.protobuf.MysqlxCrud;

import java.sql.*;
import java.util.Scanner;

public class TestGiftShop {
    public static void main(String[] args) throws SQLException {
        GiftController gf1 = new GiftController();





        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Danh Sách Dữ Liệu Sách.");
        System.out.println("2. Thêm Thông Tin Sách.");
        System.out.println("3. Xóa Thông Tin Sách. ");
        System.out.print("Hãy Chọn 1 Chức Năng Trên: ");
        x = scanner.nextInt();

            switch (x) {
                case 1:
                    System.out.println("Danh Sách Dữ Liệu");
                    gf1.select();
                case 2:
                    System.out.println("Vui Lòng Nhập Thông Tin Sách.");
                    System.out.println("___________________________________________");
                    System.out.print("Nhập ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhập Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập Price:");
                    Double price = scanner.nextDouble();
                    System.out.print("Nhập Qty: ");
                    int qty = scanner.nextInt();
                    Gift gf = new Gift(id,name,price, qty);
                    GiftController.Insert(gf);

                case 3:
                    System.out.print("Vui Lòng Nhập ID Sách Muốn Xóa: ");
                    id = scanner.nextInt();
                    GiftController.Delete(id);
            }





    }

}
