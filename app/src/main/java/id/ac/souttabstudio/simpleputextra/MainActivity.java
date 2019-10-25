package id.ac.souttabstudio.simpleputextra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Intent pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tombolAtas(View view) {
        pindah = new Intent(this, DetailActivity.class);
        pindah.putExtra("tombolMain", "Ini Tobol Atas");
        startActivity(pindah);
    }

    public void tombolBawah(View view) {
        pindah = new Intent(this, DetailActivity.class);
        pindah.putExtra("tombolMain", "Ini Tobol Bawah");
        startActivity(pindah);
    }
}
