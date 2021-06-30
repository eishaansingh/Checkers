package android.examples.checkers;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.Window;
import android.widget.TextView;

public class CheckersActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(new CheckersBoard(this));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = this.getMenuInflater();
        menuInflater.inflate(R.menu.item_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.exitMenuItem:
                System.exit(1);
                break;
            case R.id.aboutMenuItem:
                AlertDialog.Builder popupBuilder = new AlertDialog.Builder(this);
                TextView myMsg = new TextView(this);
                myMsg.setText("Checkers Using AplphaBeta pruning");
                myMsg.setGravity(Gravity.CENTER_HORIZONTAL);
                popupBuilder.setView(myMsg);
                popupBuilder.show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

        return false;
    }
}