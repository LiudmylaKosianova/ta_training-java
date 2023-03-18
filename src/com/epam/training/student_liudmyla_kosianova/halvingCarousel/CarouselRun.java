package com.epam.training.student_liudmyla_kosianova.halvingCarousel;

/**
 * In this exercise you need to extend DecrementingCarousel.
 * You need to implement HalvingCarousel.
 * This subclass must halve elements instead of decrementing it by one.
 * Note that you need to apply regular integer division, discarding the remainder.
 * For example, 5 / 2 = 2.
 */

public class CarouselRun extends com.epam.training.student_liudmyla_kosianova.decrementingCarousel.CarouselRun {
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
        containRunning[currentPosition] = containRunning[currentPosition]/2;
        currentPosition++;

        if(currentPosition==containRunning.length){
            currentPosition=0;
        }
        return willReturn;
    }



}
