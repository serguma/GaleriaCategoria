package serguma.galeriacategoria.Listeners;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import android.view.View;

import serguma.galeriacategoria.Actividades.Galeria;

/**
 * Created by sergu on 27/03/2017.
 */

public class CategoriaListener implements View.OnClickListener {

    private Context ctx;
    private int idCategoria;

    public CategoriaListener(Context ctx, int idCategoria ) {
        this.ctx = ctx;
        this.idCategoria = idCategoria;
    }

    @Override
    public void onClick(View v) {

        Log.d(getClass().getCanonicalName(), "Pulso imagen " + idCategoria );

        Activity activity = (Activity) ctx;
        Intent intent = new Intent(activity, Galeria.class);
        //paso el id de la categoría
        intent.putExtra("categoria", idCategoria);

        //para comprobar en la versión en la que estoy
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            //animación entre actividades
            activity.startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(activity).toBundle());
        }else{
            activity.startActivity(intent);
        }

    }
}
