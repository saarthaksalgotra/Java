package String;

public class string {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Hello"); //constructor returns implicit
        sb.append(" Java");
        System.out.println(sb);
        StringBuffer sb1=new StringBuffer("Hello");
        sb1.insert(1,"java");
        System.out.println(sb1);
        StringBuffer sb2=new StringBuffer("Hello");
        sb2.replace(1,3,"Java");
        System.out.println(sb2);
        StringBuffer sb3=new StringBuffer("Hello");
        sb3.delete(1,3);
        System.out.println(sb3);
        StringBuffer sb4=new StringBuffer("Hello");
        sb4.reverse();
        System.out.println(sb4);
    }
}