package G25basic;

public class frequencyArray {
    public static void main(String[] args) {
        String str="helloworld";
        int [] arr=new int[26];
        for (int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            int idx=ch-97;
            arr[idx]=arr[idx]+1;
        }
        for(int i=0;i< arr.length;i++)
        {
            char ch=(char)(i+97);
            System.out.println(ch+"-->" + arr[i]);
        }
    }
}
