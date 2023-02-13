package ocp;

public class DocumentPersistence {

    private final Document document;
    private final DocumentSaver saver;

    public DocumentPersistence(Document document, DocumentSaver saver) {
        this.document = document;
        this.saver = saver;
    }

    public void save() {
        saver.save(this.document);
    }
}