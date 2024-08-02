public class LinkedList {
    Node head;
    public void insert(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        
        if (head==null){
            head = node;
        }else{
            Node n = head;
            while(n.next!=null){
                n = n.next;
            }
            n.next = node;
        }
    }

    public void headInsert(int data){
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }

    public void insertAt(int index, int data){
        if(index==0){
            headInsert(data);
            return;
        }
        
        Node node = new Node();
        node.data = data;
        Node pnode = head;
        
        for(int i=0; i<index-1; i++){
            pnode = pnode.next;
        }
        
        node.next = pnode.next;
        pnode.next = node;

    }

    public void deleteAt(int index){
        if(index == 0){
            head = head.next;
        }else{
            Node node = head;         
            Node pnode = head;
            for(int i=0; i<index; i++){
                pnode = node;
                node = node.next;
            }
            
            pnode.next = node.next;
        }
    }

    public void show(){
        Node node = head;
        {}
        while(node!=null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println();
    }
}
