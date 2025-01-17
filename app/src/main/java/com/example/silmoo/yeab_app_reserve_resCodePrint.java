package com.example.silmoo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class yeab_app_reserve_resCodePrint extends AppCompatActivity {

    // 처음부터 끝까지 '민예인' 작성

    /*변수 선언*/
    Intent intent;
    Button btn_quit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yeab_app_reserve_res_code_print);

        /*yeab_app_reserve_person에서 무슨 시간대를 전달했는지 모르니까 다 전달받음*/
        intent = getIntent();
        String rt_time_A = intent.getStringExtra("code_rt_time_A");
        /*코드를 사용해 'A' 값을 전달받고 그 값을 String rt_time_A에 저장*/
        TextView t_resCodeTimeA = findViewById(R.id.t_resCodeTimeA);
        t_resCodeTimeA.setText(rt_time_A);
        /*A타임이 출력될 텍스트뷰 자리 t_resCodeTimeA에 'A' 값을 저장한 rt_time_A을 출력*/

        intent = getIntent();
        String rt_time_B = intent.getStringExtra("code_rt_time_B");
        TextView t_resCodeTimeB = findViewById(R.id.t_resCodeTimeB);
        t_resCodeTimeB.setText(rt_time_B);

        intent = getIntent();
        String rt_time_C = intent.getStringExtra("code_rt_time_C");
        TextView t_resCodeTimeC = findViewById(R.id.t_resCodeTimeC);
        t_resCodeTimeC.setText(rt_time_C);

        intent = getIntent();
        String rt_time_D = intent.getStringExtra("code_rt_time_D");
        TextView t_resCodeTimeD = findViewById(R.id.t_resCodeTimeD);
        t_resCodeTimeD.setText(rt_time_D);

        /*yeab_app_reserve_person에서 인원수 몇 명을 선택했는지 모르니까 다 전달받음*/
        intent = getIntent();
        String rs_person1 = intent.getStringExtra("code_person1");
        /*코드를 사용해 '1' 값을 전달받고 그 값을 String rs_person1에 저장*/
        TextView t_resPerson1 = findViewById(R.id.t_resPerson1);
        t_resPerson1.setText(rs_person1);
        /*1명이 출력될 텍스트뷰 자리 t_resPerson1에 '1' 값을 저장한 rs_person1을 출력*/

        intent = getIntent();
        String rs_person2 = intent.getStringExtra("code_person2");
        TextView t_resPerson2 = findViewById(R.id.t_resPerson2);
        t_resPerson2.setText(rs_person2);

        intent = getIntent();
        String rs_person3 = intent.getStringExtra("code_person3");
        TextView t_resPerson3 = findViewById(R.id.t_resPerson3);
        t_resPerson3.setText(rs_person3);

        /*yeab_app_reserve_seat1에서 어디 좌석을 선택했는지 모르니까 다 전달받음*/
        intent = getIntent();
        String seat_page1_1 = intent.getStringExtra("code_seat_page1_1");
        /*코드를 사용해 '1' 값을 전달받고 그 값을 String seat_page1_1에 저장*/
        TextView t_printSeat_page1_1 = findViewById(R.id.t_printSeat_page1_1);
        t_printSeat_page1_1.setText(seat_page1_1);
        /*1이 출력될 텍스트뷰 자리 t_printSeat_page1_1에 '1' 값을 저장한 seat_page1_1을 출력*/

        intent = getIntent();
        String seat_page1_2 = intent.getStringExtra("code_seat_page1_2");
        TextView t_printSeat_page1_2 = findViewById(R.id.t_printSeat_page1_2);
        t_printSeat_page1_2.setText(seat_page1_2);

        intent = getIntent();
        String seat_page1_3 = intent.getStringExtra("code_seat_page1_3");
        TextView t_printSeat_page1_3 = findViewById(R.id.t_printSeat_page1_3);
        t_printSeat_page1_3.setText(seat_page1_3);

        intent = getIntent();
        String seat_page1_4 = intent.getStringExtra("code_seat_page1_4");
        TextView t_printSeat_page1_4 = findViewById(R.id.t_printSeat_page1_4);
        t_printSeat_page1_4.setText(seat_page1_4);

        intent = getIntent();
        String seat_page1_26 = intent.getStringExtra("code_seat_page1_26");
        TextView t_printSeat_page1_26 = findViewById(R.id.t_printSeat_page1_26);
        t_printSeat_page1_26.setText(seat_page1_26);

        intent = getIntent();
        String seat_page1_46 = intent.getStringExtra("code_seat_page1_46");
        TextView t_printSeat_page1_46 = findViewById(R.id.t_printSeat_page1_46);
        t_printSeat_page1_46.setText(seat_page1_46);

        intent = getIntent();
        String seat_page1_66 = intent.getStringExtra("code_seat_page1_66");
        TextView t_printSeat_page1_66 = findViewById(R.id.t_printSeat_page1_66);
        t_printSeat_page1_66.setText(seat_page1_66);

        intent = getIntent();
        String seat_page1_86 = intent.getStringExtra("code_seat_page1_86");
        TextView t_printSeat_page1_86 = findViewById(R.id.t_printSeat_page1_86);
        t_printSeat_page1_86.setText(seat_page1_86);

        intent = getIntent();
        String seat_page1_15 = intent.getStringExtra("code_seat_page1_15");
        TextView t_printSeat_page1_15 = findViewById(R.id.t_printSeat_page1_15);
        t_printSeat_page1_15.setText(seat_page1_15);

        intent = getIntent();
        String seat_page1_35 = intent.getStringExtra("code_seat_page1_35");
        TextView t_printSeat_page1_35 = findViewById(R.id.t_printSeat_page1_35);
        t_printSeat_page1_35.setText(seat_page1_35);

        intent = getIntent();
        String seat_page1_55 = intent.getStringExtra("code_seat_page1_55");
        TextView t_printSeat_page1_55 = findViewById(R.id.t_printSeat_page1_55);
        t_printSeat_page1_55.setText(seat_page1_55);

        intent = getIntent();
        String seat_page1_75 = intent.getStringExtra("code_seat_page1_75");
        TextView t_printSeat_page1_75 = findViewById(R.id.t_printSeat_page1_75);
        t_printSeat_page1_75.setText(seat_page1_75);

        intent = getIntent();
        String seat_page1_24 = intent.getStringExtra("code_seat_page1_24");
        TextView t_printSeat_page1_24 = findViewById(R.id.t_printSeat_page1_24);
        t_printSeat_page1_24.setText(seat_page1_24);

        intent = getIntent();
        String seat_page1_44 = intent.getStringExtra("code_seat_page1_44");
        TextView t_printSeat_page1_44 = findViewById(R.id.t_printSeat_page1_44);
        t_printSeat_page1_44.setText(seat_page1_44);

        intent = getIntent();
        String seat_page1_64 = intent.getStringExtra("code_seat_page1_64");
        TextView t_printSeat_page1_64 = findViewById(R.id.t_printSeat_page1_64);
        t_printSeat_page1_64.setText(seat_page1_64);

        intent = getIntent();
        String seat_page1_84 = intent.getStringExtra("code_seat_page1_84");
        TextView t_printSeat_page1_84 = findViewById(R.id.t_printSeat_page1_84);
        t_printSeat_page1_84.setText(seat_page1_84);

        intent = getIntent();
        String seat_page1_13 = intent.getStringExtra("code_seat_page1_13");
        TextView t_printSeat_page1_13 = findViewById(R.id.t_printSeat_page1_13);
        t_printSeat_page1_13.setText(seat_page1_13);

        intent = getIntent();
        String seat_page1_33 = intent.getStringExtra("code_seat_page1_33");
        TextView t_printSeat_page1_33 = findViewById(R.id.t_printSeat_page1_33);
        t_printSeat_page1_33.setText(seat_page1_33);

        intent = getIntent();
        String seat_page1_53 = intent.getStringExtra("code_seat_page1_53");
        TextView t_printSeat_page1_53 = findViewById(R.id.t_printSeat_page1_53);
        t_printSeat_page1_53.setText(seat_page1_53);

        intent = getIntent();
        String seat_page1_73 = intent.getStringExtra("code_seat_page1_73");
        TextView t_printSeat_page1_73 = findViewById(R.id.t_printSeat_page1_73);
        t_printSeat_page1_73.setText(seat_page1_73);

        intent = getIntent();
        String seat22 = intent.getStringExtra("code_seat_page1_22");
        TextView t_printSeat_page1_22 = findViewById(R.id.t_printSeat_page1_22);
        t_printSeat_page1_22.setText(seat22);

        intent = getIntent();
        String seat_page1_42 = intent.getStringExtra("code_seat_page1_42");
        TextView t_printSeat_page1_42 = findViewById(R.id.t_printSeat_page1_42);
        t_printSeat_page1_42.setText(seat_page1_42);

        intent = getIntent();
        String seat_page1_62 = intent.getStringExtra("code_seat_page1_62");
        TextView t_printSeat_page1_62 = findViewById(R.id.t_printSeat_page1_62);
        t_printSeat_page1_62.setText(seat_page1_62);

        intent = getIntent();
        String seat_page1_82 = intent.getStringExtra("code_seat_page1_82");
        TextView t_printSeat_page1_82 = findViewById(R.id.t_printSeat_page1_82);
        t_printSeat_page1_82.setText(seat_page1_82);

        intent = getIntent();
        String seat_page1_11 = intent.getStringExtra("code_seat_page1_11");
        TextView t_printSeat_page1_11 = findViewById(R.id.t_printSeat_page1_11);
        t_printSeat_page1_11.setText(seat_page1_11);

        intent = getIntent();
        String seat_page1_31 = intent.getStringExtra("code_seat_page1_31");
        TextView t_printSeat_page1_31 = findViewById(R.id.t_printSeat_page1_31);
        t_printSeat_page1_31.setText(seat_page1_31);

        intent = getIntent();
        String seat_page1_51 = intent.getStringExtra("code_seat_page1_51");
        TextView t_printSeat_page1_51 = findViewById(R.id.t_printSeat_page1_51);
        t_printSeat_page1_51.setText(seat_page1_51);

        intent = getIntent();
        String seat_page1_71 = intent.getStringExtra("code_seat_page1_71");
        TextView t_printSeat_page1_71 = findViewById(R.id.t_printSeat_page1_71);
        t_printSeat_page1_71.setText(seat_page1_71);

        /*yeab_app_reserve_seat2에서 어디 좌석을 선택했는지 모르니까 다 전달받음*/
        intent = getIntent();
        String seat_page2_1 = intent.getStringExtra("code_seat_page2_1");
        /*코드를 사용해 '1' 값을 전달받고 그 값을 String seat_page2_1에 저장*/
        TextView t_printSeat_page2_1 = findViewById(R.id.t_printSeat_page2_1);
        t_printSeat_page2_1.setText(seat_page2_1);
        /*1이 출력될 텍스트뷰 자리 t_printSeat_page2_1에 '1' 값을 저장한 seat_page2_1을 출력*/

        intent = getIntent();
        String seat_page2_2 = intent.getStringExtra("code_seat_page2_2");
        TextView t_printSeat_page2_2 = findViewById(R.id.t_printSeat_page2_2);
        t_printSeat_page2_2.setText(seat_page2_2);

        intent = getIntent();
        String seat_page2_3 = intent.getStringExtra("code_seat_page2_3");
        TextView t_printSeat_page2_3 = findViewById(R.id.t_printSeat_page2_3);
        t_printSeat_page2_3.setText(seat_page2_3);

        intent = getIntent();
        String seat_page2_4 = intent.getStringExtra("code_seat_page2_4");
        TextView t_printSeat_page2_4 = findViewById(R.id.t_printSeat_page2_4);
        t_printSeat_page2_4.setText(seat_page2_4);

        intent = getIntent();
        String seat_page2_26 = intent.getStringExtra("code_seat_page2_26");
        TextView t_printSeat_page2_26 = findViewById(R.id.t_printSeat_page2_26);
        t_printSeat_page2_26.setText(seat_page2_26);

        intent = getIntent();
        String seat_page2_46 = intent.getStringExtra("code_seat_page2_46");
        TextView t_printSeat_page2_46 = findViewById(R.id.t_printSeat_page2_46);
        t_printSeat_page2_46.setText(seat_page2_46);

        intent = getIntent();
        String seat_page2_66 = intent.getStringExtra("code_seat_page2_66");
        TextView t_printSeat_page2_66 = findViewById(R.id.t_printSeat_page2_66);
        t_printSeat_page2_66.setText(seat_page2_66);

        intent = getIntent();
        String seat_page2_86 = intent.getStringExtra("code_seat_page2_86");
        TextView t_printSeat_page2_86 = findViewById(R.id.t_printSeat_page2_86);
        t_printSeat_page2_86.setText(seat_page2_86);

        intent = getIntent();
        String seat_page2_15 = intent.getStringExtra("code_seat_page2_15");
        TextView t_printSeat_page2_15 = findViewById(R.id.t_printSeat_page2_15);
        t_printSeat_page2_15.setText(seat_page2_15);

        intent = getIntent();
        String seat_page2_35 = intent.getStringExtra("code_seat_page2_35");
        TextView t_printSeat_page2_35 = findViewById(R.id.t_printSeat_page2_35);
        t_printSeat_page2_35.setText(seat_page2_35);

        intent = getIntent();
        String seat_page2_55 = intent.getStringExtra("code_seat_page2_55");
        TextView t_printSeat_page2_55 = findViewById(R.id.t_printSeat_page2_55);
        t_printSeat_page2_55.setText(seat_page2_55);

        intent = getIntent();
        String seat_page2_75 = intent.getStringExtra("code_seat_page2_75");
        TextView t_printSeat_page2_75 = findViewById(R.id.t_printSeat_page2_75);
        t_printSeat_page2_75.setText(seat_page2_75);

        intent = getIntent();
        String seat_page2_24 = intent.getStringExtra("code_seat_page2_24");
        TextView t_printSeat_page2_24 = findViewById(R.id.t_printSeat_page2_24);
        t_printSeat_page2_24.setText(seat_page2_24);

        intent = getIntent();
        String seat_page2_44 = intent.getStringExtra("code_seat_page2_44");
        TextView t_printSeat_page2_44 = findViewById(R.id.t_printSeat_page2_44);
        t_printSeat_page2_44.setText(seat_page2_44);

        intent = getIntent();
        String seat_page2_64 = intent.getStringExtra("code_seat_page2_64");
        TextView t_printSeat_page2_64 = findViewById(R.id.t_printSeat_page2_64);
        t_printSeat_page2_64.setText(seat_page2_64);

        intent = getIntent();
        String seat_page2_84 = intent.getStringExtra("code_seat_page2_84");
        TextView t_printSeat_page2_84 = findViewById(R.id.t_printSeat_page2_84);
        t_printSeat_page2_84.setText(seat_page2_84);

        intent = getIntent();
        String seat_page2_13 = intent.getStringExtra("code_seat_page2_13");
        TextView t_printSeat_page2_13 = findViewById(R.id.t_printSeat_page2_13);
        t_printSeat_page2_13.setText(seat_page2_13);

        intent = getIntent();
        String seat_page2_33 = intent.getStringExtra("code_seat_page2_33");
        TextView t_printSeat_page2_33 = findViewById(R.id.t_printSeat_page2_33);
        t_printSeat_page2_33.setText(seat_page2_33);

        intent = getIntent();
        String seat_page2_53 = intent.getStringExtra("code_seat_page2_53");
        TextView t_printSeat_page2_53 = findViewById(R.id.t_printSeat_page2_53);
        t_printSeat_page2_53.setText(seat_page2_53);

        intent = getIntent();
        String seat_page2_73 = intent.getStringExtra("code_seat_page2_73");
        TextView t_printSeat_page2_73 = findViewById(R.id.t_printSeat_page2_73);
        t_printSeat_page2_73.setText(seat_page2_73);

        intent = getIntent();
        String seat_page2_22 = intent.getStringExtra("code_seat_page2_22");
        TextView t_printSeat_page2_22 = findViewById(R.id.t_printSeat_page2_22);
        t_printSeat_page2_22.setText(seat_page2_22);

        intent = getIntent();
        String seat_page2_42 = intent.getStringExtra("code_seat_page2_42");
        TextView t_printSeat_page2_42 = findViewById(R.id.t_printSeat_page2_42);
        t_printSeat_page2_42.setText(seat_page2_42);

        intent = getIntent();
        String seat_page2_62 = intent.getStringExtra("code_seat_page2_62");
        TextView t_printSeat_page2_62 = findViewById(R.id.t_printSeat_page2_62);
        t_printSeat_page2_62.setText(seat_page2_62);

        intent = getIntent();
        String seat_page2_82 = intent.getStringExtra("code_seat_page2_82");
        TextView t_printSeat_page2_82 = findViewById(R.id.t_printSeat_page2_82);
        t_printSeat_page2_82.setText(seat_page2_82);

        intent = getIntent();
        String seat_page2_11 = intent.getStringExtra("code_seat_page2_11");
        TextView t_printSeat_page2_11 = findViewById(R.id.t_printSeat_page2_11);
        t_printSeat_page2_11.setText(seat_page2_11);

        intent = getIntent();
        String seat_page2_31 = intent.getStringExtra("code_seat_page2_31");
        TextView t_printSeat_page2_31 = findViewById(R.id.t_printSeat_page2_31);
        t_printSeat_page2_31.setText(seat_page2_31);

        intent = getIntent();
        String seat_page2_51 = intent.getStringExtra("code_seat_page2_51");
        TextView t_printSeat_page2_51 = findViewById(R.id.t_printSeat_page2_51);
        t_printSeat_page2_51.setText(seat_page2_51);

        intent = getIntent();
        String seat_page2_71 = intent.getStringExtra("code_seat_page2_71");
        TextView t_printSeat_page2_71 = findViewById(R.id.t_printSeat_page2_71);
        t_printSeat_page2_71.setText(seat_page2_71);

        /*yeab_app_reserve_seat3에서 어디 좌석을 선택했는지 모르니까 다 전달받음*/
        intent = getIntent();
        String seat_page3_1 = intent.getStringExtra("code_seat_page3_1");
        /*코드를 사용해 '1' 값을 전달받고 그 값을 String seat_page3_1에 저장*/
        TextView t_printSeat_page3_1 = findViewById(R.id.t_printSeat_page3_1);
        t_printSeat_page3_1.setText(seat_page3_1);
        /*1이 출력될 텍스트뷰 자리 t_printSeat_page3_1에 '1' 값을 저장한 seat_page3_1을 출력*/

        intent = getIntent();
        String seat_page3_2 = intent.getStringExtra("code_seat_page3_2");
        TextView t_printSeat_page3_2 = findViewById(R.id.t_printSeat_page3_2);
        t_printSeat_page3_2.setText(seat_page3_2);

        intent = getIntent();
        String seat_page3_3 = intent.getStringExtra("code_seat_page3_3");
        TextView t_printSeat_page3_3 = findViewById(R.id.t_printSeat_page3_3);
        t_printSeat_page3_3.setText(seat_page3_3);

        intent = getIntent();
        String seat_page3_4 = intent.getStringExtra("code_seat_page3_4");
        TextView t_printSeat_page3_4 = findViewById(R.id.t_printSeat_page3_4);
        t_printSeat_page3_4.setText(seat_page3_4);

        intent = getIntent();
        String seat_page3_26 = intent.getStringExtra("code_seat_page3_26");
        TextView t_printSeat_page3_26 = findViewById(R.id.t_printSeat_page3_26);
        t_printSeat_page3_26.setText(seat_page3_26);

        intent = getIntent();
        String seat_page3_46 = intent.getStringExtra("code_seat_page3_46");
        TextView t_printSeat_page3_46 = findViewById(R.id.t_printSeat_page3_46);
        t_printSeat_page3_46.setText(seat_page3_46);

        intent = getIntent();
        String seat_page3_66 = intent.getStringExtra("code_seat_page3_66");
        TextView t_printSeat_page3_66 = findViewById(R.id.t_printSeat_page3_66);
        t_printSeat_page3_66.setText(seat_page3_66);

        intent = getIntent();
        String seat_page3_86 = intent.getStringExtra("code_seat_page3_86");
        TextView t_printSeat_page3_86 = findViewById(R.id.t_printSeat_page3_86);
        t_printSeat_page3_86.setText(seat_page3_86);

        intent = getIntent();
        String seat_page3_15 = intent.getStringExtra("code_seat_page3_15");
        TextView t_printSeat_page3_15 = findViewById(R.id.t_printSeat_page3_15);
        t_printSeat_page3_15.setText(seat_page3_15);

        intent = getIntent();
        String seat_page3_35 = intent.getStringExtra("code_seat_page3_35");
        TextView t_printSeat_page3_35 = findViewById(R.id.t_printSeat_page3_35);
        t_printSeat_page3_35.setText(seat_page3_35);

        intent = getIntent();
        String seat_page3_55 = intent.getStringExtra("code_seat_page3_55");
        TextView t_printSeat_page3_55 = findViewById(R.id.t_printSeat_page3_55);
        t_printSeat_page3_55.setText(seat_page3_55);

        intent = getIntent();
        String seat_page3_75 = intent.getStringExtra("code_seat_page3_75");
        TextView t_printSeat_page3_75 = findViewById(R.id.t_printSeat_page3_75);
        t_printSeat_page3_75.setText(seat_page3_75);

        intent = getIntent();
        String seat_page3_24 = intent.getStringExtra("code_seat_page3_24");
        TextView t_printSeat_page3_24 = findViewById(R.id.t_printSeat_page3_24);
        t_printSeat_page3_24.setText(seat_page3_24);

        intent = getIntent();
        String seat_page3_44 = intent.getStringExtra("code_seat_page3_44");
        TextView t_printSeat_page3_44 = findViewById(R.id.t_printSeat_page3_44);
        t_printSeat_page3_44.setText(seat_page3_44);

        intent = getIntent();
        String seat_page3_64 = intent.getStringExtra("code_seat_page3_64");
        TextView t_printSeat_page3_64 = findViewById(R.id.t_printSeat_page3_64);
        t_printSeat_page3_64.setText(seat_page3_64);

        intent = getIntent();
        String seat_page3_84 = intent.getStringExtra("code_seat_page3_84");
        TextView t_printSeat_page3_84 = findViewById(R.id.t_printSeat_page3_84);
        t_printSeat_page3_84.setText(seat_page3_84);

        intent = getIntent();
        String seat_page3_13 = intent.getStringExtra("code_seat_page3_13");
        TextView t_printSeat_page3_13 = findViewById(R.id.t_printSeat_page3_13);
        t_printSeat_page3_13.setText(seat_page3_13);

        intent = getIntent();
        String seat_page3_33 = intent.getStringExtra("code_seat_page3_33");
        TextView t_printSeat_page3_33 = findViewById(R.id.t_printSeat_page3_33);
        t_printSeat_page3_33.setText(seat_page3_33);

        intent = getIntent();
        String seat_page3_53 = intent.getStringExtra("code_seat_page3_53");
        TextView t_printSeat_page3_53 = findViewById(R.id.t_printSeat_page3_53);
        t_printSeat_page3_53.setText(seat_page3_53);

        intent = getIntent();
        String seat_page3_73 = intent.getStringExtra("code_seat_page3_73");
        TextView t_printSeat_page3_73 = findViewById(R.id.t_printSeat_page3_73);
        t_printSeat_page3_73.setText(seat_page3_73);

        intent = getIntent();
        String seat_page3_22 = intent.getStringExtra("code_seat_page3_22");
        TextView t_printSeat_page3_22 = findViewById(R.id.t_printSeat_page3_22);
        t_printSeat_page3_22.setText(seat_page3_22);

        intent = getIntent();
        String seat_page3_42 = intent.getStringExtra("code_seat_page3_42");
        TextView t_printSeat_page3_42 = findViewById(R.id.t_printSeat_page3_42);
        t_printSeat_page3_42.setText(seat_page3_42);

        intent = getIntent();
        String seat_page3_62 = intent.getStringExtra("code_seat_page3_62");
        TextView t_printSeat_page3_62 = findViewById(R.id.t_printSeat_page3_62);
        t_printSeat_page3_62.setText(seat_page3_62);

        intent = getIntent();
        String seat_page3_82 = intent.getStringExtra("code_seat_page3_82");
        TextView t_printSeat_page3_82 = findViewById(R.id.t_printSeat_page3_82);
        t_printSeat_page3_82.setText(seat_page3_82);

        intent = getIntent();
        String seat_page3_11 = intent.getStringExtra("code_seat_page3_11");
        TextView t_printSeat_page3_11 = findViewById(R.id.t_printSeat_page3_11);
        t_printSeat_page3_11.setText(seat_page3_11);

        intent = getIntent();
        String seat_page3_31 = intent.getStringExtra("code_seat_page3_31");
        TextView t_printSeat_page3_31 = findViewById(R.id.t_printSeat_page3_31);
        t_printSeat_page3_31.setText(seat_page3_31);

        intent = getIntent();
        String seat_page3_51 = intent.getStringExtra("code_seat_page3_51");
        TextView t_printSeat_page3_51 = findViewById(R.id.t_printSeat_page3_51);
        t_printSeat_page3_51.setText(seat_page3_51);

        intent = getIntent();
        String seat_page3_71 = intent.getStringExtra("code_seat_page3_71");
        TextView t_printSeat_page3_71 = findViewById(R.id.t_printSeat_page3_71);
        t_printSeat_page3_71.setText(seat_page3_71);

        /*종료 버튼(누르면 yeab_app_main_01로 넘어감)*/
        btn_quit = findViewById(R.id.btn_quit);
        btn_quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                Intent intent = new Intent(yeab_app_reserve_resCodePrint.this, yeab_app_main_01.class);
                startActivity(intent);
            }
        });

    }
}