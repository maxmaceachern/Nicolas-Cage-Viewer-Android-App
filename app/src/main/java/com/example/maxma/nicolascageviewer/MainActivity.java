package com.example.maxma.nicolascageviewer;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;
import android.app.Activity;

public class MainActivity extends Activity {
    private Integer images[] = {R.drawable.owl_cagge, R.drawable.nicolas_cage_2011, R.drawable.dail_cage, R.drawable.golem_cage, R.drawable.chicken_cage, R.drawable.super_cage, R.drawable.beyonce_cage, R.drawable.jesus_cage, R.drawable.gandalf_cage, R.drawable.bill_cage};
    private int currImage = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setInitialImage();
        setImageRotateListener();

    }

    private void setImageRotateListener(){
        final Button nextbutton = (Button) findViewById(R.id.btnNextImage);
        nextbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currImage++;
                if (currImage == images.length){
                    currImage = 0;
                }
                setCurrentImage();;
            }
        });
    }
    private void setInitialImage(){
        setCurrentImage();
    }

    private void setCurrentImage(){
        final ImageView imageView = (ImageView) findViewById(R.id.imageDisplay);
        imageView.setImageResource(images[currImage]);
    }
}
