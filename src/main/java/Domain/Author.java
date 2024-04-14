package Domain;

public class Author extends Person{
    private static int authorId = 0;
    private int authorCode; // a code assigned to each author by an association
    private int authorNoOfWrittenBooks;

    public Author(String personName, int personBirthYear, int authorCode, int authorNoOfWrittenBooks) {
        super(personName, personBirthYear);
        this.authorCode = authorCode;
        this.authorNoOfWrittenBooks = authorNoOfWrittenBooks;
        authorId++;
    }

    public int getAuthorCode() {
        return authorCode;
    }

    public void setAuthorCode(int authorCode) {
        this.authorCode = authorCode;
    }

    public int getAuthorNoOfWrittenBooks() {
        return authorNoOfWrittenBooks;
    }

    public void setAuthorNoOfWrittenBooks(int authorNoOfWrittenBooks) {
        this.authorNoOfWrittenBooks = authorNoOfWrittenBooks;
    }

    @Override
    public String toString() {
        return "Author number " + authorId + ", unique ID " + authorCode + ", " + personName + ", was born in the year " + personBirthYear + " and wrote " + authorNoOfWrittenBooks + " books (Person number " + personId + ")";
    }
}
