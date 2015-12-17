package DataStructures;

import java.util.Random;
import java.util.Stack;

class ListNode {
	ListNode next;
	int value;
	
	ListNode(){}
	ListNode(int val) {
		value = val;
	}
	public void setValue(int inputVal) {
		value = inputVal;
	}
	
}
public class SinglyLinkedList {
	ListNode head;
	public SinglyLinkedList() {
		head = new ListNode();
	}
	public SinglyLinkedList(int inVal) {
		head = new ListNode(inVal);
	}
	
	public ListNode getHeadNode() {
		return head;
	}
	
	public void appendNode(ListNode newNode) {
		append(head, newNode);
	}
	private void append(ListNode currentNode, ListNode newNode) {
		if (currentNode.next == null) {
			currentNode.next = newNode;
		} else {
			append(currentNode.next, newNode);
		}
	}
	public void printList() {
		print(head);
	}
	private void print(ListNode start) {
		if (start.next == null) {
			System.out.println(start.value);
			return;
		}
		System.out.print(start.value + "->");
		print(start.next);
	}
	
	public void deleteNodeByValue(int value) {
		deleteByValue(head, value);
	}
	private void deleteByValue(ListNode cur, int value) {
		if (cur == null) {
			return;
		}
		if (cur.value == value) {
			deleteNode(cur);
		}
		deleteByValue(cur.next, value);
	}
	public void deleteNode(ListNode target) {
		if (target.next == null) {
			target = null;
		} else {
			target.value = target.next.value;
			target.next = target.next.next;
		}
	}
	
	public void reverseList() {
        Stack<ListNode> nodes = new Stack<ListNode>();
        ListNode current = head;
        while (current != null) {
            nodes.push(current);
            current = current.next;
        }
        try {
            head = (ListNode) nodes.pop();
            while(true) {
            	ListNode currentNode = (ListNode) nodes.pop();
            	currentNode.next = null;
                appendNode(currentNode);
            }
      } catch (Exception e) {
            return;
      }
    }
	
	public static void main(String[] args) {
		int size = 100, sample = size + 10;
		Random r = new Random();
		SinglyLinkedList list = new SinglyLinkedList(r.nextInt(size));
		for (int c = 1; c < size; c++) {
			int rand = r.nextInt(size);
			if (c == 1 ) {
				sample = rand;
			}
			list.appendNode(new ListNode(rand));
		}
		list.printList();
		list.deleteNodeByValue(sample);
		list.reverseList();
		list.printList();
		
	}
}
