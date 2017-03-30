package serguma.galeriacategoria.Actividades;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import serguma.galeriacategoria.Adapter.AdapterCategoria;
import serguma.galeriacategoria.Animaciones.DepthPageTransformer;
import serguma.galeriacategoria.Modelos.Categorias;
import serguma.galeriacategoria.R;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private AdapterCategoria adapterCategoria;
    private Categorias categorias = new Categorias();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.elViewPager);
        adapterCategoria = new AdapterCategoria(getSupportFragmentManager(), categorias);

        viewPager.setAdapter(adapterCategoria);
        viewPager.setPageTransformer(true, new DepthPageTransformer()); //asigno animación


    }
}
