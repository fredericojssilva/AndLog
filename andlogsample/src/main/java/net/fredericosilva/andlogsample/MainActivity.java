package net.fredericosilva.andlogsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import net.fredericosilva.andlog.AndLog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AndLog.hereIam();

        AndLog.d("Woow");

        AndLog.d("Balo", "Bilo", "Silo: 3");

        AndLog.e("Die because reasons", new Exception("booooooooom"));

        AndLog.withTag("FRED").d("balo", "bilo");

    }
}
