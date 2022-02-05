package d.after;

public interface Task {
    String getChoreName();

    void setChoreName(String choreName);

    Person getOwner();

    void setOwner(Person owner);

    double getHoursWorked();

    void setHoursWorked(double hour);

    boolean getIsComplete();

    void setIsComplete(boolean isComplete);

    void performedWork(double hours);

    void completeChore();
}
