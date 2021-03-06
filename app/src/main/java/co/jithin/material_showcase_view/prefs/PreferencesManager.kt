package co.jithin.material_showcase_view.prefs

import android.content.Context
import co.jithin.material_showcase_view.utils.SingletonHolder

internal class PreferencesManager private constructor(private val context: Context) {
  private val sharedPreferences = context.getSharedPreferences(PREFERENCES_NAME, Context.MODE_PRIVATE)

  fun isDisplayed(id: String?): Boolean {
    return sharedPreferences.getBoolean(id, false)
  }

  fun setDisplayed(id: String?) {
    sharedPreferences.edit().putBoolean(id, true).apply()
  }

  fun reset(id: String?) {
    sharedPreferences.edit().putBoolean(id, false).apply()
  }

  fun resetAll() {
    sharedPreferences.edit().clear().apply()
  }

  companion object : SingletonHolder<PreferencesManager, Context>(::PreferencesManager) {
    private const val PREFERENCES_NAME = "material_intro_preferences"
  }
}