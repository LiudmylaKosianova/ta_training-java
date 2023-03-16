package classes;



/**
 *  The CarouselRun iterates over elements in the order of their insertion.
 *  When an element is decreased to zero, the CarouselRun will skip it in further iterations.
 *  When there are no more elements available for decrementing, the CarouselRun returns -1.
 * CarouselRun has two public methods:
 * <p>
 * int next() - returns the current value of the current element, then decreases the current element by one
 * and switches to the next element in insertion order. Skips zero elements.
 * When there is no more elements to decrease, returns -1.
 * <p>
 * boolean isFinished() - when there is no more elements to decrease, returns true. Otherwise, returns false.
 */
public class CarouselRun {

    int currentPosition = 0;
    int [] containRunning;
    public CarouselRun(int[]arry) {
        this.containRunning = arry;
    }

    /**
     * I need this method, because I need to check
     * if all the numbers in the "contain" are zeros or not
     * @return true, if all the elements in the "contain" are 0s
     */
    public boolean onlyZeros (){
        for(int element: containRunning){
            if(element!=0){
               return false;}
        }

        return true;
    }

    public int next(){
        //if (all numbers inside the "contain" == 0){return -1;}
        //else{
        // first: return the current value of the current element,
        // then: decreases the current element by one
        // then: switches to the next element in insertion order. Skips zero elements.
        // }

        if(onlyZeros()){
            System.out.println("I have returned -1");
            return -1;
        }


        //System.out.println("willReturn is: "+willReturn+" currentPosition is: "+currentPosition);
        while(containRunning[currentPosition]==0 && currentPosition< containRunning.length-1){
            currentPosition++;
        }
        if (containRunning[currentPosition] != 0) {
            int willReturn = containRunning[currentPosition];
            containRunning[currentPosition]--;
            currentPosition++;
            return willReturn;
        }
    }

        //Ferrari's ideas:
// currentPosition++;
// return this.getContain()[currentPosition];



    public boolean isFinished(){
        return onlyZeros();
    }


}
