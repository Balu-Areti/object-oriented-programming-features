

# 🏦 Java Banking System — OOP & System Design

A simple Banking System designed using **Core Java and Object-Oriented Programming (OOP)** principles.

The main goal of this project is not to build a production-ready banking application, but to understand how real-world banking concepts can be converted into **Java classes, objects, relationships, and business logic**.

This project helps visualize how concepts like **Inheritance, Encapsulation, Method Overriding, Runtime Polymorphism, Method Overloading, Constructors, `super`, Getters and Setters, `BigDecimal`, and `UUID**` work together in a small backend-style system.

1. Parent class = common business concept,
2. Child classes = different types of that concept
3. Overloading = same operation, different inputs
4. Overriding = each child behaves differently
---

## 🎯 Project Idea

In a real banking application, different types of bank accounts share common information.

**Every account may have:**

* Account Number
* Account Holder Name
* Balance
* Transaction ID


**But different account types have their own specific features:**

* **Savings Account:** Has an Interest Rate and Interest Calculation.
* **Current Account:** Has an Overdraft Limit and different interest rules.

Instead of creating completely separate classes with duplicate code, we create a common parent class. This is where **Inheritance** becomes useful.

```text
                    BankAccount
                        │
             ┌──────────┴──────────┐
             │                     │
             ▼                     ▼
      SavingsAccount        CurrentAccount

```

---

## 🏗️ Project Structure

```text
com.java.oop.businessusecase.banksystem
│
├── BankAccount.java
├── SavingsAccount.java
├── CurrentAccount.java
├── BankingService.java
└── Main.java

```

---

## 🧩 Class Responsibilities & OOP Concepts

### 1. `BankAccount` (The Parent Class)

`BankAccount` is the base class. It contains the common properties and behavior shared by different bank accounts.

```java
private String accountNumber;
private String accountHolderName;
private BigDecimal balance;
private UUID transactionId;

```

**Why here?** Instead of writing the same properties inside `SavingsAccount` and `CurrentAccount`, we define them once inside `BankAccount` and allow child classes to inherit them.

### 2. 🌳 Inheritance

Inheritance is used to establish an **IS-A** relationship.

* `public class SavingsAccount extends BankAccount` (SavingsAccount IS-A BankAccount)
* `public class CurrentAccount extends BankAccount` (CurrentAccount IS-A BankAccount)

**Why use inheritance?** It prevents code duplication. Without it, we would have to rewrite common fields in every account class.

### 3. 🔐 Encapsulation & Getters/Setters like JAVA BEEN uses Encapsulation with strict rules

The fields in `BankAccount` are declared as `private`.
**Why?** Because the object should control its own data. Another class (like `BankingService`) should not be able to directly modify the balance (`account.balance = 5000`). Instead, we use controlled methods like `account.deposit(amount)`.

* **Getter:** Used to read a value (e.g., `getBalance()`).
* **Setter:** Used to modify a value safely.

### 4. 💰 Why `BigDecimal` and `UUID`?

* **`BigDecimal`:** Money should never be represented using `double` or `float` because floating-point math can cause precision issues (e.g., 0.1 + 0.2 might not be exact). `BigDecimal` guarantees 100% accuracy for financial calculations.
* **`UUID`:** Used to generate a universally unique identifier (e.g., `550e8400-e29b-41d4-a716-446655440000`) for transactions, mimicking real-world banking logs.

### 5. 🔄 Method Overriding

Both child classes override the `calculateInterest()` method from the parent `BankAccount`.

* `SavingsAccount` calculates a 4.5% interest.
* `CurrentAccount` calculates 0% interest.

**Why?** The method name is the same, but the behavior changes based on the account type.

### 6. ⚡ Runtime Polymorphism (Dynamic Dispatch)

This is the most powerful part of the project. The `BankingService` method accepts the parent `BankAccount` as a parameter, not the specific child class.

```java
public void printAccountSummary(BankAccount account) {
    account.displayAccountDetails();
    account.calculateInterest();
}

```

At runtime, Java checks which actual object was passed (`SavingsAccount` or `CurrentAccount`) and executes that specific class's overridden methods.

### 7. 🔀 Method Overloading (Compile-Time Polymorphism)

`BankingService` contains two methods with the exact same name but different parameters:

1. `depositMoney(BankAccount account, BigDecimal amount)` -> For normal branch deposits.
2. `depositMoney(BankAccount account, BigDecimal amount, String upiId)` -> For UPI deposits.

### 8. 🧬 Understanding `super()` and `super.method()`

* **`super(...)`:** Used inside the child constructor to call the parent's constructor and initialize the parent's variables first.
* **`super.displayAccountDetails()`:** Used inside an overridden method to execute the parent's base logic before adding the child's specific logic.

---

## 📊 System Flow

```text
                         Main (Application Entry)
                          │
                          │ creates objects
                          ▼
                ┌────────────────────┐
                │  SavingsAccount    │
                │  CurrentAccount    │
                └─────────┬──────────┘
                          │
                          ▼
                  BankingService (Business Logic)
                          │
             ┌────────────┴────────────┐
             │                         │
             ▼                         ▼
      Print Summary               Deposit Money
             │                         │
             ▼                         ▼
     Runtime Polymorphism        BankAccount.deposit()
             │                         │
       ┌─────┴─────┐                   ▼
       ▼           ▼              Balance Updated
   Savings      Current

```

---

## 🧠 OOP Concepts Summary Cheat Sheet

| OOP Concept | Where Used in Project | Why We Used It |
| --- | --- | --- |
| **Class** | All `.java` files | Represents system components and blueprints. |
| **Object** | `Main` | Represents the actual, physical accounts in memory. |
| **Inheritance** | `extends BankAccount` | Reuses common account properties and behavior. |
| **Encapsulation** | `private` fields | Protects account data from direct outside modification. |
| **Method Overriding** | `calculateInterest()` | Allows different account types to calculate interest differently. |
| **Runtime Polymorphism** | `BankingService` parameter | Allows one single method to handle 100s of different account types. |
| **Method Overloading** | `depositMoney()` | Provides multiple ways to deposit money (Branch vs UPI) using one name. |
| **`super()`** | Child Constructors | Triggers the parent constructor to set up base data. |

---

## 🌍 How This Relates to Real Backend Development

In a real **Spring Boot** application, these Core Java concepts evolve into advanced layers:

* **`Main`** ➔ Transforms into API Controllers (`BankAccountController`).
* **`BankingService`** ➔ Transforms into Spring Services (`@Service`).
* **`BankAccount` (Domain Model)** ➔ Transforms into Database Entities (`@Entity`).

This project represents the foundational **Domain Model and Business Logic** layer of a true backend system.

> **💡 Note on System Design:**
> This is a **Java OOP + Basic Domain Design** exercise. True backend system design will eventually introduce databases (MySQL), APIs (REST), authentication (JWT), and exception handling. This OOP foundation is exactly the right place to start before jumping into Spring Boot!

---

## ▶️ How to Run

1. Clone the repository.
2. Open the project in IntelliJ IDEA or your preferred Java IDE.
3. Run `Main.java`.
4. The console will output the creation of accounts, polymorphism in action during summary printing, and overloaded deposit operations.