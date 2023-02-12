package Srp;

public class DocumentLogger {

    private final Document document;

    public DocumentLogger(Document document) {
        this.document = document;
    }

    public void display(){
        System.out.println(this.document);
    }
}