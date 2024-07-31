package dev.razafindratelo.streamingMusical.user;

import dev.razafindratelo.streamingMusical.songSet.Like;
import dev.razafindratelo.streamingMusical.songSet.PlayList;
import dev.razafindratelo.streamingMusical.songs.Genre;
import dev.razafindratelo.streamingMusical.songs.Song;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class User {
    private String id;
    private String username;
    private String email;
    private List<PlayList> playLists;
    private List<PlayList> favoritePlayLists;

    public User(String id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.playLists = new ArrayList<>();
        this.favoritePlayLists = new ArrayList<>();
    }

    public void like(PlayList playList) {
        if(playList.getLike() == Like.NO_LIKE) {
            playList.setLike(Like.LIKED);
            favoritePlayLists.add(playList);
        } else {
            playList.setLike(Like.NO_LIKE);
            favoritePlayLists.remove(playList);
        }
    }

    public PlayList exclude(PlayList playlist ,Genre ... genres) {
        PlayList newPlayList = new PlayList(
                "NewOne",
                "New playlist");
        for(Song song : playlist.getSongList()) {
            for(Genre genre : genres) {
                if(!song.getGenre().equals(genre)) {
                    newPlayList.addToPlayList(song);
                }
            }
        }
        return newPlayList;
    }

    public int countPlayList(Song song) {
        int count = 0;
        for(PlayList playList : playLists) {
            if(playList.getSongList().contains(song)) {
                count++;
            }
        }
        return count;
    }
}
