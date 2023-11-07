package com.kurt.odev4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kurt.odev4.databinding.FragmentSayfaBBinding;


public class SayfaBFragment extends Fragment {

    private FragmentSayfaBBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSayfaBBinding.inflate(inflater,container,false);

        binding.buttonGitBY.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.bygecis);
        });

        return binding.getRoot();
    }
}