import java.util.HashSet;
public class RemoveDuplicate {
    public static void main(String[] args){
        String s = "Harman";
        StringBuilder result = new StringBuilder();
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++) {
            if(set.contains(s.charAt(i))){
                continue;
            }
            else{
                set.add(s.charAt(i));
                result.append(s.charAt(i));
            }
        }
        System.out.println("Output After removing the duplicate");
        System.out.println(result.toString());
    }
}
//input Harman
//output
// Output After removing the duplicate
// Harmn