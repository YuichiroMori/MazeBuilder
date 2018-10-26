package mazebuilder;
import java.awt.Color;
import static java.awt.Color.*;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;
import java.util.*;
import javax.swing.JPanel;


public class Cell extends JPanel{
    
    boolean isVisited;
    int row;
    int column;
           
    //Object that stores whether it has been visited
    public Cell(int r,int c){
        
        isVisited=false;
        row=r;
        column=c;

    }
    
    public void setVisited(){
        
        isVisited=true;
    
    }
    
    public boolean isVisited(){
        
        return isVisited;
    }
    
    public int getRow(){
        
        return row;
    }
    
    public int getColumn(){
        
        return column;
    }
    
}
