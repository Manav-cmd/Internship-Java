import java.sql.*;

public class Database {
    private static final String URL="jdbc:sqlite:library.db";

    public static Connection connect() throws SQLException{
        return DriverManager.getConnection(URL);
    }

    public static void initialize() throws SQLException{
        Connection con=connect();
        Statement st=con.createStatement();

        st.executeUpdate("CREATE TABLE IF NOT EXISTS books(id INTEGER PRIMARY KEY,title TEXT,author TEXT,available INTEGER)");
        st.executeUpdate("CREATE TABLE IF NOT EXISTS users(id INTEGER PRIMARY KEY,name TEXT)");
        st.executeUpdate("CREATE TABLE IF NOT EXISTS borrow(bookId INTEGER,userId INTEGER)");

        st.close();
        con.close();
    }
}