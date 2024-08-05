package dev.razafindratelo.corrections;

import dev.razafindratelo.streamingMusical.songSet.GroupOfSongs;
import dev.razafindratelo.streamingMusical.user.User;

import java.util.ArrayList;
import java.util.List;

public class PlayList extends GroupOfSongs {
    private List<User> likes;

    public PlayList(String id, String name) {
        super(id, name);
        this.likes = new ArrayList<>();
    }
}
