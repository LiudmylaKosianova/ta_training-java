package com.epam.training.student_liudmyla_kosianova.decrementingCarouselWithLimitedRun;

import com.epam.training.student_liudmyla_kosianova.decrementingCarousel.CarouselRun;
import com.epam.training.student_liudmyla_kosianova.decrementingCarousel.DecrementingCarousel;
/**
 * In this exercise you need to extend DecrementingCarousel.
 * You need to implement DecrementingCarouselWithLimitedRun.
 * This subclass must decrement elements as a usual DecrementingCarousel.
 * The difference is that this implementation must produce a carousel run, which limits
 * number of calls to the next method. When the limit of calls reached
 * carousel run must consider itself finished.
 */

public class DecrementingCarouselWithLimitedRun extends DecrementingCarousel {
    int limitRun;
    public DecrementingCarouselWithLimitedRun(int capacity, int limitRun) {
        super(capacity);
        this.limitRun = limitRun;
    }

    @Override
    public com.epam.training.student_liudmyla_kosianova.decrementingCarouselWithLimitedRun.CarouselRun run() {

        if (!isAlreadyRun) {
            isAlreadyRun = true;
            return new com.epam.training.student_liudmyla_kosianova.decrementingCarouselWithLimitedRun.CarouselRun(contain,limitRun);
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        //Empty case:

        /*CarouselRun run = new DecrementingCarouselWithLimitedRun(7, 5).run();
        System.out.println(run.isFinished()); //true
        System.out.println(run.next()); //-1*/

        //Regular case:

        //DecrementingCarousel carousel = new DecrementingCarouselWithLimitedRun(7, 10);
        DecrementingCarouselWithLimitedRun carousel = new DecrementingCarouselWithLimitedRun(7, 10);

        carousel.addElement(20);
        carousel.addElement(30);
        carousel.addElement(10);

        CarouselRun run = carousel.run();

        System.out.println(run.isFinished()); //false

        System.out.println(run.next()); //20
        System.out.println(run.next()); //30
        System.out.println(run.next()); //10

        System.out.println(run.next()); //19
        System.out.println(run.next()); //29
        System.out.println(run.next()); //9

        System.out.println(run.next()); //18
        System.out.println(run.next()); //28
        System.out.println(run.next()); //8

        System.out.println(run.next()); //17

        System.out.println(run.isFinished()); //true
        System.out.println(run.next()); //-1


    }
}
