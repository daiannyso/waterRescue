/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package water;
 
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Barco {
    private int x, y;
    private Image icon;

    public Image getIcon() {
        return icon;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public Barco() {
        icon = new ImageIcon("src/Imagens/barco.png").getImage();
        x = 200;
        y = 200;
    }

    void atualizaPos(KeyEvent ke) {
        if (ke.getKeyCode() == KeyEvent.VK_UP) y-=7;
        if (ke.getKeyCode() == KeyEvent.VK_DOWN) y+=7;
        if (ke.getKeyCode() == KeyEvent.VK_LEFT) x-=7;
        if (ke.getKeyCode() == KeyEvent.VK_RIGHT) x+=7;
    }
    
}
