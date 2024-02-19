package patterns.structural.wrappers.adapter.task.mapper;

import java.util.Map;

/**
 Contract for objects that can represent {@link java.util.Map} as a string
 */
public interface Mapper {
    String map(Map<String, String> data);
}
