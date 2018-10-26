package mazebuilder;
import java.awt.Graphics;
import java.util.*;
import javax.swing.JPanel;

public class Maze extends JPanel{
    
    public Cell[][]cell;
    private int column=8;
    private int row=8;
    private Stack stack;
    Graphics window;
    
    public Maze(){
        
        cell=new Cell[row][column];
        stack=new Stack<>();
        
        for(int r=0;r<row;r++){
            for(int c=0;c<column;c++){
                
                cell[r][c]=new Cell(r,c);
            }
        }
    }
    
    public void update(Graphics window) {
        paint(window);
    }
     
    public void paint(Graphics window){
         
        int multiplyBy=700/cell.length;
        
        for(int r=0;r<cell.length;r++){
            for(int c=0;c<cell[r].length;c++){
                window.drawLine(cell[r][c].getColumn()*multiplyBy,cell[r][c].getRow()*multiplyBy,cell[r][c].getColumn()*multiplyBy+multiplyBy ,cell[r][c].getRow()*multiplyBy);
                
            }
        }
     }
}
