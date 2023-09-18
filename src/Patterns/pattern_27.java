package Patterns;

import java.util.Scanner;

public class pattern_27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int row=1;
        int cntstar=1;
        int leftspace=n-1;
        while (row<=n)
        {
            int spc=1;
            while (spc<=leftspace)
            {
                System.out.print("  ");
                spc++;
            }
            int str=1;
            int pos=1;
            while (str<=cntstar)
            {
                System.out.print(pos+" ");
                if(str<(cntstar/2+1)) {
                    pos++;
                }
                else
                {
                    pos--;
                }
                str++;

            }
            row++;
            leftspace--;
            cntstar=cntstar+2;
            System.out.println();
        }
    }
}
