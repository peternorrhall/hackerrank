package se.movlin.hackerrank.linkedlist;
import java.io.*;
import java.util.*;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}

public class Solution {

    public static  Node insert(Node head,int data) {
        Node result = new Node(data);
        Node h = head;
        Node tail = getTail(head);
        if (tail != null) {
        	tail.next = result;
        } else if (head != null) {
        	head.next = result;
        } else {
        	h = result;
        }
        return h;
    }
    
    private static Node getTail(Node head) {
    	if (head == null) {
    		return null;
    	} else if (head.next == null) {
    		return head;
    	} else {
    		return getTail(head.next);
    	}
    }
    
	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}


