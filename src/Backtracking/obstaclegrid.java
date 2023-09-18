package Backtracking;

public class obstaclegrid {
    public static int count=0;
    public static void main(String[] args) {
        int arr[][]={{0,1,1,0},{0,0,0,1},{0,0,0,0},{0,1,0,0}};
        boolean visited[][]=new boolean[4][4];
        sol(arr,0,arr.length-1,0,arr.length-1,"",visited);
        System.out.print("\n"+count);
    }

    public static void sol(int[][] arr, int cr , int er , int cc, int ec , String ans,boolean [][] visited)
    {
        if(cr<0 || cc<0 || cr>er || cc>ec || visited[cr][cc]==true || arr[cr][cc]==1){
            return;
        }
        if(cr==er && cc==ec){
            System.out.println(ans);
            count++;
            return;
        }

        visited[cr][cc]=true;
        //up
        sol(arr,cr-1,er,cc,ec,ans+"U ",visited);
        //down
        sol(arr,cr+1,er,cc,ec,ans+"D ",visited);
        //left
        sol(arr,cr,er,cc-1,ec,ans+"L ",visited);
        //right
        sol(arr,cr,er,cc+1,ec,ans+"R ",visited);
        visited[cr][cc]=false;
    }
}
