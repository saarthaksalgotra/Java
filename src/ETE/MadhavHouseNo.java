package ETE;

import java.util.Scanner;

public class MadhavHouseNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=1;n>0;i++)
        {
            int house=3*i+2;
            if(house%m!=0)
            {
                System.out.println(house);
                n--;
            }
        }
    }
}
