public class StringSearch {
    public static void main(String[] args){
        String test = "My Name is Harman Veer Singh";
        String result = "";
        String targetWord = "Harman";
        String[] test1 = test.split(" ");
        for(String str:test1){
            if(str.equals(targetWord)){
                result = targetWord;
                break;
            }
        }
        if(result.length()==0){
            System.out.println("Not Found");
        }
        else{
            System.out.println("The word "+result+" is found in string");
        }
    }
}
//output
// The word Harman is found in string