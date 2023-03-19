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
    private String id, name;
    private int hoursToComplete;
    public boolean completed = false;
    public Ticket(String id, String name, int number){
        this.id = id;
        this.name = name;
        this.hoursToComplete = number;
    }

    protected String getId() {
        return id;
    }

    protected String getName() {
        return name;
    }

    protected int getEstimate(){
        return hoursToComplete;
    }
    public boolean isCompleted(){
        return completed;
    }
    protected void complete(){
        this.completed = true;
    }

}
