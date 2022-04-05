package com.example.nextstation;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.nextstation.ui.AutoReply.AutoReplyFragment;
import com.example.nextstation.ui.Files.FilesFragment;
import com.example.nextstation.ui.home.HomeFragment;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.example.nextstation.databinding.ActivityWorkingBinding;

import java.util.ArrayList;

public class WorkingActivity extends AppCompatActivity {


    private AppBarConfiguration mAppBarConfiguration;
    private ActivityWorkingBinding binding;
    TextView hyperlink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


//
//        Button ukbottun = findViewById(R.id.ukbtn);
//        ukbottun.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(WorkingActivity.this, "test", Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(WorkingActivity.this, UKActivity.class);
//               startActivity(intent);
//
//            }
//        });


        binding = ActivityWorkingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarWorking.toolbar);
        binding.appBarWorking.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Need Help?You can call us by this number(123456789)", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_files, R.id.nav_AutoReply, R.id.nav_Usage)
                .setOpenableLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_working);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

         Button morebottun =findViewById(R.id.morebtn);
        Button ukbottun = findViewById(R.id.ukbtn);
        Button usabottun= (Button) findViewById(R.id.usabtn);
        ukbottun.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WorkingActivity.this, Uk.class);
                startActivity(intent);

            }
        });
        usabottun.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent9 = new Intent(WorkingActivity.this, USAActivity.class);
                startActivity(intent9);

            }


        });
//        Button btn11 =findViewById(R.id.call_fragment);
//        btn11.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick ( View view) {
//                Intent intent111 = new Intent(,MainActivity2.class);
//                intent111.putExtra("some", "some data");
//                startActivity(intent111);
//
//            }
//        });
        morebottun.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent0 = new Intent(WorkingActivity.this,MoreCountries.class);
                startActivity(intent0);

            }

        });
        MenuItem FilesItem = navigationView.getMenu().findItem(R.id.nav_files);
        FilesItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick ( MenuItem menuItem ) {
//                Intent intent00= Intent (WorkingActivity.this,FilesFragment.class);
//                startActivity(intent00);

                return false;
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.working, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_working);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }


//
////
////    public class  WorkingActivity extends AppCompatActivity {
////        @Override
////        protected void onCreate(Bundle savedInstanceState) {
////            super.onCreate(savedInstanceState);
////            setContentView(R.layout.activity_working);
//


   }