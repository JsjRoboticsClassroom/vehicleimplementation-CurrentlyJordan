package nyc.c4q.abassawo;

/**
 * Created by c4q-ac29 on 8/31/16.
 */
public class Bicycle implements Vehicle {
    double speed;



    public Bicycle(double speed){
        this.speed = speed;
    }

    public void popAWheelie(int duration){
        while(duration != 0){
            System.out.println("I'm popping a Wheeelieee");

        }
    }

    @Override
    public void applyBrakes() {
        for (double i = speed; i > 0; i--) {
            speed--;

        }
    }

    @Override
    public void speedUp(){
        while(speed < 60){
            speed++;
        }
    }




    @Override
    public void slowDown(){
        while(speed > 100){
            speed--;
        }

    }
}
