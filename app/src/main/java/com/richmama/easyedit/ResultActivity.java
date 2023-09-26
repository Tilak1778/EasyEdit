package com.richmama.easyedit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.richmama.easyedit.databinding.ActivityMainBinding;
import com.richmama.easyedit.databinding.ActivityResultBinding;


public class ResultActivity extends AppCompatActivity {

    ActivityResultBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("tilak","result activity oncrrate");
        binding = ActivityResultBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.resultImage.setImageURI(getIntent().getData());
    }
}