package com.epam.training.student_liudmyla_kosianova.decrementingCarouselWithLimitedRun;

/**
 * In this exercise you need to extend DecrementingCarousel.
 * You need to implement DecrementingCarouselWithLimitedRun.
 * This subclass must decrement elements as a usual DecrementingCarousel.
 * The difference is that this implementation must produce a carousel run, which limits
 * number of calls to the next method. When the limit of calls reached
 * carousel run must consider itself finished.
 */
public class CarouselRun extends com.epam.training.student_liudmyla_kosianova.decrementingCarousel.CarouselRun {
    protected int limitRun;
    protected int count;
    public CarouselRun(int[] greenSofa, int limitRun) {
        super(greenSofa);
        this.limitRun = limitRun;
    }

    boolean limitReached (){
        return count == limitRun;
    }

    @Override
    public int next(){

        if(onlyZeros() || limitReached()){
            return -1;
        }
        //the value of the current element can't be zero, since we should skip zero elements
        // Let's find the currentPosition, that points to not a zero element

        while(containRunning[currentPosition]==0){
            currentPosition++;
            if(currentPosition==containRunning.length){
                currentPosition=0;
            }
        }

        int willReturn = containRunning[currentPosition];//I'm so happy it is not zero )))
        containRunning[currentPosition]--;
        currentPosition++;
        count++;
        //make sure that currentPosition is not bigger, than the length of containRunning
        //if it is bigger, that I need to start from the beginning
        if(currentPosition==containRunning.length){
            currentPosition=0;
        }
        return willReturn;
    }

    @Override
    public boolean isFinished(){

        return (onlyZeros() || limitReached());
    }
}
