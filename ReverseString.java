//demo for in-built stringbuilder method to reverse the string
public class ReverseString {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("hello");
        sb.reverse();
        System.out.println("Output after reverse for word hello");
        System.out.println(sb.toString());
    }
}
//output
//Output after reverse for word hello
//olleh