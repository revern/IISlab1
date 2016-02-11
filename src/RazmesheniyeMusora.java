/**
 * Created by almaz on 09.02.2016.
 */
public class RazmesheniyeMusora {
    int position;
    boolean[] cleanPositions = new boolean[100];
    public boolean isClean(){
        return  cleanPositions[position];
    }
    public void clean(){
        cleanPositions[position]=true;
    }

}
