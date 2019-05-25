package model;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class Car {

private String brand;
private String model;
private String bodyType;
private String productionYear;
private String color;

//@Enumerated(EnumType.STRING)
private OrderStatus orderStatus;

private double pricePerDay;
}