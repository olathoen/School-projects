import java.util.Scanner;

public class Oblig3 {
    public static void main(String[] args) {

        //enable user input
        Scanner input = new Scanner(System.in);

        //ask and collect desired length
        System.out.print("Choose the desired length of your list: ");
        int length = input.nextInt();

        //create HashTable object with int length as size
        HashTable hashTbl = new HashTable(length);

        //ask and collect desired values to add
        System.out.print("Add the desired values to the list: ");
        int value = input.nextInt();

        while (value != 0){//adds value, end session by typing: 0

            //add value to table
            hashTbl.add(value);

            //enable to insert multiple values
            value = input.nextInt();

        }//while ends


        //15 default values for testing program
        hashTbl.add(10);
        hashTbl.add(0);
        hashTbl.add(410);
        hashTbl.add(43);
        hashTbl.add(21);
        hashTbl.add(3);
        hashTbl.add(67);
        hashTbl.add(87);
        hashTbl.add(45);
        hashTbl.add(46);
        hashTbl.add(32);
        hashTbl.add(89);
        hashTbl.add(212);
        hashTbl.add(4);
        hashTbl.add(988);


        //print the hashtable by using print method
        hashTbl.printTable();

    }//main ends
}//class ends
