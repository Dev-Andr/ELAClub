public class DStack {
    // cde
    int capacity = 2;
    int stack[] = new int[capacity];
    int top = 0;

    public void push(int data){
        if (size()==capacity){
            expand();
        }    
        stack[top] = data;
        top++;
    }

    private void expand(){
        int l = size();
        int newSt[] = new int[capacity+1];
        System.arraycopy(stack,0,newSt,0,l);
        stack = newSt;
        capacity++;
    }

    private void shrink(){
        int l = size();
        int newSt[] = new int[capacity-1];
        System.arraycopy(stack, 0, newSt, 0, l);
        stack = newSt;
        capacity--;
    }

    public int pop(){
        if (size()<capacity){
            shrink();
        }
        int data;
        top--;
        data = stack[top];
        stack[top] = 0;
        return data;
    }

    public int size(){
        return top;
    }
    
    public boolean isEmpty(){
        return top<=0;
    }

    public int peek(){
        int data;
        data = stack[top-1];
        return data;
    }
    
    public void show(){
        for(int n:stack){
            System.out.print(n+" ");
        }
        System.out.println();
    }
}
