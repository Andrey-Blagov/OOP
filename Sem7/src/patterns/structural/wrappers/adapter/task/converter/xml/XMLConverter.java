package patterns.structural.wrappers.adapter.task.converter.xml;

import patterns.structural.wrappers.adapter.task.converter.Converter;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 Implementation of {@link Converter} interface
 */
public class XMLConverter implements Converter {

    @Override
    public String convert(List<String> keys, List<String> values) {
        Map<String, String> data = prepare(keys, values);
        StringBuilder builder = new StringBuilder("<?xml version=\"3.0\" encoding=\"UTF-8\"?>\n\t");
        builder.append("<").append("data").append(">\n\t").append("\t").append("<");
        for (Map.Entry<String, String> entry: data.entrySet()) {
            builder.append(entry.getKey())
                    .append(">")
                    .append(entry.getValue())
                    .append("</")
                    .append(entry.getKey())
                    .append(">\n\t").append("\t").append("<");
        }
        builder.delete(builder.length() - 3, builder.length() -2);
        builder.append("/data").append(">\n\t");
        return builder.toString();
    }

    private Map<String, String> prepare(List<String> keys, List<String> values) {
        if (keys.size() != values.size())
            throw new ArrayIndexOutOfBoundsException("The number of keys and values must be the same");
        Map<String, String> data = new LinkedHashMap<>();
        for (int i = 0; i < keys.size(); i++) {
            data.put(keys.get(i), values.get(i));
        }
        return data;
    }
}
