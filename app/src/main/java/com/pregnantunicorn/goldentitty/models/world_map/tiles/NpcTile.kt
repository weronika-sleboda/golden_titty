package com.pregnantunicorn.goldentitty.models.world_map.tiles

import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.graphics.BackgroundFactory
import com.pregnantunicorn.goldentitty.models.graphics.IconFactory
import com.pregnantunicorn.goldentitty.models.npcs.CurrentNpc
import com.pregnantunicorn.goldentitty.views.fragments.NpcFragment
import com.pregnantunicorn.goldentitty.views.fragments.PalmFragment

class NpcTile(
    private val icon: Int,
    private val npcIndex: Int
): Tile(true)
{
    override fun icon() = icon

    override fun background() = BackgroundFactory().beach()

    override fun onClick(activity: FragmentActivity) {

        CurrentNpc.changeNpc(npcIndex)

        activity.supportFragmentManager.commit {

            replace<NpcFragment>(R.id.world_container)
        }
    }
}