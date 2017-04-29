package SRM_711_DIV2;

/**
 * Created by JORGE on 4/27/2017.
 */
public class Exe {

    public static void main(String[] args){


    }

    public static void squareMakingTest(){
        int x = (new SquareMaking()).getMinimalPrice(5, 6, 5, 5);
        int y = (new SquareMaking()).getMinimalPrice(4, 1, 5, 4);
        int z = (new SquareMaking()).getMinimalPrice(2017, 2017, 2017, 2017);
        int a = (new SquareMaking()).getMinimalPrice(705451, 751563, 608515, 994713);

        System.out.println("x: " + x + ", y: " + y+ ", z: " + z+ ", a: " + a);
    }
}
