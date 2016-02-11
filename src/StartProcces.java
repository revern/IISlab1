/**
 * Created by almaz on 09.02.2016.
 */
public class StartProcces {
    public void main(String[] args){
        Sreda sreda = new Sreda(new Razmer(), new Forma(), new RazmesheniyeMusora());
        Agent agent = new Agent();
        agent.startAgent(sreda);
    }
}
