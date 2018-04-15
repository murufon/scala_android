package ml.murufon.scalahelloworld

import android.content.Context
import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Assert._


/**
  * Instrumented test, which will execute on an Android device.
  *
  * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
  */
@RunWith(classOf[AndroidJUnit4]) class ExampleInstrumentedTest {
  @Test
  @throws[Exception]
  def useAppContext(): Unit = { // Context of the app under test.
    val appContext = InstrumentationRegistry.getTargetContext
    assertEquals("ml.murufon.scalahelloworld", appContext.getPackageName)
  }
}
