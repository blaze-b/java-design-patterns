## Structural Design Pattern

### Adapter Design Pattern

- Acts as a converter for older systems
- Converts the interface of a class into another interface clients expect
- It lets classes work together that couldn't otherwise because of incompatible interfaces
- It is also known as the wrapper
- Intention:
  - Match an old component to a new system
  - Wrap an existing class with a new interface
- When to use: create a reusable class that cooperates with classes which don't have compatible interfaces

### Proxy Design Pattern

- It means 'on behalf of' or 'representing' or 'in place of' are literal meanings of proxy
- It is a wrapper or agent object that is being called by the client to access the real serving 
object behind the scenes
- Intention: 
  - Provide the surrogate or placeholder for another object to control access to it
  - Add a wrapper and delegation tp protect the real component from undue complexity
  - Use an extra level of indirection
- When to use: When the creation of object is expensive or heavy weight, which means, when a 
deep object graph is required in the object 
  
### Facade Design System

- It adds an interface to existing system or group of sub systems to hide its complexities
- It involves a simple class which provides an interface with simplified methods required  by client 
and delegate calls to methods of existing system classes
- Intention:
  - Provides an interface to set of interfaces in a subsystem
  - Wrap a complicated subsystem with a simpler interface
- When to use: Needs a simplified interface to overall functionality of a complex subsystem


