/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaocr;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Bojo
 */
public class JavaOCR {
    static BufferedImage getImg(){
        try{
             File input = new File("resources/Eng/Img/Sample001/img001-001.png");
        
            BufferedImage image = ImageIO.read(input);

            BufferedImage result = new BufferedImage(
                image.getWidth(),
            image.getHeight(),
            BufferedImage.TYPE_INT_RGB);
            
            Graphics2D graphic = result.createGraphics();
            graphic.drawImage(result, 0, 0, Color.WHITE, null);
            
            return result;
        }catch(IOException e){
            return null;
        }
    } 
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        BufferedImage img = getImg();
    
        
    }
    
}
