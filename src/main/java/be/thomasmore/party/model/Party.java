package be.thomasmore.party.model;



import javax.persistence.*;

import java.util.Date;

@Entity
public class Party {
    @Id
    private int id;
    private String name;
    private Integer pricePresaleInEur;
    private Integer priceInEur;
    private String extraInfo;
    @Temporal(TemporalType.DATE)
    private Date date;
    @Temporal(TemporalType.TIME)
    private Date doors;
    @ManyToOne
    private Venue venue;

    public Party() {
    }

    public Party(int id, String name, Integer pricePresaleInEur, Integer priceInEur, String extraInfo, Date date,
                 Date doors) {
        this.id = id;
        this.name = name;
        this.pricePresaleInEur = pricePresaleInEur;
        this.priceInEur = priceInEur;
        this.extraInfo = extraInfo;
        this.date = date;
        this.doors = doors;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPricePresaleInEur() {
        return pricePresaleInEur;
    }

    public void setPricePresaleInEur(Integer pricePresaleInEur) {
        this.pricePresaleInEur = pricePresaleInEur;
    }

    public Integer getPriceInEur() {
        return priceInEur;
    }

    public void setPriceInEur(Integer priceInEur) {
        this.priceInEur = priceInEur;
    }

    public String getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDoors() {
        return doors;
    }

    public void setDoors(Date doors) {
        this.doors = doors;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }
}