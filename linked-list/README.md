# Singly Linked List
A singly linked list is a type of linked list that is unidirectional, that is, it can be traversed in only one direction from head to the last node (tail). Each element in a linked list is called a node. A single node contains data and a pointer to the next node which helps in maintaining the structure of the list.
## Challenge
the aims of this challenge is to create a link list class plus make test for the class

## Approach & Efficiency & API
I created two classes, the first is the node which has two properity the value of the node plus the referance for the next node.
the second class is the linkedList class that hold one properity for the head node (data type is Node) as well as it contains a three methods as per the challege requorement as following: 
- insert: to add item to the list. the Big O used here is is O(1)
- includesL: to sheck if the list contains certain value. the Big O used here is is O(n)
- to string: to print out the linked list instances; the value of the nodes. the Big O used here is is O(n)

## Code Challenge 06: linked-list-insertions
in this challenge we had added the following methods: 
- append: it takes one argumants and adds a new node with the given value to the end of the list.
- insertBefore: takes two values; the value you want to add and the value you want to make the installation before, and then adds a new node with the given new value immediately before the first node that has the value specified.
- insertAfter: takes two arguments: value, new value; and then adds a new node with the given new value immediately after the first node that has the value specified.

