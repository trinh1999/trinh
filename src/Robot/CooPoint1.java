package Robot;

import java.util.Random;

enum Direction1 {
    AHEAD, T_LEFT, T_RIGHT;

//    private static final Direction1[] VALUES = values();
//    private static final int SIZE = VALUES.length;
//    private static final Random RANDOM = new Random();
//
//    public static Direction1 getRandom() {
//        return VALUES[RANDOM.nextInt(SIZE)];
//    }
}

   public class CooPoint1{
        private int x;
        private int y;
        private String mat;

       public CooPoint1() {
           Random random = new Random();
           this.x = random.nextInt(2000);
           this.y = random.nextInt(2000);
       }

       public CooPoint1(int x, int y) {
            this.x = x;
            this.y = y;
        }

       public CooPoint1(int x, int y, String mat) {
            this.x = x;
            this.y = y;
            this.mat = mat;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public String getMat() {
            return mat;
        }

        public void setMat(String mat) {
            this.mat = mat;
        }

       @Override
       public String toString() {
           return "CooPoint1{" +
                   "x=" + x +
                   ", y=" + y +
                   ", mat='" + mat + '\'' +
                   '}';
       }
   }

