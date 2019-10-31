import java.util.Scanner;

public class Test {
    public static void main(String [] args){

        //prints out program information
        System.out.print(
            "Select one of the following operations you want to use:" +
            "\n[0]: End session" +
            "\n[1]: Delete the first element in the list." +
            "\n[2]: Delete the last element in the list." +
            "\n[3]: Delete element with desired value." +
            "\n[4]: Delete all elements with desired value." +
            "\n[5]: Add element in front of list." +
            "\n[6]: Add element in the end of the list." +
            "\n[7]: Add element after element with desired value." +
            "\n[8]: Add element in front of element with desired value" +
            "\n[9]: Show length of list." +
            "\n[10]: Check and see if the elementCount variable is correct." +
            "\n[11]: Count the amount of an element in the list." +
            "\n[12]: Show the complete list." +
            "\n[13]: Delete list. The amount of elements deleted will be shown." +
            "\n[14]: Find the largest element in the list." +
            "\n[15]: Find the smallest element in the list. " +
            "\n\nType in  mode: ");

        //enables inout from user
        Scanner input = new Scanner(System.in);
        int num = input.nextInt(); //variable from user-input

        //create a linked list for the program
        SingleLinkedList myList = new SingleLinkedList();

        while (num != 0){ //goes in loop until 0 i typed, to end the program

            if(num == 1 ){ //if 1 i typed, user deletes the first Node

                //deletes first Node, and writes a message to user to inform that it was deleted
                System.out.println(myList.delFirst1());//prints returned message to user
            }

            if(num == 2 ){ //if 2 i typed

                System.out.println(myList.delLast2()); //prints returned message to user
            }

            if(num == 3 ){ //if 3 i typed

                System.out.println("Enter value to delete once: "); //ask for input

                int val = input.nextInt();//collects inout from user

                System.out.println(myList.delWithValue3(val));//prints returned message to user
            }

            if(num == 4 ){ //if 4 i typed

                System.out.println("Enter value to delete all: ");//ask for input

                int val = input.nextInt();//collects inout from user

                System.out.println(myList.delAllWithValue4(val));//prints returned message to user
            }


            if (num == 5){//if 5 i typed the program adds the value desired

                System.out.print("Enter value to add first: ");//ask for input
                int add = input.nextInt();//collects inout from user

                System.out.println(myList.addFirst5(add));//prints returned message to user
            }

            if(num == 6 ){ //if 6 i typed

                System.out.print("Enter value to add last: ");//ask for input
                int add = input.nextInt();//collects inout from user

                System.out.println(myList.addLast6(add));//prints returned message to user
            }

            if(num == 7 ){ //if 7 i typed

                System.out.print("Enter the value you want to add after: ");//ask for input
                int ele = input.nextInt();//collects inout from user

                System. out.println("Enter the value you want to add: ");//ask for input
                int val = input.nextInt();//collects inout from user

                System.out.println(myList.addAppendValue7(ele, val));//prints returned message to user
            }

            if(num == 8 ){ //if 8 i typed

                System.out.print("Enter the value you want to add in front of: ");//ask for input
                int ele = input.nextInt();//collects inout from user

                System. out.println("Enter the value you want to add: ");//ask for input
                int val = input.nextInt();//collects inout from user

                System.out.println(myList.addPrependValue8(ele, val));//prints returned message to user
            }

            if (num == 9){ //if 9 is typed, the length is written out

                System.out.println("The length is: " + myList.getLength9());//prints returned message to user
            }

            if(num == 10 ){ //if 10 i typed

                System.out.println("Is elementCount correct? " + myList.elementCountIsCorrect10());//prints returned message to user
            }

            if(num == 11 ){ //if 11 i typed

                System.out.println("Write which number to count: ");//ask for input
                int find = input.nextInt();//collects inout from user

                if(myList.countValue11(find) == 0) // if the element doesn't exist in the list, return text

                    System.out.println("The number is not in the list.");

                else
                    System.out.println("There are " + myList.countValue11(find) + " occurrences of " + find + " in the list.");//prints returned message to user

            }

            if(num == 12){ //if 12 is typed, the whole list is written out

                System.out.println(myList.showList12());//prints returned message to user
            }

            if (num == 13){ //if 13 is typed, the list is deleted and the amount of Nodes deleted is shown.

                System.out.println(myList.delList13() + " Nodes was deleted");//prints returned number to user
            }

            if(num == 14 ){ //if 14 i typed

                System.out.println(myList.findMax14());//prints returned message to user
            }

            if(num == 15 ){ //if 15 i typed

                System.out.println(myList.findMin15());//prints returned message to user
            }

            if(num == 16 ){ //if 15 i typed

                myList.checkForGap16();//prints returned message to user
            }

            if(num == 17 ){ //if 15 i typed

                int val = input.nextInt();

                myList.insert17(val);//prints returned message to user
            }

            if(num == 18 ){ //if 15 i typed

                int val = input.nextInt();

                myList.delete18(val);//prints returned message to user
            }

            else { // if another number is typed the program information is printed again

                System.out.print("\nPlease choose a valid mode from the menu: ");//ask for input
            }

            //System.out.print("\nPlease choose a mode from the menu: ");
            num = input.nextInt();//enables input after a command is given.

        }
    }
}
