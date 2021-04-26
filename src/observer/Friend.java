package observer;

public class Friend implements Observer{

    private  Subject post;
    private String name;

    public Friend(String name) {
        this.name = name;
    }

    @Override
    public void setPost(Subject post) {
        this.post = post;
    }

    public String getName() {
        return name;
    }
    
    @Override
    public void update() {

        if (this.post == null){
            System.out.println(this.getName() + "has no post");
            return;
        }

        String newPost = this.post.getUpdate();
        System.out.println(this.getName() + "has seen " + newPost);
    }
}
