package patterns.structural.wrappers.proxy.task.downloaders.view;

import patterns.structural.wrappers.proxy.task.downloaders.impl.PictureDownloadService;

import java.util.Scanner;

public class View {

    public void run(PictureDownloadService service) {

        while (true) {
            String url = prompt("Enter the url of picture's download:");
            String filename = prompt("Enter the name of file for picture's saving:");

            service.download(url, filename);

            String isContinue = prompt("Continue? (y/n)");

            if (!(isContinue.equalsIgnoreCase("y"))) {
                System.exit(0);
            }
        }
    }

    private String prompt(String message) {
        System.out.println(message);
        return new Scanner(System.in).next();
    }
}
