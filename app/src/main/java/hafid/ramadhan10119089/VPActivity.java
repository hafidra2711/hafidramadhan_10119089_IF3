package hafid.ramadhan10119089;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VPActivity extends AppCompatActivity {

    ViewPager viewPager;
    Button tombol;
    int[] tampilan;
    VPAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vpactivity);

        viewPager = findViewById(R.id.vp);
        tombol = findViewById(R.id.tombol);

        tampilan = new int[]{
                R.layout.viewpager1,
                R.layout.viewpager2
        };
        adapter = new VPAdapter(this, tampilan);
        viewPager.setAdapter(adapter);
        tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(viewPager.getCurrentItem()+1<tampilan.length){
                    viewPager.setCurrentItem(viewPager.getCurrentItem()+1);
                }else{
                    startActivity(new Intent(VPActivity.this, MainActivity.class));
                    finish();
                }
            }
        });
        viewPager.addOnPageChangeListener(viewPagerChangeListener);
    }

    ViewPager.OnPageChangeListener viewPagerChangeListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int i, float v, int i1) {

        }

        @Override
        public void onPageSelected(int i) {
            if(i == tampilan.length -1 ){
                tombol.setText("START");
            }else {
                tombol.setText("NEXT");
            }
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };
}