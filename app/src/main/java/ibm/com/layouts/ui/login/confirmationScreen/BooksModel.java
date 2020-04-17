package ibm.com.layouts.ui.login.confirmationScreen;

public class BooksModel {

    public int bookImage;
    public String bookName;

    public BooksModel(String bookName, int bookImage) {
        this.bookImage = bookImage;
        this.bookName = bookName;
    }

    public int getBookImage() {
        return bookImage;
    }

    public void setBookImage(int bookImage) {
        this.bookImage = bookImage;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
