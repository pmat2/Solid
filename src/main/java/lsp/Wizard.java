package lsp;

public class Wizard extends Character implements Caster {

    public Wizard(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Wizard moves");
    }

    @Override
    public void meleeFight() {
        System.out.println("Wizard fights");
    }

    @Override
    public void castSpell(Spell spell) {
        System.out.println("Wizard casts " + spell.getName());
    }
}
