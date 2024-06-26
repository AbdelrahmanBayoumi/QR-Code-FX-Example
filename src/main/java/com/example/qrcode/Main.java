package com.example.qrcode;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import javafx.application.Application;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.awt.image.BufferedImage;
import java.io.IOException;

public class Main extends Application {

    private static final int QR_CODE_SIZE = 300;
    private static final String CONTENT_TO_ENCODE = "JavaFX QR Code Generator";

    private final StackPane parent = new StackPane();

    @Override
    public void init() throws Exception {
        super.init();
        this.buildUI();
    }

    private void buildUI() {
        QRGenerator qrGenerator;
        try {
            qrGenerator = new QRGenerator(
                    CONTENT_TO_ENCODE,
                    BarcodeFormat.QR_CODE,
                    QR_CODE_SIZE, QR_CODE_SIZE,
                    BufferedImage.TYPE_INT_ARGB
            );

        } catch (WriterException e) {
            e.printStackTrace();
            return;
        }

        BufferedImage qrImage = qrGenerator.qrImage();

        // Save QR code as an image file (optional)
        try {
            qrGenerator.save("qrcode.png", "PNG");
        } catch (IOException e) {
            e.printStackTrace();
        }

        Image image = SwingFXUtils.toFXImage(qrImage, null);

        // Display QR code in JavaFX window
        ImageView imageView = new ImageView(image);
        parent.getChildren().add(imageView);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(this.parent, 640.0, 480.0);
        // Sets the stage title
        stage.setTitle("JavaFX QR Code Generator");
        // Sets the stage scene
        stage.setScene(scene);
        // Centers stage on screen
        stage.centerOnScreen();
        // Show stage on screen
        stage.show();
    }

}
