package tech.itpark.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Film {
    private long id;
    private String url;
    private String image;
    private String filmName;
    private double rating;
    private boolean like;
    private String availabilityTicket;
    private long date;
}
