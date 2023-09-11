package test;

import model.truck.Brand;

public class TestTruckDetails {
    public static void main(String[] args) {
        Brand actual = new Brand(001,"Volvo",false);
        System.out.println(actual.getBrandInfo());


    }
}
