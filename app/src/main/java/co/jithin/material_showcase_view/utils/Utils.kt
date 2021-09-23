package co.jithin.material_showcase_view.utils

import android.content.res.Resources

internal object Utils {
  fun pxToDp(px: Int): Int {
    return (px / Resources.getSystem().displayMetrics.density).toInt()
  }

  @JvmStatic
  fun dpToPx(dp: Int): Int {
    return (dp * Resources.getSystem().displayMetrics.density).toInt()
  }
}