package graph;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

/**
 *
 * @author EricaJGS
 */
public class DrawArea extends javax.swing.JPanel {

    public DrawArea() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void paint(Graphics g) {
        Font f = new Font("Times New Roman", Font.BOLD, 24);
        g.setFont(f);
        g.drawString("Hola Mundo", 40, 40);
        
        g.setColor(Color.red);
        g.fillOval(30, 70, 100, 100);
        
        g.setColor(Color.blue);
        g.fillRect(150, 70, 100, 100);
        
        g.setColor(Color.red);
        g.fillRect(45, 190, 200, 1);
        
        g.setColor(Color.green);
        g.fillRect(45, 195, 200, 2);
        
        g.setColor(Color.blue);
        g.fillRect(45, 200, 200, 3);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
