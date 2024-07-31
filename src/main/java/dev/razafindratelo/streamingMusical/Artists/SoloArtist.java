package dev.razafindratelo.streamingMusical.Artists;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Objects;

@Getter
@Setter
@ToString
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SoloArtist that = (SoloArtist) o;
        return Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(birthDate, that.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, birthDate);
    }
}
