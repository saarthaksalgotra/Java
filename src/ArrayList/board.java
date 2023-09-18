package ArrayList;
import java.util.*;
public class board {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scn=new Scanner(System.in);
        int dest=scn.nextInt();
        int dice=scn.nextInt();
        ArrayList<String> paths=new ArrayList();
        int ans=sol(0,dice,dest,"",paths);
        System.out.println(String.join(" ",paths));
        System.out.print(ans);
    }
    public static int sol(int cp,int dice,int dest,String ans,ArrayList<String>paths)
    {
        if(cp==dest)
        {
            paths.add((ans));
            return 1;
        }
        if(cp>dest)
        {
            return 0;
        }
        int cnt=0;
        for(int i=1;i<=dice;i++)
        {
            cnt+=sol(cp+i,dice,dest,ans+i,paths);
        }
        return cnt;
    }
}
