package com.example.gasgame;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Patterns;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.gasgame.RoomDataDase.Entity.EntityIformationPerson;
import com.example.gasgame.RoomDataDase.ViewModle;
import com.example.gasgame.databinding.ActivityProfileBinding;
import com.wdullaer.materialdatetimepicker.date.DatePickerDialog;

import java.util.Calendar;
import java.util.List;

public class ProfileActivity extends AppCompatActivity {
    ActivityProfileBinding binding;
    Calendar calendar;
    public static int date;
    ViewModle viewModle;
    List<EntityIformationPerson>iformationPersonList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProfileBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        viewModle=new ViewModelProvider(this).get(ViewModle.class);


        binding.edName.addTextChangedListener(new TextWatcher() {


            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String name=binding.edName.getText().toString();

                 editable.toString();
            }
        });
        binding.edEmail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Toast.makeText(ProfileActivity.this, "Enter your email", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                editable.toString();
            }
        });

        binding.tvDatepicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calendar = Calendar.getInstance();  //هادى المكتبة بتديني خيار اني احدد القيمة الافتراضيه لل date pickerانو يكون ع الوقت الحالى
                calendar = Calendar.getInstance();
                DatePickerDialog dpd = DatePickerDialog.newInstance(//بيطلع مربع حوار عشان تختار تاريخ

                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePickerDialog view, int year, int monthOfYear, int dayOfMonth) {//تستدعي لما المسنخدم يختار تاريخ
                                binding.tvDatepicker.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
                                date = Calendar.getInstance().get(Calendar.YEAR) - year;

                            }
                        },
                        calendar.get(Calendar.YEAR), // Initial year selection
                        calendar.get(Calendar.MONTH), // Initial month selection
                        calendar.get(Calendar.DAY_OF_MONTH) // Inital day selection
                );

// If you're calling this from a support Fragment
                dpd.show(getSupportFragmentManager(), "Datepickerdialog");
            }
        });

        binding.btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = binding.edName.getText().toString();
                String email = binding.edEmail.getText().toString();
                String birthdate = binding.tvDatepicker.getText().toString();
                if (validateEmail() == true) {
                    Intent intent = new Intent(getBaseContext(), SettingActivity.class);
                    startActivity(intent);
                    finish();
                }

            }
        });
    }


        private boolean validateEmail () {//لفحص الايميل
            String emailInput = binding.edEmail.getText().toString().trim();

            if (emailInput.isEmpty()) {// اذا تركنا الايميل فارغ
                binding.edEmail.setError("Field can't be empty");
                return false;
            } else if (!Patterns.EMAIL_ADDRESS.matcher(emailInput).matches()) {//لا يحتوى مكونات الايميل
                binding.edEmail.setError("Please enter a valid email address");
                return false;
            } else {
                binding.edEmail.setError(null);
                return true;
            }
        }




}
