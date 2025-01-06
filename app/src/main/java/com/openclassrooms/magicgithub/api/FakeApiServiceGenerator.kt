package com.openclassrooms.magicgithub.api

import com.openclassrooms.magicgithub.model.User
import java.util.*

object FakeApiServiceGenerator {

    @JvmField
    var FAKE_USERS = mutableListOf(
        User("001", "Jake", "https://api.dicebear.com/7.x/avataaars/png?seed=Jake"),
        User("002", "Paul", "https://api.dicebear.com/7.x/avataaars/png?seed=Paul"),
        User("003", "Phil", "https://api.dicebear.com/7.x/avataaars/png?seed=Phil"),
        User("004", "Guillaume", "https://api.dicebear.com/7.x/avataaars/png?seed=Guillaume"),
        User("005", "Francis", "https://api.dicebear.com/7.x/avataaars/png?seed=Francis"),
        User("006", "George", "https://api.dicebear.com/7.x/avataaars/png?seed=George"),
        User("007", "Louis", "https://api.dicebear.com/7.x/avataaars/png?seed=Louis"),
        User("008", "Mateo", "https://api.dicebear.com/7.x/avataaars/png?seed=Mateo"),
        User("009", "April", "https://api.dicebear.com/7.x/avataaars/png?seed=April"),
        User("010", "Louise", "https://api.dicebear.com/7.x/avataaars/png?seed=Louise"),
        User("011", "Elodie", "https://api.dicebear.com/7.x/avataaars/png?seed=Elodie"),
        User("012", "Helene", "https://api.dicebear.com/7.x/avataaars/png?seed=Helene"),
        User("013", "Fanny", "https://api.dicebear.com/7.x/avataaars/png?seed=Fanny"),
        User("014", "Laura", "https://api.dicebear.com/7.x/avataaars/png?seed=Laura"),
        User("015", "Gertrude", "https://api.dicebear.com/7.x/avataaars/png?seed=Gertrude"),
        User("016", "Chloé", "https://api.dicebear.com/7.x/avataaars/png?seed=Chloe"),
        User("017", "April", "https://api.dicebear.com/7.x/avataaars/png?seed=April2"),
        User("018", "Marie", "https://api.dicebear.com/7.x/avataaars/png?seed=Marie"),
        User("019", "Henri", "https://api.dicebear.com/7.x/avataaars/png?seed=Henri"),
        User("020", "Rémi", "https://api.dicebear.com/7.x/avataaars/png?seed=Remi")
    )

    @JvmField
    var FAKE_USERS_RANDOM = Arrays.asList(
        User("021", "Lea", "https://api.dicebear.com/7.x/avataaars/png?seed=Lea"),
        User("022", "Geoffrey", "https://api.dicebear.com/7.x/avataaars/png?seed=Geoffrey"),
        User("023", "Simon", "https://api.dicebear.com/7.x/avataaars/png?seed=Simon"),
        User("024", "André", "https://api.dicebear.com/7.x/avataaars/png?seed=Andre"),
        User("025", "Leopold", "https://api.dicebear.com/7.x/avataaars/png?seed=Leopold")
    )
}