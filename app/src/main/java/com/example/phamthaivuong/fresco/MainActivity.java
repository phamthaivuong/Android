package com.example.phamthaivuong.fresco;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.DraweeView;
import com.facebook.drawee.view.SimpleDraweeView;

import java.math.RoundingMode;

public class MainActivity extends AppCompatActivity {
    SimpleDraweeView msimpleDraweeView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fresco.initialize(this);
        setContentView(R.layout.activity_main);



        Uri uri = Uri.parse("https://tinthuongnhat.net/wp-content/uploads/2018/09/hinh2-20170906085641.jpg");
        SimpleDraweeView draweeView = (SimpleDraweeView) findViewById(R.id.my_iamge);
        draweeView.setImageURI(uri);


        //msimpleDraweeView = (SimpleDraweeView)findViewById(R.id.my_iamge);
//        int overlayColor  = getResources().getColor(R.color.green);
//        RoundingParams roundingParams = RoundingParams.fromCornersRadius(7f);
//        draweeView.setHierarchy(new GenericDraweeHierarchyBuilder(getResources())
//                .setRoundingParams(roundingParams)
//                .build());
        int color = getResources().getColor(R.color.red);
        RoundingParams roundingParams = RoundingParams.fromCornersRadius(5f);
        roundingParams.setBorder(color, 16f);
        roundingParams.setRoundAsCircle(true);
        draweeView.getHierarchy().setRoundingParams(roundingParams);


    }
}
