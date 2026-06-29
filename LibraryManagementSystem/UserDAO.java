import java.sql.*;

public class UserDAO{
    public void addUser(User u) throws Exception{
        Connection con=Database.connect();
        PreparedStatement ps=con.prepareStatement("INSERT INTO users VALUES(?,?)");
        ps.setInt(1,u.getId());
        ps.setString(2,u.getName());
        ps.executeUpdate();
        ps.close();
        con.close();
    }
}