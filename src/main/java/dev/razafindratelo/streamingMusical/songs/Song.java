package dev.razafindratelo.streamingMusical.songs;

import dev.razafindratelo.streamingMusical.Artists.Artist;

import java.time.Duration;
import java.util.List;

public class Song {
    private String id;
    private String title;
    private Duration duration;
    private List<Genre> genre;
    private Artist artist;
}
