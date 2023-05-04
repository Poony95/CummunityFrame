package cummunity;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CardViewExample extends JFrame {
    private JPanel mainPanel;

    public CardViewExample() {
        setTitle("Card View Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 800);

        // 메인 패널을 생성합니다.
        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        add(mainPanel);

        // 카드뷰를 생성하고 메인 패널에 추가합니다.
        mainPanel.add(createCard("배트민턴 함께해요", "운동", "2023-04-28", "좋아요"));
        mainPanel.add(createCard("Title 2", "Author 2", "2023-04-27", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam varius sapien vel purus euismod elementum."));
        mainPanel.add(createCard("Title 3", "Author 3", "2023-04-26", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam varius sapien vel purus euismod elementum."));

        setVisible(true);
    }

    // 카드뷰를 생성하는 메소드입니다.
    private JPanel createCard(String title, String author, String date, String text) {
        // 카드뷰를 담을 패널을 생성합니다.
        JPanel cardPanel = new JPanel();
        cardPanel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1)); // 경계선 그리기
      
        cardPanel.setLayout(new BorderLayout());
        cardPanel.setPreferredSize(new Dimension(500, 150));
        cardPanel.setMaximumSize(new Dimension(500, 150));

        // 제목, 작성자, 작성일을 담을 패널을 생성하고 카드패널에 추가합니다.
        JPanel headerPanel = new JPanel();
        headerPanel.setLayout(new GridLayout(3, 1));
        cardPanel.add(headerPanel, BorderLayout.NORTH);

        Font font = new Font("맑은 고딕", Font.BOLD, 20);
        JLabel titleLabel = new JLabel(title);
        titleLabel.setFont(font);
        headerPanel.add(titleLabel);
        

        JLabel authorLabel = new JLabel(author);
        headerPanel.add(authorLabel);

        JLabel dateLabel = new JLabel(date);
        headerPanel.add(dateLabel);

        // 내용을 담을 패널을 생성하고 카드패널에 추가합니다.
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BorderLayout());
        cardPanel.add(contentPanel, BorderLayout.CENTER);

        JLabel textLabel = new JLabel(text);
        contentPanel.add(textLabel, BorderLayout.CENTER);

        return cardPanel;
    }

    public static void main(String[] args) {
        new CardViewExample();
    }
}
