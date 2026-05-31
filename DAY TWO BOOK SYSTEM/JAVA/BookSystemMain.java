import java.util.Scanner;

public class BookSystemMain {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean inBookSystem = true;

        while (inBookSystem) {

            System.out.println("""
                    
                    Welcome to the Book Suggestion System!
                    0. Exit
                    1. Get Suggestions
                    2. Add Book
                    3. Remove Book
                    4. Update Book
                    5. Show All Books
                    """);

            System.out.print("Choose from options: ");
            int userChoice = input.nextInt();
            input.nextLine();

            switch (userChoice) {

                case 0:
                    inBookSystem = false;
                    System.out.println("Exiting the Book Suggestion System");
                    break;

                case 1:

                    System.out.println("Book for the Day:");
                    System.out.println("Book Title: "
                            + BookSystem.getSuggestedBooks());

                    System.out.println("Page: "
                            + BookSystem.getPageNumber());

                    System.out.print("Would you like another suggestion? (yes/no): ");
                    String optional = input.nextLine();

                    while (optional.equalsIgnoreCase("yes")) {

                        System.out.println("Book for the Day:");
                        System.out.println("Book Title: "
                                + BookSystem.getSuggestedBooks());

                        System.out.println("Page: "
                                + BookSystem.getPageNumber());

                        System.out.print("Would you like another suggestion? (yes/no): ");
                        optional = input.nextLine();
                    }

                    break;

                case 2:

                    System.out.print("Enter the book title: ");
                    String bookName = input.nextLine();

                    BookSystem.addBooks(bookName);

                    System.out.println("Book successfully added!");
                    break;

                case 3:

                    System.out.print("Enter the book title to remove: ");
                    String bookNameToRemove = input.nextLine();

                    BookSystem.removeBooks(bookNameToRemove);

                    System.out.println("Book successfully removed!");
                    break;

                case 4:

                    System.out.print("Enter the old book title: ");
                    String oldBookName = input.nextLine();

                    System.out.print("Enter the new book title: ");
                    String newBookName = input.nextLine();

                    BookSystem.updateBooks(oldBookName, newBookName);

                    System.out.println("Book updated successfully!");
                    break;

                case 5:

                    System.out.println("All Books");

                    String[] allBooks = BookSystem.showBooks();

                    for (int index = 0; index < allBooks.length; index++) {
                        System.out.println((index + 1) + ". " + allBooks[index]);
                    }

                    break;

                default:
                    System.out.println("Invalid Choice. Please choose from 0 - 5");
            }
        }

    }
}
