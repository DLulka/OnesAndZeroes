package com.company;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(Main.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,0,0,1,1))));
    }

        public static int ConvertBinaryArrayToInt(List<Integer> binary) {
           int size, bin = 0, exp = 0, decimal = 0;
           size = binary.size();
           while(size > 0){
               bin = binary.get(size - 1);
               if(bin == 1)
                   decimal = (int) (decimal + (Math.pow(2, exp)));
               exp = exp +1;
               size = size - 1;
           }
           return decimal;
        }

}
