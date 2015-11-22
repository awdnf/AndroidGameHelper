package br.edu.ifspsaocarlos.sdm.gameshelper;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GameHelperActivity extends Activity {

    private static final int INTENT_NEW_MARKER = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_helper);

    }

    public void onCreateClick(View v) {

        int id = v.getId();
        if (id == R.id.create_marker) {
            startActivity(new Intent(this, NewMarkerActivity.class));
        }

    }
}
