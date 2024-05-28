package Service;

import Config.DBConfiguration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteFromDB {
    private static DeleteFromDB instance;

    private DeleteFromDB() {

    }

    public static void deleteBookById(int id) {
        String deleteBookSql = "DELETE FROM book b WHERE b.id = ?";
        Connection conn = DBConfiguration.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement(deleteBookSql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void deleteCDById(int id){
        String deleteCDSql = "DELETE FROM cd c WHERE c.id = ?";
        Connection conn = DBConfiguration.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement(deleteCDSql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void deleteAuthorById(int id){
        String deleteAuthorSql = "DELETE FROM author a WHERE a.id = ?";
        Connection conn = DBConfiguration.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement(deleteAuthorSql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteReaderById(int id){
        String deleteReaderSql = "DELETE FROM reader r WHERE r.id = ?";
        Connection conn = DBConfiguration.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement(deleteReaderSql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
