package patterns.structural.wrappers.proxy.task.downloaders.impl;

import patterns.structural.wrappers.proxy.task.downloaders.validators.PictureComparator;

import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PictureDownloadService {
    private final String PREFIX = "https://w.forfun.com/fetch/";
    private final PictureComparator comparator = new PictureComparator();

    public void download(String path, String filename) {
        if (invalid(path)) throw new IllegalArgumentException("Invalid url. Url must started at" + PREFIX);

        System.err.println("Start download");
        long startTime = System.currentTimeMillis();
        try {
            Thread.sleep(5000);

            URL url = new URL(path);

            Path outputPath = Paths.get("src/patterns/structural/wrappers/proxy/pictures/" + filename);

            InputStream in = url.openStream();

            Files.copy(in, outputPath, StandardCopyOption.REPLACE_EXISTING);

        } catch (Exception e) {
            System.err.println("In load time happened error");
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        System.err.printf("Load finished with time %s %s%n", (endTime - startTime) / 1000, "seconds");
    }


    private boolean invalid(String path) {
        return !path.toLowerCase().startsWith(PREFIX);
    }
}
