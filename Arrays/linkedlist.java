import java.util.List;
import java.io.*;

public class linkedlist{
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	public static linkedlist insert(linkedlist list , int data){
		Node new_node = new Node(data);
		if(list.head == null){
			list.head = new_node;
		}
		else{
			Node last = list.head;
			while(last.next != null){
				last = last.next;
			}
			last.next = new_node;
		}
		return list;
	}
	public static void Printlist(linkedlist list){
		Node currNode = list.head;
		System.out.println("LinkedList");
		while (currNode != null) {
			System.out.print(currNode.data + " ->");
			currNode = currNode.next;
		}
		System.out.print("Null");
	}
	public static linkedlist deleteByKey(linkedlist list,int key)
    {
        // Store head node
        Node currNode = list.head, prev = null;
 
        //
        // CASE 1:
        // If head node itself holds the key to be deleted
 
        if (currNode != null && currNode.data == key) {
            list.head = currNode.next; // Changed head
 
            // Display the message
            System.out.println(key + " found and deleted");
 
            // Return the updated List
            return list;
        }
 
        //
        // CASE 2:
        // If the key is somewhere other than at head
        //
 
        // Search for the key to be deleted,
        // keep track of the previous node
        // as it is needed to change currNode.next
        while (currNode != null && currNode.data != key) {
            // If currNode does not hold key
            // continue to next node
            prev = currNode;
            currNode = currNode.next;
        }
 
        // If the key was present, it should be at currNode
        // Therefore the currNode shall not be null
        if (currNode != null) {
            // Since the key is at currNode
            // Unlink currNode from linked list
            prev.next = currNode.next;
 
            // Display the message
            System.out.println(key + " found and deleted");
        }
 
        //
        // CASE 3: The key is not present
        //
 
        // If key was not present in linked list
        // currNode should be null
        if (currNode == null) {
            // Display the message
            System.out.println(key + " not found");
        }
 
        // return the List
        return list;
    }
 
    // **************MAIN METHOD**************
 
    // method to create a Singly linked list with n nodes
    public static void main(String[] args)
    {
        /* Start with the empty list. */
        linkedlist list = new linkedlist();
 
        //
        // ******INSERTION******
        //
 
        // Insert the values
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);
 
        // Print the LinkedList
        Printlist(list);
 
        //
        // ******DELETION BY KEY******
        //
 
        // Delete node with value 1
        // In this case the key is ***at head***
        deleteByKey(list, 1);
 
        // Print the LinkedList
        Printlist(list);
 
        // Delete node with value 4
        // In this case the key is present ***in the
        // middle***
        deleteByKey(list, 4);
 
        // Print the LinkedList
        Printlist(list);
 
        // Delete node with value 10
        // In this case the key is ***not present***
        deleteByKey(list, 10);
 
        // Print the LinkedList
        Printlist(list);


	}
}