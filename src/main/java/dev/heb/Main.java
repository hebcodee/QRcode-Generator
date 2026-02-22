package dev.heb;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {

        String texto = "https://www.google.com";

        // Gera a imagem do QR Code
        BufferedImage img = QrcodeGenerator.generateQrcode(texto);

        // Salva no arquivo
        ImageIO.write(img, "png", new File("qrcode.png"));

        System.out.println("QR Code gerado com sucesso!");
    }
}