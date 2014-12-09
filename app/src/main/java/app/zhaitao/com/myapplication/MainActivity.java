package app.zhaitao.com.myapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.SeekBar;

import com.roger.match.library.MatchTextView;
import com.roger.match.library.util.MatchView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final MatchTextView matchTextView = (MatchTextView) findViewById(R.id.MatchTextView);
        SeekBar seekBar = (SeekBar)findViewById(R.id.SeekBar);
        seekBar.setProgress(100);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                matchTextView.setProgress(progress*1f/100);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        final MatchTextView matchTextView1 = (MatchTextView) findViewById(R.id.MatchTextViewCopy);
        matchTextView.setMatchOutListener(new MatchView.MatchOutListener() {
            @Override
            public void onBegin() {

            }

            @Override
            public void onProgressUpdate(float progress) {

            }

            @Override
            public void onFinish() {

            }
        });
        matchTextView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                matchTextView1.hide();
            }
        });
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
}
