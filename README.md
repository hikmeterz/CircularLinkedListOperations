﻿# CircularLinkedListOperations
## Project Description
This repository contains a Java program that implements a circular singly linked list to store integers from a given array. It performs specific operations based on additional input integers and provides appropriate outputs.

## Files
- `Node.java`: Defines the node structure used in the circular linked list.
- `CircularLinkedList.java`: Implements the circular linked list structure and its operations such as adding elements and deleting nodes based on given criteria.
- `Main.java`: Main class to test the circular linked list operations by taking user input and producing the required output.

## Algorithm Explanation

### Node Class
The `Node` class defines the basic unit of the circular linked list. Each node contains:
- An integer (`int data`): The data stored in the node.
- A reference to the next node (`Node next`): Points to the next node in the list.

### CircularLinkedList Class
The `CircularLinkedList` class manages the nodes and provides methods to manipulate the list:
- `addLast(int data)`: Adds a new node with the specified integer to the end of the list.
  - If the list is empty (`head` is `null`), the new node becomes the head and its `next` reference points to itself.
  - Otherwise, it traverses the list to find the last node and sets its `next` reference to the new node, then updates the new node's `next` reference to point to the head.
- `deleteNodes(int first, int second)`: Deletes nodes starting from the position indicated by the second integer, repeated `first` times.
  - If the number of deletions exceeds the length of the list, it outputs "Error: linkedlist is too small."
  - If the list becomes empty after deletions, it outputs "Linkedlist is now empty."

### Main Class
The `Main` class contains the main method to run the application:
- Creates an instance of `CircularLinkedList`.
- Uses a `Scanner` to take user input.
- Splits the input string based on the delimiter `|`.
- Adds integers from the first part of the input to the circular linked list.
- Uses the two integers from the second part of the input to perform deletions.
- Outputs the resulting list or appropriate error messages.

### Example Workflow
1. The user inputs a string: `1 2 3 4 5 6 7 8 9 | 4 8`.
2. The program splits the string based on the delimiter `|`.
3. The first part (`1 2 3 4 5 6 7 8 9`) is added to the circular linked list.
4. The two integers (`4` and `8`) are used to delete nodes starting from the 8th position, repeated 4 times.
5. The program outputs the resulting list or error messages if applicable.
