package guavadreamelectronicsmedia.firstandroidapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();  // name of the main Activity (or class)
    private FactBook mFactBook = new FactBook();  // default constructor
    private ColorWheel mColorWheel = new ColorWheel();

    // Declare our View variables
    private TextView mFactTextView;  // mixed my textview variable names...this is really the text container for "did you know?"
    private TextView textView;       // this one is the text container for the facts...(should've been called mFactTextView)
    private Button mShowFactButton;
    private RelativeLayout mRelativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Assign the Views from the layout file to the corresponding variables
        textView = (TextView) findViewById(R.id.textView);
        mShowFactButton = (Button) findViewById(R.id.showFactButton);
        mRelativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fact = mFactBook.getFact();
                int color = mColorWheel.getColor();

                // Update the screen with our dynamic fact
                textView.setText(fact);
                mRelativeLayout.setBackgroundColor(color);
                mShowFactButton.setTextColor(color);
            }
        };
        mShowFactButton.setOnClickListener(listener);

        //Toast.makeText(MainActivity.this, "Yay! Our Activity was created!", Toast.LENGTH_SHORT).show();
        Log.d(TAG,"We're logging from the OnCreate Method!");
    }
}
