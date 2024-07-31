package dev.razafindratelo.streamingMusical.songSet;

import dev.razafindratelo.streamingMusical.Artists.Artist;
import dev.razafindratelo.streamingMusical.songs.Song;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@ToString
public class Album extends GroupOfSongs {
    private LocalDate releaseDate;
    private Artist artist;

    public Album(String id, String name, List<Song> songList, LocalDate releaseDate) {
        super(id, name);
        this.songList = songList;
        this.releaseDate = releaseDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Album album = (Album) o;
        return Objects.equals(releaseDate, album.releaseDate) && Objects.equals(artist, album.artist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(releaseDate, artist);
    }
}
