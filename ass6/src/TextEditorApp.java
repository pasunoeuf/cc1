public class TextEditorApp {
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();
        TextEditor editor = new TextEditor(factory);

        // Insert and render text
        editor.insertText("Hello World", "Arial", 12, 0, 0);
        editor.insertText("Flyweight Pattern", "Arial", 12, 0, 20);
        editor.renderDocument();

        // Display memory efficiency
        System.out.println("\nTotal unique characters created: " + factory.getTotalCharactersCreated());
    }
}
