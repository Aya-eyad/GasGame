package com.example.gasgame;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gasgame.databinding.ActivityProfileBinding;

public class ProfileActivity extends AppCompatActivity {
ActivityProfileBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityProfileBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
//        binding.tvCleckName.setVisibility(View.GONE);
//        binding.edCleckName.setVisibility(View.VISIBLE);
//        binding.edCleckName.setText(edititemname);

        binding.edCleckName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                Toast.makeText(ProfileActivity.this, editable.toString(), Toast.LENGTH_SHORT).show();
            }
        });
       TextViewClicked();
    }
    public void TextViewClicked() {
        ViewSwitcher switcher = (ViewSwitcher) findViewById(R.id.switcher_name);
        switcher.showPrevious(); //or switcher.showNext();
//        TextView myTV = (TextView) switcher.findViewById(R.id.tv_cleck_name);
//        myTV.setText("value");

        }
}