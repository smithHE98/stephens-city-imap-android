package han.svuspiral.phonetoad;

/**
 * Created by han on 12/2/2017.
 */

public class location {

    String title, description, address, image;
    Double latitude, longitude;

    location(){

    }

    location(String title, String description, String address, String image, Double latitude, Double longitude ){
        this.title = title;
        this.description = description;
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
        this.image = image;
    }

    public String getTitle(){return title;}
    public void setTitle(String Title){this.title = title;}

    public String getDescription(){return description;}
    public void setDescription(String Description){this.description = description;}

    public String getAddress(){return address;}
    public void setAddress(String Address){this.address = address;}

    public String getImage(){return image;}
    public void setImage(String Image){this.image = image;}

    public Double getLatitude(){return latitude;}
    public void setLatitude(Double Latitude){this.latitude = latitude;}

    public Double getLongitude(){return longitude;}
    public void setLongitude(Double Longitude){this.longitude = longitude;}



}
