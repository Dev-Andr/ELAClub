public class Queue{
    int queue[] = new int[4];
    int size,front,rear;

    void enQueue(int data){
        queue[rear] = data;
        rear = rear*(rear+1)%5;
        size++;
    }
    int deQueue(){
        int data = queue[front];
        front = (front+1)%5;
        size--;
        return data;
    }
    void show(){
        for (int i=0;i<size;i++){
            System.out.println(queue[front+i]+" ");
        }
        for (int n:queue){
            System.out.println(n);
        }
    }
}