import java.util.*;

class DigitalLibrary {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> books = new ArrayList<>();

    public static void main(String[] args) {

        books.add("Java Programming");
        books.add("Python Basics");
        books.add("Web Development");
        books.add("Data Structures");

        while (true) {
            System.out.println("\n---- DIGITAL LIBRARY MANAGEMENT ----");
            System.out.println("1. View Books");
            System.out.println("2. Add Book");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    viewBooks();
                    break;
                case 2:
                    addBook();
                    break;
                case 3:
                    issueBook();
                    break;
                case 4:
                    returnBook();
                    break;
                case 5:
                    System.out.println("Thank You!");
                    System.exit(0);
            }
        }
    }

    static void viewBooks() {
        System.out.println("\nAvailable Books:");
        for (String book : books) {
            System.out.println("- " + book);
        }
    }

    static void addBook() {
        System.out.print("Enter new book name: ");
        sc.nextLine();
        String book = sc.nextLine();
        books.add(book);
        System.out.println("Book Added Successfully!");
    }

    static void issueBook() {
        System.out.print("Enter book name to issue: ");
        sc.nextLine();
        String book = sc.nextLine();

        if (books.contains(book)) {
            books.remove(book);
            System.out.println("Book Issued Successfully!");
        } else {
            System.out.println("Book not available!");
        }
    }

    static void returnBook() {
        System.out.print("Enter book name to return: ");
        sc.nextLine();
        String book = sc.nextLine();
        books.add(book);
        System.out.println("Book Returned Successfully!");
    }
}
