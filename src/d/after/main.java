package d.after;

public class main {
    public static void main(String[] args) {
        Person owner = Factory.createWorker();
        owner.setFirstName("William");
        owner.setLastName("Ardianto");
        owner.setPhone("+60189662679");
        owner.setEmail("william.ardianto@gmail.com");

        Task chore = Factory.createChore();
        chore.setChoreName("Take out the trash");
        chore.setOwner(owner);

        chore.performedWork(4);
        chore.performedWork(1.5);
        chore.completeChore();
    }
}
