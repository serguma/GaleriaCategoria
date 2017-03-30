package serguma.galeriacategoria.Actividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import serguma.galeriacategoria.Async.AsyncDescargaImagenes;
import serguma.galeriacategoria.Modelos.Imagenes;
import serguma.galeriacategoria.R;

public class Galeria extends AppCompatActivity {

    private Imagenes imagenes = new Imagenes();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeria);

        //recojo el id de la categoría para realizar la llamada a las imágenes
        Intent intent = getIntent();
        int categoria = intent.getIntExtra("categoria", 0);

        AsyncDescargaImagenes asyncDescargaImagenes = new AsyncDescargaImagenes(this);
        asyncDescargaImagenes.execute(imagenes.getImagenes(categoria));

    }
}
