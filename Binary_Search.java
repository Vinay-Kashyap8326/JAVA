public class Binary_Search {
public static void main(String[] args) {
int target = 3;
int arr[] = {1,2,3,4,5,6,7};
int start = 0, end = arr.length - 1;
while (start <= end){
int mid = (start + end) / 2;
if (target > arr[mid]){
start = mid + 1;
} else if (target < arr[mid]){
end = mid - 1;
} else {
System.out.println("target on index: " + mid);
return;
}
}
System.out.println("Target not found");
}
}