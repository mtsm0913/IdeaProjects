import javax.swing.*;
import java.awt.*;

public class SimpleFrame extends JFrame {

    public SimpleFrame() {
        // ウィンドウのタイトル
        setTitle("簡単なSwingアプリ");

        // ウィンドウサイズ
        setSize(400, 200);

        // 閉じるボタンの動作
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ウィンドウを中央に配置
        setLocationRelativeTo(null);

        // レイアウトを設定
        setLayout(new FlowLayout());

        // ボタンを追加
        JButton button = new JButton("クリックしてください");

        // ボタンクリック時の処理
        button.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "ボタンがクリックされました！");
        });

        add(button);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SimpleFrame().setVisible(true);
        });
    }
}
