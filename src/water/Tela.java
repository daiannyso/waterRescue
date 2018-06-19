package water;


import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class Tela extends JPanel{
    private Image icon;
    protected int x;
    protected int y;
    
    public Tela(){
        
        icon = new ImageIcon("src/Imagens/barco.png").getImage();
        x = 0;
        y = 0;
    }
    
    public void atualizaPos(KeyEvent e){
        if (e.getKeyCode() == KeyEvent.VK_UP) y-=5;
        if (e.getKeyCode() == KeyEvent.VK_DOWN) y+=5;
        if (e.getKeyCode() == KeyEvent.VK_LEFT) x-=5;
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) x+=5;
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.drawImage(icon, x, y, this);
        g.drawString(String.valueOf(x), 100, 100);
    }

}
