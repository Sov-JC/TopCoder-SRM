package SRM_609_DIV1;

/**
 * Created by JORGE on 3/25/2017.
 */
public class Exe extends EyeDrops{
    public static void main(String[] args){
        EyeDrops e = new EyeDrops();
        System.out.println("8, 2 -> " + e.closest(8, 2));
        System.out.println("9, 3 -> " + e.closest(9,3));
        System.out.println("9, 8 -> " + e.closest(9,8));
    }
}
