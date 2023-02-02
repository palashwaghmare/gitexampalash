import java.io.*;
import java.util.*;

class javafile{
	
		class Node {
        int data;
        Node next;
 
        
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
		
		}
		
		
		
	
	 Node head = null;
	Node tail = null;
	
	
	
	
	public static void main(String[] args)
    {
 
        LinkedListCreation L1 = new LinkedListCreation();
 
        L1.addNode(1);
        L1.addNode(2);
        L1.addNode(3);
        L1.addNode(4);
 
        //Displays the nodes present in the list
        //L1.displayNodes();
 
        
    }
	
	
}