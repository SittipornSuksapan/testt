package mean.chan.mind.testsentgps;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by ichob_naza-jung on 6/26/16 AD.
 */
public class TestActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_activity);
    }
    public void OnclickWelcome (View view){

        Button btn_wel = (Button)findViewById(R.id.button1);
        Intent intent = new Intent(TestActivity.this, WelcomeActivity.class);
        startActivity(intent);
    }
}
