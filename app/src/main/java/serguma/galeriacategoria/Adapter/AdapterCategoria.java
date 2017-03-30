package serguma.galeriacategoria.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import serguma.galeriacategoria.Fragment.FragmentCategoria;
import serguma.galeriacategoria.Modelos.Categorias;

/**
 * Created by sergu on 27/03/2017.
 */

public class AdapterCategoria extends FragmentStatePagerAdapter {

    private Categorias categorias;

    public AdapterCategoria(FragmentManager fm, Categorias categorias) {
        super(fm);
        this.categorias = categorias;
    }

    @Override
    public Fragment getItem(int position) {
        FragmentCategoria fragmentCategoria = FragmentCategoria.crea(categorias.getCategoria(position), position);
        return fragmentCategoria;
    }

    @Override
    public int getCount() {
        return categorias.tamCategoria();
    }
}
