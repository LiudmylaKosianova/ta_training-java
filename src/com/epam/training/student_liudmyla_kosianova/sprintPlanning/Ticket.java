package com.epam.training.student_liudmyla_kosianova.sprintPlanning;

/**
 * Ticket
 * Every ticket has an id, a name and an estimate of hours to complete it.
 * One provides them via the constructor of the Ticket class.
 * Also, a ticket may be completed or not. When a ticket is created, it is not completed.
 * getId() - Returns the id of the ticket.
 * getName() - Returns the name of the ticket.
 * getEstimate() - Returns the estimate of the ticket.
 * isCompleted() - Returns true if the ticket is completed, false otherwise.
 * complete() - Sets the ticket to completed state.
 */

public class Ticket {
    private String  name;
    private int id, estimate;
    protected boolean completed = false;
    public Ticket(int id, String name, int estimate){
        this.id = id;
        this.name = name;
        this.estimate = estimate;
    }

    protected int getId() {
        return id;
    }

    protected String getName() {
        return name;
    }

    protected int getEstimate(){
        return estimate;
    }
    public boolean isCompleted(){
        return completed;
    }
    protected void complete(){
        this.completed = true;
    }

}
