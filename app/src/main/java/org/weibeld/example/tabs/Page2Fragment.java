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
        next.setOnClickListener(v -> parent.setCurrentItem(Page3Fragment.class.getName(), false));

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
        iv.setOnClickListener(v -> parent.setCurrentItem(Page1Fragment.class.getName(), false));
    }

    @Override
    public void viewDidDisappear() {
        super.viewDidDisappear();
    }
}
