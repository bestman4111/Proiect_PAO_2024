package Application;

import Domain.*;
import Service.ArticleService;
import Service.Library;
import Service.PersonService;

public class Main {
    public static void main(String[] args) {
        ArticleService articleService = new ArticleService(5);

        Library library1 = new Library("Biblioteca Nationala", "Soseaua Libertatii", 4, "Bucuresti", 5);
        System.out.println(library1);

        Section section1 = new Section("Fictiune", SectionType.Books);
        System.out.println(section1);
        Section section2 = new Section("Science Fiction", SectionType.Books);
        System.out.println(section2);
        Section section3 = new Section("Metal", SectionType.CDs);
        System.out.println(section3);

        library1.addSection(section1);
        library1.addSection(section2);
        library1.addSection(section3);

        Book book1 = new Book("The Rainmaker", 434, 1995, "Doubleday");
        articleService.addArticle(book1);
        CD cd1 = new CD("Megadeth - Rust in Peace", 10, CDGenre.Metal, 1990, "Capitol Records");
        articleService.addArticle(cd1);

        PersonService personService = new PersonService(5);

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

        Reader reader2 = new Reader("Andrei Ion", 2002);
        System.out.println(reader2);
        personService.addPerson(reader2);
    }
}
