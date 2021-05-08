package com.polytech.model

interface SolveBuilder {

    fun read()
    fun buildHypo(): List<Hypothesis>
}