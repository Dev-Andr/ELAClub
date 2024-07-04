import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        // LinkedList list = new LinkedList();
        // list.insert(1);
        // list.insert(18);
        // list.insert(345);
        // list.show();
        // list.headInsert(123);
        // list.insertAt(0, 456);
        // list.show();
        // list.deleteAt(0);
        // list.show();

        // DStack nums = new DStack();
        // nums.push(12);
        // nums.push(2);
        // nums.push(11);
        // nums.show();
        // nums.push(112);
        // nums.push(22);
        // nums.push(212);        
        // System.out.println("size"+nums.size());

        // nums.show();
        // nums.pop();
        // nums.pop();
        // nums.pop();
        // nums.pop();
        // nums.show();
        // System.out.println("size"+nums.size());
        // System.out.println("size"+nums.isEmpty());
        Queue q = new Queue();
        q.enQueue(5);
        q.enQueue(6);
        q.enQueue(7);
        q.enQueue(8);
        q.deQueue();
        q.deQueue();
        q.show();

    }    
}
