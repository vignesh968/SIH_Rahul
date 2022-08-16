package com.example.hackragul.ui.home;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.hackragul.R;
import com.example.hackragul.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        final ImageView web=binding.imageView9;
        web.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), website.class);
                view.getContext().startActivity(intent);
                getActivity().finish();

            }
        });
        final ImageView fin=binding.acad;
        fin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), fin.class);
                view.getContext().startActivity(intent);
                getActivity().finish();

            }
        });
        final ImageView affect=binding.inf1;
        affect.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), affect.class);
                view.getContext().startActivity(intent);
                getActivity().finish();

            }
        });
        final ImageView agum=binding.imageView3;
        agum.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), agum.class);
                view.getContext().startActivity(intent);
                getActivity().finish();

            }
        });
        final ImageView human=binding.imageView1;
        human.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), human.class);
                view.getContext().startActivity(intent);
                getActivity().finish();

            }
        });
        final ImageView host=binding.imageView2;
        host.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), host.class);
                view.getContext().startActivity(intent);
                getActivity().finish();

            }
        });
//        agum.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View arg0) {
//                Intent viewIntent =
//                        new Intent("android.intent.action.VIEW",
//                                Uri.parse("https://sihack1.glitch.me/"));
//                startActivity(viewIntent);
//            }
//        });
//

          //homeViewModel.get().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}


