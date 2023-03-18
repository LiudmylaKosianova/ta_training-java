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




}
