package com.polytech.ballboxes

import com.polytech.model.Property

fun main(args: Array<String>) {
    val property = Property("ballout.txt")
    val builder = BallBoxes()
    builder.read()
    builder.buildHypo()
    val solver = Solver(builder.hypo, builder.list, property)
    solver.run()
}