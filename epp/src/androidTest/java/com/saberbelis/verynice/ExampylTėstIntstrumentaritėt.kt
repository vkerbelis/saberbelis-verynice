@file:Suppress(
    "SpellCheckingInspection", "FunctionName", "NonAsciiCharacters", "ClassName",
    "LocalVariableName", "PropertyName", "PackageName", "SetTextI18n", "ObjectPropertyName"
)

package com.saberbelis.verynice

import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.assertTrue
import org.junit.Assert.fail
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampylTėstIntstrumentaritėt {
    @Test
    fun useAppContext() {
        try {
            fail()
        } catch (throwable: Throwable) {
            assertTrue(true)
        }
    }
}
