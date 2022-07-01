package hafid.ramadhan10119089;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import hafid.ramadhan10119089.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());
        replaceFragment(new RestoFragment());

        activityMainBinding.bottomView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.resto:
                    replaceFragment(new RestoFragment());
                    break;
                case R.id.profil:
                    replaceFragment(new ProfilFragment());
                    break;
            }
            return true;
        });
    }
    private void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.layout_bottom, fragment);
        fragmentTransaction.commit();
    }
}