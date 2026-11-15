public class Q_16{
Node head;
class Node{
String data;
Node next;
Node(String data){
this.data = data;
this.next = null;
}
}
void addFirst(String data){
Node newNode = new Node(data);
if (head == null){
head = newNode;
newNode.next = head;
return;
}
Node lastNode = head;
while (lastNode.next != head){
lastNode = lastNode.next;
}
newNode.next = head;
head = newNode;
lastNode.next = head;
}
void addLast(String data){
Node newNode = new Node(data);
if (head == null){
head = newNode;
newNode.next = head;
return;
}
Node lastNode = head;
while (lastNode.next != head){
lastNode = lastNode.next;
}
lastNode.next = newNode;
newNode.next = head;
}
void removeFirst(){
if (head == null){
System.out.println("List is Empty");
return;
}
if (head.next == head){
head = null;
return;
}
Node lastNode = head;
while (lastNode.next != head){
lastNode = lastNode.next;
}
head = head.next;
lastNode.next = head;
}
void removeLast(){
if (head == null){
System.out.println("List is Empty");
return;
}
if (head.next == head){
head = null;
return;
}
Node secondLastNode = head;
while (secondLastNode.next.next != head){
secondLastNode = secondLastNode.next;
}
secondLastNode.next = head;
}
void printList(){
if (head == null){
System.out.println("List is Empty");
return;
}
Node curr = head;
do{
System.out.print(curr.data+" -> ");
curr = curr.next;
}while (curr != head);
System.out.println("Back To Head("+head.data+")");
}
public static void main(String args[]){
Q_16 p = new Q_16();
p.addFirst("Vinay");
p.addFirst("Shree");
p.addLast("ji");
p.addLast("Mahan");
p.addLast("Hai");
p.printList();
p.removeFirst();
p.printList();
p.removeLast();
p.printList();
}
}