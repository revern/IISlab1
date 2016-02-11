import java.util.Random;

/**
 * Created by almaz on 09.02.2016.
 */
//  Task 2
public class Agent {
    Sreda sreda;
    int shtraf = 0; //task3
    Random random = new Random(); //task4
    public Sreda startAgent(Sreda s){
        sreda=s;

        for(int i=0;i<1000;i++){
            if(proverka()){
                clean();
            }
            step();
        }
        return s;
    }
    public boolean proverka(){
        return sreda.getRazmesheniyeMusora().isClean();
    }

    public void clean(){
        RazmesheniyeMusora rm = sreda.getRazmesheniyeMusora();
        rm.clean();
        sreda.setRazmesheniyeMusora(rm);
    }

    public void step(){
        //task4
        int vector = random.nextInt(4);
        switch (vector) {
            case 1:
                stepRight();
                break;
            case 2:
                stepLeft();
                break;
            case 3:
                stepUp();
                break;
            case 4:
                stepDown();
                break;
        }
    }
        
    boolean rightClosed, leftClosed, upClosed, downClosed;

    public void stepRight(){
        if(rightClosed){
            stepDown();
        }else{
            //step right
            shtraf++; //task3
        }
    }
    public void stepLeft(){
        if(leftClosed){
            stepUp();
        }else{
            //step left
        }
    }
    public void stepUp(){
        if(upClosed){
            stepRight();
        }else{
            //step up
        }
    }
    public void stepDown(){
        if(downClosed){
            stepLeft();
        }else{
            //step down
        }
    }

}
