# SOLID_third_Assignment
..................................................................................................

#Single Responsibility principles

1.	How does first project violate the Single Responsibility principles?
•	It contains three functions  1- add 2-delete: they are close to each other and have a relationship with the name of the class,
so you can add an invoice or delete an invoice. As for the function of 3- sendEmail: its function is a little far from the class of the invoice.

•	the second reason is the add and delete functions are a little too long for this class. 

That is, they violate the principles of single responsibility.


2.	Draw class diagram for the new design for first project :


![Single Respon](https://user-images.githubusercontent.com/99614732/196451420-d0e324a3-d296-4b55-9aca-49476e0e6d3f.png)


3.	Make the required change on the code to remove the SOLID violations?

•	functions add and delete depend on Database, so I built an Interface(IConnectionDb)  for them it have two function(connectToAdd , ConnectToDelete),
and then implementations (MyConnectionDb), and linking with the invoice class through the compositing relationship,
to the call of the function ConnectToAdd and ConnectToDelete 

•	 for the function, sendEmail, put it in the interface(ISendEmail),
and linking with the invoice class through the compositing relationship, to the call SendEmail function

•	 for the MailMessage class, the class remained the same because the constructor function is fixed, and there is nothing to add to it .
* Also, the isVaildMessage remained the same, because the laws of checking email are fixed, there is nothing to add to it, so there will be no problems in the future.

# Open-Closed Principle

1.	How does Second project violate the Open-Closed Principle?
 For the calculator class, there are a lot of possible mathematical operations, so the getOperationResult() can be added to many mathematical operations,
 It becomes difficult to reuse and maintain it because for each mathematical operations,
 the if-Statement is different, That is, they violate the principles of Open-Closed Principle.

2.	Draw class diagram for the new design for Second project :


![Open-Closed](https://user-images.githubusercontent.com/99614732/196451698-eb1ea64d-2dea-499c-8075-43b0b604ee0b.png)

3.	Make the required change on the code to remove the Open-Closed Principle violations?

•	Build Interface (IGetOperationResult) and linking it with the Calculator Class through the Aggregation relationship,
it contains resuls function take the Arraylist numbers, to override it in addition, count, max, min and multiplication classes ,
they are implements for the  interface (IGetOperationResult).

•	With this, many if-statements were break in the same function, so modification and maintenance could be done with ease in one class for each operation.


# Liskov Substitution Principle

1.	How does third project violate the Liskov Substitution Principle?

becouse subclasses(limited Customer) cannot be substitutable for their supper classes(Customer),
this means that when using the customer class the code does not work if the subclass(limited customer) is passed.

That is, they violate the principles of Liskov Substitution Principle.

2.	Draw class diagram for the new design for third project : 


![Liskov](https://user-images.githubusercontent.com/99614732/196494025-f054fc50-0fe4-40f2-a6cb-30031d9cf8bb.png)


3.	Make the required change on the code to remove the Liskov Substitution Principle violations?

•	It was avoided by making a class (GeneralCustomer) that contains the three functions, 
and both classes (limited Customer) and class (Public Customer) are inherited from it, then simple changes to the override functions,
thus the problem Liskov Substitution was solved

# Interface Segregation Principle


1.	How does fourth project violate the Interface Segregation Principle?

Interface Bird forces both classes ( Eagle and Penguin) to make an override all behavers, with this class the eagle takes a behaver that it does not need (swim), and the Penguin class takes a behaver (fly), which it does not need.
That is, they violate the principles of Interface Segregation Principle.


2.	Draw class diagram for the new design for fourth project :

![interface](https://user-images.githubusercontent.com/99614732/196451991-65e17014-e84e-4b1d-91be-70277837df1d.png)

3.	Make the required change on the code to remove the Interface Segregation Principle violations?

•	build three interfaces(IFlight, ISwimming, IMolting) for each behaver, thus both classes (Eagle and Penguin) implement the interface it needs without forcing them to take a behaver they don't need.
•	

# Dependency Inversion Principle

1.	How does fifth project violate the Dependency Inversion Principle?
•	Because the High Level Model (WindowsMachine) is imported from the Low Level Model (Keyboard and Monitor) directly, thus they depend on each other, and this means that the software modules are tightly connected. Any changes in the future to the classes must be changed on all modules.
•	Abstractions depend on concrete implementations; not concrete implementations depend on abstractions.
That is, they violate the principles of Dependency Inversion Principle.


2.	Draw class diagram for the new design for fifth project : 

![Dependency-Inversion_](https://user-images.githubusercontent.com/99614732/196495530-c29326bf-18ef-4a58-8e85-016a3fa5f255.png)

3.	Make the required change on the code to remove the Dependency Inversion Principle violations?

•	Create two implements class (MyKeyboard , MyMonitor) from two interfaces(IKeyboard , IMonitor) where the two interfaces is linked with the (windows Machine) class with a compositing relationship.

•	The high-level modules (Windows Machine) did not import anything from the lower-level modules (keyboard , monitor) directly; Both depend on Interfaces (IKeyboard , IMonitor).

•	abstractions not depend on concrete implementations; concrete implementations depend on abstractions.












