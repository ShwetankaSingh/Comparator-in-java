# Comparator-in-java 🌸🍁🍂🌼

Comparator interface is used to order the objects of user-defined classes. A comparator object is capable of comparing two objects of two different classes.
Following function compare obj1 with obj2

Syntax:
       public int compare(Object obj1, Object obj2):

Suppose we have an array/arraylist of our own class type, containing fields like rollno, name, address, DOB etc and we need to sort the array based on Roll no or name?🙆

Method 1: One obvious approach is to write our own sort() function using one of the standard algorithms. This solution requires rewriting the whole sorting code for different 
criterion like Roll No. and Name.🙅

Method 2: Using comparator interface- Comparator interface is used to order the objects of user-defined class. This interface is present in java.util package and contains 
2 methods compare(Object obj1, Object obj2) and equals(Object element). Using comparator, we can sort the elements based on data members. For instance it may be on rollno, 
name, age or anything else.💁😎

👉Method of Collections class for sorting List elements is used to sort the elements of List by the given comparator.

// To sort a given list. ComparatorClass must implement 
// Comparator interface.
public void sort(List list, ComparatorClass c)
How does Collections.Sort() work?❓🤔
Internally the Sort method does call Compare method of the classes it is sorting. To compare two elements, it asks “Which is greater?” Compare method returns -1, 0 or 1
to say if it is less than, equal, or greater to the other. It uses this result to then determine if they should be swapped for its sort.🤗
