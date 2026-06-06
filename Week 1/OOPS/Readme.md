# Library Management System

## Overview

This project demonstrates the use of **Interfaces, Inheritance, and Polymorphism** in Java through a simple Library Management System.

The system supports two types of users:

* **KidUser** – Can register only if age is less than 12 and can borrow only Kids books.
* **AdultUser** – Can register only if age is greater than 12 and can borrow only Fiction books.

## Features

### KidUser

* Registration allowed only for users below 12 years of age.
* Can request only books categorized as `"Kids"`.
* Borrowed books must be returned within 10 days.

### AdultUser

* Registration allowed only for users above 12 years of age.
* Can request only books categorized as `"Fiction"`.
* Borrowed books must be returned within 7 days.

## Technologies Used

* Java
* Object-Oriented Programming (OOP)
* Interfaces

## Class Structure

### Interface: `LibraryUser`

```java
interface LibraryUser {
    void registerAccount();
    void requestBook();
}
```

### Classes

#### `KidUser`

Implements the `LibraryUser` interface and handles registration and book requests for children.

#### `AdultUser`

Implements the `LibraryUser` interface and handles registration and book requests for adults.

#### `LibraryU`

Contains the `main()` method used to test different scenarios.

## Sample Output

```text
case1: KidUser

you have successfully registerd under a kid Account
Sorry age must be less than 12 to register as a kid
Book Issued successfully ,please return the book with in 10 days
Oops you are allowed to take only kids books

Case2: Adult user

Sorry age must be greater than 12 to registerd as a adult
You have successfult registerd under an adult Account
Oops you are allowed to take only adult fiction books
Book Issued successfully ,please return the book with in 7 days
```

## How to Run

1. Save the code in a file named `LibraryU.java`.
2. Open a terminal in the project directory.
3. Compile the program:

```bash
javac LibraryU.java
```

4. Run the program:

```bash
java LibraryU
```

## Concepts Demonstrated

* Java Interfaces
* Method Implementation
* Conditional Statements
* Object-Oriented Programming
* Class Design
* Basic Library User Management

## Author

Created as a Java OOP practice project demonstrating interface implementation and user-specific business rules.
