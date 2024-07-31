package dev.razafindratelo.streamingMusical.songSet;

import dev.razafindratelo.streamingMusical.Artists.Artist;
import dev.razafindratelo.streamingMusical.songs.Song;

import java.time.LocalDate;
import java.util.List;

public class Album extends GroupOfSongs {
    private LocalDate releaseDate;
    private Artist artist;

    public Album(String id, String name, List<Song> songList, LocalDate releaseDate) {
        super(id, name);
        this.songList = songList;
        this.releaseDate = releaseDate;
    }
}
