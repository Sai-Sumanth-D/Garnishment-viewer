function addGarnishment() {
  const employeeName = document.getElementById("employeeName").value;
  const amount = parseFloat(document.getElementById("amount").value);
  const status = document.getElementById("status").value;
  const courtDate = document.getElementById("courtDate").value;
  const createdBy = document.getElementById("createdBy").value;

  GarnishmentController.addGarnishment(
    employeeName,
    amount,
    status,
    courtDate,
    createdBy,
    function (response) {
      document.getElementById("addResponse").innerText = response;
    }
  );
}

function getGarnishment() {
  const caseId = parseInt(document.getElementById("searchCaseId").value);

  GarnishmentController.getGarnishmentByCaseId(caseId, function (response) {
    console.log("✅ Received response:", response); // For debugging

    if (response) {
      document.getElementById("garnishmentDetails").innerHTML =
        `<b>Case ID:</b> ${response.caseId}<br>` +
        `<b>Employee Name:</b> ${response.employeeName}<br>` +
        `<b>Amount:</b> ${response.amount}<br>` +
        `<b>Status:</b> ${response.status}<br>` +
        `<b>Court Date:</b> ${new Date(
          response.courtOrderDate
        ).toLocaleDateString()}<br>` +
        `<b>Created By:</b> ${response.createdBy}`;
    } else {
      document.getElementById("garnishmentDetails").innerText =
        "❌ No record found.";
    }
  });
}
