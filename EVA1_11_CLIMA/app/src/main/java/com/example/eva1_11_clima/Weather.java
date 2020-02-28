package com.example.eva1_11_clima;

public class Weather {
    /*Nombre de la ciudad - String
    * Temperatura - int
    * Desripoción del clima - String
    * Imagen* - int*/

    private String city, climate;
    private int temp;
    private int image;

    public Weather(String city, int temp, String climate, int image) {
        this.city = city;
        this.climate = climate;
        this.temp = temp;
        this.image = image;
    }

    public String getCity() {
        return city;
    }

    public String getClimate() {
        return climate;
    }

    public int getTemp() {
        return temp;
    }

    public int getImage() {
        return image;
    }
}
