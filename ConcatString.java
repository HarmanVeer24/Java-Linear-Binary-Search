public class ConcatString {
    public static void main(String[] args){
        String s1 = "Harman Veer";
        String s2 = "Singh";
        StringBuffer sb = new StringBuffer();
        sb.append(s1);
        sb.append(" ");
        sb.append(s2);
        System.out.println("String after Concat");
        System.out.println(sb.toString());
        System.out.println(System.nanoTime());

    }
}
