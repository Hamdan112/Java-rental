package om.gov.taxoman.entity;

public class DateTime {

    private int itemId;
    private String date;
    private String time;
    private int locationId;

    @Override
    public String toString() {
        return "DateTime{" +
                "itemId=" + itemId +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", locationId=" + locationId +
                '}';
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public DateTime(int itemId, String date, String time, int locationId) {
        this.itemId = itemId;
        this.date = date;
        this.time = time;
        this.locationId = locationId;
    }

    public DateTime() {
    }
}
