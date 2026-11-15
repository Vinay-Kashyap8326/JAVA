public class Q_17{
Node head;
class Node{
String data;
Node prev;
Node next;
Node(String data){
this.data = data;
this.prev = null;
this.next = null;
}
}
void addFirst(String data){
Node newNode = new Node(data);
if (head == null){
head = newNode;
return;
}
newNode.next = head;
head.prev = newNode;
head = newNode;
}
void addLast(String data){
Node newNode = new Node(data);
if (head == null){
head = newNode;
return;
}
Node lastNode = head;
while (lastNode.next != null){
lastNode = lastNode.next;
}
lastNode.next = newNode;
newNode.prev = lastNode;
}
void removeFirst(){
if (head == null){
System.out.println("List is Empty");
return;
}
if (head.next == null){
head = null;
return;
}
head = head.next;
head.prev = null;
}
void removeLast(){
if (head == null){
System.out.println("List is Empty");
return;
}
if (head.next == null){
head = null;
return;
}
Node curr = head;
while (curr.next != null){
curr = curr.next;
}
curr.prev.next = null;
}
void printList(){
if (head == null){
System.out.println("List is Empty");
return;
}
Node curr = head;
while (curr != null){
System.out.print(curr.data+" <=> ");
curr = curr.next;
}
System.out.println("null");
}
public static void main(String args[]){
Q_17 p = new Q_17();
p.addFirst("Vinay");
p.addFirst("Shree");
p.addLast("Ji");
p.addLast("Mahan");
p.addLast("Hai");
p.printList();
p.removeFirst();
p.printList();
p.removeLast();
p.printList();
}
}