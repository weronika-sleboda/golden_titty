package com.pregnantunicorn.goldentitty.models.player

object Player {

    private var health = Status()
    private var energy = Status()
    private var storyProgress = StoryProgress()
    private var iron = Resource()
    private var wood = Resource()
    private var coconuts = Resource()

    fun isDead() = health.amountIsZero()

    fun health() = health
    fun energy() = energy
    fun storyProgress() = storyProgress
    fun coconuts() = coconuts
    fun iron() = iron
    fun wood() = wood

    fun reset() {

        health = Status()
        energy = Status()
        storyProgress = StoryProgress()
        iron = Resource()
        wood = Resource()
        coconuts = Resource()
    }

    fun setStatus(
        health: Status,
        energy: Status,
        storyProgress: StoryProgress,
        iron: Resource,
        wood: Resource,
        coconuts: Resource
    )
    {
        this.health = health
        this.energy = energy
        this.storyProgress = storyProgress
        this.iron = iron
        this.wood = wood
        this.coconuts = coconuts
    }
}