
==========================================================Data structure and algorithms======================================
=============================================================================================================================

---->In matter of ---Efficieny---

take in hand (Space / Time) with app concume

we can measure the Efficieny of code of with the (big--O^n--) --->where  n is number of steps

---Collection---> can be grouped of ant type (List,Array,LikedList,etc,....).

---LikedList---> it is extention of List but not an Array
             ---it is charactrized by it`s links throught it`s node
             ---an element in linked list idintfy next node


----LinkedList   'vs'  Array-----

Both Arrays and Linked List can be used to store linear data of similar types, 
but they both have some advantages and disadvantages over each othe

--in LinkedList we store referances to the next node in the list 
--in LinkedList (Add,insert,delete,update,....) is more faster as we are swaping all the index
just shifting the pointer referances.
--in LinkedList we cant Random access is not allowed.
We have to access elements sequentially starting from the first node. So we cannot do binary search with linked lists.

--in Array we get value by array index
--The size of the arrays is fixed: So we must know the upper limit on the number of elements in advance
--when we add New element in java array list ---> New array is created and the contents of the old one are copied over. That`s all you know at the 

----List    'vs'  Sets-----

A list has order type of it`s elements  Sets are not
Sits not allowing for repeated elements
A maps is A set-based data structure but arrays is list-based data structure.
 
 ---HashTable---
 ===============
 Like HashMap, Hashtable stores key/value pairs in a hash table.
  When using a Hashtable,you 'specify an object that is used as a key', 
 and the value that you want linked to that key. The key is then hashed,
 and the resulting hash code is used as the index at which the value is stored within the table.

Hashtable is synchronized, whereas HashMap is not. 
This makes HashMap better for non-threaded applications, 
as unsynchronized Objects typically perform better than synchronized ones.
Hashtable does not allow null keys or values.
HashMap allows one null key and any number of null values.

  ----Hash Function() ----
  =====================
The purpose of the hash function is to transform some value into one that can be stored and retrived easly.
Hash method spitsout the value that`s often an index in an array
Hashing is a technique to convert a range of '(key,values)' into a range of indexes of an array.


  Since a hash function gets us a small number for a key which is a big integer or string, 
  there is possibility that two keys result in same value. 
  The situation where a newly inserted key maps to an already occupied slot in hash table is called collision and must be handled using some collision handling technique.

*Hash collision
-----------------

Solving :-

1- change the divided value in hash function 
2- use another hash function
3-Use Bucket



----Bucket (Search technique)----
==================================
Bucket addressing for collision resolution allows the table to store all colliding key values at the same position.


------------------------------------------------------------------------------------------------
Stacks--
--------
--they hava a diffrent flair than arrays and  list.
--the elements are placed one over another and you got easy acceses to the 'newely added object'
--to get the bottom you have to degg from the top.
--when you add elements to stack it calld 'push'  when you take out called 'pop'
--as Stacks are so ubstract you can imlements a linked list over it and uss 'stack' idinety
--Maps are like asstiotive arrays in php


-----------------------------------------------------------------------------------------------------------
Queus--
-------
Queus are the oppesed of the stack
as First element called Head  (removing it called Dequeue)
   Last  element called Tail  (removing it called Enqueue)

Peak ---> is looking to the Head element but not removing it

Prioraity queue :-
------------------
is queue where each node has Prioraity 
when you Dequeue you are removing queue with the hieghest Prioraity.
note with math of Prioraity oldest element get removed first
------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------
Binary Search  algorithms--
------------------------------------
 To use binary search on a collection, the collection must first be sorted.
 

Bubble Search algorithms--
------------------------------------
it uses the naive approch to search for elements

------------------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------------------

Merge Sorting algorithms :-
--------------------------
it is all about split your array to small one and sort each one and merge them togather again. 
                                                                ------->That is called(Divide and conqure).
we can claculate  Efficieny with Log( s Log(n))

we make 's' of comperasion of  to n of steps

merge and sort  algorithms are better of Bubble sort algorithms in terms of Efficieny.
as always --->O(Log( s Log(n))) < O(n*n)


Quick  Sorting algorithms :-
--------------------------

Like Merge Sort, QuickSort is a Divide and Conquer algorithm.
 It picks an element as pivot and partitions the given array around the picked pivot. There are many different versions of quickSort that pick pivot in different ways.

Always pick first or last or random element as pivot.
Step 1 − Choose the highest index value has pivot
Step 2 − Take two variables to point left and right of the list excluding pivot
Step 3 − left points to the low index
Step 4 − right points to the high
Step 5 − while value at left is less than pivot move right
Step 6 − while value at right is greater than pivot move left
Step 7 − if both step 5 and step 6 does not match swap left and right
Step 8 − if left ≥ right, the point where they met is New pivot


Write a HashTable Class that stores strings
in a hash table, where keys are calculated
using the first two letters of the string





------------------------Tree traversal--------------------
----------------------------------------------------------

a Tree is effecent if you want to make all operation like in array quicly.
and also faster than LinkedList.

Root --->where our tree start and must hava child nodes.
Leaf --->child node must be final node in the tree

---the key to create a binary tree is that the 'key' or 'value' of the left child 
   is less than it`s parent root and the right sibiling child

---there is two traversal approch to treat traversal
  1-DFS ---> Depth first search.
  2-BFS ---> Breadth first Search.

  DFS type
  =========
 Depth First Traversals:
(a) Inorder (Left, Root, Right) 
(b) Preorder (Root, Left, Right)  
(c) Postorder (Left, Right, Root) 


Time operation in a A tree  is O(logN).