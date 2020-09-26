package Robot;
    enum Mat
    {
        X_CONG, X_TRU, Y_CONG, Y_TRU
    }
    public class Robot1 {
        private int x;
        private int y;
        private Mat mat;

        public Robot1(int x, int y, Mat mat) {
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

        public Mat getMat() {
            return mat;
        }

        public void setMat(Mat mat) {
            this.mat = mat;
        }

        @Override
        public String toString() {
            return "Robot1{" +
                    "x=" + x +
                    ", y=" + y +
                    ", mat=" + mat +
                    '}';
        }

        public void run (String huong, int buoc) {
            if(this.mat == Mat.X_CONG) {
                if( huong == "phai") {
                    y = y- buoc;
                    this.mat= Mat.Y_TRU;
                }else if (huong == "trai") {
                    y = y+buoc;
                    this.mat= Mat.Y_CONG;
                }else if (huong == "thang") {
                    x= x+buoc;
                    this.mat= Mat.X_CONG;
                }

            }else if (this.mat == Mat.Y_CONG) {
                if (huong == "phai") {
                    x= x+buoc;
                    this.mat = Mat.X_CONG;

                }else if( huong == "trai") {
                    x= x-buoc;
                    this.mat = Mat.X_TRU;

                }else if(huong == "thang") {
                    y= y+buoc;
                    this.mat= Mat.Y_CONG;
                }

            }else if(this.mat == Mat.X_TRU) {
                if(huong =="phai") {
                    y=y+buoc;
                    this.mat= Mat.Y_CONG;
                }else if (huong == "trai") {
                    y=y-buoc;
                    this.mat = Mat.Y_TRU;
                }else if (huong == " thang") {
                    x= x-1;
                    this.mat = Mat.X_TRU;
                }
            }else if ( this.mat== Mat.Y_TRU) {
                if(huong == "trai") {
                    x=x+buoc;
                    this.mat = Mat.X_CONG;
                }else if (huong == "phai") {
                    x=x-buoc;
                    this.mat = Mat.X_TRU;
                }else if (huong == "thang") {
                    y=y-buoc;
                    this.mat = Mat.Y_TRU;
                }
            }


        }


        public static void main(String[] args) {
            Robot1 robot1= new Robot1(0,0,Mat.X_CONG);
            robot1.run("trai",2);
            System.out.println(robot1);
        }



}