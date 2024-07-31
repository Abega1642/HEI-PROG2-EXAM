package dev.razafindratelo.streamingMusical.songSet;

import dev.razafindratelo.streamingMusical.songs.Song;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class PlayList extends GroupOfSongs{
    private Like like;
    private int numberOfLikes;

    public PlayList(String id, String name) {
        super(id, name);
        this.like = Like.NO_LIKE;
        numberOfLikes = 0; ;
    }

    public void incrementNumberOfLikes() {
        this.numberOfLikes += (this.like == Like.LIKED) ? 1 : -1;
    }

}
