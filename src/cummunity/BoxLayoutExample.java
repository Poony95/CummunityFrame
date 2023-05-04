package cummunity;

import javax.swing.*;

public class BoxLayoutExample {
    public static void main(String[] args) {
        // 프레임 생성
        JFrame frame = new JFrame("BoxLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // 수직 방향으로 일렬로 배치되는 JPanel 생성
        JPanel panel = new JPanel();
        BoxLayout boxLayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        panel.setLayout(boxLayout);
        
        // 버튼 3개 생성
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        
        // 버튼을 패널에 추가
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        
        // 프레임에 패널 추가
        frame.getContentPane().add(panel);
        
        // 프레임 크기 지정 및 보이기
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}