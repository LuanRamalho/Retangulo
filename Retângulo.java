import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Retângulo extends JPanel {
        
    public Retângulo() 
    {        
        super.setPreferredSize( new Dimension( 400, 400 ) ); 
        super.setBackground( Color.LIGHT_GRAY );
    }
    
    public void paintComponent( Graphics g ) 
    {
        super.paintComponent(g); 
        g.setColor(Color.RED);
        g.fillRect(100, 100, 150, 400);  
        g.setColor(Color.GREEN);
        g.fillRect(300, 100, 150, 400);
    }
           
    public static void main(String[] args) 
    {
        Retângulo painel = new Retângulo();
        
        JFrame f = new JFrame();
        f.setContentPane( painel ); 
        f.setTitle( "Retângulo" ); 
        f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        f.setSize( 600, 600 ); 
        f.setLocationRelativeTo( f );                
        f.setVisible( true );
    }
    
}