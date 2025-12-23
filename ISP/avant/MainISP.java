package ISP.avant;

public class MainISP {
    public static void MainISP(String[] args) {
        System.out.println("===== AVANT REFACTORING ISP =====\n");

        Worker human = new HumanWorker();
        human.work();
        human.eat();

        System.out.println();

        Worker robot = new RobotWorker();
        robot.work();

        try{
            robot.eat();
        } catch(UnsupportedOperationException e) {
            System.out.println("Exception:"+ e.getMessage());
        }
    }
}
