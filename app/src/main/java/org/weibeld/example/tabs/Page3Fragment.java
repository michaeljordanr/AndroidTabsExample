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

/* Fragment used as page 3 */
public class Page3Fragment extends BaseFragment {

    MainActivity parent;
    ImageView iv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_page3, container, false);
        parent = (MainActivity) getActivity();

        Button bt3 = rootView.findViewById(R.id.bt3);
        bt3.setOnClickListener(v -> parent.setCurrentItem(Page1Fragment.class.getName(), false));

        iv = parent.findViewById(R.id.ib_back_toolbar);


        return rootView;
    }


    @Override
    public void viewDidAppear() {
        super.viewDidAppear();
        setToolbarTitle(tvToolbar, "Fragment 3");
        iv.setOnClickListener(v -> parent.setCurrentItem(Page2Fragment.class.getName(), false));
        toolbar.setBackgroundColor(getResources().getColor(R.color.azure));
    }

    @Override
    public void viewDidDisappear() {
        super.viewDidDisappear();
    }
}
