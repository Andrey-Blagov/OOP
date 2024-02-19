package patterns.structural.wrappers.adapter.task;

import patterns.structural.wrappers.adapter.task.mapper.Mapper;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
  This object can manage to save {@link java.util.Map} as string into file.
 */
public class FileSaver {
    private final Mapper mapper;

    public FileSaver(Mapper mapper) {
        this.mapper = mapper;
    }

    public void save(String path, Map<String, String> data) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            writer.write(mapper.map(data));
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Data saved...");
    }
}
