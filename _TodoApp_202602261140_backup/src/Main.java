import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        try {
            // データベース初期化
            DBManager.initializeDatabase();

            // Swing UIを起動
            SwingUtilities.invokeLater(() -> {
                new TodoFrame().setVisible(true);
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
