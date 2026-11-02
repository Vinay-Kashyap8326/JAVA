public class Q_20 {
    int queue[] = new int[5];
    int front = 0, rear = -1;
    void enqueue(int value) {
        if (rear == queue.length - 1) {
            System.out.println("Queue Overflow");
        } else {
            queue[++rear] = value;
        }
    }
    void dequeue() {
        if (front > rear) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println("Deleted: " + queue[front++]);
        }
    }
    public static void main(String args[]) {
        Q_20 q = new Q_20();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.dequeue();
    }
}