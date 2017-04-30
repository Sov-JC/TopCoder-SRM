package SRM_712_DIV2;

/**
 * Created by JORGE on 4/26/2017.
 * 110.72/250 points
 * Time: 48min 32 sec
 */

public class RepeatNumberCompare {

    public String compare(int x1, int k1, int x2, int k2){
        String v1 = "";
        String v2 = "";

        for(int i=0; i<k1; i++)
            v1+=Integer.toString(x1);

        for(int i=0; i<k2; i++)
            v2+=Integer.toString(x2);


        if(v1.length() == v2.length()){
            for(int i=0; i<v1.length(); i++)
                if(v1.charAt(i) > v2.charAt(i))
                    return "Greater";
                else if(v1.charAt(i) < v2.charAt(i))
                    return "Less";

            return "Equal";
        }else if(v1.length() > v2.length())
            return "Greater";
        else
            return "Less";
    }


}