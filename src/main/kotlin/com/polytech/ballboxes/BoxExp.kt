package com.polytech.ballboxes

import com.polytech.model.Experiment

class BoxExp(): Experiment {
    var list = mutableListOf<Color>()
    enum class Color {
        RED, WHITE, BLACK, GREEN, BLUE, YELLOW;
    }

    override fun toString(): String {
        return "Experiment(list=$list)\n"
    }
}
