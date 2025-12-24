import java.util.Stack;

public class History {

    private Stack<DocumentMomento> history = new Stack<>();

    public void save(DocumentMomento memento) {
        history.push(memento);
    }

    public DocumentMomento undo() {
        return history.pop();
    }
}
