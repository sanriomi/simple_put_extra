package id.ac.souttabstudio.simpleputextra;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    Intent ambil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView textView = (TextView) findViewById(R.id.textDetail);

        ambil = getIntent();
        textView.setText(ambil.getStringExtra("tombolMain"));

        //untuk mengaktifkan tombol back pada title bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    //prosedur untuk menjalankan tombol back di atas.

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home : onBackPressed(); return true;
            default: return super.onOptionsItemSelected(item);
        }
    }
}
