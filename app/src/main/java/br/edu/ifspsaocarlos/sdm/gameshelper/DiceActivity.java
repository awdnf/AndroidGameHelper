package br.edu.ifspsaocarlos.sdm.gameshelper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.List;
import java.util.Map;

import br.edu.ifspsaocarlos.sdm.gameshelper.model.Dice;
import br.edu.ifspsaocarlos.sdm.gameshelper.model.Player;

public class DiceActivity extends AppCompatActivity {

    private Map<Player, List<Dice>> playerDices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice);
    }
}
