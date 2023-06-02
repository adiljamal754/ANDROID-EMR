package com.adiljamal.android_emr.ui.profile;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.adiljamal.android_emr.R;
import com.adiljamal.android_emr.databinding.FragmentPerformedBinding;
import com.adiljamal.android_emr.databinding.FragmentProfileBinding;

public class ProfileFragment extends Fragment {

    private FragmentProfileBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentProfileBinding.inflate(inflater, container, false);

        disableAll();

        //ID section buttons
        binding.editIDBtn.setOnClickListener( v -> {
            enableIdLayout(true);
        });

        binding.cancelIDBtn.setOnClickListener( v -> {
            enableIdLayout(false);
        });


        binding.saveIDBtn.setOnClickListener( v -> {
            //implementar a actualização
            Toast.makeText(getContext(), "Actualizado com sucesso", Toast.LENGTH_LONG).show();
            enableIdLayout(false);
        });


        //contact section
        binding.editContactBtn.setOnClickListener( v -> {
            enableContactLayout();
        });


         binding.editEmergencyBtn.setOnClickListener( v -> {
            enableEmergencyLayout();
        });
         binding.editInsuranceBtn.setOnClickListener( v -> {
            enableInsuranceLayout();
        });
         binding.editAditionalBtn.setOnClickListener( v -> {
            enableAdditionalLayout();
        });


        return binding.getRoot();
    }

private void disableAll(){
        //identificacao
        binding.nameET.setEnabled(false);
        binding.birthdayET.setEnabled(false);
        binding.genderET.setEnabled(false);
        binding.biET.setEnabled(false);

        binding.saveIDBtn.setVisibility(View.INVISIBLE);
        binding.saveIDBtn.setClickable(false);

        binding.cancelIDBtn.setVisibility(View.INVISIBLE);
        binding.cancelIDBtn.setClickable(false);

  //Contacto
        binding.addressET.setEnabled(false);
        binding.phoneET.setEnabled(false);
        binding.emailET.setEnabled(false);

        binding.saveContactBtn.setVisibility(View.INVISIBLE);
        binding.saveContactBtn.setClickable(false);

        binding.cancelContactBtn.setVisibility(View.INVISIBLE);
        binding.cancelContactBtn.setClickable(false);

  //Emergency
        binding.emergencyNameET.setEnabled(false);
        binding.emergencyNumberET.setEnabled(false);
        binding.relationET.setEnabled(false);

        binding.saveEmergencyBtn.setVisibility(View.INVISIBLE);
        binding.saveEmergencyBtn.setClickable(false);

        binding.cancelEmergencyBtn.setVisibility(View.INVISIBLE);
        binding.cancelEmergencyBtn.setClickable(false);

  //insurance
        binding.insuraceNameET.setEnabled(false);
        binding.policyNumberET.setEnabled(false);
        binding.insuraceEmailET.setEnabled(false);

        binding.saveInsuranceBtn.setVisibility(View.INVISIBLE);
        binding.saveInsuranceBtn.setClickable(false);

        binding.cancelInsuranceBtn.setVisibility(View.INVISIBLE);
        binding.cancelInsuranceBtn.setClickable(false);

//additional info
        binding.nationalityT.setEnabled(false);
        binding.maritalStatusET.setEnabled(false);
        binding.professionET.setEnabled(false);
        binding.bloodGroupET.setEnabled(false);

        binding.saveAditionalBtn.setVisibility(View.INVISIBLE);
        binding.saveAditionalBtn.setClickable(false);

        binding.cancelAditionalBtn.setVisibility(View.INVISIBLE);
        binding.cancelAditionalBtn.setClickable(false);


}

//testar essa fi
private void enableIdLayout(boolean enable){
    binding.nameET.setEnabled(enable);
    binding.birthdayET.setEnabled(enable);
    binding.genderET.setEnabled(enable);
    binding.biET.setEnabled(enable);

    if(enable){
        binding.saveIDBtn.setVisibility(View.VISIBLE);
        binding.saveIDBtn.setClickable(enable);

        binding.cancelIDBtn.setVisibility(View.VISIBLE);
        binding.cancelIDBtn.setClickable(enable);

        binding.editIDBtn.setVisibility(View.INVISIBLE);
        binding.editIDBtn.setClickable(!enable);
    } else {
        binding.saveIDBtn.setVisibility(View.INVISIBLE);
        binding.saveIDBtn.setClickable(!enable);

        binding.cancelIDBtn.setVisibility(View.INVISIBLE);
        binding.cancelIDBtn.setClickable(!enable);

        binding.editIDBtn.setVisibility(View.VISIBLE);
        binding.editIDBtn.setClickable(!enable);
    }


}

    private void enableContactLayout(){
        binding.addressET.setEnabled(true);
        binding.phoneET.setEnabled(true);
        binding.emailET.setEnabled(true);

        binding.saveContactBtn.setVisibility(View.VISIBLE);
        binding.saveContactBtn.setClickable(true);

        binding.cancelContactBtn.setVisibility(View.VISIBLE);
        binding.cancelContactBtn.setClickable(true);

        binding.editContactBtn.setVisibility(View.INVISIBLE);
        binding.editContactBtn.setClickable(false);

    }
    private void enableEmergencyLayout(){
        binding.emergencyNameET.setEnabled(true);
        binding.emergencyNumberET.setEnabled(true);
        binding.relationET.setEnabled(true);

        binding.saveEmergencyBtn.setVisibility(View.VISIBLE);
        binding.saveEmergencyBtn.setClickable(true);

        binding.cancelEmergencyBtn.setVisibility(View.VISIBLE);
        binding.cancelEmergencyBtn.setClickable(true);

        binding.cancelEmergencyBtn.setVisibility(View.INVISIBLE);
        binding.cancelEmergencyBtn.setClickable(false);
    }
    private void enableInsuranceLayout(){
        binding.insuraceNameET.setEnabled(true);
        binding.policyNumberET.setEnabled(true);
        binding.insuraceEmailET.setEnabled(true);

        binding.saveInsuranceBtn.setVisibility(View.VISIBLE);
        binding.saveInsuranceBtn.setClickable(true);

        binding.cancelInsuranceBtn.setVisibility(View.VISIBLE);
        binding.cancelInsuranceBtn.setClickable(true);

        binding.editInsuranceBtn.setVisibility(View.INVISIBLE);
        binding.editInsuranceBtn.setClickable(false);
    }
    private void enableAdditionalLayout(){
        binding.nationalityT.setEnabled(true);
        binding.maritalStatusET.setEnabled(true);
        binding.professionET.setEnabled(true);
        binding.bloodGroupET.setEnabled(true);

        binding.saveAditionalBtn.setVisibility(View.VISIBLE);
        binding.saveAditionalBtn.setClickable(true);

        binding.cancelAditionalBtn.setVisibility(View.VISIBLE);
        binding.cancelAditionalBtn.setClickable(true);

        binding.cancelAditionalBtn.setVisibility(View.INVISIBLE);
        binding.cancelAditionalBtn.setClickable(false);
    }


}