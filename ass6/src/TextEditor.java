import java.util.ArrayList;
import java.util.List;

public class TextEditor {
    private List<RenderedCharacter> renderedCharacters = new ArrayList<>();
    private CharacterFactory characterFactory;

    public TextEditor(CharacterFactory factory) {
        this.characterFactory = factory;
    }

    // Represents a character with its position (extrinsic state)
    private class RenderedCharacter {
        Character character;
        int x, y;

        public RenderedCharacter(Character character, int x, int y) {
            this.character = character;
            this.x = x;
            this.y = y;
        }
    }

    public void insertText(String text, String font, int size, int startX, int startY) {
        int x = startX, y = startY;
        for (char c : text.toCharArray()) {
            Character character = characterFactory.getCharacter(c, font, size);
            renderedCharacters.add(new RenderedCharacter(character, x, y));
            x += 10;  // Move x-coordinate for the next character
        }
    }

    public void renderDocument() {
        for (RenderedCharacter rc : renderedCharacters) {
            rc.character.render(rc.x, rc.y);
        }
    }
}
