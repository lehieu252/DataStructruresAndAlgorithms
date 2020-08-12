package linked_list.single_linked_list;

public class Node {
    public int data;;
    Node next;
    Node(int data){
        this.data = data;
    }

    public void display(){
        System.out.println("{ "+data+" }");
    }
}
