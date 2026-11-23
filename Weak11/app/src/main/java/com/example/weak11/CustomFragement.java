package com.example.weak11;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class CustomFragement extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {]
        View view = inflater.inflate(R.layout.custom_fragement, container, false);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);

        ViewPager viewPager = view.findViewById(R.id.viewPager);
        FragmentManager manager = getChildFragmentManager();
        CustomViewAdapter adapter = new CustomViewAdapter(manager);
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = viewPager.findViewById(R.id.tabLayout);
        tabLayout.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.background2));
        tabLayout.setTabTextColors(ContextCompat.getColor(requireContext(), R.color.unselected_text),
                ContextCompat.getColor(requireContext(), R.color.selected_text));
        tabLayout.setSelectedTabIndicatorColor();
        tabLayout.setSelectedTabIndicatorHeight(10);
        tabLayout.setupWithViewPager(viewPager);
    }
}
