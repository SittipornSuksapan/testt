package mean.chan.mind.testsentgps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnclickOk (View view){

        Button btn_ok = (Button)findViewById(R.id.buttonok);
        Intent intent = new Intent(MainActivity.this, TestActivity.class);
        startActivity(intent);
    }
    public void OnclickRegiter (View view){

        Button btn_re = (Button)findViewById(R.id.button);
        Intent intent = new Intent(MainActivity.this, RegiterActivity.class);
        startActivity(intent);
    }


}
