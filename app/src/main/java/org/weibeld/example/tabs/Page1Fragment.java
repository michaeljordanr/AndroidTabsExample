package org.weibeld.example.tabs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import org.weibeld.example.R;

/* Fragment used as page 1 */
public class Page1Fragment extends Fragment {

    public Page1Fragment(){}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_page1, container, false);
        Button bt1 = rootView.findViewById(R.id.bt1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).setCurrentItem(1, false);
            }
        });


        return rootView;
    }

    @Override
    public void onResume() {
        super.onResume();
        Toast.makeText(getContext(), "Frag 1", Toast.LENGTH_SHORT).show();
    }
}
