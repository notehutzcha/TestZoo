package sdu.cs.teerapat.testzoo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView elepImageView, hipImageView, goImageView, callImageView;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        elepImageView = findViewById(R.id.imv_elep);
        hipImageView = findViewById(R.id.imv_hip);
        goImageView = findViewById(R.id.imv_go);
        callImageView = findViewById(R.id.imv_call);


        callImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent telIntent = new Intent(Intent.ACTION_DIAL);
                telIntent.setData(Uri.parse("tel:0888188216"));
                startActivity(telIntent);
            }
        });

        hipImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fbIntent = new Intent(Intent.ACTION_VIEW);
                fbIntent.setData(Uri.parse("https://youtu.be/41ZU6J5-GsE"));
                startActivity(fbIntent);
            }
        });

        goImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri location = Uri.parse("http://maps.google.com/maps?z=10&q=loc:13.216298, 101.056642('สวนสัตว์เปิดเขาเขียว')");
                Intent eduIntent = new Intent(Intent.ACTION_VIEW, location);
                eduIntent.setPackage("com.google.android.apps.maps");
                startActivity(eduIntent);
            }
        });
        mediaPlayer = MediaPlayer.create(this, R.raw.elephant);
//        elepImageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                mediaPlayer = MediaPlayer.create(this, R.raw.elephant);
//            }
//        });
//        elepImageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                mediaPlayer = MediaPlayer.create(this, R.raw.elephant);
//                mediaPlayer.start();
//            }
//        });

    }
    public void playSound(View view) {
//        mediaPlayer = MediaPlayer.create(this, R.raw.elephant);
        mediaPlayer.start();
    } //end playSound() medthod


}
