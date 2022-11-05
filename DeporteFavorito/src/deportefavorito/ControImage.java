/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deportefavorito;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;

public class ControImage {
     ArrayList<String> lista;

    public ControImage() {
        DireccionImaganes();
    }
     
     
    private void DireccionImaganes(){
        lista = new ArrayList();
        lista.add("/img/futbol.jpeg");
         lista.add("/img/images.jpeg");
          lista.add("/img/tenis.jpeg");
           lista.add("/img/croos.jpeg");
    }
    
    //manda las imagenes a nuestro label y recibe un evento
    public Icon MandarImagen(ActionEvent e){
         JRadioButton b1 = (JRadioButton )e.getSource();
    
    ImageIcon imgIcon = new ImageIcon(getClass().getResource(MandarEventoCorrespondiente(b1.getText())));
         Image imgEscalada = imgIcon.getImage().getScaledInstance(290,
                310, Image.SCALE_SMOOTH);
         Icon iconoEscalado = new ImageIcon(imgEscalada);
        return iconoEscalado;
    }
    
    private String MandarEventoCorrespondiente(String b1){
        String direccion = "";
        if("Futbol".equals(b1))
             direccion = lista.get(0);
        if("Basquetball".equals(b1))
             direccion = lista.get(1);
        if("Tenis".equals(b1))
             direccion = lista.get(2);
        if("Croos".equals(b1))
             direccion = lista.get(3);
         return direccion;
    }
}
