package model.conditions;

public class
Weather {
    public Weather(double wind, double precipitation, double temperature, boolean snow, boolean rain) {
        this.wind = wind;
        this.precipitation = precipitation;
        this.temperature = temperature;
        this.snow = snow;
        this.rain = rain;
    }

    private double wind;
    private double precipitation;
    private double temperature;
    private boolean snow;
    private boolean rain;

    public void getWeatherFromAPI() {
        // TODO Call WeatherAPI
    }

    public double getWind() {
        return wind;
    }

    public void setWind(double wind) {
        this.wind = wind;
    }

    public double getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(double precipitation) {
        this.precipitation = precipitation;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public boolean isSnow() {
        return snow;
    }

    public void setSnow(boolean snow) {
        this.snow = snow;
    }

    public boolean isRain() {
        return rain;
    }

    public void setRain(boolean rain) {
        this.rain = rain;
    }


    public String getWeatherInfo(){
//        System.out.println("*=* Weather Conditions *=*");
        String weatherInfo ="Precipitation: "+ precipitation + "mm\n";
        weatherInfo +="Wind: " + wind+"km/h\n";
        weatherInfo +="Temperature: " + temperature +"°C\n";
        weatherInfo +="Snow :" +(snow ? "Yes": "No") + "\n";
        weatherInfo +="Rain :" +(rain ? "Yes": "No") ;



        return weatherInfo;
    }
}
