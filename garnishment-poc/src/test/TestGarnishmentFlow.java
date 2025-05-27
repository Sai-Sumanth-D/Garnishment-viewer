package test;

import controller.GarnishmentController;
import model.Garnishments;

public class TestGarnishmentFlow {
    public static void main(String[] args) {
        GarnishmentController controller = new GarnishmentController();

        System.out.println("🟢 Inserting a sample garnishment...");

        String result = controller.addGarnishment(
                "John ",
                75088.25,
                "Pending",
                "2024-12-01",
                "system_user")
                ;

        System.out.println(result);

        System.out.println("🔎 Fetching inserted garnishment by case ID = 1");

        Garnishments g = controller.getGarnishmentByCaseId(1); // change ID as needed

        if (g != null) {
            System.out.println("✅ Garnishment found:");
            System.out.println("Case ID       : " + g.getCaseId());
            System.out.println("Employee Name : " + g.getEmployeeName());
            System.out.println("Amount        : " + g.getAmount());
            System.out.println("Status        : " + g.getStatus());
            System.out.println("Order Date    : " + g.getCourtOrderDate());
            System.out.println("Created By    : " + g.getCreatedBy());
        } else {
            System.out.println("❌ No garnishment found with that case ID.");
        }
    }
}
