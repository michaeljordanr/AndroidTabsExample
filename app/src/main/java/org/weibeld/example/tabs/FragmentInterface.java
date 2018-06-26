package org.weibeld.example.tabs;

import android.widget.TextView;
import android.widget.Toolbar;

public interface FragmentInterface {
    default void setToolbarTitle(TextView tvToolbar, String title) {
        tvToolbar.setText(title);
    }
}
