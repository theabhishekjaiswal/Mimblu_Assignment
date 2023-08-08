package com.abhi.mimblu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String api="http://dev.mimblu.com/mimblu-yii2-1552/api/user/symptoms";
    ArrayList<userModel> allUserList;
    AppCompatButton btnNext ;
    RecyclerView rvcMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNext= findViewById(R.id.btnNext);
        rvcMain = findViewById(R.id.rcvMain);
        rvcMain.setLayoutManager(new LinearLayoutManager(this));


        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iNext;
                iNext=new Intent(MainActivity.this,SecondPage.class);
                startActivity(iNext);
            }
        });
            getdata();
            allUserList=new ArrayList<>();


    }

    private void getdata() {
        RequestQueue queue = Volley.newRequestQueue(this);
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, api, null,
                new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    JSONArray array = response.getJSONArray("list");
                    for(int i = 0 ; i< array.length();i++){
                        JSONObject singleObject = array.getJSONObject(i);
                        userModel singleModel = new userModel(
                                singleObject.getInt("id"),
                                singleObject.getString("title"),
                                singleObject.getInt("state_id"),
                                singleObject.getString("created_on"),
                                singleObject.getInt("type_id"),
                                singleObject.getBoolean("is_selected"),
                                singleObject.getInt("created_by_id")

                        );
                       allUserList.add(singleModel);

                    }

                    rvcMain.setAdapter(new userAdapter(MainActivity.this, allUserList));
                    Log.e("api", "onResponse: " + allUserList.size() );
                } catch (JSONException e) {
                    e.printStackTrace();
                    Log.e("api", "onResponse: " + e.getMessage());
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("api", "onErrorResponse: " + error.getLocalizedMessage() );

            }
        });

        queue.add(request);

    }
}