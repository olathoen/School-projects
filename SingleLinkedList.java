public class SingleLinkedList {//LinkedList class

	private Node head;
	private int elementCount;

	public SingleLinkedList(int value) {//LinkedList default constructor

		//set default head points to null, elementCount resets to 0 every time a new list is made
		head = new Node(value);
		elementCount = 0;
	}

	public String delFirst1() {//delete first value in list

		//return with a message to the user if the list is empty
		if(elementCount == 0) {
			return "No Nodes in List";
		}

		//deletes the first Node in the list, decrease elementCount and give output to the user
		else {
			head = head.next;
			elementCount--;
			return "The first element was deleted";
		}

	}

	public String delLast2 (){// delete the last element in the list

		//return with a message to the user if the list is empty
		if(elementCount == 0) {
			return "No Nodes in List";
		}

		//create nodes
		Node prev = head;
		Node current = head.next;

		if(elementCount == 1){//if there's only one element in the list

			//delete the whole list
			head = null;
			elementCount--;
			return "The last element was deleted";
		}

		else {
			//if there are elements in the list
            while(current.next != null){// go to the end of the list

				// update nodes each round
				current = current.next;
				prev = prev.next;
            }

           	prev.next = null;//deletes connection to the last element, so it isnt possible to reach
            elementCount--;

            return "The last element was deleted";

		}
	}

	public String delWithValue3(int val){ //delete an element with a desired value

		if(elementCount == 0) { //if the list is empty
			return "No Nodes in List";
		}

		if(elementCount == 1 && val == head.value){//if there's only one element in the list and this element is the desired one

			//delete list and decrease elementCount
			head = null;
			elementCount--;
			return "You deleted the last number.";
		}

		if(head.value == val){//If you want to delete the first node

			head = head.next;//skips the first element, which then is lost
			elementCount--;
		}

		else {

			Node current = head;

			while (current.next != null) {

				try {
					if (current.next.value == val) {// if the desired value is the current node it deletes the node
						current.next = current.next.next;
						elementCount--;
						return "Your desired value was deleted";
					}

					current = current.next;

				} catch (Exception e) {//if the desired value isn't in the list return to user

					return "Could not find value";

				}
			}
		}
		return "Your desired value was deleted";
	}

	public String delAllWithValue4 (int val){ //delete all the elements with a desired value

		//create node
		Node current = head;

		while (current != null){//loop until the end of the list

			delWithValue3(val);//runs the delWithValue3 method until the list is gone through

			current = current.next;
		}
		return delWithValue3(val);
	}



	public String addFirst5(int value) {// adds value to a new node first in list

		//creates new node with value from user, sets head pointer to the new Node and increase elementCount
		head = new Node(value, head);
		elementCount++;
		return "Element was added to list!";
	}

	public String addLast6(int value) {// adds value to a new node last in list

		//if the list is empty, it creates a new object as in the addFirst5() method
		if(head == null){

			head = new Node(value, null);//the node points to null, because its te last element in the list
			elementCount++;
		}

		else {//creates new node with value from user at the end of the list and increase elementCount

			Node current = head;

			while (current.next != null){
				current = current.next;
			}

			current.next= new Node(value, null);
			elementCount++;
		}
		return "Element was added to list!";
	}

	public  String addAppendValue7 (int ele, int val){//add a value after an element in the list

		if (head == null){ // if the list is empty
			return  "The list is empty. Fill it first!";
		}

		Node current = head;

		try {

			while (current.value != ele) {// try this: if the program finds the selected element,...

				current = current.next;

			}

			//...it creates a new node after the element and sets the pointer to the element after the original element.
			Node temp = current.next;
			current.next = new Node(val, temp);

			elementCount++;
			return "The element was added behind the desired value.";
		}

		catch (Exception e){ //else the program tells the user that the element isn't in the list. For example if the element isn't in the list
			return "The element is not in the list.";
		}
	}

	public  String addPrependValue8 (int ele, int val){//add value in front of an desired element in the list

		if (head == null){// if the list is empty, return to user
			return  "The list is empty. Fill it first!";
		}

		//create nodes
		Node prev = head;
		Node current = head.next;

		if (head.value == ele){// if the element is the first, add as the first element in list

			head = new Node(val, prev);//creates a new node and sets the pointer to the previous head element
			elementCount++;
		}

		try {
			while (current.value != ele) {//add in front of the desired element

				prev = prev.next;
				current = current.next;
			}

			prev.next = new Node(val, current);

			elementCount++;
			return "The element was added in front of the desired value.";
		}

		catch (Exception e){ //if the element doesn't exist in the list, give the user an output
			return "The element is not in the list.";
		}

	}


	public int getLength9() {//returns elementCount, which is the amount of nodes in the list

		return elementCount;
	}

	public boolean elementCountIsCorrect10 (){// check to see if the elementCount matches the amount of nodes in the list

		Node current = head;
		int count = 0;

		while (current != null){//counts the amount of nodes in list

			count++;//adds to variable
			current = current.next;
		}

		//check if the elementCount is correct
		if(elementCount == count)
			return true;

		else
			return false;
	}

	public int countValue11(int find){//count the amount of a desired value in the list

		Node current = head;

		//Node current = head.next;
		int count = 0;

		while (current != null){
			if(current.value == find)
				count++;

			current = current.next;
		}
		return count; //returns the amount of occurrences of the element
	}

	public String showList12() {// print out list with 5 values per line

		//sets  default values
		int lineShift = 0;
		Node current = head;
		String show = "";
/*
		if(elementCount == 0){//if the list is empty, inform user
			return "The list is empty";
		}
*/
		while(current != null){

			//go through list as long as there are Nodes and adds to the variable show
			show += current.value + " ";
			current = current.next;
			lineShift++;

			//make new line every time there are 5 values on the line
			/*if(lineShift % 5 == 0 ){
				show += "\n";
				lineShift = 0;
			}*/
		}
		return "" + show; //return the list
	}

	public int delList13() { //delete the list and returns amount of nodes deletes


		head = null;
		int lastCount = elementCount;//creates a variable to remember the last count before resetting elementCount.
		elementCount = 0; //resets elementCount

		return lastCount;
	}

	public String findMax14(){ //find the largest number in the list

		if(elementCount == 0) {// if the list is empty
			return "No Nodes in List";
		}

		else {// find the largest element

			Node current = head;
			int max = head.value;

			while (current != null) {
				if (current.value > max) {//compares the first element with the second

					max = current.value; // changes if the second element is bigger
				}
				current = current.next;
			}
			return "The largest number in the list is " + max; //returns the element which is largest
		}
	}

	public String findMin15(){//find the smallest number in the list

		if(elementCount == 0) {// if the list is empty
			return "No Nodes in List";
		}

		else {// find the smallest element

			Node current = head;
			int min = head.value;

			while (current != null) {
				if (current.value < min) {//compares the first element with the second

					min = current.value;// changes if the second element is smaller
				}
				current = current.next;
			}
			return "The smallest number in the list is " + min; //returns the element which is smallest
		}
	}
}