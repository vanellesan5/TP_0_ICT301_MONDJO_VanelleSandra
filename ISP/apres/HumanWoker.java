  package ISP.apres;
  
  class HumanWorker implements Eatable{
@Override
public void work(){
    System.out.println("les humains travaillent");}
    @Override
    public void eat(){
        System.out.println("les humains mangent");}
}

class RobotWorker implements Workable {
    @Override
    public void work() {
        System.out.println("les robots travaillent sans fatigue");}
}
