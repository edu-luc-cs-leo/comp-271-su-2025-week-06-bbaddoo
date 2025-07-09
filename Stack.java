public class Stack extends DynamicArray implements Comparable<Stack>, Xifo<String>, Lifo<String> {

    public int compareTo(Stack other) {
        return this.getOccupancy() - other.getOccupancy();
    } // method compareTo

    public String peek() {
        if(this.getOccupancy()== 0) {
           return null;
    } 
    //the underlying array to get to the top element
    String top = null;
    // loop through all the items 
   for (int i = 0; i < this.getOccupancy(); i++) {
    // remove it from the front
    top = this.remove(0);
    // put it back to the end
    this.add(top);
}
   return top;
    }
 //removes and returns the top item from the stack
    public String pop() {
        if (this.getOccupancy()== 0) { //check if the stack is empty
            return null; //empty
        } 
        return this.remove(this.getOccupancy()-1); //otherwise return the item to the top
    }

    public String toString() {
        if (this.getOccupancy() == 0) {
            return "empty stack";
    } 
    String result = "Stack:/n";
     //to save the original 
    int size = this.getOccupancy();
    //from top to bottom without the stack changing
    for (int i = size - 1; i >= 0; i--) { //loop through the top
        for (int j = 0; j <= i; j++) {
            String item = this.remove(0); //remove the front item
                this.add(item); //add that item back to the end
                if (j == i) {
                    result += item + "\n";
                }
        }
    }
    return result;
    }


    public void push(String e) {
       //add to the end of the array 
        this.add(e);
    } // method push

} // class Stack