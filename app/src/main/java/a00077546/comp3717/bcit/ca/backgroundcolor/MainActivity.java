package a00077546.comp3717.bcit.ca.backgroundcolor;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void changeBGColor(final View view) {

        final LinearLayout background;
        boolean checked;

        background = (LinearLayout) findViewById(R.id.background);
        checked = ((RadioButton) view).isChecked();

        if (checked) {
            switch (view.getId()) {
                case R.id.optRed:
                    background.setBackgroundColor(Color.parseColor("#990000"));
                    break;
                case R.id.optOrange:
                    background.setBackgroundColor(Color.parseColor("#ff6600"));
                    break;
                case R.id.optYellow:
                    background.setBackgroundColor(Color.parseColor("#ffff00"));
                    break;
                case R.id.optGreen:
                    background.setBackgroundColor(Color.parseColor("#99cc00"));
                    break;
                case R.id.optBlue:
                    background.setBackgroundColor(Color.parseColor("#006699"));
                    break;
                case R.id.optWhite:
                    background.setBackgroundColor(Color.parseColor("#ffffff"));
                    break;
                default:
                    background.setBackgroundColor(Color.parseColor("#000000"));
                    break;

            }
        }





    }
}
