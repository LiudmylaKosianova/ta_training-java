package classes;

/**
 * CarouselRun has two public methods:
 * <p>
 * int next() - returns the current value of the current element, then decreases the current element by one
 * and switches to the next element in insertion order. Skips zero elements.
 * When there is no more elements to decrease, returns -1.
 * <p>
 * boolean isFinished() - when there is no more elements to decrease, returns true. Otherwise, returns false.
 */
public class CarouselRun extends DecrementingCarousel {

    int currentPosition =0;
    public CarouselRun(int capacity) {
        super(capacity);
    }

    public int next(){
        currentPosition++;
        return this.getContain()[currentPosition];

    }
    public boolean isFinished(){}
}
