package d.before;

public class main {
    public static void main(String[] args) {
        Person owner = new Person();
        owner.firstName = "William";
        owner.lastName = "Ardianto";
        owner.phone = "+60189662679";
        owner.email = "william.ardianto@gmail.com";

        Chore chore = new Chore();
        chore.choreName = "Take out the trash";
        chore.owner = owner;

        chore.performedWork(4);
        chore.performedWork(1.5);
        chore.completeChore();
    }
}
