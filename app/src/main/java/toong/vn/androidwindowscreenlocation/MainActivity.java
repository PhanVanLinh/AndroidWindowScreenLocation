package toong.vn.androidwindowscreenlocation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnA;
    private Button btnB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnA = (Button) findViewById(R.id.button_a);
        btnB = (Button) findViewById(R.id.button_b);
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        int[] screenPos = new int[2];
        btnA.getLocationOnScreen(screenPos);
        Log.i("TAG", "screenPos: "+screenPos[0] + " - " + screenPos[1]);

        int[] windowPos = new int[2];
        btnA.getLocationInWindow(windowPos);
        Log.i("TAG", "windowPos: "+windowPos[0] + " - " + windowPos[1]);

        // Out put
        // The value return from getLocationOnScreen and getLocationInWindow is the same
    }
}
