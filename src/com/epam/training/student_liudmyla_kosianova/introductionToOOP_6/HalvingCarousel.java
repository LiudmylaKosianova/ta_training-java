package com.epam.training.student_liudmyla_kosianova.introductionToOOP_6;

import com.epam.training.student_liudmyla_kosianova.classes_5.CarouselRun;
import com.epam.training.student_liudmyla_kosianova.classes_5.DecrementingCarousel;

/**
 * In this exercise you need to extend DecrementingCarousel.
 * You need to implement HalvingCarousel.
 * This subclass must halve elements instead of decrementing it by one.
 * Note that you need to apply regular integer division, discarding the remainder.
 * For example, 5 / 2 = 2.
 */

public class HalvingCarousel extends DecrementingCarousel {
    public HalvingCarousel(final int capacity) {
        super(capacity);
    }

    public static void main(String[] args) {
        //Empty cases

        /*CarouselRun run = new HalvingCarousel(7).run();
        System.out.println(run.isFinished()); //true
        System.out.println(run.next()); //-1*/

        //Regular cases

        DecrementingCarousel carousel = new HalvingCarousel(7);

        carousel.addElement(20);
        carousel.addElement(30);
        carousel.addElement(10);

        CarouselRun run = carousel.run();

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
