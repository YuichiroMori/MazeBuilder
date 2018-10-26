package mazebuilder;

import java.awt.Component;
import java.awt.Graphics;
import javax.swing.JFrame;

public class MazeBuilder extends JFrame{
    
    public static final int WIDTH=700;
    public static final int HEIGHT=700;

    public static void main(String[] args) {
        
        new MazeBuilder();
        
    }
    
    public MazeBuilder(){
        
        super("Maze");
        
        setSize(WIDTH,HEIGHT);
        
        Maze maze=new Maze();
        
        ((Component) maze).setFocusable(true);
        
        getContentPane().add(maze);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
}
