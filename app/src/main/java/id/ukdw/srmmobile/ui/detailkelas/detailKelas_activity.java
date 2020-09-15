package id.ukdw.srmmobile.ui.detailkelas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


import id.ukdw.srmmobile.R;
import id.ukdw.srmmobile.ui.RecyclerViewModelKelas;

public class detailKelas_activity extends AppCompatActivity {
    ImageView imageView;
    TextView textJudul, textDetail;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailmatkul);

        Intent intent = getIntent();
        RecyclerViewModelKelas recyclerViewModelKelas = intent
                .getParcelableExtra( "RecyclerViewModelKelas");

        String Judul = recyclerViewModelKelas.getJudul();
        String Detail = recyclerViewModelKelas.getDetail();

        textJudul = findViewById(R.id.judulKelas);
        textJudul.setText(Judul);


        imageView = findViewById(R.id.prevPage);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  Intent intent = new Intent(detailKelas_activity.this, HomeActivity.class);
               // startActivity(intent);
            }
        });

        CardView lihatTugas = findViewById( R.id.lihat_tugas );
        CardView lihatPengumuman = findViewById( R.id.lihat_pengumuman );


        lihatTugas.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent keTugas = new Intent( detailKelas_activity.this, LihatTugasActivity.class  );

            }
        } );
    }
}