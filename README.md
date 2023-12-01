# SOLID principles

## Single Responsibility Principle

### Violations:
1. **Invoice Class Responsibilities:**
   - The 'Invoice' class violates the SRP by handling multiple responsibilities:
     - Adding and deleting invoices are closely related to the class name but the 'sendEmail' function's purpose is distant from the invoice class.
   - The 'add' and 'delete' functions are lengthy, deviating from the principle of single responsibility.

### Changes Made:
1. **Design Changes:**
   - Introduced an interface (IConnectionDb) with functions 'connectToAdd' and 'connectToDelete' for 'add' and 'delete' operations, linked to the 'Invoice' class through composition.
   - 'sendEmail' function is placed in an interface (ISendEmail) linked to the 'Invoice' class via composition.
     
### Draw a class diagram for the new design for the first project :

![Single Respon](https://user-images.githubusercontent.com/99614732/196451420-d0e324a3-d296-4b55-9aca-49476e0e6d3f.png)

## Open-Closed Principle

### Violations:
1. **Calculator Class:**
   - Violates the OCP due to difficulties in extending and reusing the 'getOperationResult()' method.
   - Adding new mathematical operations involves altering the if-statements within the method.

### Changes Made:
1. **Design Enhancements:**
   - Introduced an interface (IGetOperationResult) with a 'result' function for operations like addition, counting, maximum, minimum, and multiplication.
   - Implementation classes (Addition, Count, Max, Min, Multiplication) are linked to the Calculator class through aggregation for specific operations.
     
### Draw a class diagram for the new design for the Second project :

![Open-Closed](https://user-images.githubusercontent.com/99614732/196451698-eb1ea64d-2dea-499c-8075-43b0b604ee0b.png)

## Liskov Substitution Principle

### Violations:
1. **Limited Customer Subclass Issue:**
   - Subclasses (e.g., LimitedCustomer) cannot substitute their superclass (Customer), leading to non-functional code when using the superclass.

### Changes Made:
1. **Design Changes:**
   - Introduced a parent class (GeneralCustomer) containing common functions, with both LimitedCustomer and PublicCustomer inheriting from it.
   - Override functions modified in the subclasses to resolve the Liskov Substitution issue.
     
###  Draw a class diagram for the new design for the third project : 
![Liskov](https://user-images.githubusercontent.com/99614732/196494025-f054fc50-0fe4-40f2-a6cb-30031d9cf8bb.png)

## Interface Segregation Principle

### Violations:
1. **Bird Interface Implementation:**
   - The 'Bird' interface forces classes (Eagle and Penguin) to implement all behaviors, leading to unnecessary implementations for each class.

### Changes Made:
1. **Design Enhancements:**
   - Built separate interfaces (IFlight, ISwimming, IMolting) for specific behaviors, allowing Eagle and Penguin classes to implement only necessary interfaces.
     
### Draw a class diagram for the new design for the fourth project :

![interface](https://user-images.githubusercontent.com/99614732/196451991-65e17014-e84e-4b1d-91be-70277837df1d.png)

## Dependency Inversion Principle

### Violations:
1. **Tight Module Connections:**
   - High-level module (WindowsMachine) imports from low-level modules (Keyboard and Monitor) directly, causing tight coupling.

### Changes Made:
1. **Design Changes:**
   - Created interfaces (IKeyboard, IMonitor) implemented by classes (MyKeyboard, MyMonitor).
   - WindowsMachine class is linked to the interfaces (IKeyboard, IMonitor) via composition, ensuring high-level modules depend on abstractions.
### Draw a class diagram for the new design for the fifth project : 

![Dependency-Inversion_](https://user-images.githubusercontent.com/99614732/196495530-c29326bf-18ef-4a58-8e85-016a3fa5f255.png)


