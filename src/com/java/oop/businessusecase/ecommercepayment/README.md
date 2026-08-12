
```markdown
# 🛒 E-Commerce Payment Gateway - Core Java OOPs Implementation

## 📝 Overview
This project is a console-based Core Java application that simulates a real-world E-Commerce Payment Gateway. It is designed specifically to demonstrate the practical implementation of the **4 Pillars of Object-Oriented Programming (OOP)** along with **HAS-A (Composition/Association)** relationships.

## 🏛️ System Architecture

The architecture separates the independent entities (Customer) from the transactional entities (Payment) and routes them through a centralized Service layer.

```text
                    Customer (Independent Domain)
                       │
                       │ [HAS-A Relationship]
                       ▼
                    Payment (Abstract Parent Domain)
                       │
          ┌────────────┼────────────┐
          ▼            ▼            ▼
     UpiPayment   CreditCardPayment WalletPayment (Future Scope)
     [IS-A]       [IS-A]            [IS-A]

```

## 📁 Project Structure

```text
src/
└── com/java/oop/businessusecase/paymentgateway/
    ├── Customer.java               # Independent entity
    ├── Payment.java                # Abstract base class (Parent)
    ├── UpiPayment.java             # Concrete implementation (Child)
    ├── CreditCardPayment.java      # Concrete implementation (Child)
    ├── PaymentGatewayService.java  # Business logic & Polymorphism router
    └── Main.java                   # Application entry point & execution

```

## 🚀 Key OOP Concepts Demonstrated

### 1. Encapsulation (Data Hiding & Security)

* All class fields (e.g., `amount`, `status`, `transactionId`) are declared as `private`.
* Strict adherence to **Java Bean Standards** using public Getters, Setters, and No-Args constructors.
* **Proof:** Child classes (`UpiPayment`, `CreditCardPayment`) cannot directly modify the transaction status. They must use the public setter `setStatus("SUCCESS")`, preventing unauthorized data manipulation.

### 2. Abstraction (Hiding Implementation Details)

* The `Payment` class is declared as `abstract` because a "Generic Payment" does not exist in the real world. You cannot instantiate `new Payment()`.
* It defines an abstract method `processPayment()`, acting as a strict contract that forces every specific payment type to provide its own implementation.

### 3. Inheritance (IS-A Relationship for Code Reusability)

* `UpiPayment` and `CreditCardPayment` extend the `Payment` base class.
* They reuse common fields (`amount`, `paymentDate`, `customer`) without rewriting them, utilizing the `super(...)` constructor to pass data up the chain.

### 4. Polymorphism (Many Forms)

* **Runtime Polymorphism (Method Overriding):**
* The `PaymentGatewayService` handles payments dynamically via `executePayment(Payment payment)`.
* At runtime, Java automatically decides whether to execute the UPI logic or the Credit Card logic based on the actual object passed, even though the reference type is the parent `Payment`.


* **Compile-Time Polymorphism (Method Overloading):**
* The service class implements multiple `processRefund()` methods.
* Passing only the `Payment` object initiates a **Full Refund**, while passing `(Payment, BigDecimal)` initiates a **Partial Refund**.



### 5. Composition / Association (HAS-A Relationship)

* A Payment cannot exist without a Customer.
* The `Payment` class holds a reference to the `Customer` object (`private Customer customer;`), establishing a strict HAS-A relationship rather than forcing an unnatural parent-child hierarchy.

## 🛠️ Industry Best Practices Followed

* **High Precision Mathematics:** Utilized `java.math.BigDecimal` exclusively for monetary values to prevent the precision loss inherent in floating-point operations (`double`/`float`). Created via `String` constructors.
* **Chronology:** Used `java.time.LocalDate` for recording transaction dates instead of legacy Date classes or Strings.
* **Data Masking:** Sensitive information like Credit Card numbers are masked (e.g., `XXXX-XXXX-XXXX-1234`) to simulate security compliance.

## 💻 Execution Flow

1. Independent `Customer` object is instantiated.
2. Specific payment objects (`UpiPayment`, `CreditCardPayment`) are created by injecting the `Customer` dependency.
3. The `PaymentGatewayService` processes the transactions dynamically and issues refunds via overloaded methods.

```

```