package isp;

public class HpPrinter implements Printer {
    @Override
    public void printGrey() {
        System.out.println("Hp printing in grey scale");
    }

    @Override
    public void printColor() {
        System.out.println("Hp printing in color");
    }

    @Override
    public void scan() {
        System.out.println("Hp scanning");
    }

    @Override
    public void copy() {
        System.out.println("Hp copying");
    }
}
