package ArrayList;

import java.util.ArrayList;

public class permutations {
    public static void main(String[] args) {
        System.out.print(sol("abc"," "));

    }
/*
    public static void sol(String str , String ans)
    {
        if(str.length()==0)
        {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            String rem=str.substring(0,i)+str.substring(i+1);
            sol(rem,ans+ch);
        }
    }
*/

    public static ArrayList<String> sol(String str , String ans)
    {
        if(str.length()==0)
        {
            ArrayList<String> list = new ArrayList();
            list.add(ans);
            return list;
        }
        ArrayList<String> mr = new ArrayList();
        for(int i=0;i<str.length();i++)
        {
            char ch= str.charAt(i);
            String rem=str.substring(0,i)+str.substring(i+1);
            ArrayList<String> list=sol(rem,ans+ch);

            for(int j=0;j<list.size();j++)
            {
                String val=list.get(j);
                mr.add(val);
            }
        }
        return mr;
    }

}
