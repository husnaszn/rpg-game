import javax.swing.ImageIcon;
import java.util.ArrayList;

public class Tob extends Playabl{
    public Tob(){
        super();
        
    }

    public Tob(int x, int y){
        super("TOB", x,y, 0,0,190,270,130,100, 100, 80,70, new ImageIcon("rpg game\\res\\characters\\tob\\tobidle.gif"),new ImageIcon("rpg game\\res\\characters\\tob\\tobidle.gif"),new ImageIcon("rpg game\\res\\characters\\tob\\tobidle.gif"),new ImageIcon("rpg game\\res\\characters\\tob\\tobwalkl.gif"),new ImageIcon("rpg game\\res\\characters\\tob\\tobwalkr.gif"),new ImageIcon("rpg game\\res\\characters\\tob\\tobwalkd.gif"),new ImageIcon("rpg game\\res\\characters\\tob\\tobwalku.gif"),new Tuna(x,y));
        super.getTools().setX(super.getX()+super.getW());
        super.setTools(setList());
        super.setUdesc("A young adventurer. He's friendly. Maybe too friendly.");
    }

    public String toString(){
        return "Tob"+super.getHealth();

    }

    public ArrayList <Tools> setList(){
        ArrayList <Tools> temp = new ArrayList<Tools>();
        temp.add(new Tuna());
        temp.add(new Tuna());
        temp.add(new Tuna());
        return temp;
    }
}

//tobidle 3
//tob eat tuna 2 sec
//tobwalk 4fps