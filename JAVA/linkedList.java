class Node{
    int data;
    Node next=null;
    Node(){
        data=-9999;
    }
    Node(int d){
        data = d;
    }
}

class LList{
    Node head;
    
    
    int size(){
        if(head==null){
            return 0;
        }
        else{
            int c=0;
            Node temp = head;
    
            while(temp!=null){
                c++;
                temp=temp.next;
            }
            return c;
        }
    }
    
    void printList(){
        Node temp = head;
        if(head==null){
            System.out.println("Nothing to print...");
        }
        else{
            System.out.println();
            do{
                System.out.print(temp.data+"--> ");
                temp = temp.next;
            }while(temp!=null);
        }
    }

    void add(int d){
        Node temp = head;
        Node newNode = new Node(d);
        if(head==null){
            head=newNode;
            head.next = null;
        }
        
        else{
            while(temp.next!=null){
                temp = temp.next;
            }
            newNode.next=null;
            temp.next=newNode;
        }
    }
    
    void addFirst(int d){
        Node newNode = new Node(d);
        newNode.next = head;
        head = newNode;
    }

    void add(int d, int index){
        int size = size();
        if(index==0){
            addFirst(d);
        }
        else if(index==size-1){
            add(d);
        }
        else if(index>0 && index<size-1){
            Node newNode = new Node(d);
            Node temp = head;

            for(int i=0;temp!=null;i++){
                if(i==index-1){
                    newNode.next = temp.next;
                    temp.next = newNode;
                    break;
                }
                temp = temp.next;
            }
        }
    }

    void deleteEnd(){
        if(head==null){
            System.out.println("Nothing to remove or delete.");
        }
        else{
            Node temp = head;
            while(temp!=null){
                if(temp.next==null){
                    System.out.println(temp.data + " Deleted");
                    head=temp=null;
                    break;
                }
                if(temp.next.next==null){
                    System.out.println(temp.next.data + " Deleted");
                    temp.next=null;
                    break;
                }
                temp=temp.next;
            }
        }
    }

    void deleteHead(){
        if(head==null){
            System.out.println("Nothing to remove or delete.");
        }
        else{
            Node temp = head.next;
            System.out.println("\n" + head.data + " deleted.");
            head=temp;
        }
    }

    void delete(int index){
        if(head==null){
            System.out.println("Nothing to delete...");
        }
        else if(index>size()-1 || index<0){
            System.out.println("\nThis index does not exist yet.");
        }
        else{
            Node temp = head;
            for(int i=0;temp!=null;i++){
                if(i==index-1){
                    System.out.println("\n" + temp.next.data + " deleted");
                    temp.next = temp.next.next;
                    break;
                }
                temp=temp.next;
            }
        }
    }
}

public class linkedList{
    public static void main(String args[]){
        LList ll = new LList();
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        ll.add(60);
        ll.add(70);
        ll.printList();
        for(int i=0;i<10;i++){
            ll.deleteEnd();
        }
        ll.printList();
    }
}






// import java.util.*;

// // import java.io.*;

// // Java program to implement
// // a Singly Linked List
// public class linkedList {

// 	Node head; // head of list

// 	// Linked list Node.
// 	// Node is a static nested class
// 	// so main() can access it
// 	static class Node {

// 		int data;
// 		Node next;

// 		// Constructor
// 		Node(int d)
// 		{
// 			data = d;
// 			next = null;
// 		}
// 	}

// 	// **************INSERTION**************

// 	// Method to insert a new node
// 	public static linkedList insert(linkedList list,
// 									int data)
// 	{
// 		// Create a new node with given data
// 		Node new_node = new Node(data);
// 		new_node.next = null;

// 		// If the Linked List is empty,
// 		// then make the new node as head
// 		if (list.head == null) {
// 			list.head = new_node;
// 		}
// 		else {
// 			// Else traverse till the last node
// 			// and insert the new_node there
// 			Node last = list.head;
// 			while (last.next != null) {
// 				last = last.next;
// 			}

// 			// Insert the new_node at last node
// 			last.next = new_node;
// 		}

// 		// Return the list by head
// 		return list;
// 	}

// 	// **************TRAVERSAL**************

// 	// Method to print the linkedList.
// 	public static void printList(linkedList list)
// 	{
// 		Node currNode = list.head;

// 		System.out.print("\nlinkedList: ");

// 		// Traverse through the linkedList
// 		while (currNode != null) {
// 			// Print the data at current node
// 			System.out.print(currNode.data + " ");

// 			// Go to next node
// 			currNode = currNode.next;
// 		}
// 		System.out.println("\n");
// 	}

// 	// **************DELETION BY KEY**************

// 	// Method to delete a node in the linkedList by KEY
// 	public static linkedList deleteByKey(linkedList list,
// 										int key)
// 	{
// 		// Store head node
// 		Node currNode = list.head, prev = null;

// 		//
// 		// CASE 1:
// 		// If head node itself holds the key to be deleted

// 		if (currNode != null && currNode.data == key) {
// 			list.head = currNode.next; // Changed head

// 			// Display the message
// 			System.out.println(key + " found and deleted");

// 			// Return the updated List
// 			return list;
// 		}

// 		//
// 		// CASE 2:
// 		// If the key is somewhere other than at head
// 		//

// 		// Search for the key to be deleted,
// 		// keep track of the previous node
// 		// as it is needed to change currNode.next
// 		while (currNode != null && currNode.data != key) {
// 			// If currNode does not hold key
// 			// continue to next node
// 			prev = currNode;
// 			currNode = currNode.next;
// 		}

// 		// If the key was present, it should be at currNode
// 		// Therefore the currNode shall not be null
// 		if (currNode != null) {
// 			// Since the key is at currNode
// 			// Unlink currNode from linked list
// 			prev.next = currNode.next;

// 			// Display the message
// 			System.out.println(key + " found and deleted");
// 		}

// 		//
// 		// CASE 3: The key is not present
// 		//

// 		// If key was not present in linked list
// 		// currNode should be null
// 		if (currNode == null) {
// 			// Display the message
// 			System.out.println(key + " not found");
// 		}

// 		// return the List
// 		return list;
// 	}

// 	// **************DELETION AT A POSITION**************

// 	// Method to delete a node in the linkedList by POSITION
// 	public static linkedList deleteAtPosition(linkedList list, int index)
// 	{
// 		// Store head node
// 		Node currNode = list.head, prev = null;

// 		//
// 		// CASE 1:
// 		// If index is 0, then head node itself is to be
// 		// deleted

// 		if (index == 0 && currNode != null) {
// 			list.head = currNode.next; // Changed head

// 			// Display the message
// 			System.out.println(
// 				index + " position element deleted");

// 			// Return the updated List
// 			return list;
// 		}

// 		//
// 		// CASE 2:
// 		// If the index is greater than 0 but less than the
// 		// size of linkedList
// 		//
// 		// The counter
// 		int counter = 0;

// 		// Count for the index to be deleted,
// 		// keep track of the previous node
// 		// as it is needed to change currNode.next
// 		while (currNode != null) {

// 			if (counter == index) {
// 				// Since the currNode is the required
// 				// position Unlink currNode from linked list
// 				prev.next = currNode.next;

// 				// Display the message
// 				System.out.println(
// 					index + " position element deleted");
// 				break;
// 			}
// 			else {
// 				// If current position is not the index
// 				// continue to next node
// 				prev = currNode;
// 				currNode = currNode.next;
// 				counter++;
// 			}
// 		}

// 		// If the position element was found, it should be
// 		// at currNode Therefore the currNode shall not be
// 		// null
// 		//
// 		// CASE 3: The index is greater than the size of the
// 		// linkedList
// 		//
// 		// In this case, the currNode should be null
// 		if (currNode == null) {
// 			// Display the message
// 			System.out.println(
// 				index + " position element not found");
// 		}

// 		// return the List
// 		return list;
// 	}

// 	// **************MAIN METHOD**************

// 	// method to create a Singly linked list with n nodes
// 	public static void main(String[] args)
// 	{
// 		/* Start with the empty list. */
// 		linkedList list = new linkedList();

// 		//
// 		// ******INSERTION******
// 		//

// 		// Insert the values
// 		list = insert(list, 1);
// 		list = insert(list, 2);
// 		list = insert(list, 3);
// 		list = insert(list, 4);
// 		list = insert(list, 5);
// 		list = insert(list, 6);
// 		list = insert(list, 7);
// 		list = insert(list, 8);

// 		// Print the linkedList
// 		printList(list);

// 		//
// 		// ******DELETION BY KEY******
// 		//

// 		// Delete node with value 1
// 		// In this case the key is ***at head***
// 		deleteByKey(list, 1);

// 		// Print the linkedList
// 		printList(list);

// 		// Delete node with value 4
// 		// In this case the key is present ***in the
// 		// middle***
// 		deleteByKey(list, 4);

// 		// Print the linkedList
// 		printList(list);

// 		// Delete node with value 10
// 		// In this case the key is ***not present***
// 		deleteByKey(list, 10);

// 		// Print the linkedList
// 		printList(list);

// 		//
// 		// ******DELETION AT POSITION******
// 		//

// 		// Delete node at position 0
// 		// In this case the key is ***at head***
// 		deleteAtPosition(list, 0);

// 		// Print the linkedList
// 		printList(list);

// 		// Delete node at position 2
// 		// In this case the key is present ***in the
// 		// middle***
// 		deleteAtPosition(list, 2);

// 		// Print the linkedList
// 		printList(list);

// 		// Delete node at position 10
// 		// In this case the key is ***not present***
// 		deleteAtPosition(list, 10);

// 		// Print the linkedList
// 		printList(list);
// 	}
// }



// public class linkedList {
//     public static void main(String[] args) {
//         LinkedList<String> ll = new LinkedList<>();

//         ll.add("A");
//         ll.add("B");
//         ll.add("C");
//         ll.addLast("C");
//         ll.addFirst("D");
//         ll.add(2,"E");
//         ll.add

//         System.out.println(ll);

//         ll.remove("B");
//         ll.remove(3);
//         ll.removeFirst();
//         ll.removeLast();
//         System.out.println(ll.size());
//     }
// }
