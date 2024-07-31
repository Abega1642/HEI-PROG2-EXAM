package dev.razafindratelo.streamingMusical;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class PlayList extends GroupOfSongs{
    private Like like;

    public PlayList(String id, String name, List<Song> songList) {
        super(id, name, songList);
        this.like = Like.NO_LIKE;
    }

}
