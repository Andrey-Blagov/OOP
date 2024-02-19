package patterns.generating.factory.task;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FactoryPropertyLoader {
    private static final String PATH_TO_PROPERTY = "src/patterns/factory/resources/application.property";
    private static final Map<String, String> settings = new TreeMap<>();
    private static Properties properties;

    public static String load() {
        new FactoryPropertyLoader();
        try {
            properties.load(new FileReader(PATH_TO_PROPERTY));
        } catch (IOException e) {
            e.printStackTrace();
        }
        fillMap();
        String key = Optional.of(properties.getProperty("profile"))
                .orElseThrow(UnsupportedOperationException::new);
        return Optional.of(settings.get(key)).orElseThrow(UnsupportedOperationException::new);
    }

    private FactoryPropertyLoader() {
        properties = new Properties();
    }

    private static void fillMap() {
        for (ProfileSettings setting : ProfileSettings.values())
            settings.put(setting.name().toLowerCase(), setting.value());
    }
}
