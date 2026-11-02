import java.util.Scanner;
class Q_17 {
class Node {
int data;
Node prev, next;
Node(int data) {
this.data = data;
prev = next = null;
}
}
Node head = null;
// Creation
void create(int data) {
Node newNode = new Node(data);
if (head == null) {
head = newNode;
} else {
Node temp = head;
while (temp.next != null) {
temp = temp.next;
}
temp.next = newNode;
newNode.prev = temp;
}
}
// Deletion
void delete() {
if (head == null) {
System.out.println("List is empty");
return;
}
head = head.next;
if (head != null) {
head.prev = null;
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
while (temp != null) {
System.out.print(temp.data + " <-> ");
temp = temp.next;
}
System.out.println("null");
}
public static void main(String[] args) {
Q_17 list = new Q_17();
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