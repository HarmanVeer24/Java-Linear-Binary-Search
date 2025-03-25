public class RoatedSearch {
    public static void main(String[] args){
        int[] inputArray = {45,47,67,70,12,14,23,34,41};
        System.out.println("For Array 45,47,67,70,12,14,23,34,41");
        int left = 0;
        int right = inputArray.length-1;
        while(left<right){
            int mid = left+(right-left)/2;
            if(left==mid){
                System.out.println("Rotation index "+left+" in array is found");
                break;
            }
            else if(inputArray[mid]>inputArray[right]){
                left = mid+1;
            }
            else{
                right = mid;
            }
        }
    }
}
//output
// For Array 45,47,67,70,12,14,23,34,41
//Rotation index 3 in array is found