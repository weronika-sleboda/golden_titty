package com.pregnantunicorn.goldentitty.models.world_map.tiles

import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.pregnantunicorn.goldentitty.R
import com.pregnantunicorn.goldentitty.models.graphics.IconFactory
import com.pregnantunicorn.goldentitty.models.key_items.CurrentKeyItem
import com.pregnantunicorn.goldentitty.models.key_items.KeyItem
import com.pregnantunicorn.goldentitty.models.key_items.KeyItemType
import com.pregnantunicorn.goldentitty.models.world_map.world.CurrentLocation
import com.pregnantunicorn.goldentitty.models.world_map.world.LocationName
import com.pregnantunicorn.goldentitty.views.fragments.LocationFragment

class SecretGateTile(
    private val locationName: LocationName,
    private val background: () -> Int
): Tile(true)
{
    override fun icon() = IconFactory().roadSign64()

    override fun background() = background.invoke()

    override fun onClick(activity: FragmentActivity) {

        if(CurrentKeyItem.keyItemType() == KeyItemType.SHAMANIC_NECKLACE) {

            CurrentLocation.changeLocation(locationName)

            activity.supportFragmentManager.commit {

                replace<LocationFragment>(R.id.world_container)
            }
        }

        else {


        }
    }
}