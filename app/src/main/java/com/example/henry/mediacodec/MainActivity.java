package com.example.henry.mediacodec;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.RelativeLayout;

import java.io.File;

public class MainActivity extends AppCompatActivity
{

    private CustomVideoView videoView = null;
    private RelativeLayout relativeLayout = null;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        relativeLayout = (RelativeLayout) findViewById(R.id.main_relative_layout);


        videoView = new CustomVideoView(this, new File(Environment.getExternalStorageDirectory() + "/vid_bigbuckbunny.mp4"));

        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                800, 600);
        params.leftMargin = 50;
        params.topMargin = 50;
        // videoView = new CustomVideoView(this, "/sdcard/1.mp4");
        // videoView = new CustomVideoView(this,
        // Uri.parse("android.resource://com.example.samplevideoview/" +
        // R.raw.video));
        relativeLayout.addView(videoView, params);
    }


}
