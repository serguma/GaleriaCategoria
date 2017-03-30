package serguma.galeriacategoria.Modelos;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 * Created by sergu on 27/03/2017.
 */

public class Imagenes {

    public String[][] imagenes;

    public Imagenes() {
        imagenes = new String[][]{
                //cine
                new String[]{
                        "http://gmd.ovh/galeria/c1.jpg",
                        "http://gmd.ovh/galeria/c2.jpg",
                        "http://gmd.ovh/galeria/c3.jpg",
                        "http://gmd.ovh/galeria/c4.jpg",
                        "http://gmd.ovh/galeria/c5.jpg"
                },

                //DEporte
                new String[]{
                        "http://gmd.ovh/galeria/d1.jpg",
                        "http://gmd.ovh/galeria/d2.jpg",
                        "http://gmd.ovh/galeria/d3.jpg",
                        "http://gmd.ovh/galeria/d4.jpg",
                        "http://gmd.ovh/galeria/d5.jpg"

                },

                //hero
                new String[]{
                        "http://gmd.ovh/galeria/h1.jpg",
                        "http://gmd.ovh/galeria/h2.jpg",
                        "http://gmd.ovh/galeria/h3.jpg",
                        "http://gmd.ovh/galeria/h4.jpg",
                        "http://gmd.ovh/galeria/h5.jpg"
                },

                //Serie
                new String[]{
                        "http://gmd.ovh/galeria/s1.jpg",
                        "http://gmd.ovh/galeria/s2.jpg",
                        "http://gmd.ovh/galeria/s3.jpg",
                        "http://gmd.ovh/galeria/s4.jpg",
                        "http://gmd.ovh/galeria/s5.jpg"
                }


        };
    }

    public String[] getImagenes(int position) {
        return imagenes[position];
    }

    public void setImagenes(String[][] imagenes) {
        this.imagenes = imagenes;
    }
}
