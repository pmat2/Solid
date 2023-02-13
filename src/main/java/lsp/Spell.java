package lsp;

public class Spell {
    private final String name;
    private int level;

    public Spell(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }
}
