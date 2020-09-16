package com.example.navigationdrawer2.ui.info;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.navigationdrawer2.R;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link InfoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class InfoFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public InfoFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment InfoFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static InfoFragment newInstance(String param1, String param2) {
        InfoFragment fragment = new InfoFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String description = "ATM Consultoria's mission is to support organizations " +
                "who wish to achieve success through excellence in management and " +
                "the search for quality.";
        Element version = new Element();
        version.setTitle("Version 1.0");

      return new AboutPage(getActivity())
              .setImage(R.drawable.logo)
              .setDescription(description)

              .addGroup("Contact")
              .addEmail("atendimento@atmconsultoria.com.br", "Send an e-mail")
              .addWebsite("https://www.google.com/", "Access our site")

              .addGroup("Social networks")
              .addFacebook("AhmadRaza", "Facebook")
              .addInstagram("AhmadRaza", "Instagram")
              .addTwitter("AhmadRaza", "Twitter")
              .addYoutube("AhmadRaza", "Youtube")
              .addGitHub("AhmadRaza", "GitHub")
              .addPlayStore("com.facebook.katana", "Download App")

              .addItem(version)

                .create();
    }
}