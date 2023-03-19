package com.epam.training.student_liudmyla_kosianova.graduallyDecreasingCarousel;

import com.epam.training.student_liudmyla_kosianova.decrementingCarousel.DecrementingCarousel;

/**
 * In this exercise you need to extend DecrementingCarousel.
 * You need to implement GraduallyDecreasingCarousel.
 * This subclass must decrement elements by gradually increasing decrement.
 * When you need to decrement an element for the first time, decrease it by 1.
 * Next time you need to decrement the same element, decrease it by 2.
 * Next time decrease by 3, then by 4 and so on.
 * Remember that you must not make process non-positive elements.
 */

public class GraduallyDecreasingCarousel extends DecrementingCarousel {


    public GraduallyDecreasingCarousel(int capacity) {
        super(capacity);
    }

    @Override
    public com.epam.training.student_liudmyla_kosianova.graduallyDecreasingCarousel.CarouselRun run() {
        //if(the run method has already been called earlier){return null;}
        if (!isAlreadyRun) {
            isAlreadyRun = true;
            return new com.epam.training.student_liudmyla_kosianova.graduallyDecreasingCarousel.CarouselRun(contain);
        } else {
            return null;
        }

    }

    public static void main(String[] args) {
        //Empty case:

        /*CarouselRun run = new GraduallyDecreasingCarousel(7).run();
        System.out.println(run.isFinished()); //true
        System.out.println(run.next()); //-1*/

        //Regular case:

        //DecrementingCarousel carousel = new GraduallyDecreasingCarousel(7); <- the same problem
        GraduallyDecreasingCarousel carousel = new GraduallyDecreasingCarousel(7);

        carousel.addElement(20);
        carousel.addElement(30);
        carousel.addElement(10);

        CarouselRun run = carousel.run();

        System.out.println(run.isFinished()); //false

        System.out.println(run.next()); //20
        System.out.println(run.next()); //30
        System.out.println(run.next()); //10
System.out.println("***");
        System.out.println(run.next()); //19
        System.out.println(run.next()); //29
        System.out.println(run.next()); //9
        System.out.println("***");
        System.out.println(run.next()); //17
        System.out.println(run.next()); //27
        System.out.println(run.next()); //7
        System.out.println("***");
        System.out.println(run.next()); //14
        System.out.println(run.next()); //24
        System.out.println(run.next()); //4
        System.out.println("***");
        System.out.println(run.next()); //10
        System.out.println(run.next()); //20

        System.out.println(run.next()); //5
        System.out.println(run.next()); //15

        System.out.println(run.next()); //9

        System.out.println(run.next()); //2

        System.out.println(run.isFinished()); //true
        System.out.println(run.next()); //-1
    }




}
