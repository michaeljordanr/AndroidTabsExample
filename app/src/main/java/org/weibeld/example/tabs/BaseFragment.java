package org.weibeld.example.tabs;

import android.support.v4.app.Fragment;
import android.widget.TextView;

import org.weibeld.example.R;

public abstract class BaseFragment extends Fragment implements FragmentInterface {
    private boolean isStarted = false;
    private boolean isVisible = false;

    TextView tvToolbar;

    @Override
    public void onStart() {
        super.onStart();
        isStarted = true;


        if(isVisible){
            viewDidAppear();
        }
    }


    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        isVisible = isVisibleToUser;
        if(isStarted) {
            if (isVisible) {
                viewDidAppear();
            } else {
                viewDidDisappear();
            }
        }
    }

    public void viewDidAppear() {
        tvToolbar = getActivity().findViewById(R.id.tv_toolbar);
    }

    public void viewDidDisappear(){

    }
}
