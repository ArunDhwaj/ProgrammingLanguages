
/*
@author: Arun Dhwaj
@date: 15th Feb, 2019
@purpose: 

//////////////////////////////////////////////////////////////////////
////1.0) Defining

Java List is an ordered collection. Java List is an interface that extends Collection interface. Java List provides control over the position where you can 
insert an element. You can access elements by their index and also search elements in the list.

//////////////////////////////////////////////////////////////////
////2.0) Some of the important points about Java List are:

2.1) Java List interface is a member of the Java Collections Framework.
2.2) List allows you to add duplicate elements.
2.3) List allows you to have ‘null’ elements.
2.4) List interface got many default methods in Java 8, for example replaceAll, sort and spliterator.
2.5) List indexes start from 0, just like arrays.
2.6) List supports Generics and we should use it whenever possible. Using Generics with List will avoid ClassCastException at runtime.

///////////////////////////////////////////////////////////////////
////3.0) Some of the useful Java List methods are;

3.1) int size(): to get the number of elements in the list.
3.2) boolean isEmpty(): to check if list is empty or not.
3.3) boolean contains(Object o): Returns true if this list contains the specified element.
3.4) Iterator<E> iterator(): Returns an iterator over the elements in this list in proper sequence.
3.5) Object[] toArray(): Returns an array containing all of the elements in this list in proper sequence
3.6) boolean add(E e): Appends the specified element to the end of this list.
3.7) boolean remove(Object o): Removes the first occurrence of the specified element from this list.
3.8) boolean retainAll(Collection<?> c): Retains only the elements in this list that are contained in the specified collection.
3.9) void clear(): Removes all the elements from the list.
3.10) E get(int index): Returns the element at the specified position in the list.
3.11) E set(int index, E element): Replaces the element at the specified position in the list with the specified element.
3.12) ListIterator<E> listIterator(): Returns a list iterator over the elements in the list.
3.13) List<E> subList(int fromIndex, int toIndex): Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive. The returned 
list is backed by this list, so non-structural changes in the returned list are reflected in this list, and vice-versa.

///////////////////////////////////////////////////////////////////////
/// 4.0) Some of the default methods added to List in Java 8 are;

4.1) default void replaceAll(UnaryOperator<E> operator): Replaces each element of this list with the result of applying the operator to that element.
4.2) default void sort(Comparator<super E> c): Sorts this list according to the order induced by the specified Comparator.
4.3) default Spliterator<E> spliterator(): Creates a Spliterator over the elements in this list.

*/



