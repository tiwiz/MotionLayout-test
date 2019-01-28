package net.orgiu.tickets.main.utils

import android.support.constraint.motion.MotionLayout

class EndAnimation : MotionLayout.TransitionListener {

    private var isStart = true

    override fun onTransitionTrigger(p0: MotionLayout?, p1: Int, p2: Boolean, p3: Float) = Unit

    override fun onTransitionStarted(p0: MotionLayout?, p1: Int, p2: Int) = Unit

    override fun onTransitionChange(p0: MotionLayout?, p1: Int, p2: Int, p3: Float) = Unit

    override fun onTransitionCompleted(target: MotionLayout?, p1: Int) {
        isStart = isStart.not()
    }

    fun isStart() = isStart
}