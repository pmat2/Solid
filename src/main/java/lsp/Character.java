package lsp;

public abstract class Character {

    private final String name;
    private int level;

    public Character(String name) {
        this.name = name;
        this.level = 1;
    }


    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public abstract void move();
    public abstract void meleeFight();
    public abstract void castSpell(Spell spell);
}
