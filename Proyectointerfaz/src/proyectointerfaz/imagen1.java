
package proyectointerfaz;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class imagen1  extends javax.swing.JPanel {
    int x, y;
    
    public imagen1(JPanel jPanel1) {
        this.x = jPanel1.getWidth();
        this.y = jPanel1.getHeight();
        this.setSize(x, y);
    }

    @Override
    public void paint(Graphics g) {
     
        ImageIcon Img = new ImageIcon(getClass().getResource("/imagenes/tres.png"));
        g.drawImage(Img.getImage(), 0, 0, x, y, null);
        
       
    }    

}
