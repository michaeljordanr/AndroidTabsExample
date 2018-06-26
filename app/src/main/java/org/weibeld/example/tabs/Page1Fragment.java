package org.weibeld.example.tabs;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.weibeld.example.R;

import java.util.Objects;

/* Fragment used as page 1 */
public class Page1Fragment extends BaseFragment implements FragmentInterface{

    MainActivity parent;

    public Page1Fragment() {
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_page1, container, false);
        parent = (MainActivity) getActivity();


        Button next = rootView.findViewById(R.id.bt1);
        next.setOnClickListener(v -> parent.setCurrentItem(1, true));


        return rootView;
    }

    @Override
    public void onResume() {
        super.onResume();

    }

    @Override
    public void viewDidAppear() {
        super.viewDidAppear();
        setToolbarTitle(tvToolbar, "Fragment 1");
    }

    @Override
    public void viewDidDisappear() {
        super.viewDidDisappear();
        Toast.makeText(getContext(), "Frag 1 disappeared", Toast.LENGTH_SHORT).show();

    }
}
