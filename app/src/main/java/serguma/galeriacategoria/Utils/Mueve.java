package serguma.galeriacategoria.Utils;

import android.content.Context;
import android.support.v4.view.ViewPager;

/**
 * Created by sergu on 29/03/2017.
 */

public class Mueve {

    private Context ctx;

    public Mueve(Context ctx) {
        this.ctx = ctx;
    }

    public static void mueve_fragment(ViewPager viewPager){
        //me muevo por los fragment
        viewPager.setCurrentItem(viewPager.getCurrentItem()+1, true);
    }

}
