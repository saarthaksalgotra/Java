//package Recursion;
//import java.util.*;
//public class kSwaps {
//        public static void main (String args[]) {
//            Scanner sc = new Scanner(System.in);
//            String str=sc.next();
//            int k=sc.nextInt();
//            sol(str,0,k,"");
//        }
//
//        public static void sol(String str,int idx,int k,String ans) {
//            if (k == 0) {
//                return;
//            }
//
//            char maxchar=str[idx];
//            for(int i=idx+1;i< str.length();i++)
//            {
//                if(maxchar<str[i])
//                {
//                    maxchar=str[i];
//                }
//            }
//
//            if(maxchar != str[idx])
//            {
//                k--;
//            }
//
//            for(int i=idx-1;i>=idx;i--)
//            {
//                swap(str[idx],str[i]);
//                if(ans<str)
//                {
//                    ans==str;
//                }
//            }
//
//        }
//}
