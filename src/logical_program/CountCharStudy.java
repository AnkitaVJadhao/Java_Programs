package logical_program;



import java.util.ArrayList;
import java.util.LinkedHashSet;

public class CountCharStudy {
    public static void main(String[] args) {
        String s1="allahabad";
        String[] a2 = s1.split("");
        System.out.println(a2[1]);

        LinkedHashSet<String>l1=new LinkedHashSet<>();
        ArrayList<String> a1=new ArrayList<>();
        for(int i=0;i<s1.length();i++){
            l1.add(String.valueOf(s1.charAt(i)));
        }
        System.out.println(l1);
        a1.addAll(l1);
        int count;
        for(int i=0;i<a1.size();i++){
             count=0;
            for(int j=0;j<a2.length;j++){
                if(a1.get(i).equals(a2[j])){
                    count++;

                }
            }
            System.out.println(a1.get(i)+":"+count);
        }

    }
}
