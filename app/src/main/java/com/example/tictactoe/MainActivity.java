package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView i1,i2,i3,i4,i5,i6,i7,i8,i9;
    int check = 0 ;
    int r1,r2,r3,r4,r5,r6,r7,r8,r9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        i1=findViewById(R.id.i1);
        i2=findViewById(R.id.i2);
        i3=findViewById(R.id.i3);
        i4=findViewById(R.id.i4);
        i5=findViewById(R.id.i5);
        i6=findViewById(R.id.i6);
        i7=findViewById(R.id.i7);
        i8=findViewById(R.id.i8);
        i9=findViewById(R.id.i9);


        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (r1 == 0) {
                    if (check % 2 == 0)
                        i1.setImageResource(R.drawable.circle);
                } else {
                    i1.setImageResource(R.drawable.cross);
                }
                check++;
                r1++;
            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (r2 == 0) {
                    if (check % 2 == 0)
                        i2.setImageResource(R.drawable.circle);
                } else {
                    i2.setImageResource(R.drawable.cross);
                }
                check++;
                r2++;
            }
        });
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (r3 == 0) {
                    if (check % 2 == 0)
                        i3.setImageResource(R.drawable.circle);
                } else {
                    i3.setImageResource(R.drawable.cross);
                }
                check++;
                r3++;
            }
        });
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (r4 == 0) {
                    if (check % 2 == 0)
                        i4.setImageResource(R.drawable.circle);
                } else {
                    i4.setImageResource(R.drawable.cross);
                }
                check++;
                r4++;
            }
        });
        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (r5 == 0) {
                    if (check % 2 == 0)
                        i5.setImageResource(R.drawable.circle);
                } else {
                    i5.setImageResource(R.drawable.cross);
                }
                check++;
                r5++;
            }
        });
        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (r6 == 0) {
                    if (check % 2 == 0)
                        i6.setImageResource(R.drawable.circle);
                } else {
                    i6.setImageResource(R.drawable.cross);
                }
                check++;
                r6++;
            }
        });
        i7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (r7 == 0) {
                    if (check % 2 == 0)
                        i7.setImageResource(R.drawable.circle);
                } else {
                    i7.setImageResource(R.drawable.cross);
                }
                check++;
                r7++;
            }
        });
        i8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (r8 == 0) {
                    if (check % 2 == 0)
                        i8.setImageResource(R.drawable.circle);
                } else {
                    i8.setImageResource(R.drawable.cross);
                }
                check++;
                r8++;
            }
        });
        i9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (r9 == 0) {
                    if (check % 2 == 0)
                        i9.setImageResource(R.drawable.circle);
                } else {
                    i9.setImageResource(R.drawable.cross);
                }
                check++;
                r9++;
            }
        });
    }
}