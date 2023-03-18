package com.epam.training.student_liudmyla_kosianova.decrementingCarouselWithLimitedRun;

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
    public DecrementingCarouselWithLimitedRun(int capacity) {
        super(capacity);
    }
}
