package ocp;

public class DocumentSavedWord implements DocumentSaver {
    @Override
    public void save(Document document) {
        System.out.println("Saving to word " + document);
    }
}
