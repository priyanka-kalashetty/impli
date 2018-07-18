package com.example.android.implicitintents;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText mShareTextEditText;
    private EditText mLocationEditText;
    public void openWebsite(View view) {
// Get the URL text.
        TextView mWebsiteEditText;
        String url = mWebsiteEditText.getText().toString();
// Parse the URI and create the intent.
        Uri webpage = Uri.parse(url);
        Uri addressUri = Uri.parse("geo:0,0?q=" + loc);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        Intent intent = new Intent(Intent.ACTION_VIEW, addressUri);
// Find an activity to hand the intent and start that activity.
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            } else {
                Log.d("ImplicitIntents", "Can't handle this intent!");
            }
        } else {
            Log.d("ImplicitIntents", "Can't handle this intent!");
        }
    }

    @Override
    public void openWebsite(View view) { }
    String loc = mLocationEditText.getText().toString();
    String mimeType = "text/plain";
    protected void onCreate(Bundle savedInstanceState) {
        mShareTextEditText = (EditText) findViewById(R.id.share_edittext);
        ShareCompat.IntentBuilder
                .from(this)
                .setType(mimeType)
                .setChooserTitle("Share this text with: ")
                .setText(txt)
                .startChooser()
        String txt = mShareTextEditText.getText().toString();
        mLocationEditText = (EditText) findViewById(R.id.location_edittext);
        mWebsiteEditText = (EditText) findViewById(R.id.website_edittext);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
