package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    final int[] action = {0};

    /*1 for plus
      2 for minus
      3 for multiply
      4 for divide
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button one=findViewById(R.id.one);
        Button two=findViewById(R.id.two);
        Button three=findViewById(R.id.three);
        Button four=findViewById(R.id.four);
        Button five=findViewById(R.id.five);
        Button six=findViewById(R.id.six);
        Button seven=findViewById(R.id.seven);
        Button eight=findViewById(R.id.eight);
        Button nine=findViewById(R.id.nine);
        Button zero=findViewById(R.id.zero);
        Button plus=findViewById(R.id.plus);
        Button eq=findViewById(R.id.equal);
        Button clean=findViewById(R.id.clear);
        Button cc=findViewById(R.id.c);
        Button minus=findViewById(R.id.minus);
        Button mult=findViewById(R.id.mul);
        Button div=findViewById(R.id.div);
        TextView buf=findViewById(R.id.buf);

        String ch="|";
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView t=findViewById(R.id.main);
                if(t.getText().toString().equals(ch)){
                    t.setText("1");}
                else
                {
                    String buffer=t.getText().toString()+"1";
                    t.setText(buffer);
                }

            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView t=findViewById(R.id.main);
                if(t.getText().toString().equals(ch)){
                    t.setText("2");}
                else
                {
                    String buffer=t.getText().toString()+"2";
                    t.setText(buffer);
                }

            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView t=findViewById(R.id.main);
                if(t.getText().toString().equals(ch)){
                    t.setText("3");}
                else
                {
                    String buffer=t.getText().toString()+"3";
                    t.setText(buffer);
                }
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView t=findViewById(R.id.main);
                if(t.getText().toString().equals(ch)){
                    t.setText("4");}
                else
                {
                    String buffer=t.getText().toString()+"4";
                    t.setText(buffer);
                }
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView t=findViewById(R.id.main);
                if(t.getText().toString().equals(ch)){
                    t.setText("5");}
                else
                {
                    String buffer=t.getText().toString()+"5";
                    t.setText(buffer);
                }

            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView t=findViewById(R.id.main);
                if(t.getText().toString().equals(ch)){
                    t.setText("6");}
                else
                {
                    String buffer=t.getText().toString()+"6";
                    t.setText(buffer);
                }

            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView t=findViewById(R.id.main);
                if(t.getText().toString().equals(ch)){
                    t.setText("7");}
                else
                {
                    String buffer=t.getText().toString()+"7";
                    t.setText(buffer);
                }

            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView t=findViewById(R.id.main);
                if(t.getText().toString().equals(ch)){
                    t.setText("8");}
                else
                {
                    String buffer=t.getText().toString()+"8";
                    t.setText(buffer);
                }

            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView t=findViewById(R.id.main);
                if(t.getText().toString().equals(ch)){
                    t.setText("9");}
                else
                {
                    String buffer=t.getText().toString()+"9";
                    t.setText(buffer);
                }

            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView t=findViewById(R.id.main);
                if(t.getText().toString().equals(ch)){
                    t.setText("0");}
                else
                {
                    String buffer=t.getText().toString()+"0";
                    t.setText(buffer);
                }

            }
        });

        final int[] a = new int[2];
        a[1]=-1;
        final int[] flag = {0};

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    action[0] = 1;
                    TextView t = findViewById(R.id.main);
                    if (a[1] == -1) {
                        a[0] = Integer.parseInt(t.getText().toString());
                        a[1] = 200;
                        t.setText("|");
                    } else {
                        if (flag[0] == 1) {
                            t.setText("|");
                            flag[0] = 0;
                        } else {
                            int temp = Integer.parseInt(t.getText().toString());
                            a[0] = a[0] + temp;
                            action[0]=0;
                            t.setText("|");
                        }

                    }
                    String e="Buffer:\n"+ Integer.valueOf(a[0]).toString();
                    buf.setText(e);



            }
        });

        eq.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                buf.setText("Buffer:");
                if(a[1]==200)
                {
                    TextView t=findViewById(R.id.main);
                    int b=Integer.parseInt(t.getText().toString());
                    if(action[0]==1){ a[0]=a[0]+b;action[0]=0;}
                    if(action[0]==2){ a[0]=a[0]-b;action[0]=0;}
                    if(action[0]==3){ a[0]=a[0]*b;action[0]=0;}
                    if(action[0]==4){ a[0]=a[0]/b;action[0]=0;}
                    action[0]=0;
                    t.setText(Integer.toString(a[0]));
                    flag[0] =1;
                }
            }
        });

        clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buf.setText("Buffer:");
                TextView t=findViewById(R.id.main);
                t.setText("|");
                a[1]=-1;
                a[0]=0;
                flag[0]=0;
                action[0] = 0;
            }
        });

        cc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView t=findViewById(R.id.main);
                String s=t.getText().toString();
                if(!s.equals(ch))
                {
                    if(a[1]==-1)
                    {
                        if(t.length()==1)
                        {
                            t.setText(ch);
                            if (a[1] == -1)
                            {
                                buf.setText("Buffer: ");
                            }
                        }
                        else
                        {
                        t.setText(s.substring(0,(s.length()-1)));}
                    }
                    else
                    {
                        if(t.length()==1){t.setText(ch);}
                        else
                        {
                        t.setText(s.substring(0,(s.length()-1)));}
                        a[0]=a[0]/10;
                    }
                }
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    action[0] = 2;
                    TextView t = findViewById(R.id.main);

                    if (a[1] == -1) {
                        a[0] = Integer.parseInt(t.getText().toString());
                        a[1] = 200;
                        t.setText("|");
                    } else {
                        if (flag[0] == 1) {
                            t.setText("|");
                            flag[0] = 0;
                        } else {
                            int temp = Integer.parseInt(t.getText().toString());
                            a[0] = a[0] - temp;
                            action[0]=0;
                            t.setText("|");
                        }

                    }
                    String e="Buffer:\n"+ Integer.valueOf(a[0]).toString();
                    buf.setText(e);


            }
        });

        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    action[0] = 3;
                    TextView t=findViewById(R.id.main);
                    if(a[1]==-1)
                    {
                        a[0]=Integer.parseInt(t.getText().toString());
                        a[1]=200;
                        t.setText("|");
                    }
                    else
                    {
                        if(flag[0]==1){
                            t.setText("|");
                            flag[0]=0;
                        }
                        else
                        {
                            int temp=Integer.parseInt(t.getText().toString());
                            a[0]=a[0]*temp;
                            action[0]=0;
                            t.setText("|");
                        }
                    }
                    String e="Buffer:\n"+ Integer.valueOf(a[0]).toString();
                    buf.setText(e);




            }

        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    action[0] = 4;
                    TextView t = findViewById(R.id.main);
                    if (a[1] == -1) {
                        a[0] = Integer.parseInt(t.getText().toString());
                        a[1] = 200;
                        t.setText("|");
                    } else {
                        if (flag[0] == 1) {
                            t.setText("|");
                            flag[0] = 0;
                        } else {
                            int temp = Integer.parseInt(t.getText().toString());
                            a[0] = a[0] / temp;
                            action[0]=0;
                            t.setText("|");
                        }

                    }
                    String e="Buffer:\n"+ Integer.valueOf(a[0]).toString();
                    buf.setText(e);



            }

        });


    }

}