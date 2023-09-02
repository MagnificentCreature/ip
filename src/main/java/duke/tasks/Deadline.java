package duke.tasks;

import java.time.LocalDate;

/**
 * Adapted from Partial Solution given in https://nus-cs2103-ay2324s1.github.io/website/schedule/week2/project.html under Level-4
 * Deadline class extends from the parent class Task
 * Deadlines are tasks that need to be done before a specific date/time e.g., submit report by 11/10/2019 5pm
 */

public class Deadline extends Task {

    /**
     * The date/time of the deadline.
     */
    protected LocalDate by;

    /**
     * Creates a Deadline object.
     *
     * @param description The description of the deadline.
     * @param by The date/time of the deadline.
     */
    public Deadline(String description, LocalDate by) {
        super(description);
        this.by = by;
    }

    /**
     * Creates a Deadline object.
     *
     * @param description The description of the deadline.
     * @param by The date/time of the deadline.
     * @param isDone Whether the deadline is done.
     */
    public Deadline(String description, LocalDate by, boolean isDone) {
        super(description, isDone);
        this.by = by;
    }

    @Override
    public String toString() {
        return "[D]" + super.toString() + " (by: " + by.format(DATE_TIME_OUTPUT) + ")";
    }

    @Override
    public String toFileString() {
        return "D | " + (isDone ? "1" : "0") + " | " + description + " | " + by.format(DATE_TIME_FORMAT);
    }
}
