package com.androidnc.btl_h2dmusic.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.androidnc.btl_h2dmusic.R;

public class CommentActivity extends AppCompatActivity {

    EditText contentComment;
    TextView addComment;
    String idBaihat;

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Bình Luận");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        contentComment = findViewById(R.id.add_comment);
        addComment = findViewById(R.id.comment);
        Intent intent = getIntent();
        idBaihat = intent.getStringExtra("idBaihat");
        addComment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(contentComment.getText().toString().equals("")){
                    Toast.makeText(CommentActivity.this, "Nội dung bình luận không được bỏ trống", Toast.LENGTH_SHORT).show();
                } else {
                    addComment();
                }
            }
        });

    }

    private void addComment() {

    }
}