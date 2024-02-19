package patterns.structural.wrappers.adapter.task.mapper.json;

import patterns.structural.wrappers.adapter.task.mapper.Mapper;

import java.util.Map;

/**
  Implementation of {@link Mapper} interface
 */
public class JsonMapper implements Mapper {

    @Override
    public String map(Map<String, String> data) {
        StringBuilder builder = new StringBuilder("{");

        for (Map.Entry<String, String> entry: data.entrySet()) {
            builder.append("\"")
                    .append(entry.getKey())
                    .append("\": \"")
                    .append(entry.getValue())
                    .append("\", ");
        }

        builder.delete(builder.length() -2, builder.length());
        builder.append("}");

        return builder.toString();
    }
}
