package lession5.Activity53;

public class Word {
    private String key;
    private String name;
    private String type;

    public Word() {
    }

    public Word(String key, String name) {
        this.key = key;
        this.name = name;
    }

    public Word(String key, String name, String type) {
        this.key = key;
        this.name = name;
        this.type = type;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
