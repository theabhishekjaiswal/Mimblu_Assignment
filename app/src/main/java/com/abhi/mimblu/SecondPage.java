package com.abhi.mimblu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class SecondPage extends AppCompatActivity {
    String url ="http://dev.mimblu.com/mimblu-yii2-1552/api/plan/all";
    RecyclerView rcv2;
    ImageButton btnBack;
    ArrayList<userModel2> allDataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);

        btnBack = findViewById(R.id.btnBack);
        rcv2 = findViewById(R.id.recyclerViewMatchOptions);
       // rcv2.setLayoutManager(new LinearLayoutManager(this));
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        rcv2.setLayoutManager(layoutManager);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        loaddata();
        allDataList=new ArrayList<>();

    }

    private void loaddata() {
        RequestQueue queue = Volley.newRequestQueue(this);
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            JSONArray array = response.getJSONArray("list");
                            for(int i = 0 ; i< array.length();i++){
                                JSONObject singleObject = array.getJSONObject(i);
                                userModel2 singleModel = new userModel2(
                                        singleObject.getInt("id"),
                                        singleObject.getString("plan_id"),
                                        singleObject.getString("title"),
                                        singleObject.getString("company_name"),
                                        singleObject.getString("description"),
                                        singleObject.getString("video_description"),
                                        singleObject.getString("duration"),
                                        singleObject.getString("weekly_price"),
                                        singleObject.getString("discounted_price"),
                                        singleObject.getInt("discounted_price_calculated"),
                                        singleObject.getString("tax_price"),
                                        singleObject.getString("tax_percentage"),
                                        singleObject.getString("final_price"),
                                        singleObject.getString("total_price"),
                                        singleObject.getInt("incentive_days"),
                                        singleObject.getInt("no_of_free_trial_days"),
                                        singleObject.getInt("no_of_video_session"),
                                        singleObject.getInt("plan_type"),
                                        singleObject.getInt("is_recommended"),
                                        singleObject.getInt("state_id"),
                                        singleObject.getInt("type_id"),
                                        singleObject.getString("created_on"),
                                        singleObject.getInt("created_by_id"),
                                        singleObject.getString("currency_code")
                                );
                                allDataList.add(singleModel);

                            }

                            rcv2.setAdapter(new userAdapter2(SecondPage.this, allDataList));
                            Log.e("url", "onResponse: " + allDataList.size() );
                        } catch (JSONException e) {
                            e.printStackTrace();
                            Log.e("url", "onResponse: " + e.getMessage());
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