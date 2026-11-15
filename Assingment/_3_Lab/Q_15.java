public class Q_15{
Node head;
public class Node{
String data;
Node next;
Node(String data){
this.data = data;
this.next = null;
}
}
public void addFirst(String data){
Node newNode = new Node(data);
newNode.next = head;
head = newNode;
}
public void addLast(String data){
Node newNode = new Node(data);
if (head == null){
head = newNode;
return;
}
Node curr = head;
while (curr.next != null){
curr = curr.next;
}
curr.next = newNode;
}
public void removeFirst(){
if (head == null){
System.out.print("List Is Empty.");
return;
}
head = head.next;
}
public void removeLast(){
if (head == null){
System.out.print("List Is Empty.");
return;
}
if (head.next == null){
head = null;
return;
}
Node secondLastNode = head;
Node lastNode = head.next;
while (lastNode.next != null){
lastNode = lastNode.next;
secondLastNode = secondLastNode.next;
}
secondLastNode.next = null;
}

public void printList(){
if (head == null){
System.out.print("List Is Empty.");
return;
}
Node curr = head;
while (curr != null){
System.out.print(curr.data+" -> ");
curr = curr.next;
}
System.out.println("null");
}
public static void main(String args[]){
Q_15 obj = new Q_15();
obj.addFirst("is");
obj.addFirst("This");
obj.printList();
obj.addLast("an");
obj.addLast("red");
obj.addLast("Apple");
obj.printList();
obj.removeFirst();
obj.printList();
obj.removeFirst();
obj.printList();
obj.removeLast();
obj.printList();
obj.removeLast();
obj.printList();
}
}