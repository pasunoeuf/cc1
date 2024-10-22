import java.util.ArrayList;
import java.util.List;

public class GenreFilterIterator implements Iterator<Song> {
    private List<Song> filteredSongs;
    private int currentIndex;

    public GenreFilterIterator(Playlist playlist, String genre) {
        filteredSongs = new ArrayList<>();
        for (Song song : playlist.getSongs()) {
            if (song.getGenre().equalsIgnoreCase(genre)) {
                filteredSongs.add(song);
            }
        }
        currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < filteredSongs.size();
    }

    @Override
    public Song next() {
        return filteredSongs.get(currentIndex++);
    }
}
