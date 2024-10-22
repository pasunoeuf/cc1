import java.util.ArrayList;
import java.util.List;

public class Document {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }


    public DocumentVersion save() {
        return new DocumentVersion(content);
    }


    public void restore(DocumentVersion memento) {
        this.content = memento.getContent();
    }
}
