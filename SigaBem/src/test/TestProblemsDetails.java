package test;

import model.conditions.Location;
import model.conditions.Road;
import model.conditions.Weather;
import model.system.Problem;

public class TestProblemsDetails {
    public static void main(String[] args) {
        System.out.println("***===*** Testes detalhes para o Problema ***===***");
        Weather todayWeather = new Weather(5.2,10.5,20.0,true,false);
        System.out.println(todayWeather.getWeatherInfo());
        System.out.println("----------------------");
        Location locationOf = new Location("03284-030", "Regis Bittencourt",317,"Proximo a entrada de São Lourenço da Serra");
        System.out.println(locationOf.getLocationInfos());
        System.out.println("----------------------");
        Road todayRoad = new Road(false,true,false, false,true);
        System.out.println(todayRoad.getRoadCondition());
        System.out.println("----------------------");
        Problem incident = new Problem(0001,357,"Capotamento na rodovia, deixando a faixa esquerda interditada","Incidente 001",todayWeather.getWeatherInfo(),locationOf.getLocationInfos(),todayRoad.getRoadCondition());
        System.out.println(incident.getProblemInfo());
        System.out.println("----------------------------------------------");







    }
}