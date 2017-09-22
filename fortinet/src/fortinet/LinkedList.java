package fortinet;

public class LinkedList {
	
	class Node{
		 Node next;
		 int value;
		 
		 Node(int data){
			 this.value=data;
			 this.next=null;
		 }
	}
	
	Node head; 					//Initialize the first node as head

// Function to determine length of Linkedlist
	public int length(){
		int length=0;
		Node temp=head;				// start from first node
		while(temp!=null)
		{
			length++;
			temp=temp.next;
		}
		return length;
	}
// Function to determine if the list is empty
	public boolean checkEmpty(){
		boolean flag=(length()==0);
		return flag;
		}
// Function  add data in Linkedlist	
	public void add(int data)
	{
		if(head==null)
		{
			head = new Node(data);
		}
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=new Node(data);
		}
	}
// Function to print the list	
	public void printList(Node node)
	{
		while(node!=null){
			System.out.print(node.value+"->");
			node=node.next;
		}
		if(node==null)
		{
			System.out.println("null");
		}
	}
// Function to reverse the list	
	public Node reverseLinklist(Node node){
		if(node==null)
		{
			return node;
		}
		if(node.next==null){
			head=node;
			return null;
		}
		reverseLinklist(node.next);
		node.next.next=node;
		node.next=null;
		return head;
	}
	
	public static void main( String args[])
	{
		LinkedList list=new LinkedList();
		System.out.println("Check if list is empty on Initialization");
		System.out.println(list.checkEmpty());
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.print("original list: ");
		list.printList(list.head);
		Node reversedlist=list.reverseLinklist(list.head);
		System.out.print("Reversed list: ");
		list.printList(reversedlist);
		
		
	}
	
	
	
}
