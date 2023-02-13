package lsp;

public class Warrior extends Character {

    public Warrior(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Warrior moves");
    }

    @Override
    public void meleeFight() {
        System.out.println("Warrior fights");
    }

}
