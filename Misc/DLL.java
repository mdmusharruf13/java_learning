public class DLL {
    class Node{
        public int data;
        public Node prevNode;
        public Node nextNode;
        public Node(int data){
            this.data = data;
        }
    }
    Node head,tail=null;
    public void addDLLnode(int data){
        Node newDLLnode  = new Node(data);
        if(head==null){
            head = tail = newDLLnode;
            head.prevNode = null;
            tail.nextNode = null;
        }
        else{
            tail.nextNode = newDLLnode;
            newDLLnode.prevNode = tail;
            tail = newDLLnode;
            tail.nextNode = null;
        }
    }
    public void display(){
        Node currentNode = head;
        if(head == null){
            System.out.println("list is empty !");
            return;
        }
        System.out.println("Double linked list elements are :");
        while(currentNode != null){
            System.out.println(currentNode.data+" ");
            currentNode = currentNode.nextNode;
        }
    }
    public static void main(String [] args){
        DLL DL = new DLL();
        DL.addDLLnode(20);
        DL.addDLLnode(30);
        DL.addDLLnode(40);
        DL.addDLLnode(50);
        DL.addDLLnode(60);
        DL.addDLLnode(70);
        DL.addDLLnode(80);
        DL.display();
    }
}
