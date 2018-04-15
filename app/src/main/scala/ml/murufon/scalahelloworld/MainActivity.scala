package ml.murufon.scalahelloworld

import android.os.Bundle
import android.support.v7.app.AppCompatActivity


class MainActivity extends AppCompatActivity {
  override protected def onCreate(savedInstanceState: Bundle): Unit = {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
  }

}
