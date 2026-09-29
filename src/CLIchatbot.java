import java.util.*;

public class CLIchatbot {

    static List<Message> history = new ArrayList<>();

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("CAHTBOT READY. TYPE 'EXIT(exit) TO QUIT'");

        while (true){
            System.out.print("YOU:");
            String input = scanner.nextLine();

            if(input.equals("exit")) break;

            history.add(new Message("user",input));

            String reply = "echo" + input;
            history.add(new Message("assistant",reply));

            System.out.println("BOT" + " " + reply);
        }

        System.out.println("----History----");
        for (Message m : history){
            System.out.println(m.role + ":" + m.content);
        }

    }

}

class Message{
    String role;
    String content;

    Message(String role,String content){
        this.role = role;
        this.content = content;
    }
}
