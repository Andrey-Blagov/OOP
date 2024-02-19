package patterns.behavioral.pubsub.task;

import patterns.behavioral.pubsub.task.pubsub.Subscriber;
import patterns.behavioral.pubsub.task.pubsub.Video;
import patterns.behavioral.pubsub.task.pubsub.VideoChannel;

import java.time.LocalDateTime;

/**
 Task: You'll need to implement interaction video channel with video channel's user on a based
 event(pub-sub, observer) design of app's architecture
 */
public class RunPubSub {
    public static void main(String[] args) {
        run();
    }

    private static void run() {
        System.out.println("App is running ...");

        VideoChannel channel = new VideoChannel();

        Video bandsOfNewYork = new Video(LocalDateTime.of(
                2023, 6, 12, 2, 0), "Bands of NewYork", 49
        );

        Video santaBarbara = new Video(LocalDateTime.of(
                1990, 1, 1, 0, 0), "Santa Barbara", 1000000
        );

        Subscriber s1 = new Subscriber("Bob");
        Subscriber s2 = new Subscriber("Jack");
    }
}
