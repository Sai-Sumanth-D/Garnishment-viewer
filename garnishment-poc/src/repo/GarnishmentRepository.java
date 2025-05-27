// 

package repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Garnishments;
import util.DBConnection;

public class GarnishmentRepository {

    public boolean insertGarnishment(Garnishments g) {
        String sql = "INSERT INTO garnishment_records (employee_name, amount, status, court_order_date, created_by) " +
                "VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = DBConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, g.getEmployeeName());
            stmt.setDouble(2, g.getAmount());
            stmt.setString(3, g.getStatus());
            stmt.setDate(4, new java.sql.Date(g.getCourtOrderDate().getTime()));
            stmt.setString(5, g.getCreatedBy());

            return stmt.executeUpdate() > 0;

        } catch (Exception e) {
            System.err.println("❌ Error inserting garnishment: " + e.getMessage());
            return false;
            
        }
    }

    public Garnishments getGarnishmentByCaseId(int caseId) {
        Garnishments g = null;
        try (Connection conn = DBConnection.getConnection()) {
            String query = "SELECT * FROM garnishment_records WHERE case_id = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, caseId);
            ResultSet rs = stmt.executeQuery();
    
            if (rs.next()) {
                g = new Garnishments();
                g.setEmployeeName(rs.getString("employee_name"));
                g.setAmount(rs.getDouble("amount"));
                g.setStatus(rs.getString("status"));
                g.setCourtOrderDate(rs.getDate("court_order_date"));
                g.setCreatedBy(rs.getString("created_by"));
            }
    
        } catch (Exception e) {
            e.printStackTrace();
        }
        return g;
    }

    public List<Garnishments> getAllGarnishments() {
        String sql = "SELECT * FROM garnishment_records";
        List<Garnishments> list = new ArrayList<>();

        try (Connection conn = DBConnection.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Garnishments g = new Garnishments();
                g.setCaseId(rs.getInt("case_id"));
                g.setEmployeeName(rs.getString("employee_name"));
                g.setAmount(rs.getDouble("amount"));
                g.setStatus(rs.getString("status"));
                g.setCourtOrderDate(rs.getDate("court_order_date"));
                g.setCreatedBy(rs.getString("created_by"));
                list.add(g);
            }

        } catch (Exception e) {
            System.err.println("❌ Error fetching all garnishments: " + e.getMessage());
        }

        return list;
    }
}
