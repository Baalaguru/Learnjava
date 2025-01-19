This repository is for my reference
Creating a well-organized file structure for your Java learning repository will help you stay organized and make it easier to track your progress. Here's a breakdown of a clean, well-organized file structure and folder naming conventions for a Java learning project.

### 1. **Top-level Folder: `JavaLearning`**
   This is the root folder where all of your Java learning content will be stored.

### 2. **Subfolders & File Structure:**

#### `src/` (Source Code)
   This folder will contain all your Java source code files. Inside this folder, you'll organize your code into different packages based on topics or functionality you're learning.

   - `src/com/learnjava/basics/`  
     (Contains files related to basic Java concepts such as variables, data types, loops, conditions, etc.)
     
     - `HelloWorld.java`
     - `VariablesAndDataTypes.java`
     - `LoopsAndConditions.java`
   
   - `src/com/learnjava/arrays/`  
     (Contains files for learning about arrays in Java.)

     - `OneDimensionalArray.java`
     - `MultiDimensionalArray.java`

   - `src/com/learnjava/oop/`  
     (Files related to Object-Oriented Programming concepts in Java, such as classes, objects, inheritance, polymorphism, etc.)
   
     - `Person.java`  
     - `Student.java`
     - `Employee.java`
     - `InheritanceExample.java`
   
   - `src/com/learnjava/exceptionhandling/`  
     (Contains files that focus on learning about exceptions, try-catch blocks, custom exceptions, etc.)
   
     - `ExceptionHandlingExample.java`
     - `CustomException.java`

   - `src/com/learnjava/collections/`  
     (Files related to Java collections such as ArrayList, HashMap, Set, etc.)
   
     - `ArrayListExample.java`
     - `HashMapExample.java`

   - `src/com/learnjava/advanced/`  
     (More advanced concepts such as Streams, Lambda Expressions, and Threads.)
   
     - `LambdaExpressionExample.java`
     - `StreamAPIExample.java`
     - `ThreadExample.java`

#### `tests/` (Unit Tests)
   This folder will contain unit tests for the code you've written. It is helpful to practice writing tests alongside your Java code.

   - `tests/com/learnjava/basics/`  
     (Tests for your basic Java code.)
   
     - `TestHelloWorld.java`
     - `TestLoopsAndConditions.java`

   - `tests/com/learnjava/oop/`  
     (Tests for Object-Oriented Programming.)
   
     - `TestPerson.java`
     - `TestEmployee.java`

#### `docs/` (Documentation)
   This folder can contain any notes, explanations, guides, or learning resources that help you document what you're learning.

   - `docs/README.md`  
     (A high-level guide to your learning progress, how to run your code, and any other important information.)
   
   - `docs/JavaSyntax.md`  
     (Syntax and conventions you've learned in Java.)
   
   - `docs/OOPConcepts.md`  
     (Document key Object-Oriented Programming concepts and principles.)

#### `libs/` (Libraries)
   If you start working with external libraries (like JUnit for testing, etc.), you can store JAR files or related libraries here. For now, this might be empty.

#### `build/` (Build Files)
   If you're using build tools like Maven or Gradle, this folder is where build-related files and outputs will be generated. This might also be empty if you’re using basic file organization.

   - `build.gradle` (For Gradle builds)
   - `pom.xml` (For Maven builds)

#### `bin/` (Binary Files)
   If you compile your Java code manually, this folder will contain the compiled `.class` files. It will be auto-generated when you compile your Java files.

### 3. **Example Folder Tree:**

```
JavaLearning/
│
├── src/
│   └── com/
│       └── learnjava/
│           ├── basics/
│           │   ├── HelloWorld.java
│           │   ├── VariablesAndDataTypes.java
│           │   └── LoopsAndConditions.java
│           │
│           ├── arrays/
│           │   ├── OneDimensionalArray.java
│           │   └── MultiDimensionalArray.java
│           │
│           ├── oop/
│           │   ├── Person.java
│           │   ├── Student.java
│           │   ├── Employee.java
│           │   └── InheritanceExample.java
│           │
│           ├── exceptionhandling/
│           │   ├── ExceptionHandlingExample.java
│           │   └── CustomException.java
│           │
│           ├── collections/
│           │   ├── ArrayListExample.java
│           │   └── HashMapExample.java
│           │
│           └── advanced/
│               ├── LambdaExpressionExample.java
│               ├── StreamAPIExample.java
│               └── ThreadExample.java
│
├── tests/
│   └── com/
│       └── learnjava/
│           ├── basics/
│           │   ├── TestHelloWorld.java
│           │   └── TestLoopsAndConditions.java
│           │
│           ├── oop/
│           │   ├── TestPerson.java
│           │   └── TestEmployee.java
│           │
├── docs/
│   ├── README.md
│   ├── JavaSyntax.md
│   └── OOPConcepts.md
│
├── libs/ (Optional)
│
├── build/ (Optional)
│
└── bin/ (Optional)
```

### 4. **Learning Approach:**
   - **Start with basics:** Focus on simple programs like printing output, handling basic data types, and learning syntax.
   - **Object-Oriented Programming (OOP):** This is a core concept in Java, so spend considerable time understanding classes, objects, inheritance, and polymorphism.
   - **Exceptions and error handling:** Once you are comfortable with basic concepts, start practicing how to handle errors and exceptions.
   - **Collections & Data Structures:** Learn and practice Java collections like ArrayList, HashMap, etc., and also explore algorithms.
   - **Testing:** Practice writing unit tests using JUnit or another testing framework.
   - **Advanced Topics:** Explore Java Streams, lambda expressions, concurrency, and other advanced topics when you're ready.

By organizing your project like this, you will be able to follow a structured path to learning Java and easily refer back to topics you've studied. You’ll also get into the habit of writing tests and documenting your progress!
