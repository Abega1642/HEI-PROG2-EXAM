package dev.razafindratelo.streamingMusical;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public abstract class GroupOfSongs {
    private String id;
    private String name;
    List<Song> songList;
}
