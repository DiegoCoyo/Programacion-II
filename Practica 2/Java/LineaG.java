import javax.swing.*;
import java.awt.*;

class Punto {
    int x, y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Linea extends JPanel {
    Punto p1, p2;

    public Linea(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
        setPreferredSize(new Dimension(400, 400)); 
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.drawLine(p1.x*10, p1.y*10, p2.x*10, p2.y*10);
    }

    // Mostrar ventana
    public void mostrar() {
        JFrame frame = new JFrame("Grafico Linea");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this); 
        frame.pack(); 
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        
    }
}

public class LineaG {
    public static void main(String[] args) {
        Punto p1 = new Punto(17, 19);
        Punto p2 = new Punto(1, 4);
        Linea linea = new Linea(p1, p2);
        linea.mostrar(); 
    }
}