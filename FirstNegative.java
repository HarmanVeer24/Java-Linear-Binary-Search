import java.util.Scanner;

public class FirstNegative {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int index = -1;
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<size;i++){
            if(arr[i]<0){
                index = i;
                break;
            }
        }
        if(index != -1){
            System.out.println("A negative number is present at "+index+" Index");
        }
        else{
            System.out.println("A negative number is not present in array");
        }
    }
}
//output
// 5
//1 -2 4 5 2
//A negative number is present at 1 Index