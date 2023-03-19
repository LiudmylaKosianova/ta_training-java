package com.epam.training.student_liudmyla_kosianova.halvingCarousel;


import com.epam.training.student_liudmyla_kosianova.decrementingCarousel.DecrementingCarousel;

/**
 * In this exercise you need to extend DecrementingCarousel.
 * You need to implement HalvingCarousel.
 * This subclass must halve elements instead of decrementing it by one.
 * Note that you need to apply regular integer division, discarding the remainder.
 * For example, 5 / 2 = 2.
 */

public class HalvingCarousel extends DecrementingCarousel {

    public HalvingCarousel(int capacity) {
        super(capacity);
    }

    @Override
    public com.epam.training.student_liudmyla_kosianova.halvingCarousel.CarouselRun run() {

        if (!isAlreadyRun) {
            isAlreadyRun = true;
            return new com.epam.training.student_liudmyla_kosianova.halvingCarousel.CarouselRun(contain);
        } else {
            return null;
        }

    }

    public static void main(String[] args) {
        //Empty case:

        /*CarouselRun run = new HalvingCarousel(7).run();
        System.out.println(run.isFinished()); //true
        System.out.println(run.next()); //-1*/

        //Regular case:

        //DecrementingCarousel carousel = new HalvingCarousel(7); <= this line causes errors, when the CarouselRun object is created later on
        HalvingCarousel carousel = new HalvingCarousel(7); //this line fixes the errors

        carousel.addElement(20);
        carousel.addElement(30);
        carousel.addElement(10);

        CarouselRun run = carousel.run(); //

        System.out.println(run.isFinished()); //false

        System.out.println(run.next()); //20
        System.out.println(run.next()); //30
        System.out.println(run.next()); //10

        System.out.println(run.next()); //10
        System.out.println(run.next()); //15
        System.out.println(run.next()); //5

        System.out.println(run.next()); //5
        System.out.println(run.next()); //7
        System.out.println(run.next()); //2

        System.out.println(run.next()); //2
        System.out.println(run.next()); //3
        System.out.println(run.next()); //1

        System.out.println(run.next()); //1
        System.out.println(run.next()); //1

        System.out.println(run.isFinished()); //true
        System.out.println(run.next()); //-1
    }
}
