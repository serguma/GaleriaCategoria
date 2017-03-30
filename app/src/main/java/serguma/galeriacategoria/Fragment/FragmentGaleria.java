package serguma.galeriacategoria.Fragment;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import serguma.galeriacategoria.R;

/**
 * Created by sergu on 29/03/2017.
 */

public class FragmentGaleria extends android.support.v4.app.Fragment {

    private Bitmap bitmap;
    private ImageView imageView;

    public FragmentGaleria(Bitmap bitmap) {
        this.bitmap = bitmap;

    }

    public static FragmentGaleria crea(Bitmap bitmap) {
        //para crear los fragment dinámicamente
        FragmentGaleria fragment = new FragmentGaleria(bitmap);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_galeria, container, false);
        imageView = (ImageView) view.findViewById(R.id.laimagen);
        imageView.setImageBitmap(bitmap);


        return view;
    }
}
