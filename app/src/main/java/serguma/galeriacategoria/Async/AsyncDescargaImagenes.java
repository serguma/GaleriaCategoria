package serguma.galeriacategoria.Async;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import serguma.galeriacategoria.Actividades.Galeria;
import serguma.galeriacategoria.Adapter.AdapterGaleria;
import serguma.galeriacategoria.Animaciones.ZoomOutPageTransformer;
import serguma.galeriacategoria.Listeners.EscuchaBoton;
import serguma.galeriacategoria.R;


/**
 * Created by sergu on 29/03/2017.
 */

public class AsyncDescargaImagenes extends AsyncTask<String, Void, Bitmap[]> {

    private Context ctx;

    public AsyncDescargaImagenes(Context ctx) {
        this.ctx = ctx;
    }

    @Override
    protected Bitmap[] doInBackground(String... params) {

        Bitmap[] bitmap = new Bitmap[params.length];
        String urlImagen = null;
        URL url = null;

        HttpURLConnection httpURLConnection = null;
        int respuesta = 0;
        InputStream inputStream = null;

        try{

            for(int i = 0; i < params.length; i++){

                urlImagen = params[i];
                //Log.d("URL", urlImagen);
                url = new URL(urlImagen);
                httpURLConnection = (HttpURLConnection) url.openConnection();

                //Log.d("Respuesta", ""+httpURLConnection.HTTP_OK);

                respuesta = httpURLConnection.getResponseCode(); // respuesta del http
                if(respuesta == httpURLConnection.HTTP_OK){
                    //si está ok obtengo el contenido
                    inputStream = httpURLConnection.getInputStream();
                    bitmap[i] = BitmapFactory.decodeStream(inputStream);
                }else{
                    Log.e(getClass().getCanonicalName(), "ERROR: fallo en la petición"  );
                }

            }



        }catch (Throwable t){
            Log.e(getClass().getCanonicalName(), "ERROR: " + t );
        }finally {
            httpURLConnection.disconnect();
        }

        return bitmap;
    }

    @Override
    protected void onPostExecute(Bitmap[] bitmaps) {

        Galeria galeria = (Galeria) ctx;

        //Asignamos el adapter y la animación
        ViewPager viewPager = (ViewPager) galeria.findViewById(R.id.galeriavp);
        AdapterGaleria adapterGaleria = new AdapterGaleria(galeria.getSupportFragmentManager(),bitmaps);
        viewPager.setAdapter(adapterGaleria);
        //asigno animación
        viewPager.setPageTransformer(true, new ZoomOutPageTransformer());

        galeria.findViewById(R.id.progressbar).setVisibility(View.GONE);

        //asignamos las funciones a los botones
        ImageButton botonSi = (ImageButton) galeria.findViewById(R.id.bsi);
        ImageButton botonNo = (ImageButton) galeria.findViewById(R.id.bno);

        EscuchaBoton escuchaboton = new EscuchaBoton(ctx);

        botonSi.setOnClickListener(escuchaboton);
        botonNo.setOnClickListener(escuchaboton);


        super.onPostExecute(bitmaps);
    }

}
