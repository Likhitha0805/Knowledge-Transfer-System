# Knowledge Management System (Java + MongoDB)

## Description

The **Knowledge Management System** is a Java-based application integrated with **MongoDB** to store, manage, and retrieve knowledge records efficiently. The project demonstrates how a Java application can interact with a NoSQL database using the MongoDB Java Driver and perform basic CRUD (Create, Read, Update, Delete) operations.

This project is ideal for academic mini-projects and for students learning Java backend development and NoSQL databases.

---

## Tech Stack

* **Language:** Java
* **Database:** MongoDB
* **Driver:** MongoDB Java Driver (v3.12.14)
* **JDK:** Java 8 or higher
* **IDE:** Eclipse / IntelliJ IDEA / VS Code

---

## Project Structure

```
KnowledgeManagementSystem/
│
├── MainApp.java              # Application entry point
├── Knowledge.java            # Model class
├── KnowledgeService.java     # MongoDB service layer
├── mongo-java-driver-3.12.14.jar
└── README.md
```

---

## Features

* Connects Java application with MongoDB
* Stores knowledge records in a NoSQL database
* Performs CRUD operations
* Modular and easy-to-understand code

---

## MongoDB Connection Setup

### 1️. Start MongoDB Server

Make sure MongoDB is installed and running on your system.

* **Windows:**

  ```bash
  mongod
  ```
* **Linux / macOS:**

  ```bash
  sudo systemctl start mongod
  ```

MongoDB runs by default on:

```
mongodb://localhost:27017
```

---

### 2️. MongoDB Connection Code (Java)

The application connects to MongoDB using the MongoDB Java Driver.

```java
MongoClient mongoClient = new MongoClient("localhost", 27017);
MongoDatabase database = mongoClient.getDatabase("knowledgeDB");
MongoCollection<Document> collection = database.getCollection("knowledge");
```

* **Database Name:** `knowledgeDB`
* **Collection Name:** `knowledge`

---

### 3️. Add MongoDB Driver to Classpath

Ensure `mongo-java-driver-3.12.14.jar` is added to your project:

* Eclipse: Right-click Project → Build Path → Add External JARs
* Command Line:

  ```bash
  javac -cp .;mongo-java-driver-3.12.14.jar *.java
  ```

---

## How to Run

1. Start MongoDB server
2. Compile the project:

   ```bash
   javac *.java
   ```
3. Run the application:

   ```bash
   java MainApp
   ```

bash
javac *.java

````
5. Run the application:
```bash
java MainApp
````
---

## Future Enhancements

* GUI or Web interface
* User authentication
* Search and filter functionality
* Improved error handling

---

## 📤 Sample Output

Below is an example of the console output when the application is executed successfully:

```text
Connected to MongoDB successfully.
Database selected: knowledgeDB

Inserting Knowledge Record...
Knowledge added successfully.

Fetching Knowledge Records...
--------------------------------
ID: 101
Title: Java Basics
Description: Introduction to Java programming
--------------------------------

Updating Knowledge Record...
Knowledge updated successfully.

Deleting Knowledge Record...
Knowledge deleted successfully.

Application executed successfully.
```

This output confirms:

* Successful MongoDB connection
* CRUD operations working correctly
* Proper interaction between Java and MongoDB

---

## Conclusion

This project provides hands-on experience in integrating Java with MongoDB and helps build a strong foundation in backend development and NoSQL database concepts.
