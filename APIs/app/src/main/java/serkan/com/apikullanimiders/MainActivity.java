package serkan.com.apikullanimiders;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void getir(View view){



    }

    // AsyncTask Sekronize olmayan görevlerde arka plan işlemlerinde kullanılıyor.
    private class DownloadData extends AsyncTask<String,Void,String>{


        @Override
        protected String doInBackground(String... strings) {
            String result="";

            URL url; //
            HttpURLConnection httpURLConnection;


            try {

                url=new URL(strings[0]);
                httpURLConnection=(HttpURLConnection) url.openConnection();
                InputStream inputstream=httpURLConnection.getInputStream();
                InputStreamReader inputStreamReader=new InputStreamReader(inputstream);




            } catch (Exception e) {
                e.printStackTrace();
            }


            return null;
        }


        // İşlem Bittiğinde
        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
        }
    }


}
