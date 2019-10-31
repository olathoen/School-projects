public class HashTable {//HashTable class

    //global variable and array
    private int tabSize;
    private SingleLinkedList[] myList;

    public HashTable(int tabSize) {//HashTable constructor

        //makes new HashTable with the length of the table as parameters
        this.tabSize = tabSize;
        this.myList = new SingleLinkedList[tabSize];

    }//constructor ends

    public int hashToIndex(int hashValue){//hash value to an index

        //return the hashed index for the value
        return hashValue % tabSize;

    }//hashToIndex method ends

    //global variable for counting the amount of added elements
    private double added = 0;

    public void add(int value){//add element to the array

        //get the index for the value to be stored at, from the hash method
        int idxValAdd = hashToIndex(value);

        //check to see if the current index is empty or not
        if (myList[idxValAdd] == null)

            //if empty then make a new LinkedList and add value from user as first Node
            myList[idxValAdd] = new SingleLinkedList(value);

        else
            //if not then add Node with value to a existing LinkedList
            myList[idxValAdd].addLast6(value);

        //add each time a Node is added
        added++;

    }//add method ends

    public void printTable(){//print the HashTable

        //variables for calculating loadfactor
        double loadFact;
        double keys = 0;

        for (int i = 0; i < tabSize; i++){

            //shows the index number
            System.out.print("Index " + i + ": ");


                if(myList[i] != null){

                    //counts the amount of used indexes
                    keys++;

                    //if the current index isn't empty, the LinkedList of the index is printed
                    System.out.println(myList[i].showList12());
                }//if ends

                else
                    //if the index is empty, gives message
                    System.out.println("index is empty");
        }//for loop ends

        //calculate loadFactor
        loadFact = added / keys;

        //loadFactor is printed
        System.out.println("\nThe loadfactor is " + loadFact);

    }//printTable method ends
}//class ends
