# **Employee Management System** 📋👨‍💼👩‍💼

A simple **Employee Management System** built using **Spring Boot** that allows you to perform CRUD operations on employee data. This application supports various features such as adding, deleting, updating, and retrieving employee information.

---

## **Features** 🚀

- **Add Employee** ✍️: Add new employees with their details like name, phone, salary, etc.
- **Delete Employee** 🗑️: Delete employees from the system by their ID.
- **Get Employee by Name** 🔍: Search for employees by their name.
- **Get Employee by ID** 🆔: Fetch a specific employee's details by their ID.
- **Get Employee with Highest Salary** 💰: Get the employee with the highest salary in the system.
- **Get All Employees** 📜: Retrieve the list of all employees in the system.

---

## **Tech Stack** 🛠️
```
- **Backend**: Spring Boot  
- **Database**: MySQL  
- **API Testing**: Postman
``` 

---

## **API Documentation** 📡

### **1. Create Employee** ✍️
- **Method**: `POST`  
- **Endpoint**: `/api/v1/employees`  
- **Request Body**:  
```json
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
```
2. Delete Employee 🗑️
Method: DELETE
Endpoint: /api/v1/employees/{id}
Path Variable: id (Employee ID)
3. Get Employee by Name 🔍
Method: GET
Endpoint: /api/v1/employees/name/{name}
Path Variable: name (Employee Name)
4. Get Employee by ID 🆔
Method: GET
Endpoint: /api/v1/employees/{id}
Path Variable: id (Employee ID)
5. Get Employee with Highest Salary 💰
Method: GET
Endpoint: /api/v1/employees/highest-salary
6. Get All Employees 📜
Method: GET
Endpoint: /api/v1/employees
How to Use with Postman 📬
To test the API using Postman, follow these steps:

Clone the repository:

bash
Copy code
git clone https://github.com/yourusername/employee-management-system.git
Navigate to the project directory:

bash
Copy code
cd employee-management-system
Run the Spring Boot application:

bash
Copy code
mvn spring-boot:run
Download the Postman Collection:
Import the Postman collection file (if available) or manually create requests in Postman.

Test the APIs:

Use POST for creating new employees.
Use GET to fetch employees by ID, name, or the highest salary.
Use DELETE to remove an employee by ID.
Setup Instructions ⚙️
Clone the repository:

bash
Copy code
git clone https://github.com/yourusername/employee-management-system.git
Navigate to the project directory:

bash
Copy code
cd employee-management-system
Ensure prerequisites:
Make sure you have Java and MySQL installed on your system.

Configure your application.properties file:
Update the following properties:

properties
Copy code
spring.datasource.url=jdbc:mysql://localhost:3306/your_database
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
Run the application:

bash
Copy code
mvn spring-boot:run
Access the application:
Visit:
http://localhost:8080 for API testing.

Contributing 🤝
Contributions are always welcome! Follow these steps to contribute:

Fork the repository.
Create a feature branch:
bash
Copy code
git checkout -b feature/your-feature
Commit your changes:
bash
Copy code
git commit -am 'Add your-feature'
Push to the branch:
bash
Copy code
git push origin feature/your-feature
Create a Pull Request.
Acknowledgments 🙏
Thanks to Spring Boot for simplifying backend development.
Thanks to Postman for testing and managing API requests efficiently.
