package dev.razafindratelo.streamingMusical.user;

import dev.razafindratelo.streamingMusical.songSet.Album;
import dev.razafindratelo.streamingMusical.songSet.Like;
import dev.razafindratelo.streamingMusical.songSet.PlayList;
import dev.razafindratelo.streamingMusical.songs.Genre;
import dev.razafindratelo.streamingMusical.songs.Song;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@ToString
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

    public void addToPlayList(Song song, PlayList playList) {
        List<Song> newList = playList.getSongList();
        newList.add(song);
        playList.setSongList(newList);
    }

    public void addToPlayList(Album album, PlayList playList) {
        List<Song> newList = playList.getSongList();
        newList.addAll(album.getSongList());
        playList.setSongList(newList);
    }

    public void removeById(String id, PlayList playList) {
        List<Song> newList = playList.getSongList()
                .stream()
                .filter(song -> song.getId() != id)
                .toList();
        playList.setSongList(newList);
    }

    public void like(PlayList playList) {
        if(playList.getLike() == Like.NO_LIKE) {
            playList.setLike(Like.LIKED);
            playList.incrementNumberOfLikes();
            favoritePlayLists.add(playList);
        } else {
            playList.setLike(Like.NO_LIKE);
            favoritePlayLists.remove(playList);
            playList.incrementNumberOfLikes();
        }
    }

    public PlayList exclude(PlayList playlist ,Genre ... genres) {
        PlayList newPlayList = new PlayList(
                "NewOne",
                "New playlist");

        for(Song song : playlist.getSongList()) {
            for(Genre genre : genres) {
                if(!song.getGenre().equals(genre)) {
                    newPlayList.getSongList().add(song);
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

    public int getTotalLikes(PlayList playList){
        return playList.getNumberOfLikes();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(username, user.username) && Objects.equals(email, user.email) && Objects.equals(playLists, user.playLists) && Objects.equals(favoritePlayLists, user.favoritePlayLists);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, email, playLists, favoritePlayLists);
    }
}
