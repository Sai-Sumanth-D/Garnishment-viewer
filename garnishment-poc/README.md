# Garnishment Viewer PoC

This project is a Java-based Proof of Concept (PoC) to demonstrate a basic garnishment management system. It allows HR or Payroll users to add, retrieve, and view garnishment records for employees using a web UI, with backend processing in Java and PostgreSQL database integration.

---

## 🚀 Tech Stack

| Layer        | Technology                  |
|-------------|------------------------------|
| Frontend     | HTML, JavaScript, DWR (Direct Web Remoting) |
| Backend      | Plain Java 1.8, JDBC         |
| Middleware   | DWR 3.0.2                    |
| Database     | PostgreSQL                   |
| Server       | JBoss EAP 7.4                |
| Build Tool   | Manual WAR Packaging (`jar cvf`) |

---

## 🎯 Use Case

> HR/Payroll departments often need to manage **court-ordered wage garnishments**. This tool helps record garnishment cases, retrieve records by case ID, and view detailed employee garnishment data in real-time.

---



---

## ⚙️ Functionality

- ✅ Add new garnishment via form
- ✅ Search garnishment by case ID
- ✅ Display employee garnishment details
- ✅ Validate PostgreSQL DB connectivity
- 🔜 (Planned) Upload CSV to prefill form and confirm entries

---

## 🧠 Data Flow

User Input (Form) ➝ DWR JavaScript Proxy ➝ Java Controller ➝ JDBC Repository ➝ PostgreSQL

⬑ HTML Render ⬑ DWR Callback ⬑ Java Object ⬑ Query Result

# Package WAR
jar cvf garnishment-poc.war -C webcontent/ .

# Deploy to JBoss
cp garnishment-poc.war ~/Desktop/garnishment-poc/jboss-eap-7.4/standalone/deployments/
cd ~/Desktop/garnishment-poc/jboss-eap-7.4/bin
./standalone.sh


Access the app at:
👉 http://localhost:8080/garnishment-poc/index.html


🤝 Contributing
This is an internal PoC, but contributions or suggestions are welcome.

📄 License
This project is provided for demonstration and educational purposes.

