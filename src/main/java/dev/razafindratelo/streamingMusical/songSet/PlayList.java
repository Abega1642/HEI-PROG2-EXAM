package dev.razafindratelo.streamingMusical.songSet;

import dev.razafindratelo.streamingMusical.songs.Song;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class PlayList extends GroupOfSongs{
    private Like like;
    private int numberOfLikes;

    public PlayList(String id, String name) {
        super(id, name);
        this.like = Like.NO_LIKE;
        numberOfLikes = 0;
    }

    public void addToPlayList(Song song) {
        this.songList.add(song);
    }

    public void addToPlayList(Album album) {
        this.songList.addAll(album.getSongList());
    }

    public void removeById(String id) {
        this.songList = this.songList
                .stream()
                .filter(song -> song.getId() != id)
                .toList();
    }

}
