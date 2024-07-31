package dev.razafindratelo.streamingMusical.songs;

import dev.razafindratelo.streamingMusical.Artists.Artist;
import dev.razafindratelo.streamingMusical.songSet.Album;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.Duration;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
public class Song {
    private String id;
    private String title;
    private Duration duration;
    private List<Genre> genre;
    private Artist artist;
    private Album album;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return Objects.equals(id, song.id) && Objects.equals(title, song.title) && Objects.equals(duration, song.duration) && Objects.equals(genre, song.genre) && Objects.equals(artist, song.artist) && Objects.equals(album, song.album);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, duration, genre, artist, album);
    }
}
