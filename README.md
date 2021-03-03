## Creational Design Pattern

### Singleton Design Pattern

- The Singleton pattern restricts the instantiation of a class to single object
- This is used when one object is needed to coordinate the actions across the system
- When to use:
    - Application needs one and only instance of an object
    - Additionally, lazy initialization and global access are necessary and state of objects needs to be shared

### Prototype Design Pattern

- It is a creational design pattern and is used when the type of objects to create is determined by a prototypical
  instance, which is cloned to produce new objects.
- When to use: When application needs to create a number of instances of a class, which has almost same state and when
  there is need to avoid creating objects using new keyword

### Builder Design Pattern

- It hides the complexity of object
- It encapsulates creating and assembling the parts of a complex object in a separate Builder Object
- When to use: Applications need to create complex objects of different types in multiple steps and expect a final
  object as outcome

### Factory Design Pattern

- It exposes the object without exposing the creation logic to the client and refer to a newly created using a common
  interface
- Intention:
    - When defining a "virtual" constructor
    - Define an interface for the creating of objects(IOC)
- Used only when we have a super class with multiple subclasses and based on input one of the subclasses is expected
to be returned
  
### Abstract Factory Design Pattern

- It is also called as factory of factories, and it works around a super-factory which creates
other factories
- An interface is responsible for creating a factory of related objects without explicitly specifying
their classes
- Intention:
  - It provides an interface for creating  families of related or dependent objects without specifying 
    their concrete classes
  - It helps in the encapsulation
- When to use: When application needs a level of indirection that abstracts the creation of families of 
related or dependent objects without directly specifying their concrete class








  
