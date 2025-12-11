public class Book {
    private String bookID,title,author;
    private char status;

    public Book(String bookID, String title , String author){
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        status = 'A';
    }

    public String getBookID() {
        return bookID;
    }

    public char getStatus() {
        return status;
    }

    public String getTitle() {
        return title;
    }

    public void updateStatus(){
        if(status == 'A'){
            status = 'U';
        }else if(status == 'U'){
            status = 'A';
        }
    }

    public String checkStatus(){
        String stat = "";
        if(status == 'A'){
            stat = "Availaable";
        }else if(status == 'U'){
            stat = "Unavailable";
        }
        return stat;
    }

    public String toString(){
        return "ID : " + getBookID() + " Title : " + getTitle() + " Author : " + author + " : " + checkStatus();
    }
}
