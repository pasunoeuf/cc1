import java.util.Collections;
import java.util.List;

public class ShuffleIterator implements Iterator<Song> {
    private List<Song> shuffledSongs;
    private int currentIndex;

    public ShuffleIterator(Playlist playlist) {
        shuffledSongs = new ArrayList<>(playlist.getSongs());
        Collections.shuffle(shuffledSongs);
        currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < shuffledSongs.size();
    }

    @Override
    public Song next() {
        return shuffledSongs.get(currentIndex++);
    }
}
