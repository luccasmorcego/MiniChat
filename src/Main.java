import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MiniChatBot bot = new MiniChatBot();

        String respostaUsuario;

        System.out.println("Olá! Eu sou o MiniChatBot. Como posso te ajudar hoje?");
        do {
            respostaUsuario = input.nextLine();

            String respostaDoChatBot = bot.responder(respostaUsuario);

            System.out.println(respostaDoChatBot);
        } while (!respostaUsuario.equalsIgnoreCase("Sair"));
    }
}