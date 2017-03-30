package serguma.galeriacategoria.Listeners;

import android.app.Activity;
import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;

import serguma.galeriacategoria.Utils.Mueve;
import serguma.galeriacategoria.R;

/**
 * Created by sergu on 29/03/2017.
 */

public class EscuchaBoton implements View.OnClickListener {

    private Context ctx;

    public EscuchaBoton(Context ctx ) {
        this.ctx = ctx;
    }

    @Override
    public void onClick(View v) {

        Activity activity = (Activity) ctx;
        ViewPager viewPager = (ViewPager) activity.findViewById(R.id.galeriavp);

        switch (v.getId()) {

            case R.id.bsi:
                Log.d(getClass().getCanonicalName(), "He pulsado el botón si " );
                break;

            case R.id.bno:
                Log.d(getClass().getCanonicalName(), "He pulsado el botón no " );
                break;

        }


        Mueve.mueve_fragment(viewPager);
    }
}
