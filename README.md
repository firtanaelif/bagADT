# bagADT
The-Bag-ADT
Bag data structures
The Bag ADT

Write an implementation for data structure Bag as a Java class, which is similar to a set, but it may contain several instances of the same member. For example, {'to', 'be', 'or', 'not', 'to', 'be'} is a bag of words, which is equal to {'be', 'be', 'not', 'or', 'to', 'to'} (since order of members is insignificant), but is unequal to {'be', 'not', 'or', 'to'} (since the number of instances is significant). Adding a member increases the number of instances in the bag by one and removing a member decreases the number of instances in the bag by one. The member is deleted from the bag when it has no instances.

Think that “how would you represent a bag without actually storing multiple instances of the same member?” Your implementation should be efficient.

Don’t forget that you cannot use any pre-written Java Api Class. You must write your own code for data structures (You are allowed to use lab source codes that we examined so far.)

Your implementation must be generic, i.e. your bag can accept any type of instances. (Use Java Generics !)

Your ADT should provide at least these operations:

 add(T item) : Inserts item in the bag.
 clear() : Removes all of the elements from this bag.
 contains(T item) : Returns true if this bag contains the specified element and false otherwise.
 distictSize() : Returns the distinct number of elements in this bag. (For example, for the bag {'to', 'be', 'or', 'not', 'to', 'be'} distinctSize is 4)
 elementSize(T item) : Returns the number of this item in this bag. (For example, for the bag {'to', 'be', 'or', 'not', 'to', 'be'} elementsize(‘be’) is 2)
 isEmpty() : Returns true if this collection contains no elements.
 remove(T item) : Removes a single instance of item from this bag and returns true if it is present; otherwise returns false.
 size() : Returns the total number of elements in this bag. (For example, for the bag {'to', 'be', 'or', 'not', 'to', 'be'} size is 6)
 toString() : Returns a string that displays the elements in the bag.

Please write a Test program (a separate Java class) proves that your container(bag) works properly.
