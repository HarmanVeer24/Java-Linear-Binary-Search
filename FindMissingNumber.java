
public class FindMissingNumber {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,6,7,8,9};
        FirstMissingNumber(arr);
    }
    public static void FirstMissingNumber(int [] arr) {
        int [] freq = new int[arr.length+2];

        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }

        boolean found = false;

        for(int i=1;i<freq.length;i++){
            if(freq[i]==0){
                found = true;
                System.out.println(i+" is first missing number");
                break;
            }
        }

        if(!found){
            System.out.println("No missing number");
        }
    }
}

//5 is first missing number
