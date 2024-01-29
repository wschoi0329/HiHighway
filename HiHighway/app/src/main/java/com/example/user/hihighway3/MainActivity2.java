package com.example.user.hihighway3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity2
        extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

       /* Button button = (Button) findViewById(R.id.listView)
                button.setOnClickListener(new View.OnClickListener(){
                    public  void onClick (View v){
                        Intent intent = new Intent()
                    }
                });
        */

        String[] items = {"안성 국밥(경부 상행-안성 휴게소)", "도리뱅뱅 정식(경부 상행-금강 휴게소)", "병천 순대국밥(경부 상행-천안 휴게소)", "향천 우동(경부 하행-기흥 휴게소)", "빠금장 된장찌개(경부 하행-망향휴게소)", "약콩국수(경부 하행-추풍령휴게소)", "안성국밥(경부 하행-안성 휴게소)", "애호박 고추장찌개(남해 부산행-보성 휴게소)", "청매실 재첩비빔밥(남해 부산행-섬진강 휴게소)", "영양 굴국밥(남해 부산행-함안 휴게소)",
        "새싹 쌈 힐링 비빔밥(남해 부산행-사천 휴게소)", "비빔된장찌개(남해 영암행-문산 휴게소)", "섬진강재첩국(남해 영암행-사천 휴게소)", "해나루 쌀비빔밥(서해안 목포행-행담도 휴게소)", "한우국밥(서해안 목포행-홍성 휴게소)", "장어덮밥(서해안 목포행-고창 고인돌 휴게소)"
                , "수제돈까스(서해안 시흥행-화성 휴게소)", "함평 한우국밥(서해안 시흥행-함평 휴게소)", "덕평 소고기국밥(영동 강릉행-덕평 휴게소)", "한우국밥(영동 강릉행-문막 휴게소)",
                "한우 떡 더덕스테이크(영동 강릉행-횡성 휴게소)", "곤드레 열무 돌솥비빔밥(영동 강릉행-강릉 휴게소)","여주 쌀잔치국수(영동 인천-여주 휴게소)", "곤지암 소머리국밥(중부 상행-이천 휴게소)", "오리 묵은지 치즈가스(중부 상행-음성 휴게소)"
                , "제육김치찌개(중부 하행-음성 휴게소)", "인삼 영양 가마솥비빔밥(중부 하행-인삼랜드 휴게소)", "옥연가 연잎밥(중부 하행-함양 휴게소)", "엄나무 닭개장(중부 하행-오창 휴게소)", "영양 더덕 산채비빔밥(중부 하행-산청 휴게소)",
        "전주 남부식 콩나물국밥(호남 상행-여산 휴게소)", "복분자 연포탕(호남 상행-정읍 휴게소)", "애호박 찌개(호남 상행-백양사 휴게소)", "꼬막 돌솥비빔밥(호남 상행-주암 휴게소)",
        "복분자 연포탕(호남 하행-정읍 휴게소)", "묵은지 김치찌개(호남 하행-순천 휴게소)"};
        //food1~3 : 경부 상행 food4~7 : 경부 하행 food8~11 : 남해 부산행 food12~13 : 남해 영암행 food14~16 : 서해안 목포행 food17~18 : 서해안 시흥행
        //food19~22 : 영동 강릉행 food23 : 영동 인천 food24~25 : 중부 상행 food26~30 : 중부 하행 food31~34 : 호남 상행
        ListView listView;
        ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, items);
        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String item = String.valueOf(parent.getItemAtPosition(position));

                        Toast.makeText(MainActivity2.this, item, Toast.LENGTH_SHORT).show();


                        if (position == 0) {

                            Intent intent1 = new Intent(MainActivity2.this, class1.class);

                            startActivity(intent1);

                        }


                        if (position == 1) {


                            Intent intent2 = new Intent(MainActivity2.this, class2.class);

                            startActivity(intent2);

                        }

                        if (position == 2) {

                            Intent intent3 = new Intent(MainActivity2.this, class3.class);

                            startActivity(intent3);

                        }

                        if (position == 3) {

                            Intent intent4 = new Intent(MainActivity2.this, class4.class);

                            startActivity(intent4);

                        }

                        if (position == 4) {

                            Intent intent5 = new Intent(MainActivity2.this, class5.class);

                            startActivity(intent5);

                        }

                        if (position == 5) {

                            Intent intent6 = new Intent(MainActivity2.this, class6.class);

                            startActivity(intent6);

                        }

                        if (position == 6) {

                            Intent intent7 = new Intent(MainActivity2.this, class7.class);

                            startActivity(intent7);

                        }

                        if (position == 7) {

                            Intent intent8 = new Intent(MainActivity2.this, class8.class);

                            startActivity(intent8);

                        }

                        if (position == 8) {

                            Intent intent9 = new Intent(MainActivity2.this, class9.class);

                            startActivity(intent9);

                        }

                        if (position == 9) {

                            Intent intent10 = new Intent(MainActivity2.this, class10.class);

                            startActivity(intent10);

                        }

                        if (position == 10) {

                            Intent intent11 = new Intent(MainActivity2.this, class11.class);

                            startActivity(intent11);

                        }

                        if (position == 11) {

                            Intent intent12 = new Intent(MainActivity2.this, class12.class);

                            startActivity(intent12);

                        }

                        if (position == 12) {

                            Intent intent13 = new Intent(MainActivity2.this, class13.class);

                            startActivity(intent13);

                        }

                        if (position == 13) {

                            Intent intent14 = new Intent(MainActivity2.this, class14.class);

                            startActivity(intent14);

                        }

                        if (position == 14) {

                            Intent intent15 = new Intent(MainActivity2.this, class15.class);

                            startActivity(intent15);

                        }

                        if (position == 15) {

                            Intent intent16 = new Intent(MainActivity2.this, class16.class);

                            startActivity(intent16);

                        }

                        if (position == 16) {

                            Intent intent17 = new Intent(MainActivity2.this, class17.class);

                            startActivity(intent17);

                        }

                        if (position == 17) {

                            Intent intent18 = new Intent(MainActivity2.this, class18.class);

                            startActivity(intent18);

                        }

                        if (position == 18) {

                            Intent intent19 = new Intent(MainActivity2.this, class19.class);

                            startActivity(intent19);

                        }

                        if (position == 19) {

                            Intent intent20 = new Intent(MainActivity2.this, class20.class);

                            startActivity(intent20);

                        }

                        if (position == 20) {

                            Intent intent21 = new Intent(MainActivity2.this, class21.class);

                            startActivity(intent21);

                        }

                        if (position == 21) {

                            Intent intent22 = new Intent(MainActivity2.this, class22.class);

                            startActivity(intent22);

                        }

                        if (position == 22) {

                            Intent intent23 = new Intent(MainActivity2.this, class23.class);

                            startActivity(intent23);

                        }

                        if (position == 23) {

                            Intent intent24 = new Intent(MainActivity2.this, class24.class);

                            startActivity(intent24);

                        }

                        if (position == 24) {

                            Intent intent25 = new Intent(MainActivity2.this, class25.class);

                            startActivity(intent25);

                        }

                        if (position == 25) {

                            Intent intent26 = new Intent(MainActivity2.this, class26.class);

                            startActivity(intent26);

                        }

                        if (position == 26) {

                            Intent intent27 = new Intent(MainActivity2.this, class27.class);

                            startActivity(intent27);

                        }

                        if (position == 27) {

                            Intent intent28 = new Intent(MainActivity2.this, class28.class);

                            startActivity(intent28);

                        }

                        if (position == 28) {

                            Intent intent29 = new Intent(MainActivity2.this, class29.class);

                            startActivity(intent29);

                        }

                        if (position == 29) {

                            Intent intent30 = new Intent(MainActivity2.this, class30.class);

                            startActivity(intent30);

                        }

                        if (position == 30) {

                            Intent intent31 = new Intent(MainActivity2.this, class31.class);

                            startActivity(intent31);

                        }

                        if (position == 31) {

                            Intent intent32 = new Intent(MainActivity2.this, class32.class);

                            startActivity(intent32);

                        }

                        if (position == 32) {

                            Intent intent33 = new Intent(MainActivity2.this, class33.class);

                            startActivity(intent33);

                        }

                        if (position == 33) {

                            Intent intent34 = new Intent(MainActivity2.this, class34.class);

                            startActivity(intent34);

                        }

                        if (position == 34) {

                            Intent intent35 = new Intent(MainActivity2.this, class35.class);

                            startActivity(intent35);

                        }


                        if (position == 35) {

                            Intent intent36 = new Intent(MainActivity2.this, class36.class);

                            startActivity(intent36);

                        }



                    }
                }
        );


    }


}




