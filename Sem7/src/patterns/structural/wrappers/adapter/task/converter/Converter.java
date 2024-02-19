package patterns.structural.wrappers.adapter.task.converter;

import java.util.List;

/**
 A contract for objects that can represent two lists({@link java.util.List})
 as a string of strings related by position
 */
public interface Converter {
    String convert(List<String> keys, List<String> values);
}
