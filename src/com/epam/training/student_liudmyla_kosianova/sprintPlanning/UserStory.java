package com.epam.training.student_liudmyla_kosianova.sprintPlanning;

/**
 * UserStory
 * We consider a user story to be a ticket that may contain some dependencies.
 * A dependency is another user story that must be completed first to allow the dependent user story
 * to complete. One provides dependencies of the UserStory via the constructor of the UserStory class.
 * <p>
 * complete() - Like the Ticket#complete() method, this sets the ticket to completed state.
 * The difference is that the user story may not be completed if its dependencies are not completed yet.
 * <p>
 * getDependencies() - Returns a defensive copy of dependencies array.
 * <p>
 * toString() - Returns a String representing this user story, using its id and name.
 * Example: "[US 1] User Registration Entity"
 */
public class UserStory extends Ticket {
    UserStory [] dependencies;

    public UserStory(int id, String name, int number, UserStory[] dependencies) {
        super(id, name, number);
        this.dependencies= dependencies;
    }

    public String toString(){
        return "[" + this.getId() + "]" + " " + this.getName();
    }

    public UserStory[] getDependencies() {
        UserStory[] copy = new UserStory[dependencies.length];
        System.arraycopy(dependencies, 0, copy, 0, dependencies.length);
        return copy;
    }

    /**
     * complete() - Like the Ticket#complete() method,
     * this sets the ticket to completed state.
     *  The difference is that the user story may not be completed
     *  if its dependencies are not completed yet.
     */
    @Override
    public void complete (){
        for(UserStory x: dependencies){
           if(!x.isCompleted()){
               break;//since the completed is set to false, it will not be changed after break
           }
        }
        this.completed = true;
    }
}
