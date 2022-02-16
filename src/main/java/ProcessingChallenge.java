import processing.core.PApplet;

public class ProcessingChallenge extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int Y = HEIGHT / 5;
    public static final int DIAMETER = 10;
    int x=0;

    public static void main(String[] args) {
        PApplet.main("ProcessingChallenge",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw(){
        drawCircle(x,Y);
        drawCircle(2*x,2*Y);
        drawCircle(3*x,3*Y);
        drawCircle(4*x,4*Y);
        x++;
    }

    private void drawCircle(int xPosition,int yPosition){
        ellipse(xPosition, yPosition, DIAMETER,DIAMETER);
    }
}
