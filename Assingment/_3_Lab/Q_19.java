public class Q_19 {
int queue[] = new int[5];
int front = 0, rear = -1;
void enqueue(int value) {
if (rear == queue.length - 1) {
System.out.println("Queue Overflow");
} else {
queue[++rear] = value;
}
}
void display()   {
if (front > rear) {
System.out.println("Queue is empty");
} else {
System.out.print("Queue: ");
for (int i = front; i <= rear; i++) {
System.out.print(queue[i] + " ");
}
System.out.println();
}
}
public static void main(String args[]) {
Q_19 q = new Q_19();
q.enqueue(10);
q.enqueue(20);
q.enqueue(30);
q.display();
}
}