package com.github.techjhp

import android.util.Log

class Jlive {
    companion object {
        fun showJliveLog() = Log.d("J-live", "log")
        fun showJliveWarnLog() = Log.w("J-live", "warn-log")
    }
}