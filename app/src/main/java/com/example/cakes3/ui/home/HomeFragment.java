package com.example.cakes3.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cakes3.Adapter;
import com.example.cakes3.MainActivity;
import com.example.cakes3.cakeModal;
import com.example.cakes3.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

//        final TextView textView = binding.textHome;
//        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        RecyclerView rv_data = binding.idRvData;

        rv_data.setHasFixedSize(true);
        rv_data.setLayoutManager(new LinearLayoutManager(getContext()));
        cakeModal[] data ={new cakeModal("cake1","1000₹"),new cakeModal("cake2","1500₹")};

        Adapter adapter = new Adapter(getContext(),data);
        rv_data.setAdapter(adapter);



        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}