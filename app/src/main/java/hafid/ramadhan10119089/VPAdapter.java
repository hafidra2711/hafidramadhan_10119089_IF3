package hafid.ramadhan10119089;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class VPAdapter extends PagerAdapter {
    int[] tampilan;
    LayoutInflater layoutInflater;
    public VPAdapter(Context context, int[] layouts){
        this.tampilan = layouts;
        this.layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = layoutInflater.inflate(tampilan[position], container, false);
        container.addView(view);
        return view;
    }

    @Override
    public int getCount() {
        return tampilan.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
