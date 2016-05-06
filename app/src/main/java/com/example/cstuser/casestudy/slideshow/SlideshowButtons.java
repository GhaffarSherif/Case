package com.example.cstuser.casestudy.slideshow;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;

import com.example.cstuser.casestudy.R;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link SlideshowButtons.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link SlideshowButtons#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SlideshowButtons extends Fragment implements View.OnClickListener {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    static CheckBox repeat;
    static RadioButton legendText;
    static RadioButton playSoundFile;
    static Button startButton;
    static Button returnToMainMenu;
    static boolean repeatSlideshow = false;
    static boolean playSound = false;

    private OnFragmentInteractionListener mListener;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SlideshowButtons.
     */
    // TODO: Rename and change types and number of parameters
    public static SlideshowButtons newInstance(String param1, String param2) {
        SlideshowButtons fragment = new SlideshowButtons();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public SlideshowButtons() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

        repeat = (CheckBox) getView().findViewById(R.id.repeatCheckBox);
        legendText = (RadioButton) getView().findViewById(R.id.legendTextRButton);
        playSoundFile = (RadioButton) getView().findViewById(R.id.playSoundFileRButton);
        startButton = (Button) getView().findViewById(R.id.startButton);
        returnToMainMenu = (Button) getView().findViewById(R.id.returnToMainMenuButton);

        repeat.setOnClickListener(this);
        legendText.setOnClickListener(this);
        playSoundFile.setOnClickListener(this);
        startButton.setOnClickListener(this);
        returnToMainMenu.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == repeat.getId()){
            if(repeat.isChecked())
                repeatSlideshow = true;
            else
                repeatSlideshow = false;
        }
        if(v.getId() == legendText.getId())
            playSound = false;
        if(v.getId() == playSoundFile.getId())
            playSound = true;
        if(v.getId() == startButton.getId()){
            Intent i = new Intent("com.example.cstuser.casestudy.SlideshowView");
            startActivity(i);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_slideshow_buttons, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (OnFragmentInteractionListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        public void onFragmentInteraction(Uri uri);
    }

}
