package OOPS;

public class stackDemo {
   // non-static cant be called by static.
    //non-static ka object bnake call krna pdta hai UwU.
    // static has highest priority lol.

    // Priority : Static --> block --> variable --> method
    // Priority : Instance--> block --> variable --> method
    int [] arr=new int[5];
    int tos=0;
    public void push(int val)
    {
        arr[tos]=val;
        tos++;
        if(tos> arr.length)
        {
            return;
        }
    }
    public void pop()
    {
        tos--;
        if(tos<0)
        {
            System.out.println("Stack is empty");
            tos++;
            return;
        }
        arr[tos]=0;
    }
    public void peek()
    {
        tos--;
        if(tos<0)
        {
            System.out.println("stack is empty");
            return;
        }
        System.out.println(arr[tos]);
        tos++;
    }
    public void display()
    {
        for(int i=tos-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
    }
}

