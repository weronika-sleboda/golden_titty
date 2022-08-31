package com.pregnantunicorn.goldentitty.models.npcs

import com.pregnantunicorn.goldentitty.models.key_items.CurrentKeyItem
import com.pregnantunicorn.goldentitty.models.key_items.KeyItemType
import com.pregnantunicorn.goldentitty.models.story_line.CurrentEvent
import com.pregnantunicorn.goldentitty.models.story_line.EventTitle

class LadySilviaGreetings {

    fun greeting(): String {

        return when(CurrentEvent.eventTitle()) {

            EventTitle.OPENING -> "Come let us gather wood and iron and start to construct the buildings."
            EventTitle.WORKSHOP_EVENT -> "Stop goofing around and go make some tools. We need to excavate the island."
            EventTitle.FIRST_FLOOR_ENDING_EVENT -> "I received a letter from a messenger pigeon this morning. You have been sued for animal abuse."
            EventTitle.SECOND_FLOOR_ENDING_EVENT -> "Remember not to feed me with the food from the Stinky Shoe Tavern."
            EventTitle.THIRD_FLOOR_ENDING_EVENT -> "Marvelous! The Temple Ruins are now cleared."
            EventTitle.TEMPLE_EVENT -> "I'm so happy, we found the Temple Ruins. The Golden Titty is just few steps from us."
            EventTitle.EXCAVATION_SITE_EVENT -> "Good work, Meteor! Build more of those excavation sites."
            EventTitle.CAMP_FIRE_EVENT -> "Sitting in front of that cozy camp fire makes me feel good. My life is great!"
            EventTitle.STATUE_EVENT -> "O yeah... The Golden Titty will be soon mine. I'm so tired of being this ugly skeleton."
            EventTitle.LADY_SILVIAS_HUT_EVENT -> "Now that I have my own hut, you can bring the key items to me for examination."
            EventTitle.WESTERN_GATE -> "Hmmm... Let me think... How to nullify that spell that is protecting the Western Gate?"
            EventTitle.PIER_EVENT -> "Mmmm... Sashimi... It sounds tasty."

            else  -> "Don't bother me now, I'm sunbathing."
        }
    }

    fun advice(): String {

        return when(CurrentKeyItem.keyItemType()) {

            KeyItemType.SHAMANIC_NECKLACE -> "This is it! This is how you go through the Western Gate. Hold it in your hand and just pass through the gate."
            KeyItemType.FIRST_FLOOR_KEY -> "This is the key to the first floor of the temple ruins. Hold it in your hand and open the door to the first floor."
            KeyItemType.SECOND_FLOOR_KEY -> "Hold that key in your hand and open the door to the second floor."
            KeyItemType.THIRD_FLOOR_KEY -> "This key opens the third floor. Just hold it in your hand and then open the door to the third floor."
            KeyItemType.STAFF_OF_ECLIPSE -> "Wonderful! You found the Staff Of Eclipse. Hold it in your hand at night and the temple ruins will appear."
            KeyItemType.TEMPLE_KEY -> "Yes! You found the key to the temple ruins. Hold it in your hand and just open the main entrance."
            KeyItemType.CRYSTAL_OF_VISION -> "I know what it is... I heard that if you hold the Crystal Of Vision in your hand, it will reveal to you what is otherwise invisible."
            KeyItemType.SAPPHIRE -> "Hmmm... Why don't we try to insert it into those slots that are built into the Statue Of Chidinma?"
            KeyItemType.EMERALD -> "I would insert that one into those slots that are built into the Statue Of Chidinma."
            KeyItemType.RUBY -> "I think it would fit perfectly into those slots that are built into the Statue of Chidinma."
        }
    }

    companion object {

        private var counter = 0
    }

    fun afterMeal(): String {

        counter++

        return when(counter) {

            1 -> "Thanks, If I had a stomach I would probably be starving right now."

            else -> {

                counter = 0
                "Yeah, finally time for a meal."
            }
        }
    }

    fun isFedLine(): String {

        counter++

        return when(counter) {

            1 -> "Thanks, but my non-existent stomach is going to explode of all that imaginary food."

            else -> {

                counter = 0
                "Please, no more. I'm done pretending I'm eating for today. My health bar is full."
            }
        }
    }
}