package dev.razafindratelo.streamingMusical.Artists;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Artist {
    protected String id;
    protected String sceneName;
    protected int beginYear;
    protected String Nationality;
}
