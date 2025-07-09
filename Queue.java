public class Queue extends DynamicArray implements Comparable<Queue>, Xifo<String>, Fifo<String> {
/** adds new item to the back
* @param e the item to queue
*/
    public int compareTo(Queue other) {
         return this.getOccupancy() - other.getOccupancy();
    } // method compareTo

    public String peek() {
        //empty
        String result = null; 
        if (this.getOccupancy() > 0) {
            //get the first 
            result = this.remove(0);
            //move it to the end   
            this.add(result);          
            // move everything else to keep the order the same
            for (int i = 1; i < this.getOccupancy(); i++) {
                this.add(this.remove(0));
            }
        }
        return result;
    }
        
     // method peek

    public String pop() {
        String result = null;
        if (this.getOccupancy() > 0) {
            result = this.remove(0);
        }
        return result;
    }

    /**
     * compare this queue to another based on number of items.
     * 
     * @param other another Queue
     * @return negative if it is smaller, positive if it is larger, zero if it is equal
     */
     // method pop


    public String toString() {
        String result; //store the final result
        if (this.getOccupancy() == 0) { //check if queue is empty
            result = "empty queue";
        } else {
            result = "Queue:\n"; //if not then start from the heaer
            int size = this.getOccupancy(); //get what is currenty in the queue
            for (int i = 0; i < size; i++) { //loop through all the elements
                String current = this.remove(0); //remove the item at the front 
                result += current + "\n"; //add the result 
                this.add(current); // put it back to maintain order
            }
        }
        return result;
    }
}

// class Queue