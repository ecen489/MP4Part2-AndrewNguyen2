package com.example.mp4part2;
//ddd
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText first;
    private EditText second;
    private TextView ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void addbuttonpush(View V)
    {

        Button button = (Button) V;
        first = (EditText) findViewById(R.id.num1);
        second= (EditText) findViewById(R.id.num2);
        ans = (TextView) findViewById(R.id.ans);
        String int1 = first.getText().toString();
        double firstnum;
        if (int1.matches(""))
        {
            firstnum = 0;
        }
        else {
            firstnum = Double.parseDouble(int1);
        }
        String int2 = second.getText().toString();
        double secondnum;
        if (int2.matches(""))
        {
             secondnum = 0;
        }
        else {
             secondnum = Double.parseDouble(int2);
        }
        double sum = firstnum+ secondnum;
        String answer = String.valueOf(sum);
        ans.setText(answer);
       first.getText().clear();
       second.getText().clear();
    }

    public void subbuttonpush(View V)
    {
        Button button = (Button) V;
        first = (EditText) findViewById(R.id.num1);
        second= (EditText) findViewById(R.id.num2);
        ans = (TextView) findViewById(R.id.ans);
        String int1 = first.getText().toString();
        double firstnum;
        if (int1.matches(""))
        {
            firstnum = 0;
        }
        else {
            firstnum = Double.parseDouble(int1);
        }
        String int2 = second.getText().toString();
        double secondnum;
        if (int2.matches(""))
        {
            secondnum = 0;
        }
        else {
            secondnum = Double.parseDouble(int2);
        }
        double sum = firstnum - secondnum;
        String answer = String.valueOf(sum);
        ans.setText(answer);
        first.getText().clear();
        second.getText().clear();
    }
    public void multbuttonpush(View V)
    {
        Button button = (Button) V;
        first = (EditText) findViewById(R.id.num1);
        second= (EditText) findViewById(R.id.num2);
        ans = (TextView) findViewById(R.id.ans);
        String int1 = first.getText().toString();
        double firstnum;
        if (int1.matches(""))
        {
            firstnum = 0;
        }
        else {
            firstnum = Double.parseDouble(int1);
        }
        String int2 = second.getText().toString();
        double secondnum;
        if (int2.matches(""))
        {
            secondnum = 0;
        }
        else {
            secondnum = Double.parseDouble(int2);
        }
        double sum = firstnum * secondnum;
        String answer = String.valueOf(sum);
        ans.setText(answer);
        first.getText().clear();
        second.getText().clear();
    }

}
