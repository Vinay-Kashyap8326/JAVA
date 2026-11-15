public class Practice{
int arr[];
int size;
int top;
Practice(int size){
this.size = size;
arr = new int[size];
top = -1;
}
void push(int data){
if (top == size-1){
System.out.println("Stack Overflow.");
return;
}
arr[++top] = data;
System.out.println(data+" added in Stack.");
}
void pop(){
if (top == -1){
System.out.println("Stack Underflow.");
return;
}
System.out.println(arr[top--]+" delete in Stack.");
}
void peek(){
if (top == -1){
System.out.println("Stack is Empty");
return;
}
System.out.println("Top Element: "+arr[top]);
}
void display(){
if (top == -1){
System.out.println("Stack is Empty");
return;
}
System.out.print("Stack: ");
for (int i = 0;i <= top;i++){
System.out.print(arr[i]+" ");
}
System.out.println("(Top)");
}
public static void main(String args[]){
Practice p = new Practice(5);
p.push(1);
p.push(2);
p.push(3);
p.push(4);
p.push(5);
p.display();
p.peek();
p.pop();
p.display();
p.pop();
p.display();
p.peek();
}
}