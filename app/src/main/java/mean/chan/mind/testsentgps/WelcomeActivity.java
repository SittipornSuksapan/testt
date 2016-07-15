package mean.chan.mind.testsentgps;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by ichob_naza-jung on 6/27/16 AD.
 */
public class WelcomeActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_activity);
    }
    public void Onclicknext (View view){

        Button btn_net = (Button)findViewById(R.id.buttonn1);
        Intent intent = new Intent(WelcomeActivity.this, MapActivity.class);
        startActivity(intent);
    }
}
