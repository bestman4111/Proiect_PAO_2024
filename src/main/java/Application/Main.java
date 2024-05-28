package Application;

import Config.DBConfiguration;
import Domain.*;
import Service.*;
import Domain.Library;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        ArticleService articleService = new ArticleService(5);

        Library library1 = new Library("Biblioteca Nationala", "Soseaua Libertatii", 4, "Bucuresti", 5);
        System.out.println(library1);

        Section section1 = new Section("Fictiune", SectionType.BOOKS);
        System.out.println(section1);
        Section section2 = new Section("Science Fiction", SectionType.BOOKS);
        System.out.println(section2);
        Section section3 = new Section("Metal", SectionType.CDS);
        System.out.println(section3);

        library1.addSection(section1);
        library1.addSection(section2);
        library1.addSection(section3);

        Book book1 = new Book("The Rainmaker", 434, 1995, "Doubleday");
        articleService.addArticle(book1);
        Book book2 = new Book("Frumoasele straine", 298, 2010, "Humanitas");
        articleService.addArticle(book2);
        Book book3 = new Book("The Fellowship of the Ring", 423, 1954, "George Allen & Unwin");
        articleService.addArticle(book3);
        CD cd1 = new CD("Megadeth - Rust in Peace", 10, CDGenre.METAL, 1990, "Capitol Records");
        articleService.addArticle(cd1);
        CD cd2 = new CD("Depeche Mode - Violator", 9, CDGenre.ROCK, 1990, "Mute");
        articleService.addArticle(cd2);
        CD cd3 = new CD("Kendrick Lamar - Good Kid, M.A.A.D City", 12, CDGenre.RAP, 2012, "Aftermath");
        articleService.addArticle(cd3);

        PersonService personService = new PersonService(10);

        Author author1 = new Author("Joe Abercrombie", 1974, 52116, 15);
        System.out.println(author1);
        personService.addPerson(author1);
        Author author2 = new Author("J. R. R. Tolkien", 1892, 1055, 13);
        System.out.println(author2);
        personService.addPerson(author2);

        Reader reader1 = new Reader("Tiberiu Niculae", 2000);
        System.out.println(reader1);
        personService.addPerson(reader1);

        Author author3 = new Author("J. K. Rowling", 1965, 48715, 30);
        System.out.println(author3);
        personService.addPerson(author3);
        Author author4 = new Author("Andrzej Sapkowski", 1948, 41024, 17);
        System.out.println(author4);
        personService.addPerson(author4);

        personService.showListOfPersons();

        Reader reader2 = new Reader("Andrei Ion", 2002);
        System.out.println(reader2);
        personService.addPerson(reader2);

        Reader reader3 = new Reader("Stefan Marinescu", 2000);
        System.out.println(reader3);
        personService.addPerson(reader3);

        Optional<Reader> readerRead = ReadFromDB.getReaderByBirthyear(2000);
        if (readerRead.isPresent()) {
            System.out.println(readerRead.get());
        }

        Optional<Author> authorRead = ReadFromDB.getAuthorByNoOfWrittenBooks(13);
        if (authorRead.isPresent()) {
            System.out.println(authorRead.get());
        }

        Optional<CD> cdRead = ReadFromDB.getCdByPublishingYear(1990);
        if (cdRead.isPresent()) {
            System.out.println(cdRead.get());
        }

        Optional<Book> bookRead = ReadFromDB.getBookByPublishingYear(1995);
        if (bookRead.isPresent()) {
            System.out.println(bookRead.get());
        }

        UpdateInDB.updateBookPagesById(434, 1);
        Optional<Book> bookUp = ReadFromDB.getBookById(1);
        if (bookUp.isPresent()) {
            System.out.println(bookUp.get());
        }

        UpdateInDB.updateReaderBirthYearById(2000, 1);
        Optional<Reader> readerUp = ReadFromDB.getReaderById(1);
        if (readerUp.isPresent()) {
            System.out.println(readerUp.get());
        }

        UpdateInDB.updateAuthorNoOfBooksById(13, 2);
        Optional<Author> authorUp = ReadFromDB.getAuthorById(2);
        if (authorUp.isPresent()) {
            System.out.println(authorUp.get());
        }

        UpdateInDB.updateCDTracksById(10, 5);
        Optional<CD> cdUp = ReadFromDB.getCDById(5);
        if (cdUp.isPresent()) {
            System.out.println(cdUp.get());
        }

        DeleteFromDB.deleteBookById(3);

        DBConfiguration.closeConnection();

        List<String[]> data = CSVFile.getData();
        CSVFile.writeDataLineByLine("actions.csv", data);

    }
}
