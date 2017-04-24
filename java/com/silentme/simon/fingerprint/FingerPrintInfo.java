package com.silentme.simon.fingerprint;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class FingerPrintInfo extends AppCompatActivity {

    LinearLayout ln1,ln2;
    TextView name,nid,address;
    ImageView finger,pic;
    String fingerImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finger_print_info);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //---------- variable initializing --------
        ln1 = (LinearLayout) findViewById(R.id.LinearprintDetails);
        ln2 = (LinearLayout)findViewById(R.id.LinearFingerPrint);

        name = (TextView)findViewById(R.id.textViewName);
        nid = (TextView)findViewById(R.id.textViewNid);
        address = (TextView)findViewById(R.id.textViewAddress);

        finger = (ImageView) findViewById(R.id.imageViewFingerPrint);
        pic = (ImageView) findViewById(R.id.imageViewPic);

        //-----------end of variable initializing ---------

        ln1.setVisibility(View.GONE);

        Intent intent = getIntent();
        fingerImage = intent.getExtras().getString("imageValue");
       // finger.setImageBitmap(BitmapFactory.decodeFile(fingerImage));



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG).setAction("Action", null).show();
                if(1==1){
                    Animation slide_up = AnimationUtils.loadAnimation(getApplicationContext(),
                            R.anim.slide_up);
                    Animation slide_up2 = AnimationUtils.loadAnimation(getApplicationContext(),
                            R.anim.slide_up2);

                    ln1.startAnimation(slide_up);

                    ln1.setVisibility(View.VISIBLE);
                    ln2.startAnimation(slide_up2);
                }
            }
        });


    }

}
