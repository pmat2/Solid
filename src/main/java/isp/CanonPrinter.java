package isp;

public class CanonPrinter implements GreyPrinter, ColorPrinter, Scanner, Copier{
    @Override
    public void printGrey() {
        System.out.println("Cannon printer prints in grey scale");
    }

    @Override
    public void printColor() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void scan() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void copy() {
        throw new UnsupportedOperationException();
    }
}
