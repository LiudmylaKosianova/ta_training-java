package com.epam.training.student_liudmyla_kosianova.graduallyDecreasingCarousel;

/**
 * In this exercise you need to extend DecrementingCarousel.
 * You need to implement GraduallyDecreasingCarousel.
 * This subclass must decrement elements by gradually increasing decrement.
 * When you need to decrement an element for the first time, decrease it by 1.
 * Next time you need to decrement the same element, decrease it by 2.
 * Next time decrease by 3, then by 4 and so on.
 * Remember that you must not make process non-positive elements.
 */

public class CarouselRun extends com.epam.training.student_liudmyla_kosianova.decrementingCarousel.CarouselRun {
    int count =1;
    public CarouselRun(int[] greenSofa) {
        super(greenSofa);
    }

    @Override
    public int next(){

        if(onlyZeros()){
            return -1;
        }


        while(containRunning[currentPosition]==0){
            currentPosition++;
            if(currentPosition==containRunning.length){
                currentPosition=0;
            }
        }

        int willReturn = containRunning[currentPosition];

        containRunning[currentPosition] = containRunning[currentPosition]-count;
        currentPosition++;
        count++;

        if(currentPosition==containRunning.length){
            currentPosition=0;
        }
        return willReturn;
    }
}
