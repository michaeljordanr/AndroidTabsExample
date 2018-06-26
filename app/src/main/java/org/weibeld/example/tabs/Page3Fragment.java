package org.weibeld.example.tabs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

        iv = parent.findViewById(R.id.ib_back_toolbar);


        return rootView;
    }


    @Override
    public void viewDidAppear() {
        super.viewDidAppear();
        Toast.makeText(getContext(), "Frag 3 appeared", Toast.LENGTH_SHORT).show();
        setToolbarTitle(tvToolbar, "Fragment 3");
        iv.setOnClickListener(v -> parent.setCurrentItem(1, false));
    }

    @Override
    public void viewDidDisappear() {
        super.viewDidDisappear();
        Toast.makeText(getContext(), "Frag 3 disappeared", Toast.LENGTH_SHORT).show();
    }
}
