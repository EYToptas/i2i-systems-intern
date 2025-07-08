import java.sql.*;
import java.util.UUID;

public class BookDataInserter {

    public static void main(String[] args) {
        String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:XE";
        String username = "C##YUSUF";
        String password = "sifre123";

        String insertSQL = "INSERT INTO BOOK (ID, NAME, ISBN, CREATE_DATE) VALUES (?, ?, ?, SYSDATE)";

        try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
             PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {

            for (int i = 1; i <= 100; i++) {
                pstmt.setInt(1, i);
                pstmt.setString(2, "Book_" + UUID.randomUUID().toString().substring(0, 8));
                pstmt.setString(3, "ISBN-" + UUID.randomUUID().toString().substring(0, 10));
                pstmt.addBatch();
            }

            pstmt.executeBatch();
            System.out.println("100 kayıt başarıyla eklendi!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
