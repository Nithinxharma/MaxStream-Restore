package xyz.mpv.rex

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onRoot
import androidx.compose.ui.test.printToString
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode
import android.content.Intent

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [33], application = App::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
class ComposeUITest {
    @get:Rule
    val composeTestRule = androidx.compose.ui.test.junit4.createAndroidComposeRule<MainActivity>()

    @Test
    fun testUI() {
        println("=== STARTING COMPOSE UI LAUNCH VERIFICATION ===")
        composeTestRule.waitForIdle()
        println("Compose UI Tree:")
        val tree = composeTestRule.onRoot().printToString()
        println(tree)
        assert(tree.isNotEmpty())
        println("=== COMPOSE UI LAUNCH VERIFICATION SUCCESSFUL ===")
    }
}
