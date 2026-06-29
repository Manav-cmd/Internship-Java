import java.sql.*;

public class BookDAO{

    public void addBook(Book b) throws Exception{
        Connection con=Database.connect();
        PreparedStatement ps=con.prepareStatement("INSERT INTO books VALUES(?,?,?,?)");
        ps.setInt(1,b.getId());
        ps.setString(2,b.getTitle());
        ps.setString(3,b.getAuthor());
        ps.setInt(4,b.isAvailable()?1:0);
        ps.executeUpdate();
        ps.close();
        con.close();
    }

    public void viewBooks() throws Exception{
        Connection con=Database.connect();
        ResultSet rs=con.createStatement().executeQuery("SELECT * FROM books");
        while(rs.next()){
            System.out.println(rs.getInt("id")+" | "+rs.getString("title")+" | "+rs.getString("author")+" | "+(rs.getInt("available")==1?"Available":"Borrowed"));
        }
        con.close();
    }
}