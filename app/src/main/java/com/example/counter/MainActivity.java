package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int count = 0;
    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);
        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_SECURE);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
    }


    public void onButtonClick(View view) {
     count++; //Увеличение переменной счетчика
     textView.setText(Integer.toString(count));
    }
    @Override
    protected void onPause() {
        Toast toast = Toast.makeText(getApplicationContext(),"onPause() Метод",Toast.LENGTH_LONG);
        toast.show();
        super.onPause();
    }
    @Override
    protected void onStart() {
        Toast toast = Toast.makeText(getApplicationContext(),"onStart() Метод",Toast.LENGTH_LONG);
        toast.show();
        super.onStart();
    }
    @Override
    protected void onStop() {
        Toast toast = Toast.makeText(getApplicationContext(),"onStop() Метод",Toast.LENGTH_LONG);
        toast.show();
        super.onStop();
    }
    @Override
    protected void onDestroy() {
        Toast toast = Toast.makeText(getApplicationContext(),"onDestroy() Метод",Toast.LENGTH_LONG);
        toast.show();
        super.onDestroy();
    }
    @Override
    protected void onResume() {
        Toast toast = Toast.makeText(getApplicationContext(),"onResume() Метод",Toast.LENGTH_LONG);
        toast.show();
        super.onResume();
    }
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        savedInstanceState.putInt("Perevernulsya", count);
        textView.setText(Integer.toString(count));
        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        count = savedInstanceState.getInt("Perevernulsya");
        textView.setText(Integer.toString(count));
    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float x = event.getX();
        float y = event.getY();

        int PositionX = (int)x;

        switch(event.getAction()) {
            case MotionEvent.ACTION_DOWN:
            Toast toast = Toast.makeText(getApplicationContext(),"ACTION_DOWN",Toast.LENGTH_SHORT);
            toast.show();
            break;
            case MotionEvent.ACTION_MOVE:
            Toast toast2 = Toast.makeText(getApplicationContext(),"ACTION_MOVE",Toast.LENGTH_SHORT);
            toast2.show();
            break;
            case MotionEvent.ACTION_UP:
            Toast toast3 = Toast.makeText(getApplicationContext(),"ACTION_UP",Toast.LENGTH_SHORT);
            toast3.show();
            break;
        }
        textView.setText(Integer.toString(PositionX));
        return true;
    }
}