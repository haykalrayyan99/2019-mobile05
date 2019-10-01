package polinema.ac.id.starterchapter05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import polinema.ac.id.starterchapter05.activities.DynamicActivity;
import polinema.ac.id.starterchapter05.activities.Main2Activity;
import polinema.ac.id.starterchapter05.activities.TugasActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handlerDynamicFragment(View view) {
        Intent intent = new Intent(this, DynamicActivity.class);
        startActivity(intent);
    }

    public void handlerStaticFragment(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }

    public void handlerTugasFragment(View view) {
        Intent intent = new Intent(this, TugasActivity.class);
        startActivity(intent);
    }
}
