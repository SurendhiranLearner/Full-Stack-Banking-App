# Full-Stack-Banking-App


🏦 Full Stack Banking Application (3-Tier Architecture)
A secure and responsive full-stack Banking Management System built using:

Java Spring Boot for the backend (REST + MVC)

Thymeleaf as the server-side templating engine for dynamic UI

MySQL as the relational database for persistent storage

🧱 3-Tier Architecture
Presentation Layer: Thymeleaf + HTML/CSS/Bootstrap

Business Logic Layer: Spring Boot Services & Controllers

Data Access Layer: Spring Data JPA with MySQL

🚀 Features
✅ Customer Registration & Login (Spring Security)

✅ Account Management (Savings, Current)

✅ Deposit & Withdrawal

✅ Fund Transfer (Between accounts)

✅ Transaction History

✅ Admin Dashboard (View users, accounts, total balance)

✅ Error handling & input validations

✅ Responsive UI with Bootstrap

🛠️ Tech Stack
Layer	Technology
Frontend (View)	Thymeleaf, HTML, CSS, Bootstrap
Backend (Controller, Service)	Spring Boot, Spring MVC, Spring Security
Persistence (DAO)	Spring Data JPA, Hibernate
Database	MySQL
Tools	Maven, Spring Initializr, VS Code / IntelliJ

📂 Project Structure
cpp
Copy
Edit
src/
├── controller/
├── service/
├── repository/
├── model/
├── templates/
├── static/
└── application.properties
⚙️ Setup Instructions
Clone the Repository

bash
Copy
Edit
git clone https://github.com/yourusername/banking-app.git
cd banking-app
Configure MySQL Database

Create a MySQL database: banking_db

Update application.properties with your DB credentials.

Run the App

bash
Copy
Edit
mvn spring-boot:run
Access the App

Frontend: http://localhost:8080

Admin Panel: /admin/login

🔐 Default Users (for demo)
Role	Username	Password
Admin	admin	admin123
Customer	user1	pass123
