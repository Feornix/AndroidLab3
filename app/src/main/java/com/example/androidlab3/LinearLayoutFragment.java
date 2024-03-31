package com.example.androidlab3;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.androidlab3.databinding.FragmentLinearLayoutBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LinearLayoutFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LinearLayoutFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public LinearLayoutFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment LinearLayoutFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static LinearLayoutFragment newInstance(String param1, String param2) {
        LinearLayoutFragment fragment = new LinearLayoutFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    FragmentLinearLayoutBinding binding;
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
        binding = FragmentLinearLayoutBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout linearLayout = (LinearLayout) binding.linearLayout1;
                LinearLayout.LayoutParams viewParams=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                viewParams.weight = 1;
                TextView txtView = new TextView(getActivity().getApplicationContext());
                txtView.setText(binding.editTextText2.getText());
                txtView.setHeight(300);
                txtView.setTextSize(32);
                txtView.setTextColor(getResources().getColor(R.color.black));
                linearLayout.addView(txtView);
            }
        });
        // Inflate the layout for this fragment
        return view;
    }
}