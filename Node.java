public class Node {//Node class
    Node next;
    int value;

    public Node(int value, Node next){ //constructor

        //set global variable to local variable
        this.value = value;
        this.next = next;

    }//constructor ends

    public Node(){ //default constructor
        value = 0;
        next = null;

    }//default constructor ends
}//Node class ends

