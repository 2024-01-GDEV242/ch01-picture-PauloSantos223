/**
 * This class draws a house with a person next to a tree.
 * It makes use of different classes to make the objects drawn on the picture.
 * 
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author Paulo Santos
 * @version 2024.01.22
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Square trunk;
    private Triangle leaf1;
    private Triangle leaf2;
    private Triangle leaf3;
    private Triangle roof;
    private Circle sun;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        wall = new Square();
        window = new Square();
        roof = new Triangle();  
        sun = new Circle();
        trunk = new Square();
        leaf1 = new Triangle();
        leaf2 = new Triangle();
        leaf3 = new Triangle();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            wall.moveHorizontal(-140);
            wall.moveVertical(20);
            wall.changeSize(120);
            wall.makeVisible();
            
            trunk.moveHorizontal(60);
            trunk.moveVertical(120);
            trunk.changeSize(20);
            trunk.makeVisible();
            trunk.changeColor("brown");
            
            window.changeColor("black");
            window.moveHorizontal(-120);
            window.moveVertical(40);
            window.changeSize(40);
            window.makeVisible();
            
            leaf1.changeColor("green");
            leaf1.moveHorizontal(60);
            leaf1.moveVertical(110);
            leaf1.changeSize(40, 180);
            leaf1.makeVisible();
            
            leaf2.changeColor("green");
            leaf2.moveHorizontal(60);
            leaf2.moveVertical(90);
            leaf2.changeSize(40, 180);
            leaf2.makeVisible();
            
            leaf3.changeColor("green");
            leaf3.moveHorizontal(60);
            leaf3.moveVertical(70);
            leaf3.changeSize(40, 180);
            leaf3.makeVisible();
            
            roof.changeSize(60, 180);
            roof.moveHorizontal(20);
            roof.moveVertical(-60);
            roof.makeVisible();
    
            sun.changeColor("yellow");
            sun.moveHorizontal(230);
            sun.moveVertical(-120);
            sun.changeSize(80);
            sun.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        wall.changeColor("black");
        window.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("black");
        trunk.changeColor("black");
        leaf1.changeColor("black");
        leaf2.changeColor("black");
        leaf3.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        wall.changeColor("red");
        window.changeColor("black");
        roof.changeColor("green");
        sun.changeColor("yellow");
        trunk.changeColor("brown");
        leaf1.changeColor("green");
        leaf2.changeColor("green");
        leaf3.changeColor("green");
    }
}
