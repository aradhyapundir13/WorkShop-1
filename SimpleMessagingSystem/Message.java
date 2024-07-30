package SimpleMessagingSystem;

public class Message {
    private User sender;
    private String content;
    private User receiver;

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public Message(User sender, User receiver, String content) {
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
    }


}

//class TextMessage extends Message{
//    User bob;
//     TextMessage( User bob) {
//         super();
//        this.bob=bob;
//    }
//    public void printMessage(){
//        System.out.println(getSender()+"(Text):" +getContent());
//    }
//}
//class ImageMessage extends Message{
//    private String imageUrl;
//     ImageMessage(String imageUrl) {
//         super();
//
//         this.imageUrl = imageUrl;
//
//    } @Override
//        public void printMessage() {
//         System.out.println("Image Message from " + getSender().getUsername() + " to " + getReceiver().getUsername() + ": " + imageUrl); }
//        public String getImageUrl() {
//         return imageUrl;
//    }
//}