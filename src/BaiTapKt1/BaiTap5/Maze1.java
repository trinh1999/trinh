package BaiTapKt1.BaiTap5;

import javax.swing.*;
import java.awt.*;

public class Maze1 {
    public static void main(String[] args) {
        //
        JFrame frame = new JFrame();
        frame.setSize(650, 470);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Maze.MazePanel mp = new Maze.MazePanel();
        frame.add(mp);
        frame.setVisible(true);
    }

    public static class MazePanel extends JPanel {
        private static final long serialVersionUID = -566807999447681130L;
        private int[][] maze = { // kh?i t?o ma tr?n m?ng 2 chi?u
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
                { 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1 },
                { 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1 },
                { 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1 },
                { 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1 },
                { 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1 },
                { 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1 },
                { 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1 },
                { 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1 },
                { 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 2, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1 },
                { 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1 },
                { 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1 },
                { 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1 },
                { 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1 },
                { 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1 },
                { 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1 },
                { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
                { 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1 },
                { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 } };
        private int sizeh, sizew, start, end;

        public MazePanel() {
            // K�ch th??c ma tr?n
            sizeh = 21;
            sizew = 31;
            start = 10;
            end = 0;
            solve(maze,10,0);
            repaint(); // v? ma tr?n v� l?i gi?i
        }

        /**
         * Implement m?t ph??ng ph�p t�m ???ng n�o ?�.
         * <p>
         * Y�u c?u : V? ???ng ?i t? ?i?m b?t ??u ??n ?i?m k?t th�c. Kh�ng hi?n
         * c�c ph?n th?a - l� c�c ph?n ???ng c?t ho?c ???ng ?i b? sai. Ch? v?
         * tuy?n ???ng ch�nh ?i t? ?i?m ??u (m�u v�ng) ??n m�u ??.
         * <p>
         * ???ng ?i t? ?i?m ??u ??n ?i?m cu?i ???c t� m�u xanh d??ng, ?? t� m�u
         * xanh d??ng h�y set gi� tr? c?a ?i?m tr�n ma tr?n sang m?t s? > 2
         */
        boolean ketQua;
        public void solve(int [][] maze, int x, int y) {
            // H�m n�y ch?a ph??ng ph�p t�m ???ng t? ?i?m start ??n v?
            // tr� m�u ?? tr�n ma tr?n
            maze[x][y] = 0; // duong di mau trang
            if(ketQua == false && x-1 >=0 && (maze[x-1][y] == 0 || maze[x-1][y] == 3))
                solve(maze,x-1,y); // sang phai
            if(ketQua == false && x+1 <sizew && (maze[x+1][y] == 0 || maze[x+1][y] == 3))
                solve(maze,x+1,y);// sang trai
            if(ketQua == false && y-1 >=0 && (maze[x][y-1] == 0 || maze[x][y-1] == 3))
                solve(maze,x,y-1);// xuong duoi
            if(ketQua == false && y+1 <sizeh && (maze[x][y+1] == 0 || maze[x][y+1] == 3))
                solve(maze,x,y+1);// len tren

            if (maze[x][y]==2){ // gap duoc mau do la den dich
                ketQua= true;return ;
            }

        }

        public void paintComponent(Graphics g) // v? ma tr?n + l?i gi?i
        {
            super.paintComponent(g);
            for (int j = 0; j < sizew; j++)
                for (int i = 0; i < sizeh; i++) {
                    if (i == start && j == end)
                        g.setColor(Color.yellow);
                    else if (maze[i][j] == 0)
                        g.setColor(Color.white);
                    else if (maze[i][j] == 1)
                        g.setColor(Color.black);
                    else if (maze[i][j] == 2)
                        g.setColor(Color.red);
                    else
                        g.setColor(Color.blue); // blue l� m�u c?a l?i gi?i
                    g.fillRect(j * 20, i * 20, 20, 20);
                }
        }
    }
}
