Employee Management System 📋👨‍💼👩‍💼
A simple Employee Management System built using Spring Boot that allows you to perform CRUD operations on employee data. This application supports various features such as adding, deleting, updating, and retrieving employee information.

Features 🚀
Add Employee ✍️: Add new employees with their details like name, phone, salary, etc.
Delete Employee 🗑️: Delete employees from the system by their ID.
Get Employee by Name 🔍: Search for employees by their name.
Get Employee by ID 🆔: Fetch a specific employee's details by their ID.
Get Employee with Highest Salary 💰: Get the employee with the highest salary in the system.
Get All Employees 📜: Retrieve the list of all employees in the system.
Tech Stack 🛠️
Backend: Spring Boot
Database: MySQL
API Testing: Postman
API Documentation 📡
1. Create Employee ✍️
Method: POST
Endpoint: /api/v1/employees
Request Body:
json
Copy code
{
  "name": "John Doe",
  "phone": "+1234567890",
  "email": "john.doe@example.com",
  "address": "123 Main St, Springfield, IL",
  "salary": 50000.0,
  "bloodgroup": "O+",
  "designation": "Software Engineer",
  "dateofjoin": "2024-01-15"
}
2. Delete Employee 🗑️
Method: DELETE
Endpoint: /api/v1/employees/{id}
Path Variable: id (Employee ID)
3. Get Employee by Name 🔍
