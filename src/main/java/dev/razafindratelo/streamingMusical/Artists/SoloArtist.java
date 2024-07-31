package dev.razafindratelo.streamingMusical.Artists;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class SoloArtist extends Artist{
    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    public SoloArtist(String id, String sceneName, int beginYear, String Nationality, String firstName, String lastName, LocalDate birthDate) {
        super(id, sceneName, beginYear, Nationality);
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }
}
