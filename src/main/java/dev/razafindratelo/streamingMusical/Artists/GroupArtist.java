package dev.razafindratelo.streamingMusical.Artists;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class GroupArtist extends Artist {
    private List<SoloArtist> soloArtists;

    public GroupArtist(String id, String sceneName, int beginYear, String Nationality, List<SoloArtist> soloArtists) {
        super(id, sceneName, beginYear, Nationality);
        this.soloArtists = soloArtists;
    }
}
