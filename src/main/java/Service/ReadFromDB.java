package Service;

import Config.DBConfiguration;
import Domain.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

public class ReadFromDB {
    private static ReadFromDB instance;

    private ReadFromDB() {

    }

    public static Optional<Reader> getReaderById(int id) {
        String selectSql = "SELECT * FROM reader r WHERE r.id = ?";
        Connection conn = DBConfiguration.getConnection();

        try{
            PreparedStatement ps = conn.prepareStatement(selectSql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            return mapToReader(rs);
        } catch (SQLException e){
            e.printStackTrace();
        }
        return Optional.empty();
    }

    private static Optional<Reader> mapToReader(ResultSet rs) throws SQLException {
        if(rs.next()){
            int id = rs.getInt("id");
            String name = rs.getString("name");
            int birthyear = rs.getInt("birthyear");
            return Optional.of(new Reader(name, birthyear));
        }
        return Optional.empty();
    }

    public static Optional<Reader> getReaderByName(String name) {
        String selectSql = "SELECT * FROM reader r WHERE r.name = ?";
        Connection conn = DBConfiguration.getConnection();
        try{
            PreparedStatement ps = conn.prepareStatement(selectSql);
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            return mapToReader(rs);
        } catch (SQLException e){
            e.printStackTrace();
        }
        return Optional.empty();
    }

    public static Optional<Reader> getReaderByBirthyear(int birthyear) {
        String selectSql = "SELECT * FROM reader r WHERE r.birthyear = ?";
        Connection conn = DBConfiguration.getConnection();
        try{
            PreparedStatement ps = conn.prepareStatement(selectSql);
            ps.setInt(1, birthyear);
            ResultSet rs = ps.executeQuery();
            return mapToReader(rs);
        } catch (SQLException e){
            e.printStackTrace();
        }
        return Optional.empty();
    }

    private static Optional<Author> mapToAuthor(ResultSet rs) throws SQLException {
        if(rs.next()){
            int id = rs.getInt("id");
            String name = rs.getString("name");
            int birthyear = rs.getInt("birthyear");
            int authorCode = rs.getInt("uniqueid");
            int authorNoOfWrittenBooks = rs.getInt("nobooks");
            return Optional.of(new Author(name, birthyear, authorCode, authorNoOfWrittenBooks));
        }
        return Optional.empty();
    }

    public static Optional<Author> getAuthorById(int id) {
        String selectSql = "SELECT * FROM author a WHERE a.id = ?";
        Connection conn = DBConfiguration.getConnection();
        try{
            PreparedStatement ps = conn.prepareStatement(selectSql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            return mapToAuthor(rs);
        } catch (SQLException e){
            e.printStackTrace();
        }
        return Optional.empty();
    }

    public static Optional<Author> getAuthorByName(String name) {
        String selectSql = "SELECT * FROM author a WHERE a.name = ?";
        Connection conn = DBConfiguration.getConnection();
        try{
            PreparedStatement ps = conn.prepareStatement(selectSql);
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            return mapToAuthor(rs);
        } catch (SQLException e){
            e.printStackTrace();
        }
        return Optional.empty();
    }

    public static Optional<Author> getAuthorByBirthyear(int birthyear) {
        String selectSql = "SELECT * FROM author a WHERE a.birthyear = ?";
        Connection conn = DBConfiguration.getConnection();
        try{
            PreparedStatement ps = conn.prepareStatement(selectSql);
            ps.setInt(1, birthyear);
            ResultSet rs = ps.executeQuery();
            return mapToAuthor(rs);
        } catch (SQLException e){
            e.printStackTrace();
        }
        return Optional.empty();
    }

    public static Optional<Author> getAuthorByUniqueId(int uniqueid) {
        String selectSql = "SELECT * FROM author a WHERE a.uniqueid = ?";
        Connection conn = DBConfiguration.getConnection();
        try{
            PreparedStatement ps = conn.prepareStatement(selectSql);
            ps.setInt(1, uniqueid);
            ResultSet rs = ps.executeQuery();
            return mapToAuthor(rs);
        } catch (SQLException e){
            e.printStackTrace();
        }
        return Optional.empty();
    }

    public static Optional<Author> getAuthorByNoOfWrittenBooks(int nobooks) {
        String selectSql = "SELECT * FROM author a WHERE a.nobooks = ?";
        Connection conn = DBConfiguration.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement(selectSql);
            ps.setInt(1, nobooks);
            ResultSet rs = ps.executeQuery();
            return mapToAuthor(rs);
        } catch (SQLException e){
            e.printStackTrace();
        }
        return Optional.empty();
    }

    private static Optional<CD> mapToCD(ResultSet rs) throws SQLException {
        if(rs.next()){
            int id = rs.getInt("id");
            String name = rs.getString("name");
            int tracks = rs.getInt("tracks");
            String genre = rs.getString("genre");
            String publisher = rs.getString("publisher");
            int publishingYear = rs.getInt("publishingyear");
            return Optional.of(new CD(name, tracks, CDGenre.getEnumByString(genre), publishingYear, publisher));
        }
        return Optional.empty();
    }

    public static Optional<CD> getCDById(int id) {
        String selectSql = "SELECT * FROM cd c WHERE c.id = ?";
        Connection conn = DBConfiguration.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement(selectSql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            return mapToCD(rs);
        } catch (SQLException e){
            e.printStackTrace();
        }
        return Optional.empty();
    }

    public static Optional<CD> getCdByName(String name) {
        String selectSql = "SELECT * FROM cd c WHERE c.name = ?";
        Connection conn = DBConfiguration.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement(selectSql);
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            return mapToCD(rs);
        } catch (SQLException e){
            e.printStackTrace();
        }
        return Optional.empty();
    }

    public static Optional<CD> getCdByTracks(int tracks) {
        String selectSql = "SELECT * FROM cd c WHERE c.tracks = ?";
        Connection conn = DBConfiguration.getConnection();
        try{
            PreparedStatement ps = conn.prepareStatement(selectSql);
            ps.setInt(1, tracks);
            ResultSet rs = ps.executeQuery();
            return mapToCD(rs);
        } catch (SQLException e){
            e.printStackTrace();
        }
        return Optional.empty();
    }

    public static Optional<CD> getCdByGenre(String genre){
        String selectSql = "SELECT * FROM cd c WHERE c.genre = ?";
        Connection conn = DBConfiguration.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement(selectSql);
            ps.setString(1, genre);
            ResultSet rs = ps.executeQuery();
            return mapToCD(rs);
        } catch (SQLException e){
            e.printStackTrace();
        }
        return Optional.empty();
    }

    public static Optional<CD> getCdByPublisher(String publisher){
        String selectSql = "SELECT * FROM cd c WHERE c.publisher = ?";
        Connection conn = DBConfiguration.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement(selectSql);
            ps.setString(1, publisher);
            ResultSet rs = ps.executeQuery();
            return mapToCD(rs);
        } catch (SQLException e){
            e.printStackTrace();
        }
        return Optional.empty();
    }

    public static Optional<CD> getCdByPublishingYear(int publishingyear){
        String selectSql = "SELECT * FROM cd c WHERE c.publishingyear = ?";
        Connection conn = DBConfiguration.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement(selectSql);
            ps.setInt(1, publishingyear);
            ResultSet rs = ps.executeQuery();
            return mapToCD(rs);
        } catch (SQLException e){
            e.printStackTrace();
        }
        return Optional.empty();
    }

    private static Optional<Book> mapToBook(ResultSet rs) throws SQLException {
        if(rs.next()){
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String publisher = rs.getString("publisher");
            int pages = rs.getInt("pages");
            int publishingyear = rs.getInt("publishingyear");
            return Optional.of(new Book(name, pages, publishingyear, publisher));
        }
        return Optional.empty();
    }

    public static Optional<Book> getBookById(int id) {
        String selectSql = "SELECT * FROM book b WHERE b.id = ?";
        Connection conn = DBConfiguration.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement(selectSql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            return mapToBook(rs);
        } catch (SQLException e){
            e.printStackTrace();
        }
        return Optional.empty();
    }

    public static Optional<Book> getBookByName(String name) {
        String selectSql = "SELECT * FROM book b WHERE b.name = ?";
        Connection conn = DBConfiguration.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement(selectSql);
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            return mapToBook(rs);
        } catch (SQLException e){
            e.printStackTrace();
        }
        return Optional.empty();
    }

    public static Optional<Book> getBookByPublisher(String publisher) {
        String selectSql = "SELECT * FROM book b WHERE b.publisher = ?";
        Connection conn = DBConfiguration.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement(selectSql);
            ps.setString(1, publisher);
            ResultSet rs = ps.executeQuery();
            return mapToBook(rs);
        } catch (SQLException e){
            e.printStackTrace();
        }
        return Optional.empty();
    }

    public static Optional<Book> getBookByPages(int pages) {
        String selectSql = "SELECT * FROM book b WHERE b.pages = ?";
        Connection conn = DBConfiguration.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement(selectSql);
            ps.setInt(1, pages);
            ResultSet rs = ps.executeQuery();
            return mapToBook(rs);
        } catch (SQLException e){
            e.printStackTrace();
        }
        return Optional.empty();
    }

    public static Optional<Book> getBookByPublishingYear(int publishingyear) {
        String selectSql = "SELECT * FROM book b WHERE b.publishingyear = ?";
        Connection conn = DBConfiguration.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement(selectSql);
            ps.setInt(1, publishingyear);
            ResultSet rs = ps.executeQuery();
            return mapToBook(rs);
        } catch (SQLException e){
            e.printStackTrace();
        }
        return Optional.empty();
    }
}
