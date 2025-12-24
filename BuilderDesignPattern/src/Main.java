import com.demo.User;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        User user = new User.UserBuilder().name("John")
                .age(20)
                .address("Pune")
                .phone("4444").build();
        System.out.println(user);

        User inValid = new User.UserBuilder().name("John")
                .age(-1)
                .address("Pune")
                .phone("4444").build();
        System.out.println(user);
    }
}