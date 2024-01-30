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
    private Square ground;
    private Square ground2;
    private Square ground3;
    private Square ground4;
    private Square ground5;
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
        ground = new Square();
        ground2 = new Square();
        ground3 = new Square();
        ground4 = new Square();
        ground5 = new Square();
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
            
            ground.moveHorizontal(-150);
            ground.moveVertical(140);
            ground.changeSize(150);
            ground.makeVisible();
            ground.changeColor("darkgreen");
            
            ground2.moveHorizontal(0);
            ground2.moveVertical(140);
            ground2.changeSize(150);
            ground2.makeVisible();
            ground2.changeColor("darkgreen");
            
            ground3.moveHorizontal(60);
            ground3.moveVertical(140);
            ground3.changeSize(150);
            ground3.makeVisible();
            ground3.changeColor("darkgreen");
            
            ground4.moveHorizontal(-300);
            ground4.moveVertical(140);
            ground4.changeSize(150);
            ground4.makeVisible();
            ground4.changeColor("darkgreen");
            
            ground5.moveHorizontal(-340);
            ground5.moveVertical(140);
            ground5.changeSize(150);
            ground5.makeVisible();
            ground5.changeColor("darkgreen");
            
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
            leaf1.moveHorizontal(170);
            leaf1.moveVertical(70);
            leaf1.changeSize(40, 100);
            leaf1.makeVisible();
            
            leaf2.changeColor("green");
            leaf2.moveHorizontal(170);
            leaf2.moveVertical(50);
            leaf2.changeSize(40, 100);
            leaf2.makeVisible();
            
            leaf3.changeColor("green");
            leaf3.moveHorizontal(170);
            leaf3.moveVertical(30);
            leaf3.changeSize(40, 100);
            leaf3.makeVisible();
            
            roof.changeSize(60, 180);
            roof.moveHorizontal(20);
            roof.moveVertical(-60);
            roof.makeVisible();
            roof.changeColor("brown");
    
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
        ground.changeColor("black");
        ground2.changeColor("black");
        ground3.changeColor("black");
        ground4.changeColor("black");
        ground5.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        wall.changeColor("red");
        window.changeColor("black");
        roof.changeColor("brown");
        sun.changeColor("yellow");
        trunk.changeColor("brown");
        leaf1.changeColor("green");
        leaf2.changeColor("green");
        leaf3.changeColor("green");
        ground.changeColor("darkgreen");
        ground2.changeColor("darkgreen");
        ground3.changeColor("darkgreen");
        ground4.changeColor("darkgreen");
        ground5.changeColor("darkgreen");
    }
}
