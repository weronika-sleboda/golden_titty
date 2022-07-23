package com.pregnantunicorn.merchantofgoldlakehorizon.models.investigation

import android.content.Context
import android.content.Intent
import androidx.fragment.app.FragmentActivity
import com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.EventFactory
import com.pregnantunicorn.merchantofgoldlakehorizon.models.story_line.EventTitle
import com.pregnantunicorn.merchantofgoldlakehorizon.views.activities.EventActivity

class EventInvestigation(
    private val eventTitle: EventTitle
) : Investigation {

    override fun execute(context: Context, activity: FragmentActivity) {

        EventFactory.changeEvent(eventTitle)

        val intent = Intent(context, EventActivity::class.java)
        activity.startActivity(intent)
    }
}