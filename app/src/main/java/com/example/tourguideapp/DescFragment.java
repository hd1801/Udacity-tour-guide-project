package com.example.tourguideapp;

import android.media.Image;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Set;

/**
 * A simple {@link Fragment} subclass.
 * Use the factory method to
 * create an instance of this fragment.
 */
public class DescFragment extends Fragment {
    View rootView;

    public DescFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_desc, container, false);
        Bundle args =getArguments();
        SetData(args);
        return rootView;
    }
    public void SetData(Bundle bundle)
    {
        //SetData
        TouristSpot a = bundle.getParcelable("Desc");
        ImageView imageView = (ImageView) rootView.findViewById(R.id.desc_image);
        imageView.setImageResource(a.getImageResourceId());
        TextView name = (TextView) rootView.findViewById(R.id.name_textView);
        TextView short_desc = (TextView) rootView.findViewById(R.id.short_desc_textView);
        TextView desc = (TextView) rootView.findViewById(R.id.desc_textView);
        TextView address =(TextView) rootView.findViewById(R.id.address_textView);
        TextView contact = (TextView) rootView.findViewById(R.id.contact_textView);

        name.setText(a.getName());
        short_desc.setText(a.getShortDescription());
        desc.setText(a.getDescription());
        contact.setText(a.getContact());
        address.setText(a.getAddress());

    }
}
