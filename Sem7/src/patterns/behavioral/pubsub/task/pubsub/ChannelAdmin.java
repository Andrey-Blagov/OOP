package patterns.behavioral.pubsub.task.pubsub;

/**
  Video channel's admin.
 */
public class ChannelAdmin {
    private String name;

    public ChannelAdmin(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
