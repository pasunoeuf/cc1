import java.util.List;

public class SequentialIterator implements Iterator<Song> {
    private Playlist playlist;
    private int currentIndex;

    public SequentialIterator(Playlist playlist) {
        this.playlist = playlist;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < playlist.getSongs().size();
    }

    @Override
    public Song next() {
        return playlist.getSongs().get(currentIndex++);
    }
}
