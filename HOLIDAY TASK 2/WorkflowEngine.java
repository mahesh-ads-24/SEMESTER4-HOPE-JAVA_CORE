// Base Step Class (Abstraction)
abstract class Step {
    String name;

    Step(String name) {
        this.name = name;
    }

    abstract void execute();
}

// Approval Step (Inheritance)
class ApprovalStep extends Step {

    ApprovalStep(String name) {
        super(name);
    }

    void execute() {
        System.out.println("Approval Step: " + name);
    }
}

// Email Step (Inheritance)
class EmailStep extends Step {

    EmailStep(String name) {
        super(name);
    }

    void execute() {
        System.out.println("Email Sent: " + name);
    }
}

// Notification Step (Extra Feature)
class NotificationStep extends Step {

    NotificationStep(String name) {
        super(name);
    }

    void execute() {
        System.out.println("Notification: " + name);
    }
}

// Workflow Class (Encapsulation)
class Workflow {

    Step[] steps;

    Workflow(Step[] steps) {
        this.steps = steps;
    }

    void start() {
        for (Step step : steps) {
            step.execute();
        }
    }
}

// Main Class
public class WorkflowEngine {

    public static void main(String[] args) {

        System.out.println("Workflow Started...\n");

        Step step1 = new ApprovalStep("Manager Approval");
        Step step2 = new ApprovalStep("HOD Approval");
        Step step3 = new EmailStep("Send Email");
        Step step4 = new NotificationStep("Notify Student");

        Step[] steps = {step1, step2, step3, step4};

        Workflow workflow = new Workflow(steps);

        workflow.start();

        System.out.println("\nWorkflow Completed!");
    }
}