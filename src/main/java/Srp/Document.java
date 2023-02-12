package Srp;

import java.time.LocalDateTime;

public class Document {

    private String content;
    private String author;
    private LocalDateTime createDate;

    public Document(String content, String author, LocalDateTime createDate) {
        this.content = content;
        this.author = author;
        this.createDate = createDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Document{" +
                "content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", createDate=" + createDate +
                '}';
    }

    public void saveToPdf(){
        System.out.println("Saving document to pdf");
    }

    public void display(){
        System.out.println(this);
    }
}
