package ArrayList;
import java.util.*;
public class list1 {
    public static void main(String[] args) {
/*
        ArrayList al = new ArrayList();
        al.add(1);
        al.add('c');
        al.add(true);
        al.add("abcd");
        al.add(10.0);
        System.out.print(al);
*/

        ArrayList<Integer> al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(2,60);    // shifting increase complexity
/*
        for(int i=0;i<al.size();i++)
        {
            System.out.print(al.get(i)+" ");  //  .get(i) will get element
        }
*/

       int i=0;
       int j=al.size()-1;
       while (i<j)
       {
           int temp=al.get(i);
           int val2=al.get(j);
           al.set(i,val2);
           al.set(j,temp);      // swapping of ArrayList
           i++;
           j--;
       }
        System.out.println(al);

    }
}
