package SimpleMessagingSystem;

public class Main
{    public static void main(String[] args) {
    User user1 = new User("Aradhya");
    User user2 = new User("Ayushi");

    Chat chat = new Chat();

    Message message1 = new Message(user1, user2 ,"Hello, Ayushi!");
    Message message2 = new Message(user2,  user1,"Hi, Aradhya! How are you?");
    ImageMessage imageMessage = new ImageMessage(user1, user2, "Check out this picture!", "http://example.com/image.jpg");

    chat.addMessage(message1);
    chat.addMessage(message2);

    chat.addMessage(imageMessage);

    chat.displayChat();
}
}