package ETE;
import java.util.*;
public class KthElement {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>al=new ArrayList<Integer>();
        while(true){
            int n=sc.nextInt();
            if(n==-1)
            {
                break;
            }
            al.add(n);
        }

        int val=sc.nextInt();
        int res=al.get(al.size()-val);
        System.out.print(res);
    }

}
