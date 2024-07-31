package dev.razafindratelo.streamingMusical.Artists;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Objects;

@Getter
@Setter
@ToString
public class GroupArtist extends Artist {
    private List<SoloArtist> soloArtists;

    public GroupArtist(String id, String sceneName, int beginYear, String Nationality, List<SoloArtist> soloArtists) {
        super(id, sceneName, beginYear, Nationality);
        this.soloArtists = soloArtists;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupArtist that = (GroupArtist) o;
        return Objects.equals(soloArtists, that.soloArtists);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(soloArtists);
    }
}
