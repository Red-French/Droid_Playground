package net.redfrench.droid_playground;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ImageFragment extends Fragment{


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.image_fragment, container, false);  // parameters: reference to layout, container, boolean

        return view;  // Inflate the layout for this fragment
    }
}
