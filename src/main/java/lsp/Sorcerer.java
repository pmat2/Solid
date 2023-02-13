package lsp;

public class Sorcerer extends Character implements Caster{

    public Sorcerer(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Sorcerer moves");
    }

    @Override
    public void meleeFight() {
        System.out.println("Sorcerer fights");
    }

    @Override
    public void castSpell(Spell spell) {
        System.out.println("Sorcerer casts " + spell.getName());
    }
}
