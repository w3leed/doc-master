package com.example.waleed.vezeeta;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CallUS extends AppCompatActivity {
    TextView Contacts_Call_Us;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_us);

        Contacts_Call_Us = (TextView)findViewById(R.id.contacts_call_us);

        Contacts_Call_Us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Phone ="16676";
                Intent intent =new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + Phone ));
                if(intent.resolveActivity(getPackageManager()) != null){
                    startActivity(intent);
                }

            }
        });
    }

}
