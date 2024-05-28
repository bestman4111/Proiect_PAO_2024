package Service;

import Config.DBConfiguration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateInDB {
    private static UpdateInDB instance;

    private UpdateInDB() {

    }

    public static void updateBookPagesById(int pages, int id){
        String updateBookSql = "UPDATE book b SET b.pages = ? WHERE b.id = ?";
        Connection conn = DBConfiguration.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement(updateBookSql);
            ps.setInt(1, pages);
            ps.setInt(2, id);
            ps.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void updateReaderBirthYearById(int birthyear, int id){
        String updateReaderSql = "UPDATE reader r SET r.birthyear = ? WHERE r.id = ?";
        Connection conn = DBConfiguration.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement(updateReaderSql);
            ps.setInt(1, birthyear);
            ps.setInt(2, id);
            ps.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void updateAuthorNoOfBooksById(int noOfBooks, int id){
        String updateAuthorSql = "UPDATE author a SET a.nobooks = ? WHERE a.id = ?";
        Connection conn = DBConfiguration.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement(updateAuthorSql);
            ps.setInt(1, noOfBooks);
            ps.setInt(2, id);
            ps.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void updateCDTracksById(int tracks, int id){
        String updateCDSql = "UPDATE cd c SET c.tracks = ? WHERE c.id = ?";
        Connection conn = DBConfiguration.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement(updateCDSql);
            ps.setInt(1, tracks);
            ps.setInt(2, id);
            ps.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
