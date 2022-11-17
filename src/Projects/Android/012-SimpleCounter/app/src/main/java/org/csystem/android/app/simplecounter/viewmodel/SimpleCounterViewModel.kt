package org.csystem.android.app.simplecounter.viewmodel

import org.csystem.android.app.simplecounter.MainActivity

data class SimpleCounterViewModel(var activity: MainActivity) {
    fun handleStartButton1() = activity.startButtonClicked1()
    fun handleStartButton2() = activity.startButtonClicked2()

}