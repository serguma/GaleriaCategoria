package serguma.galeriacategoria.Adapter;

import android.graphics.Bitmap;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import serguma.galeriacategoria.Fragment.FragmentGaleria;

/**
 * Created by sergu on 29/03/2017.
 */

public class AdapterGaleria extends FragmentStatePagerAdapter {


    private Bitmap[] bitmaps;

    public AdapterGaleria(FragmentManager fm, Bitmap[] bitmaps) {
        super(fm);
        this.bitmaps = bitmaps;
    }

    @Override
    public Fragment getItem(int position) {
        //creo tanto fragment como bitmaps hay
        FragmentGaleria fragmentGaleria = FragmentGaleria.crea(bitmaps[position]);
        return fragmentGaleria;
    }

    @Override
    public int getCount() {
        return bitmaps.length;
    }
}
