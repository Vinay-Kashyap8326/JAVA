public class Q_18{
int arr[] = new int[5];
int top = -1;
void pop(){
if (top == -1){
System.out.print("Underflow");
} else {
System.out.println("Deleted: "+arr[top--]);
}
}
void push(int value){
if (top == arr.length-1){
System.out.print("Overflow");
} else {
arr[++top] = value;
}
}
void display(){
if (top == -1){
System.out.print("Stack is Empty");
} else {
System.out.print("Stack: ");
for (int i = top; i >= 0; i--){
System.out.print(arr[i]+" ");
}
System.out.println();
}
}
public static void main(String args[]){
Q_18 i = new Q_18();
i.push(10);
i.push(20);
i.push(30);
i.display();
i.pop();
i.display();
}
}