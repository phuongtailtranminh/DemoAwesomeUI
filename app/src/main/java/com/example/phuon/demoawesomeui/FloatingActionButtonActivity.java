package com.example.phuon.demoawesomeui;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.oguzdev.circularfloatingactionmenu.library.FloatingActionButton;
import com.oguzdev.circularfloatingactionmenu.library.FloatingActionMenu;
import com.oguzdev.circularfloatingactionmenu.library.SubActionButton;

public class FloatingActionButtonActivity extends AppCompatActivity {

    private final String TAG = "FAP";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floating_action_button);

        // Create main icon
        ImageView icon = new ImageView(this); // Create an icon
        icon.setImageResource(R.drawable.ic_add);

        // Create main button
        FloatingActionButton actionButton = new FloatingActionButton.Builder(this)
                .setContentView(icon)
                .build();

        // Create sub button
        SubActionButton.Builder itemBuilder = new SubActionButton.Builder(this);
        // Sub button camera
        ImageView itemCamera = new ImageView(this);
        itemCamera.setImageResource(R.drawable.ic_camera);
        SubActionButton btnCamera = itemBuilder.setContentView(itemCamera).build();
        btnCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "Camera");
            }
        });
        // Sub button map
        ImageView itemMap = new ImageView(this);
        itemMap.setImageResource(R.drawable.ic_place);
        SubActionButton btnMap = itemBuilder.setContentView(itemMap).build();
        btnMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "Map");
            }
        });
        // Sub airplane
        ImageView itemAirplane = new ImageView(this);
        itemAirplane.setImageResource(R.drawable.ic_airplanemode);
        SubActionButton btnAirplane = itemBuilder.setContentView(itemAirplane).build();
        btnAirplane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "Airplane");
            }
        });

        // Add sub button to main button
        FloatingActionMenu actionMenu = new FloatingActionMenu.Builder(this)
                .addSubActionView(btnCamera)
                .addSubActionView(btnMap)
                .addSubActionView(btnAirplane)
                .attachTo(actionButton)
                .build();

    }
}
