import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Database.initialize();
        Scanner sc=new Scanner(System.in);
        BookDAO bookDAO=new BookDAO();
        UserDAO userDAO=new UserDAO();

        while(true){
            System.out.println("\n1.Add Book\n2.View Books\n3.Register User\n4.Exit");
            int ch=sc.nextInt();
            sc.nextLine();

            switch(ch){
                case 1:
                    System.out.print("Book ID: ");
                    int id=sc.nextInt(); sc.nextLine();
                    System.out.print("Title: ");
                    String t=sc.nextLine();
                    System.out.print("Author: ");
                    String a=sc.nextLine();
                    bookDAO.addBook(new Book(id,t,a,true));
                    System.out.println("Book Added.");
                    break;
                case 2:
                    bookDAO.viewBooks();
                    break;
                case 3:
                    System.out.print("User ID: ");
                    int uid=sc.nextInt(); sc.nextLine();
                    System.out.print("Name: ");
                    String n=sc.nextLine();
                    userDAO.addUser(new User(uid,n));
                    System.out.println("User Registered.");
                    break;
                case 4:
                    return;
            }
        }
    }
}