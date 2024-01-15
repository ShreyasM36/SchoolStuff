import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class csia {
    private JTextArea importCSVFileHereTextArea;
    private JPanel ImportCsvFile;
    private JButton induvidualFeedbackButton;
    private JButton groupFeedbackButton;
    private JButton uploadCSVHereButton;

    public csia() {
        induvidualFeedbackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //*ItemController.load();

            }
        });
        groupFeedbackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        uploadCSVHereButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int result = fileChooser.showOpenDialog(null);

                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    // Process the selected CSV file
                    ItemController(load);
                }
            }
        });
    }
}
