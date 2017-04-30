package SRM_609_DIV1;

public class EyeDrops {

    public double closest (int sleepTime, int k){

        //Awake at t >= sleepTime
        double awakeTime = 24.0 - sleepTime;

        double doseTimeInterval = awakeTime/(k-1);

        //System.out.println("doseTimeInterval @ start = " + doseTimeInterval);

        if(sleepTime >= doseTimeInterval){
            return doseTimeInterval * 60.0;
        }else{
            //System.out.println("sleepTime >= doseTimeInterval! Recalculating!");
            double ratio = sleepTime/doseTimeInterval;
            double delayTime = ratio * sleepTime;
            double newDoseTimeInterval = doseTimeInterval - delayTime;
            return newDoseTimeInterval * 60;
        }
    }

}
