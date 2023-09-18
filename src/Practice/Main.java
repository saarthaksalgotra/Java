package Practice;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int d=(n+1)/2;
        int row, space, star;
        for(row=1; row<=d; row++){
            for(space=1; space<=2*(d-row); space++){
                System.out.print("  ");
            }
            for(star=row; star>=1; star--){
                System.out.print(star+" ");
            }
            for(space=1; space<=2*row-3; space++){
                System.out.print("  ");
            }
            for(star=1; star<=row; star++){
                if(row!=1){
                    System.out.print(star+" ");
                }
            }
            System.out.println();
        }
        for(row=n-d; row>=1; row--){
            for(space=1; space<=2*(d-row); space++){
                System.out.print("  ");
            }
            for(star=row; star>=1; star--){
                System.out.print(star+" ");
            }
            for(space=1; space<=2*row-3; space++){
                System.out.print("  ");
            }
            for(star=1; star<=row; star++){
                if(row!=1){
                    System.out.print(star+" ");
                }
            }
            System.out.println();
        }
    }
}