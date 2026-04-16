# 🎓 Smart Campus Management System

## 📌 Project Overview
Smart Campus Management System is a Java-based console application developed for managing students, courses, and enrollments efficiently. The system demonstrates Object-Oriented Programming (OOP), Collections, Exception Handling, and Multithreading concepts.

---

## 🚀 Features

### 👨 Student Management
- Add new students
- View all students
- Store student details (ID, Name, Email)

### 📚 Course Management
- Add courses
- Store course details (Course ID, Name, Fee)

### 🔗 Enrollment System
- Enroll students into multiple courses
- Async processing using Threads

### ⚠️ Exception Handling
- Custom exception for invalid input validation
- Proper error handling for user input

### 🧵 Multithreading
- Enrollment process runs in separate thread to simulate real-world async behavior

---

## 🧠 Technologies Used
- Java
- OOP Concepts
- Collections (ArrayList, HashMap)
- Exception Handling
- Multithreading

---

## 📂 Project Structure

src/
└── smartcampus/
├── Main.java
├── models/
│ ├── Student.java
│ └── Course.java
├── services/
│ ├── StudentService.java
│ ├── CourseService.java
│ └── EnrollmentService.java
├── exceptions/
│ └── InvalidDataException.java
└── utils/
└── FileStorage.java


---

## ⚙️ How to Run

### Step 1: Compile
```bash
javac smartcampus/**/*.java
Step 2: Run
java smartcampus.Main
🎯 Menu Options
Add Student
Add Course
Enroll Student
View Students
View Enrollments
Exit

**SCREENSHOT**
<img width="1920" height="981" alt="Screenshot (33)" src="https://github.com/user-attachments/assets/301f946d-70bf-4391-8020-95a02bc52d58" />
