package video.streaming.service.movies;

import video.streaming.service.Video;

public class Movies extends Video {

    //#4 - Video streaming service
    public String getGenreOfMovie() {
        return genreOfMovie;
    }

    public void setGenreOfMovie(String genreOfMovie) {
        this.genreOfMovie = genreOfMovie;
    }

    private String genreOfMovie;

    public Movies(int length, boolean contentQualified, int volumeLevel, String genreOfMovie) {
        super(length, contentQualified, volumeLevel);
        setGenreOfMovie(genreOfMovie);
    }
}
