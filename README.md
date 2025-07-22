# 📋 Task Management System – TÔ DOido App 
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)

**TÔ DOido** is a Java desktop application for managing personal and group tasks, built with a clean and responsive graphical user interface using Swing.

The name **"TÔ DOido"** is a creative play on words in Portuguese:  
It reflects how we often feel overwhelmed when we have too many tasks to handle (literal translation: *"I'm going crazy"*) — while also cleverly embedding "**TO DO**" in uppercase within the name, referencing a traditional **to-do list** application. The dual meaning blends humor and utility, making the app memorable and relevant.

---

## ✅ Key Features

- User registration and login
- Task creation, editing, and deletion
- Task grouping and organization
- Assignment of tasks to custom challenges
- PDF report generation for tasks and challenges
- Access control for regular users and administrators
- Responsive and intuitive GUI built with Java Swing

---

## 🧩 Package Structure

- `model` – Domain classes: `User`, `Task`, `TaskGroup`, `Challenge`
- `dao` – Data access layer: `UserDAO`, `TaskDAO`, `GroupDAO`, `ChallengeDAO`, `TaskChallengeDAO`, `ConnectionDAO`
- `controller` – Application logic: `TodoController`
- `view` – Graphical interface screens: `Login`, `Dashboard`, `Tasks`, `Groups`, `Challenges`, etc.
- `report` – PDF report generation module
- `exceptions` – Custom exception handling
- `images` – Icons and UI assets

---

## ⚙️ Requirements & Execution

### Prerequisites

- Java Development Kit (JDK) 8 or higher  
- MySQL Server  
- External libraries (included in the classpath via NetBeans):
  - **JDBC Driver**
  - **FlatLaf** for modern UI look and feel
  - **iTextPDF** for report generation
  - **MySQL Connector/J**  
- Recommended IDE: **NetBeans**

### Running the Application

1. Open the `Trabalho3` project in NetBeans.
2. Configure database credentials in `dao/ConnectionDAO.java`.
3. Build the project (`F11`).
4. Run the application (`F6`).
5. Log in and explore the features based on your user profile.

---

## 💾 Database Configuration

Ensure the MySQL database is properly set up and connected. The configuration file is located at:

```java
dao/ConnectionDAO.java
