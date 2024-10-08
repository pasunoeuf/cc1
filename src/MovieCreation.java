
interface Movie {
    String getTitle();
    String getType();
}


class RegularMovie implements Movie {
    private String title;

    public RegularMovie(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public String getType() {
        return "Regular";
    }
}

class IMAXMovie implements Movie {
    private String title;

    public IMAXMovie(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public String getType() {
        return "IMAX";
    }
}


abstract class MovieFactory {
    public abstract Movie createMovie(String title);
}


class RegularMovieFactory extends MovieFactory {
    @Override
    public Movie createMovie(String title) {
        return new RegularMovie(title);
    }
}

class IMAXMovieFactory extends MovieFactory {
    @Override
    public Movie createMovie(String title) {
        return new IMAXMovie(title);
    }
}
