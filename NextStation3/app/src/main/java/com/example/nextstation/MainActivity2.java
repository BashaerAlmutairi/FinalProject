package com.example.nextstation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    private ArrayList<Ar> ArAr;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
//        Bundle bundle = getIntent().getExtras();
//        if (bundle != null) ;
//        {
//            if (bundle.getString("some") != null) ;
//            {
//                Toast.makeText(getApplicationContext(), "data:" + bundle.getString("some"), Toast.LENGTH_SHORT);
//            }
//        }

        recyclerView = findViewById(R.id.RV1);
        ArAr = new ArrayList<>();
        setUserInfo();
        setAdapter();

    }

    private void setAdapter () {
        {
                ArAdapter adapter = new ArAdapter(ArAr);
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
                recyclerView.setLayoutManager(layoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());
                recyclerView.setAdapter(adapter);
            }
    }


    private void setUserInfo () {
        ArAr.add(new Ar("انا في الصف 12 هل يمكنني التقديم على جامعة في الخارج مع العلم انني لم انتهي من الفصل الدراسي الثاني ؟نعم تستطيع في كل التخصصات ما عدا الطبية"));
        ArAr.add(new Ar("هل يشترط دخول الجامعات في الولايات المتحدة الامريكية على حصول الطالب على التوفل؟نعم و لكن تستطيع جلب الايلتز بدلها"));
        ArAr.add(new Ar("هل حقا لا يمكن التقديم على التخصصات الطبية في الامارات بعد مرور سنة من الحصول شهادة الثانوية العامة؟نعم"));
        ArAr.add(new Ar("اقوى الجامعات في القاهرة؟عين شمس- الاسكندرية-القاهرة"));
        ArAr.add(new Ar("التمريض متوافر في اي دولة؟ايرلندا غالبا"));

    }


    }
