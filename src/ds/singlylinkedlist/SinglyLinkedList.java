package ds.singlylinkedlist;

public class SinglyLinkedList {
    private Node first;

    public SinglyLinkedList() {
    }

    public boolean isEmpty() {
        return(first == null);
    }

    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = next;
        first = newNode;
    }

    public void deleteFirst(){
        Node temp = first;
        first = first.next;
        return temp;

    }

    public void displayList(){
        System.out.println("List (first --> last) ");
        Node current = first;
        while(current != null){
            current.displayNode();

        }


    }



}
