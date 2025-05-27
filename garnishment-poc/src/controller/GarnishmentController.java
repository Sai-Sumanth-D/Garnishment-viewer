package controller;

import java.util.Date;
import java.util.List;
import model.Garnishments;
import repo.GarnishmentRepository;

public class GarnishmentController {

    private GarnishmentRepository repo = new GarnishmentRepository();

    // ✅ Add new garnishment
    public String addGarnishment(String employeeName, double amount, String status, String courtOrderDateStr,
            String createdBy) {
        try {
            Date courtOrderDate = java.sql.Date.valueOf(courtOrderDateStr); // Format: YYYY-MM-DD
            Garnishments g = new Garnishments();
            g.setEmployeeName(employeeName);
            g.setAmount(amount);
            g.setStatus(status);
            g.setCourtOrderDate(courtOrderDate);
            g.setCreatedBy(createdBy);

            boolean result = repo.insertGarnishment(g);
            return result ? "✅ Insert successful" : "❌ Insert failed";

        } catch (Exception e) {
            return "❌ Error: " + e.getMessage();
        }
    }

    // ✅ Get one garnishment by case ID
    public Garnishments getGarnishmentByCaseId(int caseId) {
        return repo.getGarnishmentByCaseId(caseId);
    }

    // ✅ Get all garnishments (optional utility)
    public List<Garnishments> getAllGarnishments() {
        return repo.getAllGarnishments();
    }
}
