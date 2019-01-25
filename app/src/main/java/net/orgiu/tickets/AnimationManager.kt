package net.orgiu.tickets

import android.os.Bundle
import android.support.constraint.motion.MotionLayout
import net.orgiu.tickets.utils.*

class AnimationManager {

    private val endAnimation = EndAnimation()

    fun bindTo(layout: MotionLayout, bundle: Bundle?) {
        layout.setTransitionListener(endAnimation)

        bundle?.state()?.let {
            layout.setState(it, layout.width, layout.height)
        }
    }

    fun saveState(bundle: Bundle?, layout: MotionLayout) {
        bundle.setState(layout.currentState)
    }

    fun toggleAnimation(layout: MotionLayout) {
        if (endAnimation.isStart()) {
            layout.transitionToEnd()
        } else {
            layout.transitionToStart()
        }
    }
}