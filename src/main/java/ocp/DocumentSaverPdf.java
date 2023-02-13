package ocp;

public class DocumentSaverPdf implements DocumentSaver {
    @Override
    public void save(Document document) {
        System.out.println("Saving to pdf " + document);
    }
}
