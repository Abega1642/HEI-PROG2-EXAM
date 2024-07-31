package dev.razafindratelo.streamingMusical.songSet;

import dev.razafindratelo.streamingMusical.songs.Song;

import java.time.LocalDate;
import java.util.List;

public class Album extends GroupOfSongs {
    private LocalDate releaseDate;

    public Album(String id, String name, List<Song> songList, LocalDate releaseDate) {
        super(id, name, songList);
        this.releaseDate = releaseDate;
    }
}
