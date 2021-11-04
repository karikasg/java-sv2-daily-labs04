package day03;

import java.util.Arrays;
import java.util.List;

public class Stock {
    private List<Double> stock;

    public static void main(String[] args) {
        Stock stock = new Stock(Arrays.asList(1.23,4.35,0.23,4.0,8.4));
        System.out.println(stock.maxProfit());  //8.17

        Stock stock2 = new Stock(Arrays.asList(12.0,2.0,8.0,4.0));
        System.out.println(stock2.maxProfit()); //6.0
    }

    public double maxProfit(){
        double max = 0;
        for (int i=0; i<stock.size()-1; i++){
            for (int j=i+1; j<stock.size(); j++){
                if (stock.get(j)-stock.get(i) > max) {
                    max = stock.get(j)-stock.get(i);
                }
            }
        }
        return (max);
    }

    public Stock(List<Double> stock) {
        this.stock = stock;
    }
}
