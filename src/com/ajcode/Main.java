package com.ajcode;

/*
- Access modifier - Public, private, protected or default
- Optional - Static
- Return type - void
- Name -
- Optional parameters - ARRAY - (String[] args)
- Method body - What goes between the opening curley brackets
Optional return value - for the code below, it is void because it does not return any value
 */

/*
 Exercise: - calculate the % rental yield on a property in a year
 - Monthly rental income: £1,300
 - Purchased property price: £250,000
  */

public class Main{

    public static void main(String[] args){
    double yield = calculatePropertyYield(
            1_300, 250_000
                );
        System.out.println(yield);
    }

    private static double calculatePropertyYield(
            double rent, double propertyPrice
    ) {
        double yearlyRent = rent * 12;
        return (yearlyRent / propertyPrice) * 100;
    }

}