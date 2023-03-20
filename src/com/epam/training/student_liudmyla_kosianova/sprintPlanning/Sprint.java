package com.epam.training.student_liudmyla_kosianova.sprintPlanning;

/**
 * Sprints has the time capacity and the tickets limit, specified via constructor.
 * It is not allowed for a Sprint to contain tickets with total estimate grater than time capacity.
 * It is not allowed for a Sprint to contain total amount of tickets grater than tickets limit.
 * <p>
 * We consider a sprint to accept tickets via add* methods.
 * That methods return true when an input ticket was accepted and false otherwise.
 * Note that we consider a sprint to not accept:
 * null values,
 * tickets, that are already completed
 * tickets, that has an estimate value that will lead to capacity overflow if added
 * any ticket, if the sprint ticket limit is reached.
 * <p>
 * addUserStory(UserStory userStory) - accepts a userStory,
 * if it is not null, not completed and its uncompleted dependencies
 * are already accepted to the sprint.
 * Returns true if the user story is accepted, false otherwise.
 * <p>
 * addBug(Bug bugReport) - accepts a bug,
 * if it is not null and not completed.
 * Returns true if the bug is accepted, false otherwise.
 * <p>
 * getTickets() - Returns a defensive copy of the array of the sprint tickets.
 * Make sure the order of tickets is as they were accepted to the sprint.
 * <p>
 * getTotalEstimate() - Returns the sum of estimates of all the tickets accepted to the sprint.
 * Important restriction: Note that in this exercise you may not use Collections and Streams.
 */

public class Sprint {
    public int timeCapacity, ticketsLimit;
    UserStory[] userStories;
    Bug[] bugs;
    public Sprint(int timeCapacity, int ticketsLimit){
        this.timeCapacity = timeCapacity;
        this.ticketsLimit = ticketsLimit;
    }

}
