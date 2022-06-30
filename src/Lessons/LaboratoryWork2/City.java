package Lessons.LaboratoryWork2;

public class City {

    String cityName;
    String area;
    String streetName;
    Integer homeNumber;
    Integer codeOfCity;

    public City() {
    }

    public City(String cityName, String streetName, Integer homeNumber) {
        this.cityName = cityName;
        this.streetName = streetName;
        this.homeNumber = homeNumber;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public Integer getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(Integer homeNumber) {
        this.homeNumber = homeNumber;
    }

    public Integer getCodeOfCity() {
        return codeOfCity;
    }

    public void setCodeOfCity(Integer codeOfCity) {
        this.codeOfCity = codeOfCity;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityName='" + cityName + '\'' +
                ", area='" + area + '\'' +
                ", streetName='" + streetName + '\'' +
                ", homeNumber=" + homeNumber +
                ", codeOfCity=" + codeOfCity +
                '}';
    }

    public static void main(String[] args) {
        City city = new City("Saint-Petersburg", "Marata", 35);
        System.out.println(city);

        city.setCodeOfCity(198);
        city.setArea("Kalininskiy");

        System.out.println(city);
    }

}
