import java.sql.*;

class JDBCExample {
    public static void main(String args[]) {
        try {
            // 1. Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Create Connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test","root","1234");

            // 3. Create Statement
            Statement stmt = con.createStatement();

            // 4. Insert Record
            stmt.executeUpdate("insert into student values(1,'Chetan')");
            stmt.executeUpdate("insert into student values(2,'Rahul')");

            // 5. Retrieve Records
            ResultSet rs = stmt.executeQuery("select * from student");

            while(rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2));
            }

            // 6. Close Connection
            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}