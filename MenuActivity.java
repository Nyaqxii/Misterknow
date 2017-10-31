package net.misterknow.misterknow;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by Neeya on 30/10/2560.
 */

public class MenuActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        Button Button2 = (Button) findViewById(R.id.Button2);

        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, ContactusActivity.class);
                startActivity(intent);
            }
        });
    }
}