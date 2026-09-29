import java.util.*;

public class CLIchatbot2 {

    static List<Message2> history = new ArrayList<>();

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("CAHTBOT READY. TYPE 'EXIT(exit) TO QUIT'");

        while (true){
            System.out.print("YOU:");
            String input = scanner.nextLine();

            if(input.equals("exit")) break;

            history.add(new Message2("user",input));

            String reply = "echo" + input;
            history.add(new Message2("assistant",reply));

            System.out.println("BOT" + " " + reply);
        }

        System.out.println("----History----");
        for (Message2 m : history){
            System.out.println(m.role + ":" + m.content);
        }

    }

}

class Message22{
    String role;
    String content;

    Message2(String role,String content){
        this.role = role;
        this.content = content;
    }
}
