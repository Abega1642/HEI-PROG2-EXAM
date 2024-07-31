package dev.razafindratelo.streamingMusical.songSet;

import dev.razafindratelo.streamingMusical.songs.Song;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public abstract class GroupOfSongs {
    protected String id;
    protected String name;
    protected List<Song> songList;

    public GroupOfSongs(String id, String name) {
        this.id = id;
        this.name = name;
        this.songList = new ArrayList<>();
    }
}
