package patterns.behavioral.pubsub.task.pubsub;

import java.time.LocalDateTime;

/**
  Description object of video (model)
 */
public class Video {
    private final LocalDateTime startTime;
    private final String name;
    private final int duration;

    public Video(LocalDateTime startTime, String name, int duration) {
        this.startTime = startTime;
        this.name = name;
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
}
