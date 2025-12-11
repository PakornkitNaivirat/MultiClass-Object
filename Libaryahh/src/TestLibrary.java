import java.util.Scanner;

public class TestLibrary {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char ans = '0';
        String e ;

        Book[] books = {
            new Book("100","Programing", "John"),
            new Book("200","Object-Oriented Programming", "May"),
            new Book("300","Graphic", "Marry"),
            new Book("400","Statistics", "Martin"),
            new Book("500","Database", "John")};

        Library t = new Library(books);

        t.showallBook();

        while (ans != 'q'){
            System.out.println("<=== Enter the number what do you want to do ===>");
            System.out.println("1. Borrow a book.");
            System.out.println("2. Return a book.");
            System.out.println("3. Search a book.");
            System.out.println("q. Quit the system.");
            System.out.print("Select = ");
            ans = input.next().charAt(0);

            if(ans == '1'){
                System.out.print("Enter [id/title] of book : ");
                e = input.next();
                t.borrowBook(e);
            }else if (ans == '2'){
                System.out.print("Enter [id/title] of book : ");
                e = input.next();
                t.returnBook(e);
            }else if (ans == '3') {
                System.out.print("Enter [id/title] of book : ");
                e = input.next();
                int idx = t.searchBook(e);
                if (idx != -1) {
                    System.out.println(books[idx].toString());
                } else {
                    System.out.println("Can't find the book");
                }
            }else if (ans == 'q'){
                System.out.println("Exiting Program");
                break;
            }else{
                System.out.println("Input invalid, try again");
            }
        }
    }
}
