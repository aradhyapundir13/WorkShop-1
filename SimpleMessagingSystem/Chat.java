package SimpleMessagingSystem;
import java.util.ArrayList;
import java.util.List;
public class Chat {

        private List<Message> messages;

        public Chat() {
            messages = new ArrayList<>();
        }

        public void addMessage(Message message) {
            messages.add(message);
        }

    public void displayChat() {
        for (Message message : messages) {
            if (message instanceof ImageMessage) {
                ImageMessage imgMessage = (ImageMessage) message;
                System.out.println(imgMessage.getSender().getUsername() + " to " + imgMessage.getReceiver().getUsername() + ": " + imgMessage.getContent() + " [Image: " + imgMessage.getImageUrl() + "]");
            } else {
                System.out.println(message.getSender().getUsername() + " to " + message.getReceiver().getUsername() + ": " + message.getContent());
            }
        }
    }
        }





