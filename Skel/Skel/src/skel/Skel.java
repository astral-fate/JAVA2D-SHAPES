/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skel;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.geom.*;
import java.util.Random;

/**
 *
 * @author eid.emary
 */
public class Skel extends JApplet{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame=new JFrame();
        frame.setTitle("hello");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JApplet applete =new Skel();
        applete.init();
        frame.getContentPane().add(applete);
        frame.pack();
        frame.setVisible(true);
    }
    public void init(){
        JPanel panel=new JApp1Panel();
        getContentPane().add(panel);
    }
    
}
class JApp1Panel extends JPanel{
public JApp1Panel(){
    setPreferredSize(new Dimension(640,480));
}
public void paintComponent(Graphics g){
super.paintComponent(g);

//Casting graphics to graphics2D
Graphics2D g2=(Graphics2D) g;


    //face
    //g.drawOval(200, 50, 250, 200);
    g2.setPaint(Color.orange);
    g.fillOval(200, 50, 250, 200);



    //left eye
    g2.setPaint(Color.white);
    g.fillOval(250, 75, 60, 60);

    //right eye
    g2.setPaint(Color.white);
    g.fillOval(350, 75, 60, 60);

    //left nene

    g2.setPaint(Color.black);
    g.fillOval(265, 90, 30, 30);


    //right nene
    g2.setPaint(Color.black);
    g.fillOval(365, 90, 30, 30);


    //left light

    g2.setPaint(Color.white);
    g.fillOval(270, 95, 8, 8);


    //right light
    g2.setPaint(Color.white);
    g.fillOval(380, 95, 8, 8);





}

}// end of JApp1Panel class


/*


Line2D line = new Line2D.Double(100, 200,300,400);
//Cirycle
//g.drawLine(0,0, 100, 200);
//g2.draw(line);


//Arc2D arc = new Arc2D.Float(250f, 120f, 300f, 150f, 0f, 500f, Arc2D.PIE);
    //g2.draw(arc);
    //Shape ellipse = new Ellipse2D.Double(150, 100, 200, 200);
//640,480

    QuadCurve2D quad = new QuadCurve2D.Double(270, 150,  250, 200, 250, 200);
   g2.draw(quad);
    QuadCurve2D quad2 = new QuadCurve2D.Double(470, 150,  250, 200, 250, 200);
    g2.draw(quad2);


 */