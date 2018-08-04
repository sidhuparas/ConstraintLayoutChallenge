package com.parassidhu.constraintlayoutchallenge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private final String architectsData = "<b>Architects:</b> Pierre Lescot, Claude Perrault, Louis Le Vau";
    private final String establishData = "<b>Established:</b> 10 August 1793";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView architects = findViewById(R.id.architects);
        architects.setText(Html.fromHtml(architectsData));

        TextView establish = findViewById(R.id.establish);
        establish.setText(Html.fromHtml(establishData));
    }
}
