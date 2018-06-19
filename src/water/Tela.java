package water;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class Tela extends JPanel{
    private Image icon;
    protected int x;
    protected int y;
    
    public Tela(){
        this.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent ke) {
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                atualizaPos(ke);
            }

            @Override
            public void keyReleased(KeyEvent ke) {
            }
        
        });
        icon = new ImageIcon("src/Imagens/barco.png").getImage();
        x = 0;
        y = 0;
        this.setFocusable(true);
    }
    
    public void atualizaPos(KeyEvent e){
        if (e.getKeyCode() == KeyEvent.VK_UP) y-=7;
        if (e.getKeyCode() == KeyEvent.VK_DOWN) y+=7;
        if (e.getKeyCode() == KeyEvent.VK_LEFT) x-=7;
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) x+=7;
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.drawImage(icon, x, y, this);
    }
}
