package org.wooble.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

import org.wooble.ui.ActionBar.BaseFragment;
import org.wooble.ui.Components.SizeNotifierFrameLayout;

public class EmptyBaseFragment extends BaseFragment {

    @Override
    public View createView(Context context) {
        return fragmentView = new SizeNotifierFrameLayout(context);
    }

}
