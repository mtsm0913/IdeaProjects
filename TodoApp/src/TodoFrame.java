import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class TodoFrame extends JFrame {

    private JTextField titleField;
    private JTextArea memoArea;
    private JCheckBox doneCheck;
    private JTextField searchField;
    private JTable table;
    private DefaultTableModel tableModel;
    private TodoDAO dao = new TodoDAO();
    private int selectedId = -1;

    public TodoFrame() {
        setTitle("Todoアプリ");
        setSize(800, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // ========== 上部パネル（入力エリア + 検索エリア）==========
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout());

        // === 入力エリア ===
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(6, 1, 5, 5));
        inputPanel.setBorder(BorderFactory.createTitledBorder("タスクの登録・編集"));

        titleField = new JTextField();
        memoArea = new JTextArea(2, 20);
        doneCheck = new JCheckBox("完了したタスク");

        JButton addBtn = new JButton("追加");
        JButton updateBtn = new JButton("更新");
        JButton deleteBtn = new JButton("削除");

        inputPanel.add(new JLabel("タスク名"));
        inputPanel.add(titleField);
        inputPanel.add(new JLabel("メモ"));
        inputPanel.add(new JScrollPane(memoArea));
        inputPanel.add(doneCheck);

        JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        btnPanel.add(addBtn);
        btnPanel.add(updateBtn);
        btnPanel.add(deleteBtn);
        inputPanel.add(btnPanel);

        topPanel.add(inputPanel, BorderLayout.NORTH);

        // === 検索エリア ===
        JPanel searchPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        searchPanel.setBorder(BorderFactory.createTitledBorder("検索"));

        searchField = new JTextField(20);
        JButton searchBtn = new JButton("検索");
        JButton allBtn = new JButton("全件表示");

        searchPanel.add(new JLabel("キーワード:"));
        searchPanel.add(searchField);
        searchPanel.add(searchBtn);
        searchPanel.add(allBtn);

        topPanel.add(searchPanel, BorderLayout.SOUTH);

        add(topPanel, BorderLayout.NORTH);

        // ========== 中央：一覧エリア（JTable）==========
        tableModel = new DefaultTableModel(
                new String[]{"ID", "タイトル", "メモ", "完了", "作成日"}, 0
        ) {
            // セルを編集不可にする
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        table = new JTable(tableModel);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        table.getColumnModel().getColumn(0).setPreferredWidth(50);   // ID
        table.getColumnModel().getColumn(1).setPreferredWidth(200);  // タイトル
        table.getColumnModel().getColumn(2).setPreferredWidth(250);  // メモ
        table.getColumnModel().getColumn(3).setPreferredWidth(50);   // 完了
        table.getColumnModel().getColumn(4).setPreferredWidth(100);  // 作成日

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBorder(BorderFactory.createTitledBorder("タスク一覧"));

        add(scrollPane, BorderLayout.CENTER);

        // ========== ボタンのイベント処理 ==========

        // 追加ボタン
        addBtn.addActionListener(e -> addTodo());

        // TODO: 更新ボタンのイベント処理を追加
        updateBtn.addActionListener(e -> updateTodo());

        // TODO: 削除ボタンのイベント処理を追加
        deleteBtn.addActionListener(e -> deleteTodo());

        // TODO: 検索ボタンのイベント処理を追加
        searchBtn.addActionListener(e -> searchTodo());

        // 全件表示ボタン
        allBtn.addActionListener(e -> loadAll());

        // 行選択で入力欄に反映
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent e) {
                fillFormFromTable();
            }
        });

        // 初期表示
        loadAll();
    }

    // 全件取得して一覧表示

    private void loadAll() {
        tableModel.setRowCount(0);
        try {
            ArrayList<Todo> list = dao.findAll();
            for (Todo t : list) {
                tableModel.addRow(new Object[]{
                        t.getId(),
                        t.getTitle(),
                        t.getMemo(),
                        t.getDone() == 1 ? "○" : "-",
                        t.getCreatedAt()
                });
            }
        } catch (Exception e) {
            showError("一覧取得エラー", e);
        }
    }

    // タスクを追加
    private void addTodo() {
        try {
            String title = titleField.getText();
            String memo = memoArea.getText();
            int done = doneCheck.isSelected() ? 1 : 0;
            String createdAt = LocalDate.now().toString();

            // TODO: 入力チェック（タイトルが空でないか）
//            if (title.equals("")) {
//                throw new Exception();
//            }
            if (title.isEmpty()) {
                JOptionPane.showMessageDialog(this, "タスク名を入力してください");
                return;
            }

            // TODO: dao.insert() を呼び出してタスクを登録
            dao.insert(title, memo, done, createdAt);   // INSERT文実行

            // TODO: 一覧を再表示
            loadAll();

            // TODO: 入力欄をクリア
            clearForm();

            JOptionPane.showMessageDialog(this, "タスクを追加しました");

        } catch (Exception e) {
            showError("追加エラー", e);
        }
    }

    // タスクを更新
    private void updateTodo() {
        if (selectedId == -1) {
            JOptionPane.showMessageDialog(this, "更新するタスクを選択してください");
            return;
        }

        try {
            String title = titleField.getText();
            String memo = memoArea.getText();
            int done = doneCheck.isSelected() ? 1 : 0;

            // TODO: dao.update() を呼び出してタスクを更新
            dao.update(selectedId, title, memo, done);

            // TODO: 一覧を再表示
            loadAll();

            // TODO: 入力欄をクリア
            clearForm();

            JOptionPane.showMessageDialog(this, "タスクを更新しました");

        } catch (Exception e) {
            showError("更新エラー", e);
        }
    }

    // タスクを削除
    private void deleteTodo() {
        if (selectedId == -1) {
            JOptionPane.showMessageDialog(this, "削除するタスクを選択してください");
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(
                this,
                "本当に削除しますか？",
                "確認",
                JOptionPane.YES_NO_OPTION
        );

        if (confirm == JOptionPane.YES_OPTION) {
            try {
                // TODO: dao.delete() を呼び出してタスクを削除
                dao.delete(selectedId);

                // TODO: 一覧を再表示
                loadAll();

                // TODO: 入力欄をクリア
                clearForm();

                JOptionPane.showMessageDialog(this, "タスクを削除しました");

            } catch (Exception e) {
                showError("削除エラー", e);
            }
        }
    }

    // キーワード検索
    private void searchTodo() {
        tableModel.setRowCount(0);
        try {
            String keyword = searchField.getText();

            // TODO: dao.search() を呼び出して検索
            ArrayList<Todo> list = dao.search(keyword);

            // TODO: 検索結果を一覧に表示
            // ヒント: loadAll() と同じようにforループでtableModelに追加
            // ヒント：tableModel.addRow(new Object[]{ ... });

            for (Todo t : list) {
                tableModel.addRow(new Object[] {
                        t.getId(),
                        t.getTitle(),
                        t.getMemo(),
                        t.getDone() == 1 ? "○" : "-",
                        t.getCreatedAt()
                });
            }

        } catch (Exception e) {
            showError("検索エラー", e);
        }
    }

    // テーブルで選択した行のデータを入力欄に反映
    private void fillFormFromTable() {
        int row = table.getSelectedRow();
        if (row == -1) return;

        selectedId = (int) tableModel.getValueAt(row, 0);
        titleField.setText((String) tableModel.getValueAt(row, 1));
        memoArea.setText((String) tableModel.getValueAt(row, 2));
        String doneValue = (String) tableModel.getValueAt(row, 3);
        doneCheck.setSelected(doneValue.equals("○"));
    }

    // 入力欄をクリア
    private void clearForm() {
        selectedId = -1;
        titleField.setText("");
        memoArea.setText("");
        doneCheck.setSelected(false);
    }

    // エラーダイアログを表示
    private void showError(String title, Exception e) {
        JOptionPane.showMessageDialog(
                this,
                e.getMessage(),
                title,
                JOptionPane.ERROR_MESSAGE
        );
        e.printStackTrace();
    }
}
