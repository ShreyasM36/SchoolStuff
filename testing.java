//*Asked ChatGPT to code this for me to see if it works or weather it is my coding problem //*

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class testing extends Application {

    private Stage primaryStage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        primaryStage.setTitle("Multi-Screen JavaFX App");

        // Initial screen with buttons
        Button button1 = new Button("Go to Screen 1");
        button1.setOnAction(e -> goToScreen1());

        Button button2 = new Button("Go to Screen 2");
        button2.setOnAction(e -> goToScreen2());

        StackPane initialLayout = new StackPane();
        initialLayout.getChildren().addAll(button1, button2);

        Scene initialScene = new Scene(initialLayout, 1920, 1080);
        primaryStage.setScene(initialScene);

        primaryStage.show();
    }

    private void goToScreen1() {
        Button backButton = new Button("Go Back");
        backButton.setOnAction(e -> primaryStage.setScene(primaryStage.getScene()));

        StackPane screen1Layout = new StackPane();
        screen1Layout.getChildren().add(backButton);

        Scene screen1Scene = new Scene(screen1Layout, 1920, 1080);
        primaryStage.setScene(screen1Scene);
    }

    private void goToScreen2() {
        Button backButton = new Button("Go Back");
        backButton.setOnAction(e -> primaryStage.setScene(primaryStage.getScene()));

        StackPane screen2Layout = new StackPane();
        screen2Layout.getChildren().add(backButton);

        Scene screen2Scene = new Scene(screen2Layout, 1920, 1080);
        primaryStage.setScene(screen2Scene);
    }
}

//* additional testing from chat gpt

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class QuizAnalysisApp extends Application {

    private Stage primaryStage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        primaryStage.setTitle("Quiz Analysis App");

        // Initial screen with buttons
        Button individualResultButton = new Button("Individual Result");
        individualResultButton.setOnAction(e -> goToIndividualResultPage());

        Button groupResultsButton = new Button("Group Results");
        groupResultsButton.setOnAction(e -> goToGroupResultsPage());

        StackPane initialLayout = new StackPane();
        initialLayout.getChildren().addAll(individualResultButton, groupResultsButton);

        Scene initialScene = new Scene(initialLayout, 400, 200);
        primaryStage.setScene(initialScene);

        primaryStage.show();
    }

    private void goToIndividualResultPage() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Import Individual Result CSV File");
        configureFileChooser(fileChooser);

        File selectedFile = fileChooser.showOpenDialog(primaryStage);
        if (selectedFile != null) {
            System.out.println("Selected Individual Result CSV File: " + selectedFile.getAbsolutePath());
            // Add logic for processing the individual result CSV file
        }
    }

    private void goToGroupResultsPage() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Import Group Results CSV File");
        configureFileChooser(fileChooser);

        File selectedFile = fileChooser.showOpenDialog(primaryStage);
        if (selectedFile != null) {
            System.out.println("Selected Group Results CSV File: " + selectedFile.getAbsolutePath());
            // Add logic for processing the group results CSV file
        }
    }

    private void configureFileChooser(FileChooser fileChooser) {
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("CSV Files", "*.csv"),
                new FileChooser.ExtensionFilter("All Files", "*.*")
        );
    }

    public static void main(String[] args) {
        launch(args);
    }
}

//*IF JAVAFX HAS PROBLEMS

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class QuizAnalysisAppSwing extends JFrame {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new QuizAnalysisAppSwing());
    }

    public QuizAnalysisAppSwing() {
        setTitle("Quiz Analysis App");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Initial screen with buttons
        JButton individualResultButton = new JButton("Individual Result");
        individualResultButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                goToIndividualResultPage();
            }
        });

        JButton groupResultsButton = new JButton("Group Results");
        groupResultsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                goToGroupResultsPage();
            }
        });

        JPanel initialPanel = new JPanel();
        initialPanel.setLayout(new FlowLayout());
        initialPanel.add(individualResultButton);
        initialPanel.add(groupResultsButton);

        add(initialPanel);

        setVisible(true);
    }

    private void goToIndividualResultPage() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Import Individual Result CSV File");

        int userSelection = fileChooser.showOpenDialog(this);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            System.out.println("Selected Individual Result CSV File: " + selectedFile.getAbsolutePath());
            // Add logic for processing the individual result CSV file
        }
    }

    private void goToGroupResultsPage() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Import Group Results CSV File");

        int userSelection = fileChooser.showOpenDialog(this);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            System.out.println("Selected Group Results CSV File: " + selectedFile.getAbsolutePath());
            // Add logic for processing the group results CSV file
        }
    }
}
