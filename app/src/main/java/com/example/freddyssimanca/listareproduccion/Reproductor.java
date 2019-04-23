package com.example.freddyssimanca.listareproduccion;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class Reproductor extends AppCompatActivity {
    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reproductor);

        videoView = (VideoView) findViewById(R.id.videoView);
        Intent paquete = getIntent();
        Bundle video = paquete.getExtras();
        if ( video!=null){
            Uri uri = Uri.parse(video.get("urlPATH").toString());
            videoView.setMediaController(new MediaController(this));
            videoView.setVideoURI(uri);
            videoView.requestFocus();
            videoView.start();
        }
    }
}
