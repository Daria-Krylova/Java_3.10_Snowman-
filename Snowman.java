import java.awt.*;
import javax.swing.*;

public class Snowman extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Нарисовать тело снеговика
        g2d.setColor(Color.WHITE);
        g2d.fillOval(100, 100, 100, 100);
        g2d.fillOval(80, 200, 140, 140);
        g2d.fillOval(60, 350, 180, 180);

        // Нарисовать глаза
        g2d.setColor(Color.BLACK);
        g2d.fillOval(135, 135, 10, 10);
        g2d.fillOval(155, 135, 10, 10);

        // Нарисовать морковку как нос
        g2d.setColor(new Color(255, 102, 0)); // Оранжевый цвет
        int[] xPoints = {150, 155, 180}; // Точки для более большого и наклонного носа
        int[] yPoints = {165, 150, 165}; // Точки для более большого и наклонного носа
        g2d.fillPolygon(xPoints, yPoints, 3);

        // Нарисовать улыбку чуть выше
        g2d.setColor(Color.BLACK);
        g2d.drawArc(140, 175, 20, 10, -10, -160); // Дуга для улыбки

        // Нарисовать ручки
        g2d.setColor(new Color(139, 69, 19)); // Коричневый цвет для ручек
        g2d.setStroke(new BasicStroke(5)); // Увеличиваем толщину линии
        g2d.drawLine(75, 230, 55, 260); // Левая ручка
        g2d.drawLine(225, 230, 245, 260); // Правая ручка

        // Нарисовать ножки
        g2d.drawLine(110, 500, 90, 530); // Левая ножка
        g2d.drawLine(190, 500, 210, 530); // Правая ножка
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Снеговик");
        Snowman snowman = new Snowman();
        frame.add(snowman);
        frame.setSize(320, 750); // Увеличил высоту для отображения ножек
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

