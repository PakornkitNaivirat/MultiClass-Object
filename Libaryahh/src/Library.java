public class Library {
    private final Book[] book;

    public Library(Book[] book){
        this.book = book;
    }

    public int searchBook(String want){
        for (int i = 0; i < book.length; i++) {
            if (book[i].getBookID().equals(want) || book[i].getTitle().equals(want)) {
                return i;
            }
        }
        return -1;
    }

    public void borrowBook(String want){

        int idx = searchBook(want);

        if(idx == -1){
            System.out.println("Sorry, this book cannot be found in our library");
        }

        if(book[idx].getStatus() == 'A'){
            System.out.println(want + " can borrow.");
            book[idx].updateStatus();
        }else{
            System.out.println(want + " is borrowing. Sorry!");
        }
    }

    public void returnBook(String want){
        for(int i = 0 ; i < book.length;i++){
            if(book[i].getBookID().equals(want) || book[i].getTitle().equals(want)){
                if(book[i].getStatus() == 'U'){
                    System.out.println("Thank you, the return successful.");
                    book[i].updateStatus();
                }else{
                    System.out.println("book is not borrowing, Re-input again!.");
                }
            }
        }
    }

    public void showallBook(){
        System.out.println("These are all books in our library");
        for(int i = 0; i < book.length;i++){
           System.out.println(book[i].toString());
        }
    }
}
