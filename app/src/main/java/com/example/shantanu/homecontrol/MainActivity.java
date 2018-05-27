package com.example.shantanu.homecontrol;

import android.app.VoiceInteractor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class MainActivity extends AppCompatActivity {

    Button button;
    Switch switch1,switch2,switch3,switch4,switch5;
    TextView textView,textView2,textView3,textView4,textView1,textView5,textView6,textView7;
    String server_url1="http://192.168.4.1/?pin=06";
    String server_url2="http://192.168.4.1/?pin=07";
    String server_url3="http://192.168.4.1/?pin=08";
    String server_url4="http://192.168.4.1/?pin=09";
    String server_url5="http://192.168.4.1/?pin=13";
    String s1="";
    String temp,cs;
    String temp1="http://192.168.4.1/?";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        switch1 = (Switch) findViewById(R.id.switch1);
        switch2 = (Switch) findViewById(R.id.switch2);
        switch3 = (Switch) findViewById(R.id.switch3);
        switch4 = (Switch) findViewById(R.id.switch4);
        switch5 = (Switch) findViewById(R.id.switch5);
        textView = (TextView) findViewById(R.id.textView);
        textView1 = (TextView) findViewById(R.id.textView1);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        textView4 = (TextView) findViewById(R.id.textView4);
        textView5 = (TextView) findViewById(R.id.textView5);
        textView6 = (TextView) findViewById(R.id.textView6);
        textView7 = (TextView) findViewById(R.id.textView7);
        button = (Button) findViewById(R.id.button);



        switch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (switch1.isChecked()){

                    final RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);

                    StringRequest stringRequest = new StringRequest(Request.Method.POST, server_url1,
                            new Response.Listener<String>() {
                                @Override
                                public void onResponse(String response) {

                                    textView.setText("      ON-"+response);
                                    requestQueue.stop();

                                }
                            }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {

                            textView.setText("   WENT WRONG");
                            error.printStackTrace();
                            requestQueue.stop();
                        }
                    });
                    requestQueue.add(stringRequest);
                }
                else
                {
                    textView.setText("      OFF-RESPONSE");
                }
            }
        });

        switch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (switch2.isChecked()){

                    final RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);

                    StringRequest stringRequest = new StringRequest(Request.Method.POST, server_url2,
                            new Response.Listener<String>() {
                                @Override
                                public void onResponse(String response) {

                                    textView1.setText("      ON-"+response);
                                    requestQueue.stop();

                                }
                            }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {

                            textView1.setText("   WENT WRONG");
                            error.printStackTrace();
                            requestQueue.stop();
                        }
                    });
                    requestQueue.add(stringRequest);

                }
                else
                {
                    textView1.setText("      OFF-RESPONSE");
                }
            }
        });

        switch3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (switch3.isChecked()){

                    final RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);

                    StringRequest stringRequest = new StringRequest(Request.Method.POST, server_url3,
                            new Response.Listener<String>() {
                                @Override
                                public void onResponse(String response) {

                                    textView2.setText("      ON-"+response);
                                    requestQueue.stop();

                                }
                            }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {

                            textView2.setText("   WENT WRONG");
                            error.printStackTrace();
                            requestQueue.stop();
                        }
                    });
                    requestQueue.add(stringRequest);

                }
                else
                {
                    textView2.setText("      OFF-RESPONSE");
                }
            }
        });

        switch4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (switch4.isChecked()){

                    final RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);

                    StringRequest stringRequest = new StringRequest(Request.Method.POST, server_url4,
                            new Response.Listener<String>() {
                                @Override
                                public void onResponse(String response) {

                                    textView3.setText("      ON-"+response);
                                    requestQueue.stop();

                                }
                            }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {

                            textView3.setText("   WENT WTONG");
                            error.printStackTrace();
                            requestQueue.stop();
                        }
                    });
                    requestQueue.add(stringRequest);

                }
                else
                {
                    textView3.setText("      OFF-RESPONSE");
                }
            }
        });

        switch5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (switch5.isChecked()){

                    final RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);

                    StringRequest stringRequest = new StringRequest(Request.Method.POST, server_url5,
                            new Response.Listener<String>() {
                                @Override
                                public void onResponse(String response) {

                                    textView4.setText("      ON-"+response);
                                    requestQueue.stop();

                                }
                            }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {

                            textView4.setText("   WENT WRONG");
                            error.printStackTrace();
                            requestQueue.stop();
                        }
                    });
                    requestQueue.add(stringRequest);

                }
                else
                {
                    textView4.setText("      OFF-RESPONSE");
                }
            }
        });


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                temp = textView5.getText().toString();
                cs = temp1.concat(temp);
                textView6.setText(cs);
                final RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);

                StringRequest stringRequest = new StringRequest(Request.Method.POST, cs,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {

                                textView7.setText("      ON-"+response);
                                requestQueue.stop();

                            }
                        }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                        textView7.setText("   WENT WRONG");
                        error.printStackTrace();
                        requestQueue.stop();
                    }
                });
                requestQueue.add(stringRequest);

            }
        });


    }
}
