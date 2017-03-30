package serguma.galeriacategoria.Modelos;

import java.util.ArrayList;

import serguma.galeriacategoria.R;

/**
 * Created by sergu on 27/03/2017.
 */

public class Categorias {

    private ArrayList<Integer> categoria;

    public Categorias(){
        categoria = new ArrayList<Integer>();
        categoria.add(R.drawable.cine);
        categoria.add(R.drawable.deporte);
        categoria.add(R.drawable.hero);
        categoria.add(R.drawable.tv);
    }

    public int tamCategoria() {
        return categoria.size();
    }

    public int getCategoria(int position){
        return categoria.get(position);
    }

}
