import java.util.Scanner;
class Q_16 {
class Node {
int data;
Node next;
Node(int data) {
this.data = data;
next = null;
}
}
Node head = null;
// Creation
void create(int data) {
Node newNode = new Node(data);
if (head == null) {
head = newNode;
newNode.next = head;
} else {
Node temp = head;
while (temp.next != head) {
temp = temp.next;
}
temp.next = newNode;
newNode.next = head;
}
}
// Deletion
void delete() {
if (head == null) {
System.out.println("List is empty");
return;
}
if (head.next == head) {
head = null;
} else {
Node temp = head;
while (temp.next != head) {
temp = temp.next;
}
head = head.next;
temp.next = head;
}
System.out.println("First element deleted");
}
// Display
void display() {
if (head == null) {
System.out.println("List is empty");
return;
}
Node temp = head;
do {
System.out.print(temp.data + " -> ");
temp = temp.next;
} while (temp != head);
System.out.println("(back to head)");
}
public static void main(String[] args) {
Q_16 list = new Q_16();
Scanner sc = new Scanner(System.in);
int choice, data;
do {
System.out.println("\n1. Creation");
System.out.println("2. Deletion");
System.out.println("3. Display");
System.out.println("4. Exit");
System.out.print("Enter choice: ");
choice = sc.nextInt();
switch (choice) {
case 1:
  System.out.print("Enter data: ");
  data = sc.nextInt();
  list.create(data);
  break;
case 2:
  list.delete();
  break;
case 3:
  list.display();
  break;
case 4:
  System.out.println("Program ended");
  break;
default:
  System.out.println("Invalid choice");
  }
  } while (choice != 4);
  sc.close();
  }
  }