package ETE;

import java.util.Scanner;

public class AliceBob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test= sc.nextInt();
        while(test>0)
        {
            int day=sc.nextInt();
            int[] alice = new int[day];
            int[] bob = new int[day];
            //for alice
            for(int i=0;i<day;i++)
            {
                alice[i]=sc.nextInt();
            }
            //for bob
            for(int i=0;i<day;i++)
            {
                bob[i]=sc.nextInt();
            }

            int happydays=check(alice,bob,day);
            System.out.print(happydays);

            test--;
        }
    }
    public static int check(int[] alice, int[] bob,int day)
    {
        int happy=0;
        for(int i=0;i<day;i++)
        {
            int distalice=alice[i];
            int distbob=bob[i];

            if(distalice<=distbob*2 && distbob <=distalice*2)
            {
                happy++;
            }
        }
        return happy;
    }
}
