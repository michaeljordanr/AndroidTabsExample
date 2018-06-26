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

/* Fragment used as page 2 */
public class Page2Fragment extends BaseFragment {

    MainActivity parent;
    ImageView iv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_page2, container, false);
        parent = (MainActivity) getActivity();

        Button next = rootView.findViewById(R.id.bt2);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                parent.setCurrentItem(2, false);
            }
        });

        iv = parent.findViewById(R.id.ib_back_toolbar);


        return rootView;
    }

    @Override
    public void onResume() {
        super.onResume();

    }


    @Override
    public void viewDidAppear() {
        super.viewDidAppear();
        setToolbarTitle(tvToolbar, "Fragment 2");
        Toast.makeText(getContext(), "Frag 2 appeared", Toast.LENGTH_SHORT).show();

        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                parent.setCurrentItem(0, false);
            }
        });
    }

    @Override
    public void viewDidDisappear() {
        super.viewDidDisappear();
        Toast.makeText(getContext(), "Frag 2 disappeared", Toast.LENGTH_SHORT).show();
    }
}
