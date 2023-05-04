package cummunity;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class GridExample extends JFrame {
    public GridExample() {
        // 테이블에 표시할 데이터 배열
        Object[][] data = {
            {"John", "Doe", 28},
            {"Jane", "Doe", 32},
            {"Bob", "Smith", 45},
            {"Mary", "Johnson", 21}
        };
        
        // 테이블에 표시할 컬럼 이름 배열
        String[] columnNames = {"First Name", "Last Name", "Age"};
        
        // JTable 생성
        JTable table = new JTable(data, columnNames);
        
        // 스크롤 가능한 패널에 JTable 추가
        JScrollPane scrollPane = new JScrollPane(table);
        
        // 패널에 스크롤 가능한 패널 추가
        JPanel panel = new JPanel();
        panel.add(scrollPane);
        
        // JFrame에 패널 추가
        this.add(panel);
        
        // JFrame 기본 설정
        this.setTitle("Grid Example");
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        new GridExample();
    }
}