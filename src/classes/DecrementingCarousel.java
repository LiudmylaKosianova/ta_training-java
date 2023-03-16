package classes;

import java.util.ArrayList;

/**
 * Decrementing Carousel is a container, accepting int elements. DecrementingCarousel has a maximum capacity,
 * specified via the constructor.
 * When created, DecrementingCarousel is in accumulating state: you may add elements via the addElement method
 * and can produce a CarouselRun object via the run method.
 * Once the run method is called, DecrementingCarousel is in running state: it refuses adding more elements.
 * <p>
 * The CarouselRun allows to iterate over elements of the carousel decrementing them one by one with the next method.
 * The next returns the value of the current element. Then it decreases the current element by one and switches to the next element.
 * <p>
 * The CarouselRun iterates over elements in the order of their insertion.
 * When an element is decreased to zero, the CarouselRun will skip it in further iterations.
 * When there are no more elements available for decrementing, the CarouselRun returns -1.
 * <p>
 * The CarouselRun also has the isFinished method, which indicates, if the carousel has run out of the elements to decrement.
 * <p>
 * Specification Details
 * DecrementingCarousel has two public methods:
 * <p>
 * boolean addElement(int element) - adds an element. If element is negative or zero, do not add the element. If container is full, do not add the element. If the run method was called to create a CarouselRun, do not add the element. If element is added successfully, return true. Return false otherwise.
 * CarouselRun run() - returns a CarouselRun to iterate over the elements. If the run method has already been called earlier, it must return null: DecrementingCarousel may generate only one CarouselRun object.
 * CarouselRun has two public methods:
 * <p>
 * int next() - returns the current value of the current element, then decreases the current element by one and switches to the next element in insertion order. Skips zero elements. When there is no more elements to decrease, returns -1.
 * boolean isFinished() - when there is no more elements to decrease, returns true. Otherwise, returns false.
 */

public class DecrementingCarousel {
    private int capacity;
    private int[] contain = new int[capacity];

    public DecrementingCarousel(int capacity) {
        this.capacity = capacity;
        this.contain = new int[capacity];
    }

    public boolean addElement(int element) {

        if (element > 0 && capacity > 0) {
            //
            contain[capacity-1] = element;
            capacity--;
            return true;
        } else {return false;
            //throw new UnsupportedOperationException("I am unhappy with this element, bu");
        }

    }

    public int getCapacity() {
        return capacity;
    }

    public int[] getContain() {
        return contain;
    }

    public CarouselRun run() {
        throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {

        //empty case
        CarouselRun run = new DecrementingCarousel(7).run();
        System.out.println(run.isFinished()); //true
        System.out.println(run.next()); //-1

        //regular case
        DecrementingCarousel carousel = new DecrementingCarousel(7);

        carousel.addElement(2);
        carousel.addElement(3);
        carousel.addElement(1);

        CarouselRun run = carousel.run();

        System.out.println(run.isFinished()); //false

        System.out.println(run.next()); //2
        System.out.println(run.next()); //3
        System.out.println(run.next()); //1

        System.out.println(run.next()); //1
        System.out.println(run.next()); //2

        System.out.println(run.next()); //1

        System.out.println(run.isFinished()); //true
        System.out.println(run.next()); //-1

        //Refusing adding more elements case:
        DecrementingCarousel carousel = new DecrementingCarousel(3);

        System.out.println(carousel.addElement(-2)); //false
        System.out.println(carousel.addElement(0)); //false

        System.out.println(carousel.addElement(2)); //true
        System.out.println(carousel.addElement(3)); //true
        System.out.println(carousel.addElement(1)); //true

        //carousel is full
        System.out.println(carousel.addElement(2)); //false

        CarouselRun run = carousel.run();

        System.out.println(run.next()); //2
        System.out.println(run.next()); //3
        System.out.println(run.next()); //1

        System.out.println(run.next()); //1
        System.out.println(run.next()); //2

        System.out.println(run.next()); //1

        System.out.println(run.isFinished()); //true
        System.out.println(run.next()); //-1

        //Refusing to add more elements after "run" was called:
        DecrementingCarousel carousel = new DecrementingCarousel(10);

        System.out.println(carousel.addElement(2)); //true
        System.out.println(carousel.addElement(3)); //true
        System.out.println(carousel.addElement(1)); //true

        carousel.run();

        System.out.println(carousel.addElement(2)); //false
        System.out.println(carousel.addElement(3)); //false
        System.out.println(carousel.addElement(1)); //false

        //Refusing to create more than one CarouselRun:
        DecrementingCarousel carousel = new DecrementingCarousel(10);
        System.out.println(carousel.run() == null); //false
        System.out.println(carousel.run() == null); //true
    }

}
