package Srp;

public class DocumentPersistence {

    private final Document document;

    public DocumentPersistence(Document document) {
        this.document = document;
    }

    public void saveToPdf(){
        System.out.println("Saving document to pdf " + this.document);
    }
}