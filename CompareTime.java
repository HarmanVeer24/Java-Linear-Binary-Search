public class CompareTime {
    public static void main(String[] args){
        String s1 = "Harman Veer Singh";
        StringBuffer sb = new StringBuffer();
        StringBuilder sv = new StringBuilder();
        long intiatime= System.nanoTime();
        for(int i=0;i<1000000;i++){
            sb.append(s1);
        }
        long sbtime = System.nanoTime()-intiatime;
        sv.append(s1);
        for(int i=0;i<1000000;i++){
            sv.append(s1);
        }
        long svtime = System.nanoTime() - sbtime;
        if(svtime>sbtime){
            System.out.println("StringBuffer is Faster");
        }
        else{
            System.out.println("StringBuilder is Faster");
        }
    }
}

//output
// out of StringBuilder and StringBuffer
// StringBuffer is faster