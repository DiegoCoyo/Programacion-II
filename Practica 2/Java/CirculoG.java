import javax.swing.*;
import java.awt.*;

// Clase Punto
class Punto {
    int x, y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Circulo extends JPanel {
    Punto centro;
    int radio;

    public Circulo(Punto centro, int radio) {
        this.centro = centro;
        this.radio = radio;
        setPreferredSize(new Dimension(400, 400)); 
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.drawOval(centro.x*10, centro.y*10, 2 * radio * 10, 2 * radio * 10);
    }

    
    public void mostrar() {
        JFrame frame = new JFrame("Grafico Circulo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        frame.pack();
        frame.setVisible(true);
		frame.setLocationRelativeTo(null);
    }
}

public class CirculoG {
    public static void main(String[] args) {
        Punto centro = new Punto(5, 5);
        int radio = 15;
        Circulo circulo = new Circulo(centro, radio);
        circulo.mostrar(); 
    }
}