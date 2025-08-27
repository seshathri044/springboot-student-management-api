# Springboot-student-management-demo

A **Spring Boot RESTful API** for managing students, authentication, and greeting endpoints.  
This project demonstrates **REST best practices**, and **clean code structure** using Spring Boot.

---

## 🚀 Features
- **Hello API** – Basic test endpoint.
- **Login API** – Simple login response service.
- **Student API** – Get all students (GET)

---

## 🛠️ Tech Stack
- **Java 21**
- **Spring Boot 3.x**
- **Maven**
- **REST APIs**
- **Postman (API testing)**

---

## 📂 Project Structure
```bash
src/main/java/com/example/FirstAPI
│── controller
│ ├── HelloController.java
│ ├── LoginController.java
│── service
│ ├── HelloService.java
│── FirstApiApplication.java
```

---

## ▶️ Getting Started

### 1. Clone the repository
```bash
git clone https://github.com/<your-username>/springboot-student-management-api.git
cd springboot-student-management-api
```
### 2. Build & Run
```bash
mvn spring-boot:run
```
### 3. API will run at:
```bash
http://localhost:8080
```

---


## 📡 API Endpoints
- ✅ Hello API
GET /
Response: "Seshathri"
<img width="1920" height="1020" alt="SB1" src="https://github.com/user-attachments/assets/db4816be-02d3-401f-ae0d-ff2155e941aa" />
- ✅ Login API
GET /login
Response: "Successfully Login"
<img width="1920" height="1020" alt="SB1 1" src="https://github.com/user-attachments/assets/d02a8d9b-e55e-4d2e-a61e-b343fee2deba" />

---


##   📌 Example JSON for POST/PUT:
```bash
{
  "rno": 1,
  "name": "Seshathri",
  "technology": "Java"
}
```


---


##   🧪 Testing
- Use Postman or cURL to test APIs.
- Example:
curl -X GET http://localhost:8080/students

---


## 📖 Future Improvements
### Full CRUD support:
  - Create student (POST)
  - Get all students (GET)
  - Get student by ID (GET)
  - Update student (PUT)
  - Delete student (DELETE)

---


## 👨‍💻 Author
- Seshathri M
- 📌 Aspiring Software Engineer | Java & Spring Boot Developer

## ⭐ Contribute
Contributions are welcome! Feel free to fork, submit PRs, or open issues.
