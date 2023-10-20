package ETE;
import java.util.*;

public class removeStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        LinkedList<String> list = new LinkedList<>();
        String[] elements=sc.nextLine().split(" ");
        for(String element : elements)
        {
            list.add(element);
        }

        String compareto = sc.nextLine().trim();

        check(list,compareto);
        System.out.print(list);
    }

    public static void check(LinkedList<String> list , String compare)
    {
        LinkedList<String> removelist = new LinkedList<>();
        for (String element : list) {
            if (element.compareTo(compare) <= 0) {
                removelist.add(element);
            }
        }
        list.removeAll(removelist);
    }
}
