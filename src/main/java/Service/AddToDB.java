package Service;

import Config.DBConfiguration;
import Domain.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddToDB {
    private static AddToDB instance;

    private AddToDB(){

    }

    public static void addArticleToDB (Article article){
        if(article instanceof CD) {
            try {
                CD c = (CD) article;
                String insertCdSql = "INSERT INTO cd (name, tracks, genre, publisher, publishingyear) VALUES (?,?,?,?,?);";
                Connection conn = DBConfiguration.getConnection();
                try {
                    PreparedStatement ps = conn.prepareStatement(insertCdSql);
                    ps.setString(1, article.getArticleName());
                    ps.setInt(2, ((CD) article).getCDNoOfTracks());
                    ps.setString(3, ((CD) article).getCDGenre().label);
                    ps.setString(4, ((CD) article).getCDPublisher());
                    ps.setInt(5, ((CD) article).getCDPublicationYear());
                    ps.executeUpdate();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } catch (ClassCastException e) {
                e.printStackTrace();
            }
        } else {
            try {
                Book b = (Book) article;
                String insertBookSql = "INSERT INTO book (name, publisher, pages, publishingyear) VALUES (?,?,?,?);";
                Connection conn = DBConfiguration.getConnection();
                try {
                    PreparedStatement ps = conn.prepareStatement(insertBookSql);
                    ps.setString(1, article.getArticleName());
                    ps.setString(2, ((Book) article).getBookPublisher());
                    ps.setInt(3, ((Book) article).getBookNoOfPages());
                    ps.setInt(4, ((Book) article).getBookPublicationYear());
                    ps.executeUpdate();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } catch (ClassCastException e) {
                e.printStackTrace();
            }
        }
    }

    public static void addPersonToDB (Person person){
        if (person instanceof Author) {
            try {
                Author a = (Author) person;
                String insertAuthorSql = "INSERT INTO author (name, birthyear, uniqueid, nobooks) VALUES (?,?,?,?);";
                Connection conn = DBConfiguration.getConnection();
                try {
                    PreparedStatement ps = conn.prepareStatement(insertAuthorSql);
                    ps.setString(1, person.getPersonName());
                    ps.setInt(2, person.getPersonBirthYear());
                    ps.setInt(3, ((Author) person).getAuthorCode());
                    ps.setInt(4, ((Author) person).getAuthorNoOfWrittenBooks());
                    ps.executeUpdate();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } catch (ClassCastException e) {
                e.printStackTrace();
            }
        } else {
            try {
                Reader r = (Reader) person;
                String insertReaderSql = "INSERT INTO reader (name, birthyear) VALUES (?,?);";
                Connection conn = DBConfiguration.getConnection();
                try {
                    PreparedStatement ps = conn.prepareStatement(insertReaderSql);
                    ps.setString(1, person.getPersonName());
                    ps.setInt(2, person.getPersonBirthYear());
                    ps.executeUpdate();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } catch (ClassCastException e) {
                e.printStackTrace();
            }
        }
    }

}
