package dev.razafindratelo.streamingMusical;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Artist {
    private String id;
    private String sceneName;
    private int beginYear;
    private String Nationality;
}
