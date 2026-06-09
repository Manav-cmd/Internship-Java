import java.util.ArrayList;
import java.util.Scanner;

public class ContactManagementSystem {

    static class Contact {
        private String name;
        private String phone;
        private String email;

        public Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public String getPhone() {
            return phone;
        }

        public String getEmail() {
            return email;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        @Override
        public String toString() {
            return "Name: " + name +
                   ", Phone: " + phone +
                   ", Email: " + email;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Contact> contacts = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n===== Contact Management System =====");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Update Contact");
            System.out.println("5. Delete Contact");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Phone: ");
                    String phone = sc.nextLine();

                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    contacts.add(new Contact(name, phone, email));
                    System.out.println("Contact added successfully.");
                    break;

                case 2:
                    if (contacts.isEmpty()) {
                        System.out.println("No contacts available.");
                    } else {
                        for (Contact c : contacts) {
                            System.out.println(c);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter name to search: ");
                    String searchName = sc.nextLine();

                    boolean found = false;

                    for (Contact c : contacts) {
                        if (c.getName().equalsIgnoreCase(searchName)) {
                            System.out.println(c);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Contact not found.");
                    }

                    break;

                case 4:
                    System.out.print("Enter name to update: ");
                    String updateName = sc.nextLine();

                    found = false;

                    for (Contact c : contacts) {
                        if (c.getName().equalsIgnoreCase(updateName)) {

                            System.out.print("Enter new phone number: ");
                            c.setPhone(sc.nextLine());

                            System.out.print("Enter new email: ");
                            c.setEmail(sc.nextLine());

                            System.out.println("Contact updated successfully.");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Contact not found.");
                    }

                    break;

                case 5:
                    System.out.print("Enter name to delete: ");
                    String deleteName = sc.nextLine();

                    found = false;

                    for (int i = 0; i < contacts.size(); i++) {
                        if (contacts.get(i).getName().equalsIgnoreCase(deleteName)) {
                            contacts.remove(i);
                            found = true;
                            System.out.println("Contact deleted successfully.");
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Contact not found.");
                    }

                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 6);

        sc.close();
    }
}
