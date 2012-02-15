package com.example;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * since: 2012-02-15 17:27
 *
 * @author tomasz.zablocki@monomi.pl
 */

public class PrT extends Activity {

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    TextView tv = new TextView(this);
    tv.setText("prT !");
    setContentView(tv);
  }
}