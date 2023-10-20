package ETE;
import java.util.*;
public class recursiveText {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        String target= sc.nextLine();
        ArrayList<Integer> list= new ArrayList<>();
        sol(str, target, 0, list);
        if(list.isEmpty()){
            System.out.println("-1");
        }
        else{
            System.out.println(list);
        }
    }
    public static void sol(String str, String target, int index, ArrayList<Integer> list){
        if(str.length()<target.length()){
            return;
        }
        int indexFound=str.indexOf(target);
        if(indexFound!=-1){
            list.add(indexFound+index);
            sol(str.substring(indexFound+1), target, indexFound+index+1, list);
        }
    }
}
