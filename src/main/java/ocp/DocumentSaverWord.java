package ocp;

public class DocumentSaverWord implements DocumentSaver{
    @Override
    public void save(Document document) {
        System.out.println("Saving to word " + document);
    }
}
