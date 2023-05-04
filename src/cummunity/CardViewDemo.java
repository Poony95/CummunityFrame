package cummunity;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CardViewDemo extends JFrame {

    private static final long serialVersionUID = 1L;

    public CardViewDemo() {
        setTitle("CardView Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel cardViewPanel = new JPanel(new BorderLayout());
        cardViewPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5)); // 경계선 그리기

        JPanel postPanel = new JPanel();
        postPanel.setPreferredSize(new Dimension(200, 100));
        postPanel.setOpaque(false);

        cardViewPanel.add(postPanel, BorderLayout.CENTER);
        add(cardViewPanel);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new CardViewDemo();
    }
}