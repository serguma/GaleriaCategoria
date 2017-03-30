package serguma.galeriacategoria.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import serguma.galeriacategoria.Listeners.CategoriaListener;
import serguma.galeriacategoria.R;

/**
 * Created by sergu on 27/03/2017.
 */

public class FragmentCategoria extends android.support.v4.app.Fragment {

    private int idCategoria;
    private int item;
    private ImageView imCategoria;

    public FragmentCategoria( int item, int idCategoria) {
        this.idCategoria = idCategoria;
        this.item = item;
    }

    public static FragmentCategoria crea(int item, int idCategoria) {
        //para crear los fragment dinámicamente
        FragmentCategoria fragment = new FragmentCategoria(item, idCategoria);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_categoria, container, false);
        imCategoria = (ImageView) view.findViewById(R.id.imcategoria);
        Log.d("Categoria", ""+idCategoria);

        imCategoria.setImageResource(item);

        //listener para las imágenes de las categorías
        CategoriaListener categoriaListener = new CategoriaListener(getContext(), idCategoria);
        imCategoria.setOnClickListener(categoriaListener);

        return view;
    }
}
