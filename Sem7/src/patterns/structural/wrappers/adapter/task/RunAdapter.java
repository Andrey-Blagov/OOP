package patterns.structural.wrappers.adapter.task;
import patterns.structural.wrappers.adapter.task.mapper.Mapper;
import patterns.structural.wrappers.adapter.task.mapper.json.JsonMapper;

import java.util.HashMap;
import java.util.Map;

/**
 Your "mapper" library manages the conversion of java.util.Map into a JSON format string.
 Problem: The RunAdapter application is able to write java.util.Map to a JSON file.
 You will need to teach it to write the java.util.Map to an XML file.
 You found out that there is a converter library that can handle this task, but it has a different interface...
 */
public class RunAdapter {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        fillMap(map);

        Mapper jsonMapper = new JsonMapper();
        FileSaver jsonSaver = new FileSaver(jsonMapper);
        jsonSaver.save("test.json", map);

        Mapper xmlMapper = null;
        FileSaver xmlSaver = new FileSaver(xmlMapper);
        xmlSaver.save("test.xml", map);
    }

    private static void fillMap(Map<String, String> map) {
        map.put("mother", "Gloria");
        map.put("father", "John");
    }
}
