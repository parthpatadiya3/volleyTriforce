package com.example.volleytriforce;

import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    String url;
    RecyclerView recyclerView;
    private List<personlist> list;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = new ArrayList<>();

        getdata();
    }

    private void getdata()
    {
       try {
                String URL = "http://www.bajrang.890m.com/BK_Webservice_1.0/connection.php";
                JSONObject jsonBody = new JSONObject();

                jsonBody.put("action","AdminData");
                jsonBody.put("usertype","ADMIN");

                JsonObjectRequest jsonOblect = new JsonObjectRequest(Request.Method.POST, URL, jsonBody, new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response)
                    {
                        Log.d("@@@data", String.valueOf(response));
                       Toast.makeText(getApplicationContext(), "Response:  " + response.toString(), Toast.LENGTH_SHORT).show();

                    }

                }, new Response.ErrorListener()
                {
                    @Override
                    public void onErrorResponse(VolleyError error)
                    {

                        onBackPressed();

                    }
                });

                RequestQueue requestQueue = Volley.newRequestQueue(getApplicationContext());
                requestQueue.add(jsonOblect);
           recyclerView=findViewById(R.id.recyclerview);
           recyclerviewAdapter recyclerviewAdapter=new recyclerviewAdapter(list);
           recyclerView.setHasFixedSize(true);
           recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
           recyclerView.setAdapter(recyclerviewAdapter);

            } catch (JSONException e)
            {
                e.printStackTrace();
            }
            // Toast.makeText(getApplicationContext(), "done", Toast.LENGTH_LONG).show();

        }
    }




