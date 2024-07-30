package SimpleMessagingSystem;

class ImageMessage extends Message {
    private String imageUrl;

    public ImageMessage(User sender, User receiver, String content, String imageUrl) {
        super(sender, receiver, content);
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
