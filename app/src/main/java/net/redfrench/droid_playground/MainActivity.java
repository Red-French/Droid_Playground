package net.redfrench.droid_playground;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import net.redfrench.droid_playground.MainFragment;
import net.redfrench.droid_playground.R;


public class MainActivity extends AppCompatActivity {
    private static MainActivity mainActivity;

    public static MainActivity getMainActivity() {
        return mainActivity;
    }

    private static void setMainActivity(MainActivity mainActivity) {
        MainActivity.mainActivity = mainActivity;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FragmentManager fragmentManager = getSupportFragmentManager();

        Fragment mainFragment = fragmentManager.findFragmentById(R.id.container);
//    mainFragment = (MainFragment)getSupportFragmentManager().findFragmentById(R.id.container_main);

        if (mainFragment == null) {
//        mainFragment = MainFragment.newInstance();
            mainFragment = new MainFragment();
            fragmentManager
                    .beginTransaction()
                    .add(R.id.container, mainFragment)
                    .commit();

        }

    }
}
