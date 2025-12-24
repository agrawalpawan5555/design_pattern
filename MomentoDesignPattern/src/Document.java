public class Document {

    private String content;
    public Document(String content) {
        this.content = content;
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public DocumentMomento addDocumentMomento()
    {
      return new DocumentMomento(content);
    }

    public void restore(DocumentMomento memento) {
        this.content = memento.getContent();
    }

}
