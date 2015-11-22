package br.edu.ifspsaocarlos.sdm.gameshelper;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NewMarkerActivity extends Activity {

    private TextView playersNumber;
    private TextView dicesNumber;
    private TextView diceFaces;

    private static final Integer ZERO = Integer.valueOf(0);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_marker);
        this.playersNumber = (TextView) super.findViewById(R.id.playersNumber);
        this.dicesNumber = (TextView) super.findViewById(R.id.dicesNumber);
        this.diceFaces = (TextView) super.findViewById(R.id.diceFaces);
    }

    public void onIncrementClick(View v) {
        int id = v.getId();
        switch (id) {
            case (R.id.incrementPlayers):
                this.handleIncrementDecrement(this.playersNumber, 1);
                break;
            case (R.id.incrementDicesNumber):
                this.handleIncrementDecrement(this.dicesNumber, 1);
                break;
            case (R.id.incrementDiceFaces):
                this.handleIncrementDecrement(this.diceFaces, 1);
                break;
        }
    }

    public void onDecrementClick(View v) {
        int id = v.getId();
        switch (id) {
            case (R.id.decrementPlayers):
                this.handleIncrementDecrement(this.playersNumber, -1);
                break;
            case (R.id.decrementDicesNumber):
                this.handleIncrementDecrement(this.dicesNumber, -1);
                break;
            case (R.id.decrementDiceFaces):
                this.handleIncrementDecrement(this.diceFaces, -1);
                break;
        }
    }

    private void handleIncrementDecrement(TextView txtView, Integer valueToAdd) {
        Integer currVal = Integer.valueOf(txtView.getText().toString());
        currVal = currVal + valueToAdd;
        if (currVal.compareTo(ZERO) < 0) {
            currVal = ZERO;
        }
        txtView.setText(currVal.toString());
    }
}
