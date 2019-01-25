package net.orgiu.tickets.utils

import android.os.Bundle
import android.support.constraint.ConstraintSet
import android.support.constraint.motion.MotionLayout
import net.orgiu.tickets.R

private const val IS_START = "is_start"
private const val STATE = "state"

fun Bundle?.isStart(): Boolean =
    this?.getBoolean(IS_START, true) ?: true

fun Bundle?.state(): Int? =
    this?.getInt(STATE)

fun Bundle?.setIsStart(isStart: Boolean) {
    this?.putBoolean(IS_START, isStart)
}

fun Bundle?.setState(state: Int) {
    this?.putInt(STATE, state)
}

fun MotionLayout.setEnd() {
    val constraintSet = ConstraintSet().apply {
        load(context, R.id.end)
    }

    setConstraintSet(constraintSet)
}