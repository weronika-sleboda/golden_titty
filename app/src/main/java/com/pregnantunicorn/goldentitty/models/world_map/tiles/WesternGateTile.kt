package com.pregnantunicorn.goldentitty.models.world_map.tiles

import android.content.Intent
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.entrances.CurrentEntrance
import com.pregnantunicorn.goldentitty.models.graphics.BackgroundFactory
import com.pregnantunicorn.goldentitty.models.graphics.IconFactory
import com.pregnantunicorn.goldentitty.models.story_line.CurrentEvent
import com.pregnantunicorn.goldentitty.models.story_line.EventTitle
import com.pregnantunicorn.goldentitty.models.story_line.events.WesternGateEvent
import com.pregnantunicorn.goldentitty.views.activities.EventActivity
import com.pregnantunicorn.goldentitty.views.fragments.EntranceFragment

class WesternGateTile: Tile(true)
{
    override fun icon() = IconFactory().secretGate64()

    override fun background() = BackgroundFactory().grass()

    override fun onClick(activity: FragmentActivity) {

        if(!WesternGateEvent.event.hasAlreadyHappened()) {

            CurrentEvent.changeEvent(EventTitle.WESTERN_GATE)

            val intent = Intent(activity.baseContext, EventActivity::class.java)
            activity.startActivity(intent)
        }

        else {

            CurrentEntrance.changeEntrance(CurrentEntrance.WESTERN_GATE)

            activity.supportFragmentManager.commit {

                replace<EntranceFragment>(R.id.world_container)
            }
        }
    }
}