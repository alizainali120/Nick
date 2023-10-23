# 5.1 - Java Class

## Creating a Class

```
public class Student {
	// body of the class
}
```

We will have the keyword `public` before classes we write though it is optional. 
We write class names with first letter capitalized.

We can create instances of class with the `new` keyword and we can declare variables that can hold a reference to that class object. 

```
Student std1 = new Student();
Student ali = new Student();
```
The body of a class contains instance variables (attributes), constructors, and methods.

**Instance variables (attributes)**: This is the first thing we define in a class. Each object has its own set of variables that are not shared with other instances.
<br>

**Constructors**: The second thing we define in a class is usually its constructors. Constructor's role is to **initialize** variables when the object is created. We will discuss constructors in more detail in unit 5.2.
<br>

**Methods**: Methods define the behaviors of the objects of that class. Most methods either do things (complex calculations) or return values (getAge on Student). The methods of the class share access to object's attributes and when a method is called on an object, it uses the instance variables (attributes) for that object.

```
public class Student {
	// instance variables 
	// constructors
	// methods
}
```

**Main method**: any Java class can have a `main` method which can be used to run that class as a program either to test that one class or as the entry point to a whole program made up of many classes and objects.
