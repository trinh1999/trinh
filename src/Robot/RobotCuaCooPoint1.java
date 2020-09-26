package Robot;

public class RobotCuaCooPoint1 {
    CooPoint1 current_posision;

    public RobotCuaCooPoint1(CooPoint1 current_posision) {
        this.current_posision = current_posision;
    }

    public RobotCuaCooPoint1() {
        current_posision= new CooPoint1(0,0,"x+");
    }
    public void move(Direction1 moveDirection, int distance){
        CooPoint1 first= new CooPoint1(current_posision.getX(), current_posision.getY());
        if (current_posision.getMat()=="x+"){
            if (moveDirection== Direction1.AHEAD){
                current_posision.setX(current_posision.getX()+distance);
            }else if (moveDirection== Direction1.T_RIGHT){
                current_posision.setY(current_posision.getY()-distance);
                current_posision.setMat("y-");
            }else if ((moveDirection== Direction1.T_LEFT)){
                current_posision.setY(current_posision.getY()+distance);
                current_posision.setMat("y+");
            }
        }else if (current_posision.getMat()=="x-"){
            if (moveDirection== Direction1.AHEAD){
                current_posision.setX(current_posision.getX()-distance);
            }else if (moveDirection== Direction1.T_RIGHT){
                current_posision.setY(current_posision.getY()+distance);
                current_posision.setMat("y+");
            }else if (moveDirection== Direction1.T_LEFT){
                current_posision.setY(current_posision.getY()-distance);
                current_posision.setMat("y-");
            }
        }else if (current_posision.getMat() == "y+") {
            if (moveDirection == Direction1.AHEAD) {
                current_posision.setY(current_posision.getY() + distance);
            } else if (moveDirection == Direction1.T_RIGHT) {
                current_posision.setX(current_posision.getX() + distance);
                current_posision.setMat("x+");
            } else if (moveDirection == Direction1.T_LEFT) {
                current_posision.setX(current_posision.getX() - distance);
                current_posision.setMat("x-");
            }
        } else if (current_posision.getMat() == "y-") {
            if (moveDirection == Direction1.AHEAD) {
                current_posision.setY(current_posision.getY() - distance);
            } else if (moveDirection == Direction1.T_RIGHT) {
                current_posision.setMat("x-");
                current_posision.setX(current_posision.getX() - distance);
            } else if (moveDirection == Direction1.T_LEFT) {
                current_posision.setX(current_posision.getX() + distance);
                current_posision.setMat("x+");
            }
        }
    }

    public CooPoint1 getCurrentPosision(){
        return current_posision;
    }

    public static void main(String[] args) {
        RobotCuaCooPoint1 robot= new RobotCuaCooPoint1();
        CooPoint1 point1= new CooPoint1(0,0,"x+");
        robot.move(Direction1.T_LEFT,20);
        System.out.println(robot.getCurrentPosision());




    }

}
