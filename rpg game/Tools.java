import javax.swing.ImageIcon;

public class Tools {
    // 
    int dam, durability, dps, x;
    ImageIcon pic;
    public Tools(){

    }
    public Tools(int d, int dur, int dp){
        dam=d;
        durability= dur;
        dps=dp;
    }
    public Tools(int x2, int y, int dam2, int dur, int dp, ImageIcon pic) {
        //TODO Auto-generated constructor stub
    }
    public int getDam() {
        return dam;
    }
    public void setDam(int dam) {
        this.dam = dam;
    }
    public int getX() {
        return x;
    }
    public int getDurability() {
        return durability;
    }
    public void setDurability(int durability) {
        this.durability = durability;
    }
    public int getDps() {
        return dps;
    }
    public void setDps(int dps) {
        this.dps = dps;
    }
    public void setX(int i) {
        // TODO Auto-generated method stub
        x=i;
    }
    public ImageIcon getPic() {
        // TODO Auto-generated method stub
        return pic;
    }
}