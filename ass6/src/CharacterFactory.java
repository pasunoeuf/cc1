import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private Map<String, Character> characterPool = new HashMap<>();

    public Character getCharacter(char value, String font, int size) {
        String key = value + font + size;

        if (!characterPool.containsKey(key)) {
            characterPool.put(key, new Character(value, font, size));
        }
        return characterPool.get(key);
    }

    public int getTotalCharactersCreated() {
        return characterPool.size();
    }
}
