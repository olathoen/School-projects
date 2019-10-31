public class Node {//Node class
    Node next;
    int value;

    public Node(int value, Node next){ //constructor

        //set global variable to local variable
        this.value = value;
        this.next = next;

    }//constructor ends

    public Node(int value){ //default constructor
        this.value = value;
        next = null;

    }//default constructor ends
}//Node class ends

