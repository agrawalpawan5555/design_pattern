//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Document editor = new Document("First document");
        History history = new History();

        editor.setContent("Version 1");
        history.save(editor.addDocumentMomento());

        editor.setContent("Version 2");
        history.save(editor.addDocumentMomento());

        editor.setContent("Version 3");

        // Undo
        editor.restore(history.undo());
        System.out.println(editor.getContent());
    }
}