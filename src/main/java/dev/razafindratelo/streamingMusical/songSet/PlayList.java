package dev.razafindratelo.streamingMusical.songSet;

import dev.razafindratelo.streamingMusical.songs.Song;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;


@Setter
@Getter
@ToString
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayList playList = (PlayList) o;
        return numberOfLikes == playList.numberOfLikes && like == playList.like;
    }

    @Override
    public int hashCode() {
        return Objects.hash(like, numberOfLikes);
    }
}
