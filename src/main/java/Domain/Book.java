package Domain;

public class Book extends Article{
    private static int bookId = 0;
    private int bookNoOfPages;
    private int bookPublicationYear;
    private String bookPublisher;

    public Book(String articleName, int bookNoOfPages, int bookPublicationYear, String bookPublisher) {
        super(articleName);
        this.bookNoOfPages = bookNoOfPages;
        this.bookPublicationYear = bookPublicationYear;
        this.bookPublisher = bookPublisher;
        bookId++;
    }

    public int getBookNoOfPages() {
        return bookNoOfPages;
    }

    public void setBookNoOfPages(int bookNoOfPages) {
        this.bookNoOfPages = bookNoOfPages;
    }

    public int getBookPublicationYear() {
        return bookPublicationYear;
    }

    public void setBookPublicationYear(int bookPublicationYear) {
        this.bookPublicationYear = bookPublicationYear;
    }

    public String getBookPublisher() {
        return bookPublisher;
    }

    public void setBookPublisher(String bookPublisher) {
        this.bookPublisher = bookPublisher;
    }

    @Override
    public String toString() {
        return "Book number " + bookId + ", titled \"" + articleName + "\" (" + bookNoOfPages + " pages) was first published in the year " + bookPublicationYear + " by " + bookPublisher + " (Article number " + articleId + ")";
    }
}
