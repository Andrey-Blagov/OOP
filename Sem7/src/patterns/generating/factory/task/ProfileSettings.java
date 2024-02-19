package patterns.generating.factory.task;

public enum ProfileSettings {
    DEV("dev"), PROD("prod");

    final String value;

    ProfileSettings(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }
}
