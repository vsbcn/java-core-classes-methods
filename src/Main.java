import bd.operations.BigDecimalOperations;
import car.inventory.system.utility.Utility;
import ordered.integers.intarraylist.IntArrayList;
import ordered.integers.intvector.IntVector;
import video.streaming.service.tvseries.TvSeries;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        //#1 - BigDecimal
        BigDecimal bigdecimal = new BigDecimal("6.755");
        System.out.println(BigDecimalOperations.doubleBD(bigdecimal));

        //#2 - BigDecimal
        System.out.println(BigDecimalOperations.reverseBD(bigdecimal));

        //#3 - Car intentory system
        Utility polo = new Utility("7825112114N", "Wolkswagen", "Polo", 1000.0, false);
        System.out.println(polo.getVinNumber());

        //#4 - Video streaming service
        TvSeries lost = new TvSeries(700, false, 80);
        lost.setNextInSeries(new TvSeries(500, false, 90));
        System.out.println(lost.getNextInSeries().getLength());

        //#5 - IntList Interface
        //# a) IntArrayList implementation - add method

        System.out.println("=========== intArrayList ===========");

        IntArrayList intArrayList = new IntArrayList();
        //Length at start
        System.out.println(intArrayList.getIntListArray().length);

        for (int i = 0; i < 15; i++) {
            intArrayList.add(i);
        }
        //Length after adding values
        System.out.println(intArrayList.getIntListArray().length);

        for (int i = 0; i < 5; i++) {
            intArrayList.add(i);
        }
        //Length  after adding from previous position values
        System.out.println(intArrayList.getIntListArray().length);

        //# b) IntArrayList implementation - get method

        System.out.println("=========== intVector =============");

        IntVector intArrayListVector = new IntVector();
        //Length at start
        System.out.println(intArrayListVector.getIntListArray().length);

        for (int i = 0; i < 25; i++) {
            intArrayListVector.add(i);
        }
        //Length after adding values
        System.out.println(intArrayListVector.getIntListArray().length);

        for (int i = 0; i < 40; i++) {
            intArrayListVector.add(i);
        }
        //Length  after adding from previous position values
        System.out.println(intArrayListVector.getIntListArray().length);

    }
}