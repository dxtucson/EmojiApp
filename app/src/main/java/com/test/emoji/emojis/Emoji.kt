package com.test.emoji.emojis

open class Emoji(val emoji: String, val name: String)

class EmojiWithSkinTone(
    emoji: String,
    name: String,
    val variations: Array<Emoji>
) : Emoji(emoji, name)

object Emojis {
    val activities = arrayOf(
        //group: Activities
        //subgroup: event
        Emoji("🎃", "jack-o-lantern"),
        Emoji("🎄", "Christmas tree"),
        Emoji("🎆", "fireworks"),
        Emoji("🎇", "sparkler"),
        Emoji("🧨", "firecracker"),
        Emoji("✨", "sparkles"),
        Emoji("🎈", "balloon"),
        Emoji("🎉", "party popper"),
        Emoji("🎊", "confetti ball"),
        Emoji("🎋", "tanabata tree"),
        Emoji("🎍", "pine decoration"),
        Emoji("🎎", "Japanese dolls"),
        Emoji("🎏", "carp streamer"),
        Emoji("🎐", "wind chime"),
        Emoji("🎑", "moon viewing ceremony"),
        Emoji("🧧", "red envelope"),
        Emoji("🎀", "ribbon"),
        Emoji("🎁", "wrapped gift"),
        Emoji("🎗️", "reminder ribbon"),
        Emoji("🎟️", "admission tickets"),
        Emoji("🎫", "ticket"),
        //subgroup: award-medal
        Emoji("🎖️", "military medal"),
        Emoji("🏆", "trophy"),
        Emoji("🏅", "sports medal"),
        Emoji("🥇", "1st place medal"),
        Emoji("🥈", "2nd place medal"),
        Emoji("🥉", "3rd place medal"),
        //subgroup: sport
        Emoji("⚽", "soccer ball"),
        Emoji("⚾", "baseball"),
        Emoji("🥎", "softball"),
        Emoji("🏀", "basketball"),
        Emoji("🏐", "volleyball"),
        Emoji("🏈", "american football"),
        Emoji("🏉", "rugby football"),
        Emoji("🎾", "tennis"),
        Emoji("🥏", "flying disc"),
        Emoji("🎳", "bowling"),
        Emoji("🏏", "cricket game"),
        Emoji("🏑", "field hockey"),
        Emoji("🏒", "ice hockey"),
        Emoji("🥍", "lacrosse"),
        Emoji("🏓", "ping pong"),
        Emoji("🏸", "badminton"),
        Emoji("🥊", "boxing glove"),
        Emoji("🥋", "martial arts uniform"),
        Emoji("🥅", "goal net"),
        Emoji("⛳", "flag in hole"),
        Emoji("⛸️", "ice skate"),
        Emoji("🎣", "fishing pole"),
        Emoji("🤿", "diving mask"),
        Emoji("🎽", "running shirt"),
        Emoji("🎿", "skis"),
        Emoji("🛷", "sled"),
        Emoji("🥌", "curling stone"),
        //subgroup: game
        Emoji("🎯", "direct hit"),
        Emoji("🪀", "yo-yo"),
        Emoji("🪁", "kite"),
        Emoji("🎱", "pool 8 ball"),
        Emoji("🔮", "crystal ball"),
        Emoji("🧿", "nazar amulet"),
        Emoji("🎮", "video game"),
        Emoji("🕹️", "joystick"),
        Emoji("🎰", "slot machine"),
        Emoji("🎲", "game die"),
        Emoji("🧩", "puzzle piece"),
        Emoji("🧸", "teddy bear"),
        Emoji("♠️", "spade suit"),
        Emoji("♥️", "heart suit"),
        Emoji("♦️", "diamond suit"),
        Emoji("♣️", "club suit"),
        Emoji("♟️", "chess pawn"),
        Emoji("🃏", "joker"),
        Emoji("🀄", "mahjong red dragon"),
        Emoji("🎴", "flower playing cards"),
        //subgroup: arts & crafts
        Emoji("🎭", "performing arts"),
        Emoji("🖼️", "framed picture"),
        Emoji("🎨", "artist palette"),
        Emoji("🧵", "thread"),
        Emoji("🧶", "yarn")
    )
    val flags = arrayOf(
        //group: Flags
        //subgroup: flag
        Emoji("🏁", "chequered flag"),
        Emoji("🚩", "triangular flag"),
        Emoji("🎌", "crossed flags"),
        Emoji("🏴", "black flag"),
        Emoji("🏳️", "white flag"),
        Emoji("🏳️‍🌈", "rainbow flag"),
        Emoji("🏴‍☠️", "pirate flag"),
        //subgroup: country-flag
        Emoji("🇦🇨", "flag: Ascension Island"),
        Emoji("🇦🇩", "flag: Andorra"),
        Emoji("🇦🇪", "flag: United Arab Emirates"),
        Emoji("🇦🇫", "flag: Afghanistan"),
        Emoji("🇦🇬", "flag: Antigua & Barbuda"),
        Emoji("🇦🇮", "flag: Anguilla"),
        Emoji("🇦🇱", "flag: Albania"),
        Emoji("🇦🇲", "flag: Armenia"),
        Emoji("🇦🇴", "flag: Angola"),
        Emoji("🇦🇶", "flag: Antarctica"),
        Emoji("🇦🇷", "flag: Argentina"),
        Emoji("🇦🇸", "flag: American Samoa"),
        Emoji("🇦🇹", "flag: Austria"),
        Emoji("🇦🇺", "flag: Australia"),
        Emoji("🇦🇼", "flag: Aruba"),
        Emoji("🇦🇽", "flag: Åland Islands"),
        Emoji("🇦🇿", "flag: Azerbaijan"),
        Emoji("🇧🇦", "flag: Bosnia & Herzegovina"),
        Emoji("🇧🇧", "flag: Barbados"),
        Emoji("🇧🇩", "flag: Bangladesh"),
        Emoji("🇧🇪", "flag: Belgium"),
        Emoji("🇧🇫", "flag: Burkina Faso"),
        Emoji("🇧🇬", "flag: Bulgaria"),
        Emoji("🇧🇭", "flag: Bahrain"),
        Emoji("🇧🇮", "flag: Burundi"),
        Emoji("🇧🇯", "flag: Benin"),
        Emoji("🇧🇱", "flag: St. Barthélemy"),
        Emoji("🇧🇲", "flag: Bermuda"),
        Emoji("🇧🇳", "flag: Brunei"),
        Emoji("🇧🇴", "flag: Bolivia"),
        Emoji("🇧🇶", "flag: Caribbean Netherlands"),
        Emoji("🇧🇷", "flag: Brazil"),
        Emoji("🇧🇸", "flag: Bahamas"),
        Emoji("🇧🇹", "flag: Bhutan"),
        Emoji("🇧🇻", "flag: Bouvet Island"),
        Emoji("🇧🇼", "flag: Botswana"),
        Emoji("🇧🇾", "flag: Belarus"),
        Emoji("🇧🇿", "flag: Belize"),
        Emoji("🇨🇦", "flag: Canada"),
        Emoji("🇨🇨", "flag: Cocos (Keeling) Islands"),
        Emoji("🇨🇩", "flag: Congo - Kinshasa"),
        Emoji("🇨🇫", "flag: Central African Republic"),
        Emoji("🇨🇬", "flag: Congo - Brazzaville"),
        Emoji("🇨🇭", "flag: Switzerland"),
        Emoji("🇨🇮", "flag: Côte d’Ivoire"),
        Emoji("🇨🇰", "flag: Cook Islands"),
        Emoji("🇨🇱", "flag: Chile"),
        Emoji("🇨🇲", "flag: Cameroon"),
        Emoji("🇨🇳", "flag: China"),
        Emoji("🇨🇴", "flag: Colombia"),
        Emoji("🇨🇵", "flag: Clipperton Island"),
        Emoji("🇨🇷", "flag: Costa Rica"),
        Emoji("🇨🇺", "flag: Cuba"),
        Emoji("🇨🇻", "flag: Cape Verde"),
        Emoji("🇨🇼", "flag: Curaçao"),
        Emoji("🇨🇽", "flag: Christmas Island"),
        Emoji("🇨🇾", "flag: Cyprus"),
        Emoji("🇨🇿", "flag: Czechia"),
        Emoji("🇩🇪", "flag: Germany"),
        Emoji("🇩🇬", "flag: Diego Garcia"),
        Emoji("🇩🇯", "flag: Djibouti"),
        Emoji("🇩🇰", "flag: Denmark"),
        Emoji("🇩🇲", "flag: Dominica"),
        Emoji("🇩🇴", "flag: Dominican Republic"),
        Emoji("🇩🇿", "flag: Algeria"),
        Emoji("🇪🇦", "flag: Ceuta & Melilla"),
        Emoji("🇪🇨", "flag: Ecuador"),
        Emoji("🇪🇪", "flag: Estonia"),
        Emoji("🇪🇬", "flag: Egypt"),
        Emoji("🇪🇭", "flag: Western Sahara"),
        Emoji("🇪🇷", "flag: Eritrea"),
        Emoji("🇪🇸", "flag: Spain"),
        Emoji("🇪🇹", "flag: Ethiopia"),
        Emoji("🇪🇺", "flag: European Union"),
        Emoji("🇫🇮", "flag: Finland"),
        Emoji("🇫🇯", "flag: Fiji"),
        Emoji("🇫🇰", "flag: Falkland Islands"),
        Emoji("🇫🇲", "flag: Micronesia"),
        Emoji("🇫🇴", "flag: Faroe Islands"),
        Emoji("🇫🇷", "flag: France"),
        Emoji("🇬🇦", "flag: Gabon"),
        Emoji("🇬🇧", "flag: United Kingdom"),
        Emoji("🇬🇩", "flag: Grenada"),
        Emoji("🇬🇪", "flag: Georgia"),
        Emoji("🇬🇫", "flag: French Guiana"),
        Emoji("🇬🇬", "flag: Guernsey"),
        Emoji("🇬🇭", "flag: Ghana"),
        Emoji("🇬🇮", "flag: Gibraltar"),
        Emoji("🇬🇱", "flag: Greenland"),
        Emoji("🇬🇲", "flag: Gambia"),
        Emoji("🇬🇳", "flag: Guinea"),
        Emoji("🇬🇵", "flag: Guadeloupe"),
        Emoji("🇬🇶", "flag: Equatorial Guinea"),
        Emoji("🇬🇷", "flag: Greece"),
        Emoji("🇬🇸", "flag: South Georgia & South Sandwich Islands"),
        Emoji("🇬🇹", "flag: Guatemala"),
        Emoji("🇬🇺", "flag: Guam"),
        Emoji("🇬🇼", "flag: Guinea-Bissau"),
        Emoji("🇬🇾", "flag: Guyana"),
        Emoji("🇭🇰", "flag: Hong Kong SAR China"),
        Emoji("🇭🇲", "flag: Heard & McDonald Islands"),
        Emoji("🇭🇳", "flag: Honduras"),
        Emoji("🇭🇷", "flag: Croatia"),
        Emoji("🇭🇹", "flag: Haiti"),
        Emoji("🇭🇺", "flag: Hungary"),
        Emoji("🇮🇨", "flag: Canary Islands"),
        Emoji("🇮🇩", "flag: Indonesia"),
        Emoji("🇮🇪", "flag: Ireland"),
        Emoji("🇮🇱", "flag: Israel"),
        Emoji("🇮🇲", "flag: Isle of Man"),
        Emoji("🇮🇳", "flag: India"),
        Emoji("🇮🇴", "flag: British Indian Ocean Territory"),
        Emoji("🇮🇶", "flag: Iraq"),
        Emoji("🇮🇷", "flag: Iran"),
        Emoji("🇮🇸", "flag: Iceland"),
        Emoji("🇮🇹", "flag: Italy"),
        Emoji("🇯🇪", "flag: Jersey"),
        Emoji("🇯🇲", "flag: Jamaica"),
        Emoji("🇯🇴", "flag: Jordan"),
        Emoji("🇯🇵", "flag: Japan"),
        Emoji("🇰🇪", "flag: Kenya"),
        Emoji("🇰🇬", "flag: Kyrgyzstan"),
        Emoji("🇰🇭", "flag: Cambodia"),
        Emoji("🇰🇮", "flag: Kiribati"),
        Emoji("🇰🇲", "flag: Comoros"),
        Emoji("🇰🇳", "flag: St. Kitts & Nevis"),
        Emoji("🇰🇵", "flag: North Korea"),
        Emoji("🇰🇷", "flag: South Korea"),
        Emoji("🇰🇼", "flag: Kuwait"),
        Emoji("🇰🇾", "flag: Cayman Islands"),
        Emoji("🇰🇿", "flag: Kazakhstan"),
        Emoji("🇱🇦", "flag: Laos"),
        Emoji("🇱🇧", "flag: Lebanon"),
        Emoji("🇱🇨", "flag: St. Lucia"),
        Emoji("🇱🇮", "flag: Liechtenstein"),
        Emoji("🇱🇰", "flag: Sri Lanka"),
        Emoji("🇱🇷", "flag: Liberia"),
        Emoji("🇱🇸", "flag: Lesotho"),
        Emoji("🇱🇹", "flag: Lithuania"),
        Emoji("🇱🇺", "flag: Luxembourg"),
        Emoji("🇱🇻", "flag: Latvia"),
        Emoji("🇱🇾", "flag: Libya"),
        Emoji("🇲🇦", "flag: Morocco"),
        Emoji("🇲🇨", "flag: Monaco"),
        Emoji("🇲🇩", "flag: Moldova"),
        Emoji("🇲🇪", "flag: Montenegro"),
        Emoji("🇲🇫", "flag: St. Martin"),
        Emoji("🇲🇬", "flag: Madagascar"),
        Emoji("🇲🇭", "flag: Marshall Islands"),
        Emoji("🇲🇰", "flag: North Macedonia"),
        Emoji("🇲🇱", "flag: Mali"),
        Emoji("🇲🇲", "flag: Myanmar (Burma)"),
        Emoji("🇲🇳", "flag: Mongolia"),
        Emoji("🇲🇴", "flag: Macao SAR China"),
        Emoji("🇲🇵", "flag: Northern Mariana Islands"),
        Emoji("🇲🇶", "flag: Martinique"),
        Emoji("🇲🇷", "flag: Mauritania"),
        Emoji("🇲🇸", "flag: Montserrat"),
        Emoji("🇲🇹", "flag: Malta"),
        Emoji("🇲🇺", "flag: Mauritius"),
        Emoji("🇲🇻", "flag: Maldives"),
        Emoji("🇲🇼", "flag: Malawi"),
        Emoji("🇲🇽", "flag: Mexico"),
        Emoji("🇲🇾", "flag: Malaysia"),
        Emoji("🇲🇿", "flag: Mozambique"),
        Emoji("🇳🇦", "flag: Namibia"),
        Emoji("🇳🇨", "flag: New Caledonia"),
        Emoji("🇳🇪", "flag: Niger"),
        Emoji("🇳🇫", "flag: Norfolk Island"),
        Emoji("🇳🇬", "flag: Nigeria"),
        Emoji("🇳🇮", "flag: Nicaragua"),
        Emoji("🇳🇱", "flag: Netherlands"),
        Emoji("🇳🇴", "flag: Norway"),
        Emoji("🇳🇵", "flag: Nepal"),
        Emoji("🇳🇷", "flag: Nauru"),
        Emoji("🇳🇺", "flag: Niue"),
        Emoji("🇳🇿", "flag: New Zealand"),
        Emoji("🇴🇲", "flag: Oman"),
        Emoji("🇵🇦", "flag: Panama"),
        Emoji("🇵🇪", "flag: Peru"),
        Emoji("🇵🇫", "flag: French Polynesia"),
        Emoji("🇵🇬", "flag: Papua New Guinea"),
        Emoji("🇵🇭", "flag: Philippines"),
        Emoji("🇵🇰", "flag: Pakistan"),
        Emoji("🇵🇱", "flag: Poland"),
        Emoji("🇵🇲", "flag: St. Pierre & Miquelon"),
        Emoji("🇵🇳", "flag: Pitcairn Islands"),
        Emoji("🇵🇷", "flag: Puerto Rico"),
        Emoji("🇵🇸", "flag: Palestinian Territories"),
        Emoji("🇵🇹", "flag: Portugal"),
        Emoji("🇵🇼", "flag: Palau"),
        Emoji("🇵🇾", "flag: Paraguay"),
        Emoji("🇶🇦", "flag: Qatar"),
        Emoji("🇷🇪", "flag: Réunion"),
        Emoji("🇷🇴", "flag: Romania"),
        Emoji("🇷🇸", "flag: Serbia"),
        Emoji("🇷🇺", "flag: Russia"),
        Emoji("🇷🇼", "flag: Rwanda"),
        Emoji("🇸🇦", "flag: Saudi Arabia"),
        Emoji("🇸🇧", "flag: Solomon Islands"),
        Emoji("🇸🇨", "flag: Seychelles"),
        Emoji("🇸🇩", "flag: Sudan"),
        Emoji("🇸🇪", "flag: Sweden"),
        Emoji("🇸🇬", "flag: Singapore"),
        Emoji("🇸🇭", "flag: St. Helena"),
        Emoji("🇸🇮", "flag: Slovenia"),
        Emoji("🇸🇯", "flag: Svalbard & Jan Mayen"),
        Emoji("🇸🇰", "flag: Slovakia"),
        Emoji("🇸🇱", "flag: Sierra Leone"),
        Emoji("🇸🇲", "flag: San Marino"),
        Emoji("🇸🇳", "flag: Senegal"),
        Emoji("🇸🇴", "flag: Somalia"),
        Emoji("🇸🇷", "flag: Suriname"),
        Emoji("🇸🇸", "flag: South Sudan"),
        Emoji("🇸🇹", "flag: São Tomé & Príncipe"),
        Emoji("🇸🇻", "flag: El Salvador"),
        Emoji("🇸🇽", "flag: Sint Maarten"),
        Emoji("🇸🇾", "flag: Syria"),
        Emoji("🇸🇿", "flag: Eswatini"),
        Emoji("🇹🇦", "flag: Tristan da Cunha"),
        Emoji("🇹🇨", "flag: Turks & Caicos Islands"),
        Emoji("🇹🇩", "flag: Chad"),
        Emoji("🇹🇫", "flag: French Southern Territories"),
        Emoji("🇹🇬", "flag: Togo"),
        Emoji("🇹🇭", "flag: Thailand"),
        Emoji("🇹🇯", "flag: Tajikistan"),
        Emoji("🇹🇰", "flag: Tokelau"),
        Emoji("🇹🇱", "flag: Timor-Leste"),
        Emoji("🇹🇲", "flag: Turkmenistan"),
        Emoji("🇹🇳", "flag: Tunisia"),
        Emoji("🇹🇴", "flag: Tonga"),
        Emoji("🇹🇷", "flag: Turkey"),
        Emoji("🇹🇹", "flag: Trinidad & Tobago"),
        Emoji("🇹🇻", "flag: Tuvalu"),
        Emoji("🇹🇼", "flag: Taiwan"),
        Emoji("🇹🇿", "flag: Tanzania"),
        Emoji("🇺🇦", "flag: Ukraine"),
        Emoji("🇺🇬", "flag: Uganda"),
        Emoji("🇺🇲", "flag: U.S. Outlying Islands"),
        Emoji("🇺🇳", "flag: United Nations"),
        Emoji("🇺🇸", "flag: United States"),
        Emoji("🇺🇾", "flag: Uruguay"),
        Emoji("🇺🇿", "flag: Uzbekistan"),
        Emoji("🇻🇦", "flag: Vatican City"),
        Emoji("🇻🇨", "flag: St. Vincent & Grenadines"),
        Emoji("🇻🇪", "flag: Venezuela"),
        Emoji("🇻🇬", "flag: British Virgin Islands"),
        Emoji("🇻🇮", "flag: U.S. Virgin Islands"),
        Emoji("🇻🇳", "flag: Vietnam"),
        Emoji("🇻🇺", "flag: Vanuatu"),
        Emoji("🇼🇫", "flag: Wallis & Futuna"),
        Emoji("🇼🇸", "flag: Samoa"),
        Emoji("🇽🇰", "flag: Kosovo"),
        Emoji("🇾🇪", "flag: Yemen"),
        Emoji("🇾🇹", "flag: Mayotte"),
        Emoji("🇿🇦", "flag: South Africa"),
        Emoji("🇿🇲", "flag: Zambia"),
        Emoji("🇿🇼", "flag: Zimbabwe"),
        //subgroup: subdivision-flag
        Emoji("🏴󠁧󠁢󠁥󠁮󠁧󠁿", "flag: England"),
        Emoji("🏴󠁧󠁢󠁳󠁣󠁴󠁿", "flag: Scotland"),
        Emoji("🏴󠁧󠁢󠁷󠁬󠁳󠁿", "flag: Wales")
    )
    val food = arrayOf(
        //group: Food & Drink
        //subgroup: food-fruit
        Emoji("🍇", "grapes"),
        Emoji("🍈", "melon"),
        Emoji("🍉", "watermelon"),
        Emoji("🍊", "tangerine"),
        Emoji("🍋", "lemon"),
        Emoji("🍌", "banana"),
        Emoji("🍍", "pineapple"),
        Emoji("🥭", "mango"),
        Emoji("🍎", "red apple"),
        Emoji("🍏", "green apple"),
        Emoji("🍐", "pear"),
        Emoji("🍑", "peach"),
        Emoji("🍒", "cherries"),
        Emoji("🍓", "strawberry"),
        Emoji("🥝", "kiwi fruit"),
        Emoji("🍅", "tomato"),
        Emoji("🥥", "coconut"),
        //subgroup: food-vegetable
        Emoji("🥑", "avocado"),
        Emoji("🍆", "eggplant"),
        Emoji("🥔", "potato"),
        Emoji("🥕", "carrot"),
        Emoji("🌽", "ear of corn"),
        Emoji("🌶️", "hot pepper"),
        Emoji("🥒", "cucumber"),
        Emoji("🥬", "leafy green"),
        Emoji("🥦", "broccoli"),
        Emoji("🧄", "garlic"),
        Emoji("🧅", "onion"),
        Emoji("🍄", "mushroom"),
        Emoji("🥜", "peanuts"),
        Emoji("🌰", "chestnut"),
        //subgroup: food-prepared
        Emoji("🍞", "bread"),
        Emoji("🥐", "croissant"),
        Emoji("🥖", "baguette bread"),
        Emoji("🥨", "pretzel"),
        Emoji("🥯", "bagel"),
        Emoji("🥞", "pancakes"),
        Emoji("🧇", "waffle"),
        Emoji("🧀", "cheese wedge"),
        Emoji("🍖", "meat on bone"),
        Emoji("🍗", "poultry leg"),
        Emoji("🥩", "cut of meat"),
        Emoji("🥓", "bacon"),
        Emoji("🍔", "hamburger"),
        Emoji("🍟", "french fries"),
        Emoji("🍕", "pizza"),
        Emoji("🌭", "hot dog"),
        Emoji("🥪", "sandwich"),
        Emoji("🌮", "taco"),
        Emoji("🌯", "burrito"),
        Emoji("🥙", "stuffed flatbread"),
        Emoji("🧆", "falafel"),
        Emoji("🥚", "egg"),
        Emoji("🍳", "cooking"),
        Emoji("🥘", "shallow pan of food"),
        Emoji("🍲", "pot of food"),
        Emoji("🥣", "bowl with spoon"),
        Emoji("🥗", "green salad"),
        Emoji("🍿", "popcorn"),
        Emoji("🧈", "butter"),
        Emoji("🧂", "salt"),
        Emoji("🥫", "canned food"),
        //subgroup: food-asian
        Emoji("🍱", "bento box"),
        Emoji("🍘", "rice cracker"),
        Emoji("🍙", "rice ball"),
        Emoji("🍚", "cooked rice"),
        Emoji("🍛", "curry rice"),
        Emoji("🍜", "steaming bowl"),
        Emoji("🍝", "spaghetti"),
        Emoji("🍠", "roasted sweet potato"),
        Emoji("🍢", "oden"),
        Emoji("🍣", "sushi"),
        Emoji("🍤", "fried shrimp"),
        Emoji("🍥", "fish cake with swirl"),
        Emoji("🥮", "moon cake"),
        Emoji("🍡", "dango"),
        Emoji("🥟", "dumpling"),
        Emoji("🥠", "fortune cookie"),
        Emoji("🥡", "takeout box"),
        //subgroup: food-marine
        Emoji("🦀", "crab"),
        Emoji("🦞", "lobster"),
        Emoji("🦐", "shrimp"),
        Emoji("🦑", "squid"),
        Emoji("🦪", "oyster"),
        //subgroup: food-sweet
        Emoji("🍦", "soft ice cream"),
        Emoji("🍧", "shaved ice"),
        Emoji("🍨", "ice cream"),
        Emoji("🍩", "doughnut"),
        Emoji("🍪", "cookie"),
        Emoji("🎂", "birthday cake"),
        Emoji("🍰", "shortcake"),
        Emoji("🧁", "cupcake"),
        Emoji("🥧", "pie"),
        Emoji("🍫", "chocolate bar"),
        Emoji("🍬", "candy"),
        Emoji("🍭", "lollipop"),
        Emoji("🍮", "custard"),
        Emoji("🍯", "honey pot"),
        //subgroup: drink
        Emoji("🍼", "baby bottle"),
        Emoji("🥛", "glass of milk"),
        Emoji("☕", "hot beverage"),
        Emoji("🍵", "teacup without handle"),
        Emoji("🍶", "sake"),
        Emoji("🍾", "bottle with popping cork"),
        Emoji("🍷", "wine glass"),
        Emoji("🍸", "cocktail glass"),
        Emoji("🍹", "tropical drink"),
        Emoji("🍺", "beer mug"),
        Emoji("🍻", "clinking beer mugs"),
        Emoji("🥂", "clinking glasses"),
        Emoji("🥃", "tumbler glass"),
        Emoji("🥤", "cup with straw"),
        Emoji("🧃", "beverage box"),
        Emoji("🧉", "mate"),
        Emoji("🧊", "ice"),
        //subgroup: dishware
        Emoji("🥢", "chopsticks"),
        Emoji("🍽️", "fork and knife with plate"),
        Emoji("🍴", "fork and knife"),
        Emoji("🥄", "spoon"),
        Emoji("🔪", "kitchen knife"),
        Emoji("🏺", "amphora")
    )
    val nature = arrayOf(
        //group: Animals & Nature
        //subgroup: animal-mammal
        Emoji("🐵", "monkey face"),
        Emoji("🐒", "monkey"),
        Emoji("🦍", "gorilla"),
        Emoji("🦧", "orangutan"),
        Emoji("🐶", "dog face"),
        Emoji("🐕", "dog"),
        Emoji("🦮", "guide dog"),
        Emoji("🐕‍🦺", "service dog"),
        Emoji("🐩", "poodle"),
        Emoji("🐺", "wolf"),
        Emoji("🦊", "fox"),
        Emoji("🦝", "raccoon"),
        Emoji("🐱", "cat face"),
        Emoji("🐈", "cat"),
        Emoji("🦁", "lion"),
        Emoji("🐯", "tiger face"),
        Emoji("🐅", "tiger"),
        Emoji("🐆", "leopard"),
        Emoji("🐴", "horse face"),
        Emoji("🐎", "horse"),
        Emoji("🦄", "unicorn"),
        Emoji("🦓", "zebra"),
        Emoji("🦌", "deer"),
        Emoji("🐮", "cow face"),
        Emoji("🐂", "ox"),
        Emoji("🐃", "water buffalo"),
        Emoji("🐄", "cow"),
        Emoji("🐷", "pig face"),
        Emoji("🐖", "pig"),
        Emoji("🐗", "boar"),
        Emoji("🐽", "pig nose"),
        Emoji("🐏", "ram"),
        Emoji("🐑", "ewe"),
        Emoji("🐐", "goat"),
        Emoji("🐪", "camel"),
        Emoji("🐫", "two-hump camel"),
        Emoji("🦙", "llama"),
        Emoji("🦒", "giraffe"),
        Emoji("🐘", "elephant"),
        Emoji("🦏", "rhinoceros"),
        Emoji("🦛", "hippopotamus"),
        Emoji("🐭", "mouse face"),
        Emoji("🐁", "mouse"),
        Emoji("🐀", "rat"),
        Emoji("🐹", "hamster"),
        Emoji("🐰", "rabbit face"),
        Emoji("🐇", "rabbit"),
        Emoji("🐿️", "chipmunk"),
        Emoji("🦔", "hedgehog"),
        Emoji("🦇", "bat"),
        Emoji("🐻", "bear"),
        Emoji("🐨", "koala"),
        Emoji("🐼", "panda"),
        Emoji("🦥", "sloth"),
        Emoji("🦦", "otter"),
        Emoji("🦨", "skunk"),
        Emoji("🦘", "kangaroo"),
        Emoji("🦡", "badger"),
        Emoji("🐾", "paw prints"),
        //subgroup: animal-bird
        Emoji("🦃", "turkey"),
        Emoji("🐔", "chicken"),
        Emoji("🐓", "rooster"),
        Emoji("🐣", "hatching chick"),
        Emoji("🐤", "baby chick"),
        Emoji("🐥", "front-facing baby chick"),
        Emoji("🐦", "bird"),
        Emoji("🐧", "penguin"),
        Emoji("🕊️", "dove"),
        Emoji("🦅", "eagle"),
        Emoji("🦆", "duck"),
        Emoji("🦢", "swan"),
        Emoji("🦉", "owl"),
        Emoji("🦩", "flamingo"),
        Emoji("🦚", "peacock"),
        Emoji("🦜", "parrot"),
        //subgroup: animal-amphibian
        Emoji("🐸", "frog"),
        //subgroup: animal-reptile
        Emoji("🐊", "crocodile"),
        Emoji("🐢", "turtle"),
        Emoji("🦎", "lizard"),
        Emoji("🐍", "snake"),
        Emoji("🐲", "dragon face"),
        Emoji("🐉", "dragon"),
        Emoji("🦕", "sauropod"),
        Emoji("🦖", "T-Rex"),
        //subgroup: animal-marine
        Emoji("🐳", "spouting whale"),
        Emoji("🐋", "whale"),
        Emoji("🐬", "dolphin"),
        Emoji("🐟", "fish"),
        Emoji("🐠", "tropical fish"),
        Emoji("🐡", "blowfish"),
        Emoji("🦈", "shark"),
        Emoji("🐙", "octopus"),
        Emoji("🐚", "spiral shell"),
        //subgroup: animal-bug
        Emoji("🐌", "snail"),
        Emoji("🦋", "butterfly"),
        Emoji("🐛", "bug"),
        Emoji("🐜", "ant"),
        Emoji("🐝", "honeybee"),
        Emoji("🐞", "lady beetle"),
        Emoji("🦗", "cricket"),
        Emoji("🕷️", "spider"),
        Emoji("🕸️", "spider web"),
        Emoji("🦂", "scorpion"),
        Emoji("🦟", "mosquito"),
        Emoji("🦠", "microbe"),
        //subgroup: plant-flower
        Emoji("💐", "bouquet"),
        Emoji("🌸", "cherry blossom"),
        Emoji("💮", "white flower"),
        Emoji("🏵️", "rosette"),
        Emoji("🌹", "rose"),
        Emoji("🥀", "wilted flower"),
        Emoji("🌺", "hibiscus"),
        Emoji("🌻", "sunflower"),
        Emoji("🌼", "blossom"),
        Emoji("🌷", "tulip"),
        //subgroup: plant-other
        Emoji("🌱", "seedling"),
        Emoji("🌲", "evergreen tree"),
        Emoji("🌳", "deciduous tree"),
        Emoji("🌴", "palm tree"),
        Emoji("🌵", "cactus"),
        Emoji("🌾", "sheaf of rice"),
        Emoji("🌿", "herb"),
        Emoji("☘️", "shamrock"),
        Emoji("🍀", "four leaf clover"),
        Emoji("🍁", "maple leaf"),
        Emoji("🍂", "fallen leaf"),
        Emoji("🍃", "leaf fluttering in wind")
    )
    val objects = arrayOf(
        //group: Objects
        //subgroup: clothing
        Emoji("👓", "glasses"),
        Emoji("🕶️", "sunglasses"),
        Emoji("🥽", "goggles"),
        Emoji("🥼", "lab coat"),
        Emoji("🦺", "safety vest"),
        Emoji("👔", "necktie"),
        Emoji("👕", "t-shirt"),
        Emoji("👖", "jeans"),
        Emoji("🧣", "scarf"),
        Emoji("🧤", "gloves"),
        Emoji("🧥", "coat"),
        Emoji("🧦", "socks"),
        Emoji("👗", "dress"),
        Emoji("👘", "kimono"),
        Emoji("🥻", "sari"),
        Emoji("🩱", "one-piece swimsuit"),
        Emoji("🩲", "briefs"),
        Emoji("🩳", "shorts"),
        Emoji("👙", "bikini"),
        Emoji("👚", "woman’s clothes"),
        Emoji("👛", "purse"),
        Emoji("👜", "handbag"),
        Emoji("👝", "clutch bag"),
        Emoji("🛍️", "shopping bags"),
        Emoji("🎒", "backpack"),
        Emoji("👞", "man’s shoe"),
        Emoji("👟", "running shoe"),
        Emoji("🥾", "hiking boot"),
        Emoji("🥿", "flat shoe"),
        Emoji("👠", "high-heeled shoe"),
        Emoji("👡", "woman’s sandal"),
        Emoji("🩰", "ballet shoes"),
        Emoji("👢", "woman’s boot"),
        Emoji("👑", "crown"),
        Emoji("👒", "woman’s hat"),
        Emoji("🎩", "top hat"),
        Emoji("🎓", "graduation cap"),
        Emoji("🧢", "billed cap"),
        Emoji("⛑️", "rescue worker’s helmet"),
        Emoji("📿", "prayer beads"),
        Emoji("💄", "lipstick"),
        Emoji("💍", "ring"),
        Emoji("💎", "gem stone"),
        //subgroup: sound
        Emoji("🔇", "muted speaker"),
        Emoji("🔈", "speaker low volume"),
        Emoji("🔉", "speaker medium volume"),
        Emoji("🔊", "speaker high volume"),
        Emoji("📢", "loudspeaker"),
        Emoji("📣", "megaphone"),
        Emoji("📯", "postal horn"),
        Emoji("🔔", "bell"),
        Emoji("🔕", "bell with slash"),
        //subgroup: music
        Emoji("🎼", "musical score"),
        Emoji("🎵", "musical note"),
        Emoji("🎶", "musical notes"),
        Emoji("🎙️", "studio microphone"),
        Emoji("🎚️", "level slider"),
        Emoji("🎛️", "control knobs"),
        Emoji("🎤", "microphone"),
        Emoji("🎧", "headphone"),
        Emoji("📻", "radio"),
        //subgroup: musical-instrument
        Emoji("🎷", "saxophone"),
        Emoji("🎸", "guitar"),
        Emoji("🎹", "musical keyboard"),
        Emoji("🎺", "trumpet"),
        Emoji("🎻", "violin"),
        Emoji("🪕", "banjo"),
        Emoji("🥁", "drum"),
        //subgroup: phone
        Emoji("📱", "mobile phone"),
        Emoji("📲", "mobile phone with arrow"),
        Emoji("☎️", "telephone"),
        Emoji("📞", "telephone receiver"),
        Emoji("📟", "pager"),
        Emoji("📠", "fax machine"),
        //subgroup: computer
        Emoji("🔋", "battery"),
        Emoji("🔌", "electric plug"),
        Emoji("💻", "laptop"),
        Emoji("🖥️", "desktop computer"),
        Emoji("🖨️", "printer"),
        Emoji("⌨️", "keyboard"),
        Emoji("🖱️", "computer mouse"),
        Emoji("🖲️", "trackball"),
        Emoji("💽", "computer disk"),
        Emoji("💾", "floppy disk"),
        Emoji("💿", "optical disk"),
        Emoji("📀", "dvd"),
        Emoji("🧮", "abacus"),
        //subgroup: light & video
        Emoji("🎥", "movie camera"),
        Emoji("🎞️", "film frames"),
        Emoji("📽️", "film projector"),
        Emoji("🎬", "clapper board"),
        Emoji("📺", "television"),
        Emoji("📷", "camera"),
        Emoji("📸", "camera with flash"),
        Emoji("📹", "video camera"),
        Emoji("📼", "videocassette"),
        Emoji("🔍", "magnifying glass tilted left"),
        Emoji("🔎", "magnifying glass tilted right"),
        Emoji("🕯️", "candle"),
        Emoji("💡", "light bulb"),
        Emoji("🔦", "flashlight"),
        Emoji("🏮", "red paper lantern"),
        Emoji("🪔", "diya lamp"),
        //subgroup: book-paper
        Emoji("📔", "notebook with decorative cover"),
        Emoji("📕", "closed book"),
        Emoji("📖", "open book"),
        Emoji("📗", "green book"),
        Emoji("📘", "blue book"),
        Emoji("📙", "orange book"),
        Emoji("📚", "books"),
        Emoji("📓", "notebook"),
        Emoji("📒", "ledger"),
        Emoji("📃", "page with curl"),
        Emoji("📜", "scroll"),
        Emoji("📄", "page facing up"),
        Emoji("📰", "newspaper"),
        Emoji("🗞️", "rolled-up newspaper"),
        Emoji("📑", "bookmark tabs"),
        Emoji("🔖", "bookmark"),
        Emoji("🏷️", "label"),
        //subgroup: money
        Emoji("💰", "money bag"),
        Emoji("💴", "yen banknote"),
        Emoji("💵", "dollar banknote"),
        Emoji("💶", "euro banknote"),
        Emoji("💷", "pound banknote"),
        Emoji("💸", "money with wings"),
        Emoji("💳", "credit card"),
        Emoji("🧾", "receipt"),
        Emoji("💹", "chart increasing with yen"),
        Emoji("💱", "currency exchange"),
        Emoji("💲", "heavy dollar sign"),
        //subgroup: mail
        Emoji("✉️", "envelope"),
        Emoji("📧", "e-mail"),
        Emoji("📨", "incoming envelope"),
        Emoji("📩", "envelope with arrow"),
        Emoji("📤", "outbox tray"),
        Emoji("📥", "inbox tray"),
        Emoji("📦", "package"),
        Emoji("📫", "closed mailbox with raised flag"),
        Emoji("📪", "closed mailbox with lowered flag"),
        Emoji("📬", "open mailbox with raised flag"),
        Emoji("📭", "open mailbox with lowered flag"),
        Emoji("📮", "postbox"),
        Emoji("🗳️", "ballot box with ballot"),
        //subgroup: writing
        Emoji("✏️", "pencil"),
        Emoji("✒️", "black nib"),
        Emoji("🖋️", "fountain pen"),
        Emoji("🖊️", "pen"),
        Emoji("🖌️", "paintbrush"),
        Emoji("🖍️", "crayon"),
        Emoji("📝", "memo"),
        //subgroup: office
        Emoji("💼", "briefcase"),
        Emoji("📁", "file folder"),
        Emoji("📂", "open file folder"),
        Emoji("🗂️", "card index dividers"),
        Emoji("📅", "calendar"),
        Emoji("📆", "tear-off calendar"),
        Emoji("🗒️", "spiral notepad"),
        Emoji("🗓️", "spiral calendar"),
        Emoji("📇", "card index"),
        Emoji("📈", "chart increasing"),
        Emoji("📉", "chart decreasing"),
        Emoji("📊", "bar chart"),
        Emoji("📋", "clipboard"),
        Emoji("📌", "pushpin"),
        Emoji("📍", "round pushpin"),
        Emoji("📎", "paperclip"),
        Emoji("🖇️", "linked paperclips"),
        Emoji("📏", "straight ruler"),
        Emoji("📐", "triangular ruler"),
        Emoji("✂️", "scissors"),
        Emoji("🗃️", "card file box"),
        Emoji("🗄️", "file cabinet"),
        Emoji("🗑️", "wastebasket"),
        //subgroup: lock
        Emoji("🔒", "locked"),
        Emoji("🔓", "unlocked"),
        Emoji("🔏", "locked with pen"),
        Emoji("🔐", "locked with key"),
        Emoji("🔑", "key"),
        Emoji("🗝️", "old key"),
        //subgroup: tool
        Emoji("🔨", "hammer"),
        Emoji("🪓", "axe"),
        Emoji("⛏️", "pick"),
        Emoji("⚒️", "hammer and pick"),
        Emoji("🛠️", "hammer and wrench"),
        Emoji("🗡️", "dagger"),
        Emoji("⚔️", "crossed swords"),
        Emoji("🔫", "pistol"),
        Emoji("🏹", "bow and arrow"),
        Emoji("🛡️", "shield"),
        Emoji("🔧", "wrench"),
        Emoji("🔩", "nut and bolt"),
        Emoji("⚙️", "gear"),
        Emoji("🗜️", "clamp"),
        Emoji("⚖️", "balance scale"),
        Emoji("🦯", "probing cane"),
        Emoji("🔗", "link"),
        Emoji("⛓️", "chains"),
        Emoji("🧰", "toolbox"),
        Emoji("🧲", "magnet"),
        //subgroup: science
        Emoji("⚗️", "alembic"),
        Emoji("🧪", "test tube"),
        Emoji("🧫", "petri dish"),
        Emoji("🧬", "dna"),
        Emoji("🔬", "microscope"),
        Emoji("🔭", "telescope"),
        Emoji("📡", "satellite antenna"),
        //subgroup: medical
        Emoji("💉", "syringe"),
        Emoji("🩸", "drop of blood"),
        Emoji("💊", "pill"),
        Emoji("🩹", "adhesive bandage"),
        Emoji("🩺", "stethoscope"),
        //subgroup: household
        Emoji("🚪", "door"),
        Emoji("🛏️", "bed"),
        Emoji("🛋️", "couch and lamp"),
        Emoji("🪑", "chair"),
        Emoji("🚽", "toilet"),
        Emoji("🚿", "shower"),
        Emoji("🛁", "bathtub"),
        Emoji("🪒", "razor"),
        Emoji("🧴", "lotion bottle"),
        Emoji("🧷", "safety pin"),
        Emoji("🧹", "broom"),
        Emoji("🧺", "basket"),
        Emoji("🧻", "roll of paper"),
        Emoji("🧼", "soap"),
        Emoji("🧽", "sponge"),
        Emoji("🧯", "fire extinguisher"),
        Emoji("🛒", "shopping cart"),
        //subgroup: other-object
        Emoji("🚬", "cigarette"),
        Emoji("⚰️", "coffin"),
        Emoji("⚱️", "funeral urn"),
        Emoji("🗿", "moai")
    )
    val people = arrayOf(
        //group: Smileys & Emotion
        //subgroup: face-smiling
        Emoji("😀", "grinning face"),
        Emoji("😃", "grinning face with big eyes"),
        Emoji("😄", "grinning face with smiling eyes"),
        Emoji("😁", "beaming face with smiling eyes"),
        Emoji("😆", "grinning squinting face"),
        Emoji("😅", "grinning face with sweat"),
        Emoji("🤣", "rolling on the floor laughing"),
        Emoji("😂", "face with tears of joy"),
        Emoji("🙂", "slightly smiling face"),
        Emoji("🙃", "upside-down face"),
        Emoji("😉", "winking face"),
        Emoji("😊", "smiling face with smiling eyes"),
        Emoji("😇", "smiling face with halo"),
        //subgroup: face-affection
        Emoji("🥰", "smiling face with hearts"),
        Emoji("😍", "smiling face with heart-eyes"),
        Emoji("🤩", "star-struck"),
        Emoji("😘", "face blowing a kiss"),
        Emoji("😗", "kissing face"),
        Emoji("☺️", "smiling face"),
        Emoji("😚", "kissing face with closed eyes"),
        Emoji("😙", "kissing face with smiling eyes"),
        //subgroup: face-tongue
        Emoji("😋", "face savoring food"),
        Emoji("😛", "face with tongue"),
        Emoji("😜", "winking face with tongue"),
        Emoji("🤪", "zany face"),
        Emoji("😝", "squinting face with tongue"),
        Emoji("🤑", "money-mouth face"),
        //subgroup: face-hand
        Emoji("🤗", "hugging face"),
        Emoji("🤭", "face with hand over mouth"),
        Emoji("🤫", "shushing face"),
        Emoji("🤔", "thinking face"),
        //subgroup: face-neutral-skeptical
        Emoji("🤐", "zipper-mouth face"),
        Emoji("🤨", "face with raised eyebrow"),
        Emoji("😐", "neutral face"),
        Emoji("😑", "expressionless face"),
        Emoji("😶", "face without mouth"),
        Emoji("😏", "smirking face"),
        Emoji("😒", "unamused face"),
        Emoji("🙄", "face with rolling eyes"),
        Emoji("😬", "grimacing face"),
        Emoji("🤥", "lying face"),
        //subgroup: face-sleepy
        Emoji("😌", "relieved face"),
        Emoji("😔", "pensive face"),
        Emoji("😪", "sleepy face"),
        Emoji("🤤", "drooling face"),
        Emoji("😴", "sleeping face"),
        //subgroup: face-unwell
        Emoji("😷", "face with medical mask"),
        Emoji("🤒", "face with thermometer"),
        Emoji("🤕", "face with head-bandage"),
        Emoji("🤢", "nauseated face"),
        Emoji("🤮", "face vomiting"),
        Emoji("🤧", "sneezing face"),
        Emoji("🥵", "hot face"),
        Emoji("🥶", "cold face"),
        Emoji("🥴", "woozy face"),
        Emoji("😵", "dizzy face"),
        Emoji("🤯", "exploding head"),
        //subgroup: face-hat
        Emoji("🤠", "cowboy hat face"),
        Emoji("🥳", "partying face"),
        //subgroup: face-glasses
        Emoji("😎", "smiling face with sunglasses"),
        Emoji("🤓", "nerd face"),
        Emoji("🧐", "face with monocle"),
        //subgroup: face-concerned
        Emoji("😕", "confused face"),
        Emoji("😟", "worried face"),
        Emoji("🙁", "slightly frowning face"),
        Emoji("☹️", "frowning face"),
        Emoji("😮", "face with open mouth"),
        Emoji("😯", "hushed face"),
        Emoji("😲", "astonished face"),
        Emoji("😳", "flushed face"),
        Emoji("🥺", "pleading face"),
        Emoji("😦", "frowning face with open mouth"),
        Emoji("😧", "anguished face"),
        Emoji("😨", "fearful face"),
        Emoji("😰", "anxious face with sweat"),
        Emoji("😥", "sad but relieved face"),
        Emoji("😢", "crying face"),
        Emoji("😭", "loudly crying face"),
        Emoji("😱", "face screaming in fear"),
        Emoji("😖", "confounded face"),
        Emoji("😣", "persevering face"),
        Emoji("😞", "disappointed face"),
        Emoji("😓", "downcast face with sweat"),
        Emoji("😩", "weary face"),
        Emoji("😫", "tired face"),
        Emoji("🥱", "yawning face"),
        //subgroup: face-negative
        Emoji("😤", "face with steam from nose"),
        Emoji("😡", "pouting face"),
        Emoji("😠", "angry face"),
        Emoji("🤬", "face with symbols on mouth"),
        Emoji("😈", "smiling face with horns"),
        Emoji("👿", "angry face with horns"),
        Emoji("💀", "skull"),
        Emoji("☠️", "skull and crossbones"),
        //subgroup: face-costume
        Emoji("💩", "pile of poo"),
        Emoji("🤡", "clown face"),
        Emoji("👹", "ogre"),
        Emoji("👺", "goblin"),
        Emoji("👻", "ghost"),
        Emoji("👽", "alien"),
        Emoji("👾", "alien monster"),
        Emoji("🤖", "robot"),
        //subgroup: cat-face
        Emoji("😺", "grinning cat"),
        Emoji("😸", "grinning cat with smiling eyes"),
        Emoji("😹", "cat with tears of joy"),
        Emoji("😻", "smiling cat with heart-eyes"),
        Emoji("😼", "cat with wry smile"),
        Emoji("😽", "kissing cat"),
        Emoji("🙀", "weary cat"),
        Emoji("😿", "crying cat"),
        Emoji("😾", "pouting cat"),
        //subgroup: monkey-face
        Emoji("🙈", "see-no-evil monkey"),
        Emoji("🙉", "hear-no-evil monkey"),
        Emoji("🙊", "speak-no-evil monkey"),
        //subgroup: emotion
        Emoji("💋", "kiss mark"),
        Emoji("💌", "love letter"),
        Emoji("💘", "heart with arrow"),
        Emoji("💝", "heart with ribbon"),
        Emoji("💖", "sparkling heart"),
        Emoji("💗", "growing heart"),
        Emoji("💓", "beating heart"),
        Emoji("💞", "revolving hearts"),
        Emoji("💕", "two hearts"),
        Emoji("💟", "heart decoration"),
        Emoji("❣️", "heart exclamation"),
        Emoji("💔", "broken heart"),
        Emoji("❤️", "red heart"),
        Emoji("🧡", "orange heart"),
        Emoji("💛", "yellow heart"),
        Emoji("💚", "green heart"),
        Emoji("💙", "blue heart"),
        Emoji("💜", "purple heart"),
        Emoji("🤎", "brown heart"),
        Emoji("🖤", "black heart"),
        Emoji("🤍", "white heart"),
        Emoji("💯", "hundred points"),
        Emoji("💢", "anger symbol"),
        Emoji("💥", "collision"),
        Emoji("💫", "dizzy"),
        Emoji("💦", "sweat droplets"),
        Emoji("💨", "dashing away"),
        Emoji("🕳️", "hole"),
        Emoji("💣", "bomb"),
        Emoji("💬", "speech balloon"),
        Emoji("👁️‍🗨️", "eye in speech bubble"),
        Emoji("🗨️", "left speech bubble"),
        Emoji("🗯️", "right anger bubble"),
        Emoji("💭", "thought balloon"),
        Emoji("💤", "zzz"),
        //group: People & Body
        //subgroup: hand-fingers-open
        EmojiWithSkinTone(
            "👋",
            "waving hand",
            arrayOf(
                Emoji("👋🏻", "waving hand: light skin tone"),
                Emoji("👋🏼", "waving hand: medium-light skin tone"),
                Emoji("👋🏽", "waving hand: medium skin tone"),
                Emoji("👋🏾", "waving hand: medium-dark skin tone"),
                Emoji("👋🏿", "waving hand: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🤚",
            "raised back of hand",
            arrayOf(
                Emoji("🤚🏻", "raised back of hand: light skin tone"),
                Emoji("🤚🏼", "raised back of hand: medium-light skin tone"),
                Emoji("🤚🏽", "raised back of hand: medium skin tone"),
                Emoji("🤚🏾", "raised back of hand: medium-dark skin tone"),
                Emoji("🤚🏿", "raised back of hand: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🖐️",
            "hand with fingers splayed",
            arrayOf(
                Emoji("🖐🏻", "hand with fingers splayed: light skin tone"),
                Emoji("🖐🏼", "hand with fingers splayed: medium-light skin tone"),
                Emoji("🖐🏽", "hand with fingers splayed: medium skin tone"),
                Emoji("🖐🏾", "hand with fingers splayed: medium-dark skin tone"),
                Emoji("🖐🏿", "hand with fingers splayed: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "✋",
            "raised hand",
            arrayOf(
                Emoji("✋🏻", "raised hand: light skin tone"),
                Emoji("✋🏼", "raised hand: medium-light skin tone"),
                Emoji("✋🏽", "raised hand: medium skin tone"),
                Emoji("✋🏾", "raised hand: medium-dark skin tone"),
                Emoji("✋🏿", "raised hand: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🖖",
            "vulcan salute",
            arrayOf(
                Emoji("🖖🏻", "vulcan salute: light skin tone"),
                Emoji("🖖🏼", "vulcan salute: medium-light skin tone"),
                Emoji("🖖🏽", "vulcan salute: medium skin tone"),
                Emoji("🖖🏾", "vulcan salute: medium-dark skin tone"),
                Emoji("🖖🏿", "vulcan salute: dark skin tone")
            )
        ),
        //subgroup: hand-fingers-partial
        EmojiWithSkinTone(
            "👌",
            "OK hand",
            arrayOf(
                Emoji("👌🏻", "OK hand: light skin tone"),
                Emoji("👌🏼", "OK hand: medium-light skin tone"),
                Emoji("👌🏽", "OK hand: medium skin tone"),
                Emoji("👌🏾", "OK hand: medium-dark skin tone"),
                Emoji("👌🏿", "OK hand: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🤏",
            "pinching hand",
            arrayOf(
                Emoji("🤏🏻", "pinching hand: light skin tone"),
                Emoji("🤏🏼", "pinching hand: medium-light skin tone"),
                Emoji("🤏🏽", "pinching hand: medium skin tone"),
                Emoji("🤏🏾", "pinching hand: medium-dark skin tone"),
                Emoji("🤏🏿", "pinching hand: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "✌️",
            "victory hand",
            arrayOf(
                Emoji("✌🏻", "victory hand: light skin tone"),
                Emoji("✌🏼", "victory hand: medium-light skin tone"),
                Emoji("✌🏽", "victory hand: medium skin tone"),
                Emoji("✌🏾", "victory hand: medium-dark skin tone"),
                Emoji("✌🏿", "victory hand: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🤞",
            "crossed fingers",
            arrayOf(
                Emoji("🤞🏻", "crossed fingers: light skin tone"),
                Emoji("🤞🏼", "crossed fingers: medium-light skin tone"),
                Emoji("🤞🏽", "crossed fingers: medium skin tone"),
                Emoji("🤞🏾", "crossed fingers: medium-dark skin tone"),
                Emoji("🤞🏿", "crossed fingers: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🤟",
            "love-you gesture",
            arrayOf(
                Emoji("🤟🏻", "love-you gesture: light skin tone"),
                Emoji("🤟🏼", "love-you gesture: medium-light skin tone"),
                Emoji("🤟🏽", "love-you gesture: medium skin tone"),
                Emoji("🤟🏾", "love-you gesture: medium-dark skin tone"),
                Emoji("🤟🏿", "love-you gesture: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🤘",
            "sign of the horns",
            arrayOf(
                Emoji("🤘🏻", "sign of the horns: light skin tone"),
                Emoji("🤘🏼", "sign of the horns: medium-light skin tone"),
                Emoji("🤘🏽", "sign of the horns: medium skin tone"),
                Emoji("🤘🏾", "sign of the horns: medium-dark skin tone"),
                Emoji("🤘🏿", "sign of the horns: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🤙",
            "call me hand",
            arrayOf(
                Emoji("🤙🏻", "call me hand: light skin tone"),
                Emoji("🤙🏼", "call me hand: medium-light skin tone"),
                Emoji("🤙🏽", "call me hand: medium skin tone"),
                Emoji("🤙🏾", "call me hand: medium-dark skin tone"),
                Emoji("🤙🏿", "call me hand: dark skin tone")
            )
        ),
        //subgroup: hand-single-finger
        EmojiWithSkinTone(
            "👈",
            "backhand index pointing left",
            arrayOf(
                Emoji("👈🏻", "backhand index pointing left: light skin tone"),
                Emoji("👈🏼", "backhand index pointing left: medium-light skin tone"),
                Emoji("👈🏽", "backhand index pointing left: medium skin tone"),
                Emoji("👈🏾", "backhand index pointing left: medium-dark skin tone"),
                Emoji("👈🏿", "backhand index pointing left: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👉",
            "backhand index pointing right",
            arrayOf(
                Emoji("👉🏻", "backhand index pointing right: light skin tone"),
                Emoji("👉🏼", "backhand index pointing right: medium-light skin tone"),
                Emoji("👉🏽", "backhand index pointing right: medium skin tone"),
                Emoji("👉🏾", "backhand index pointing right: medium-dark skin tone"),
                Emoji("👉🏿", "backhand index pointing right: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👆",
            "backhand index pointing up",
            arrayOf(
                Emoji("👆🏻", "backhand index pointing up: light skin tone"),
                Emoji("👆🏼", "backhand index pointing up: medium-light skin tone"),
                Emoji("👆🏽", "backhand index pointing up: medium skin tone"),
                Emoji("👆🏾", "backhand index pointing up: medium-dark skin tone"),
                Emoji("👆🏿", "backhand index pointing up: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🖕",
            "middle finger",
            arrayOf(
                Emoji("🖕🏻", "middle finger: light skin tone"),
                Emoji("🖕🏼", "middle finger: medium-light skin tone"),
                Emoji("🖕🏽", "middle finger: medium skin tone"),
                Emoji("🖕🏾", "middle finger: medium-dark skin tone"),
                Emoji("🖕🏿", "middle finger: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👇",
            "backhand index pointing down",
            arrayOf(
                Emoji("👇🏻", "backhand index pointing down: light skin tone"),
                Emoji("👇🏼", "backhand index pointing down: medium-light skin tone"),
                Emoji("👇🏽", "backhand index pointing down: medium skin tone"),
                Emoji("👇🏾", "backhand index pointing down: medium-dark skin tone"),
                Emoji("👇🏿", "backhand index pointing down: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "☝️",
            "index pointing up",
            arrayOf(
                Emoji("☝🏻", "index pointing up: light skin tone"),
                Emoji("☝🏼", "index pointing up: medium-light skin tone"),
                Emoji("☝🏽", "index pointing up: medium skin tone"),
                Emoji("☝🏾", "index pointing up: medium-dark skin tone"),
                Emoji("☝🏿", "index pointing up: dark skin tone")
            )
        ),
        //subgroup: hand-fingers-closed
        EmojiWithSkinTone(
            "👍",
            "thumbs up",
            arrayOf(
                Emoji("👍🏻", "thumbs up: light skin tone"),
                Emoji("👍🏼", "thumbs up: medium-light skin tone"),
                Emoji("👍🏽", "thumbs up: medium skin tone"),
                Emoji("👍🏾", "thumbs up: medium-dark skin tone"),
                Emoji("👍🏿", "thumbs up: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👎",
            "thumbs down",
            arrayOf(
                Emoji("👎🏻", "thumbs down: light skin tone"),
                Emoji("👎🏼", "thumbs down: medium-light skin tone"),
                Emoji("👎🏽", "thumbs down: medium skin tone"),
                Emoji("👎🏾", "thumbs down: medium-dark skin tone"),
                Emoji("👎🏿", "thumbs down: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "✊",
            "raised fist",
            arrayOf(
                Emoji("✊🏻", "raised fist: light skin tone"),
                Emoji("✊🏼", "raised fist: medium-light skin tone"),
                Emoji("✊🏽", "raised fist: medium skin tone"),
                Emoji("✊🏾", "raised fist: medium-dark skin tone"),
                Emoji("✊🏿", "raised fist: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👊",
            "oncoming fist",
            arrayOf(
                Emoji("👊🏻", "oncoming fist: light skin tone"),
                Emoji("👊🏼", "oncoming fist: medium-light skin tone"),
                Emoji("👊🏽", "oncoming fist: medium skin tone"),
                Emoji("👊🏾", "oncoming fist: medium-dark skin tone"),
                Emoji("👊🏿", "oncoming fist: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🤛",
            "left-facing fist",
            arrayOf(
                Emoji("🤛🏻", "left-facing fist: light skin tone"),
                Emoji("🤛🏼", "left-facing fist: medium-light skin tone"),
                Emoji("🤛🏽", "left-facing fist: medium skin tone"),
                Emoji("🤛🏾", "left-facing fist: medium-dark skin tone"),
                Emoji("🤛🏿", "left-facing fist: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🤜",
            "right-facing fist",
            arrayOf(
                Emoji("🤜🏻", "right-facing fist: light skin tone"),
                Emoji("🤜🏼", "right-facing fist: medium-light skin tone"),
                Emoji("🤜🏽", "right-facing fist: medium skin tone"),
                Emoji("🤜🏾", "right-facing fist: medium-dark skin tone"),
                Emoji("🤜🏿", "right-facing fist: dark skin tone")
            )
        ),
        //subgroup: hands
        EmojiWithSkinTone(
            "👏",
            "clapping hands",
            arrayOf(
                Emoji("👏🏻", "clapping hands: light skin tone"),
                Emoji("👏🏼", "clapping hands: medium-light skin tone"),
                Emoji("👏🏽", "clapping hands: medium skin tone"),
                Emoji("👏🏾", "clapping hands: medium-dark skin tone"),
                Emoji("👏🏿", "clapping hands: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🙌",
            "raising hands",
            arrayOf(
                Emoji("🙌🏻", "raising hands: light skin tone"),
                Emoji("🙌🏼", "raising hands: medium-light skin tone"),
                Emoji("🙌🏽", "raising hands: medium skin tone"),
                Emoji("🙌🏾", "raising hands: medium-dark skin tone"),
                Emoji("🙌🏿", "raising hands: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👐",
            "open hands",
            arrayOf(
                Emoji("👐🏻", "open hands: light skin tone"),
                Emoji("👐🏼", "open hands: medium-light skin tone"),
                Emoji("👐🏽", "open hands: medium skin tone"),
                Emoji("👐🏾", "open hands: medium-dark skin tone"),
                Emoji("👐🏿", "open hands: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🤲",
            "palms up together",
            arrayOf(
                Emoji("🤲🏻", "palms up together: light skin tone"),
                Emoji("🤲🏼", "palms up together: medium-light skin tone"),
                Emoji("🤲🏽", "palms up together: medium skin tone"),
                Emoji("🤲🏾", "palms up together: medium-dark skin tone"),
                Emoji("🤲🏿", "palms up together: dark skin tone")
            )
        ),
        Emoji("🤝", "handshake"),
        EmojiWithSkinTone(
            "🙏",
            "folded hands",
            arrayOf(
                Emoji("🙏🏻", "folded hands: light skin tone"),
                Emoji("🙏🏼", "folded hands: medium-light skin tone"),
                Emoji("🙏🏽", "folded hands: medium skin tone"),
                Emoji("🙏🏾", "folded hands: medium-dark skin tone"),
                Emoji("🙏🏿", "folded hands: dark skin tone")
            )
        ),
        //subgroup: hand-prop
        EmojiWithSkinTone(
            "✍️",
            "writing hand",
            arrayOf(
                Emoji("✍🏻", "writing hand: light skin tone"),
                Emoji("✍🏼", "writing hand: medium-light skin tone"),
                Emoji("✍🏽", "writing hand: medium skin tone"),
                Emoji("✍🏾", "writing hand: medium-dark skin tone"),
                Emoji("✍🏿", "writing hand: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "💅",
            "nail polish",
            arrayOf(
                Emoji("💅🏻", "nail polish: light skin tone"),
                Emoji("💅🏼", "nail polish: medium-light skin tone"),
                Emoji("💅🏽", "nail polish: medium skin tone"),
                Emoji("💅🏾", "nail polish: medium-dark skin tone"),
                Emoji("💅🏿", "nail polish: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🤳",
            "selfie",
            arrayOf(
                Emoji("🤳🏻", "selfie: light skin tone"),
                Emoji("🤳🏼", "selfie: medium-light skin tone"),
                Emoji("🤳🏽", "selfie: medium skin tone"),
                Emoji("🤳🏾", "selfie: medium-dark skin tone"),
                Emoji("🤳🏿", "selfie: dark skin tone")
            )
        ),
        //subgroup: body-parts
        EmojiWithSkinTone(
            "💪",
            "flexed biceps",
            arrayOf(
                Emoji("💪🏻", "flexed biceps: light skin tone"),
                Emoji("💪🏼", "flexed biceps: medium-light skin tone"),
                Emoji("💪🏽", "flexed biceps: medium skin tone"),
                Emoji("💪🏾", "flexed biceps: medium-dark skin tone"),
                Emoji("💪🏿", "flexed biceps: dark skin tone")
            )
        ),
        Emoji("🦾", "mechanical arm"),
        Emoji("🦿", "mechanical leg"),
        EmojiWithSkinTone(
            "🦵",
            "leg",
            arrayOf(
                Emoji("🦵🏻", "leg: light skin tone"),
                Emoji("🦵🏼", "leg: medium-light skin tone"),
                Emoji("🦵🏽", "leg: medium skin tone"),
                Emoji("🦵🏾", "leg: medium-dark skin tone"),
                Emoji("🦵🏿", "leg: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🦶",
            "foot",
            arrayOf(
                Emoji("🦶🏻", "foot: light skin tone"),
                Emoji("🦶🏼", "foot: medium-light skin tone"),
                Emoji("🦶🏽", "foot: medium skin tone"),
                Emoji("🦶🏾", "foot: medium-dark skin tone"),
                Emoji("🦶🏿", "foot: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👂",
            "ear",
            arrayOf(
                Emoji("👂🏻", "ear: light skin tone"),
                Emoji("👂🏼", "ear: medium-light skin tone"),
                Emoji("👂🏽", "ear: medium skin tone"),
                Emoji("👂🏾", "ear: medium-dark skin tone"),
                Emoji("👂🏿", "ear: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🦻",
            "ear with hearing aid",
            arrayOf(
                Emoji("🦻🏻", "ear with hearing aid: light skin tone"),
                Emoji("🦻🏼", "ear with hearing aid: medium-light skin tone"),
                Emoji("🦻🏽", "ear with hearing aid: medium skin tone"),
                Emoji("🦻🏾", "ear with hearing aid: medium-dark skin tone"),
                Emoji("🦻🏿", "ear with hearing aid: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👃",
            "nose",
            arrayOf(
                Emoji("👃🏻", "nose: light skin tone"),
                Emoji("👃🏼", "nose: medium-light skin tone"),
                Emoji("👃🏽", "nose: medium skin tone"),
                Emoji("👃🏾", "nose: medium-dark skin tone"),
                Emoji("👃🏿", "nose: dark skin tone")
            )
        ),
        Emoji("🧠", "brain"),
        Emoji("🦷", "tooth"),
        Emoji("🦴", "bone"),
        Emoji("👀", "eyes"),
        Emoji("👁️", "eye"),
        Emoji("👅", "tongue"),
        Emoji("👄", "mouth"),
        //subgroup: person
        EmojiWithSkinTone(
            "👶",
            "baby",
            arrayOf(
                Emoji("👶🏻", "baby: light skin tone"),
                Emoji("👶🏼", "baby: medium-light skin tone"),
                Emoji("👶🏽", "baby: medium skin tone"),
                Emoji("👶🏾", "baby: medium-dark skin tone"),
                Emoji("👶🏿", "baby: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🧒",
            "child",
            arrayOf(
                Emoji("🧒🏻", "child: light skin tone"),
                Emoji("🧒🏼", "child: medium-light skin tone"),
                Emoji("🧒🏽", "child: medium skin tone"),
                Emoji("🧒🏾", "child: medium-dark skin tone"),
                Emoji("🧒🏿", "child: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👦",
            "boy",
            arrayOf(
                Emoji("👦🏻", "boy: light skin tone"),
                Emoji("👦🏼", "boy: medium-light skin tone"),
                Emoji("👦🏽", "boy: medium skin tone"),
                Emoji("👦🏾", "boy: medium-dark skin tone"),
                Emoji("👦🏿", "boy: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👧",
            "girl",
            arrayOf(
                Emoji("👧🏻", "girl: light skin tone"),
                Emoji("👧🏼", "girl: medium-light skin tone"),
                Emoji("👧🏽", "girl: medium skin tone"),
                Emoji("👧🏾", "girl: medium-dark skin tone"),
                Emoji("👧🏿", "girl: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🧑",
            "person",
            arrayOf(
                Emoji("🧑🏻", "person: light skin tone"),
                Emoji("🧑🏼", "person: medium-light skin tone"),
                Emoji("🧑🏽", "person: medium skin tone"),
                Emoji("🧑🏾", "person: medium-dark skin tone"),
                Emoji("🧑🏿", "person: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👱",
            "person: blond hair",
            arrayOf(
                Emoji("👱🏻", "person: light skin tone, blond hair"),
                Emoji("👱🏼", "person: medium-light skin tone, blond hair"),
                Emoji("👱🏽", "person: medium skin tone, blond hair"),
                Emoji("👱🏾", "person: medium-dark skin tone, blond hair"),
                Emoji("👱🏿", "person: dark skin tone, blond hair")
            )
        ),
        EmojiWithSkinTone(
            "👨",
            "man",
            arrayOf(
                Emoji("👨🏻", "man: light skin tone"),
                Emoji("👨🏼", "man: medium-light skin tone"),
                Emoji("👨🏽", "man: medium skin tone"),
                Emoji("👨🏾", "man: medium-dark skin tone"),
                Emoji("👨🏿", "man: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🧔",
            "man: beard",
            arrayOf(
                Emoji("🧔🏻", "man: light skin tone, beard"),
                Emoji("🧔🏼", "man: medium-light skin tone, beard"),
                Emoji("🧔🏽", "man: medium skin tone, beard"),
                Emoji("🧔🏾", "man: medium-dark skin tone, beard"),
                Emoji("🧔🏿", "man: dark skin tone, beard")
            )
        ),
        EmojiWithSkinTone(
            "👨‍🦰",
            "man: red hair",
            arrayOf(
                Emoji("👨🏻‍🦰", "man: light skin tone, red hair"),
                Emoji("👨🏼‍🦰", "man: medium-light skin tone, red hair"),
                Emoji("👨🏽‍🦰", "man: medium skin tone, red hair"),
                Emoji("👨🏾‍🦰", "man: medium-dark skin tone, red hair"),
                Emoji("👨🏿‍🦰", "man: dark skin tone, red hair")
            )
        ),
        EmojiWithSkinTone(
            "👨‍🦱",
            "man: curly hair",
            arrayOf(
                Emoji("👨🏻‍🦱", "man: light skin tone, curly hair"),
                Emoji("👨🏼‍🦱", "man: medium-light skin tone, curly hair"),
                Emoji("👨🏽‍🦱", "man: medium skin tone, curly hair"),
                Emoji("👨🏾‍🦱", "man: medium-dark skin tone, curly hair"),
                Emoji("👨🏿‍🦱", "man: dark skin tone, curly hair")
            )
        ),
        EmojiWithSkinTone(
            "👨‍🦳",
            "man: white hair",
            arrayOf(
                Emoji("👨🏻‍🦳", "man: light skin tone, white hair"),
                Emoji("👨🏼‍🦳", "man: medium-light skin tone, white hair"),
                Emoji("👨🏽‍🦳", "man: medium skin tone, white hair"),
                Emoji("👨🏾‍🦳", "man: medium-dark skin tone, white hair"),
                Emoji("👨🏿‍🦳", "man: dark skin tone, white hair")
            )
        ),
        EmojiWithSkinTone(
            "👨‍🦲",
            "man: bald",
            arrayOf(
                Emoji("👨🏻‍🦲", "man: light skin tone, bald"),
                Emoji("👨🏼‍🦲", "man: medium-light skin tone, bald"),
                Emoji("👨🏽‍🦲", "man: medium skin tone, bald"),
                Emoji("👨🏾‍🦲", "man: medium-dark skin tone, bald"),
                Emoji("👨🏿‍🦲", "man: dark skin tone, bald")
            )
        ),
        EmojiWithSkinTone(
            "👩",
            "woman",
            arrayOf(
                Emoji("👩🏻", "woman: light skin tone"),
                Emoji("👩🏼", "woman: medium-light skin tone"),
                Emoji("👩🏽", "woman: medium skin tone"),
                Emoji("👩🏾", "woman: medium-dark skin tone"),
                Emoji("👩🏿", "woman: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👩‍🦰",
            "woman: red hair",
            arrayOf(
                Emoji("👩🏻‍🦰", "woman: light skin tone, red hair"),
                Emoji("👩🏼‍🦰", "woman: medium-light skin tone, red hair"),
                Emoji("👩🏽‍🦰", "woman: medium skin tone, red hair"),
                Emoji("👩🏾‍🦰", "woman: medium-dark skin tone, red hair"),
                Emoji("👩🏿‍🦰", "woman: dark skin tone, red hair")
            )
        ),
        EmojiWithSkinTone(
            "🧑‍🦰",
            "person: red hair",
            arrayOf(
                Emoji("🧑🏻‍🦰", "person: light skin tone, red hair"),
                Emoji("🧑🏼‍🦰", "person: medium-light skin tone, red hair"),
                Emoji("🧑🏽‍🦰", "person: medium skin tone, red hair"),
                Emoji("🧑🏾‍🦰", "person: medium-dark skin tone, red hair"),
                Emoji("🧑🏿‍🦰", "person: dark skin tone, red hair")
            )
        ),
        EmojiWithSkinTone(
            "👩‍🦱",
            "woman: curly hair",
            arrayOf(
                Emoji("👩🏻‍🦱", "woman: light skin tone, curly hair"),
                Emoji("👩🏼‍🦱", "woman: medium-light skin tone, curly hair"),
                Emoji("👩🏽‍🦱", "woman: medium skin tone, curly hair"),
                Emoji("👩🏾‍🦱", "woman: medium-dark skin tone, curly hair"),
                Emoji("👩🏿‍🦱", "woman: dark skin tone, curly hair")
            )
        ),
        EmojiWithSkinTone(
            "🧑‍🦱",
            "person: curly hair",
            arrayOf(
                Emoji("🧑🏻‍🦱", "person: light skin tone, curly hair"),
                Emoji("🧑🏼‍🦱", "person: medium-light skin tone, curly hair"),
                Emoji("🧑🏽‍🦱", "person: medium skin tone, curly hair"),
                Emoji("🧑🏾‍🦱", "person: medium-dark skin tone, curly hair"),
                Emoji("🧑🏿‍🦱", "person: dark skin tone, curly hair")
            )
        ),
        EmojiWithSkinTone(
            "👩‍🦳",
            "woman: white hair",
            arrayOf(
                Emoji("👩🏻‍🦳", "woman: light skin tone, white hair"),
                Emoji("👩🏼‍🦳", "woman: medium-light skin tone, white hair"),
                Emoji("👩🏽‍🦳", "woman: medium skin tone, white hair"),
                Emoji("👩🏾‍🦳", "woman: medium-dark skin tone, white hair"),
                Emoji("👩🏿‍🦳", "woman: dark skin tone, white hair")
            )
        ),
        EmojiWithSkinTone(
            "🧑‍🦳",
            "person: white hair",
            arrayOf(
                Emoji("🧑🏻‍🦳", "person: light skin tone, white hair"),
                Emoji("🧑🏼‍🦳", "person: medium-light skin tone, white hair"),
                Emoji("🧑🏽‍🦳", "person: medium skin tone, white hair"),
                Emoji("🧑🏾‍🦳", "person: medium-dark skin tone, white hair"),
                Emoji("🧑🏿‍🦳", "person: dark skin tone, white hair")
            )
        ),
        EmojiWithSkinTone(
            "👩‍🦲",
            "woman: bald",
            arrayOf(
                Emoji("👩🏻‍🦲", "woman: light skin tone, bald"),
                Emoji("👩🏼‍🦲", "woman: medium-light skin tone, bald"),
                Emoji("👩🏽‍🦲", "woman: medium skin tone, bald"),
                Emoji("👩🏾‍🦲", "woman: medium-dark skin tone, bald"),
                Emoji("👩🏿‍🦲", "woman: dark skin tone, bald")
            )
        ),
        EmojiWithSkinTone(
            "🧑‍🦲",
            "person: bald",
            arrayOf(
                Emoji("🧑🏻‍🦲", "person: light skin tone, bald"),
                Emoji("🧑🏼‍🦲", "person: medium-light skin tone, bald"),
                Emoji("🧑🏽‍🦲", "person: medium skin tone, bald"),
                Emoji("🧑🏾‍🦲", "person: medium-dark skin tone, bald"),
                Emoji("🧑🏿‍🦲", "person: dark skin tone, bald")
            )
        ),
        EmojiWithSkinTone(
            "👱‍♀️",
            "woman: blond hair",
            arrayOf(
                Emoji("👱🏻‍♀️", "woman: light skin tone, blond hair"),
                Emoji("👱🏼‍♀️", "woman: medium-light skin tone, blond hair"),
                Emoji("👱🏽‍♀️", "woman: medium skin tone, blond hair"),
                Emoji("👱🏾‍♀️", "woman: medium-dark skin tone, blond hair"),
                Emoji("👱🏿‍♀️", "woman: dark skin tone, blond hair")
            )
        ),
        EmojiWithSkinTone(
            "👱‍♂️",
            "man: blond hair",
            arrayOf(
                Emoji("👱🏻‍♂️", "man: light skin tone, blond hair"),
                Emoji("👱🏼‍♂️", "man: medium-light skin tone, blond hair"),
                Emoji("👱🏽‍♂️", "man: medium skin tone, blond hair"),
                Emoji("👱🏾‍♂️", "man: medium-dark skin tone, blond hair"),
                Emoji("👱🏿‍♂️", "man: dark skin tone, blond hair")
            )
        ),
        EmojiWithSkinTone(
            "🧓",
            "older person",
            arrayOf(
                Emoji("🧓🏻", "older person: light skin tone"),
                Emoji("🧓🏼", "older person: medium-light skin tone"),
                Emoji("🧓🏽", "older person: medium skin tone"),
                Emoji("🧓🏾", "older person: medium-dark skin tone"),
                Emoji("🧓🏿", "older person: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👴",
            "old man",
            arrayOf(
                Emoji("👴🏻", "old man: light skin tone"),
                Emoji("👴🏼", "old man: medium-light skin tone"),
                Emoji("👴🏽", "old man: medium skin tone"),
                Emoji("👴🏾", "old man: medium-dark skin tone"),
                Emoji("👴🏿", "old man: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👵",
            "old woman",
            arrayOf(
                Emoji("👵🏻", "old woman: light skin tone"),
                Emoji("👵🏼", "old woman: medium-light skin tone"),
                Emoji("👵🏽", "old woman: medium skin tone"),
                Emoji("👵🏾", "old woman: medium-dark skin tone"),
                Emoji("👵🏿", "old woman: dark skin tone")
            )
        ),
        //subgroup: person-gesture
        EmojiWithSkinTone(
            "🙍",
            "person frowning",
            arrayOf(
                Emoji("🙍🏻", "person frowning: light skin tone"),
                Emoji("🙍🏼", "person frowning: medium-light skin tone"),
                Emoji("🙍🏽", "person frowning: medium skin tone"),
                Emoji("🙍🏾", "person frowning: medium-dark skin tone"),
                Emoji("🙍🏿", "person frowning: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🙍‍♂️",
            "man frowning",
            arrayOf(
                Emoji("🙍🏻‍♂️", "man frowning: light skin tone"),
                Emoji("🙍🏼‍♂️", "man frowning: medium-light skin tone"),
                Emoji("🙍🏽‍♂️", "man frowning: medium skin tone"),
                Emoji("🙍🏾‍♂️", "man frowning: medium-dark skin tone"),
                Emoji("🙍🏿‍♂️", "man frowning: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🙍‍♀️",
            "woman frowning",
            arrayOf(
                Emoji("🙍🏻‍♀️", "woman frowning: light skin tone"),
                Emoji("🙍🏼‍♀️", "woman frowning: medium-light skin tone"),
                Emoji("🙍🏽‍♀️", "woman frowning: medium skin tone"),
                Emoji("🙍🏾‍♀️", "woman frowning: medium-dark skin tone"),
                Emoji("🙍🏿‍♀️", "woman frowning: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🙎",
            "person pouting",
            arrayOf(
                Emoji("🙎🏻", "person pouting: light skin tone"),
                Emoji("🙎🏼", "person pouting: medium-light skin tone"),
                Emoji("🙎🏽", "person pouting: medium skin tone"),
                Emoji("🙎🏾", "person pouting: medium-dark skin tone"),
                Emoji("🙎🏿", "person pouting: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🙎‍♂️",
            "man pouting",
            arrayOf(
                Emoji("🙎🏻‍♂️", "man pouting: light skin tone"),
                Emoji("🙎🏼‍♂️", "man pouting: medium-light skin tone"),
                Emoji("🙎🏽‍♂️", "man pouting: medium skin tone"),
                Emoji("🙎🏾‍♂️", "man pouting: medium-dark skin tone"),
                Emoji("🙎🏿‍♂️", "man pouting: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🙎‍♀️",
            "woman pouting",
            arrayOf(
                Emoji("🙎🏻‍♀️", "woman pouting: light skin tone"),
                Emoji("🙎🏼‍♀️", "woman pouting: medium-light skin tone"),
                Emoji("🙎🏽‍♀️", "woman pouting: medium skin tone"),
                Emoji("🙎🏾‍♀️", "woman pouting: medium-dark skin tone"),
                Emoji("🙎🏿‍♀️", "woman pouting: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🙅",
            "person gesturing NO",
            arrayOf(
                Emoji("🙅🏻", "person gesturing NO: light skin tone"),
                Emoji("🙅🏼", "person gesturing NO: medium-light skin tone"),
                Emoji("🙅🏽", "person gesturing NO: medium skin tone"),
                Emoji("🙅🏾", "person gesturing NO: medium-dark skin tone"),
                Emoji("🙅🏿", "person gesturing NO: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🙅‍♂️",
            "man gesturing NO",
            arrayOf(
                Emoji("🙅🏻‍♂️", "man gesturing NO: light skin tone"),
                Emoji("🙅🏼‍♂️", "man gesturing NO: medium-light skin tone"),
                Emoji("🙅🏽‍♂️", "man gesturing NO: medium skin tone"),
                Emoji("🙅🏾‍♂️", "man gesturing NO: medium-dark skin tone"),
                Emoji("🙅🏿‍♂️", "man gesturing NO: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🙅‍♀️",
            "woman gesturing NO",
            arrayOf(
                Emoji("🙅🏻‍♀️", "woman gesturing NO: light skin tone"),
                Emoji("🙅🏼‍♀️", "woman gesturing NO: medium-light skin tone"),
                Emoji("🙅🏽‍♀️", "woman gesturing NO: medium skin tone"),
                Emoji("🙅🏾‍♀️", "woman gesturing NO: medium-dark skin tone"),
                Emoji("🙅🏿‍♀️", "woman gesturing NO: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🙆",
            "person gesturing OK",
            arrayOf(
                Emoji("🙆🏻", "person gesturing OK: light skin tone"),
                Emoji("🙆🏼", "person gesturing OK: medium-light skin tone"),
                Emoji("🙆🏽", "person gesturing OK: medium skin tone"),
                Emoji("🙆🏾", "person gesturing OK: medium-dark skin tone"),
                Emoji("🙆🏿", "person gesturing OK: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🙆‍♂️",
            "man gesturing OK",
            arrayOf(
                Emoji("🙆🏻‍♂️", "man gesturing OK: light skin tone"),
                Emoji("🙆🏼‍♂️", "man gesturing OK: medium-light skin tone"),
                Emoji("🙆🏽‍♂️", "man gesturing OK: medium skin tone"),
                Emoji("🙆🏾‍♂️", "man gesturing OK: medium-dark skin tone"),
                Emoji("🙆🏿‍♂️", "man gesturing OK: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🙆‍♀️",
            "woman gesturing OK",
            arrayOf(
                Emoji("🙆🏻‍♀️", "woman gesturing OK: light skin tone"),
                Emoji("🙆🏼‍♀️", "woman gesturing OK: medium-light skin tone"),
                Emoji("🙆🏽‍♀️", "woman gesturing OK: medium skin tone"),
                Emoji("🙆🏾‍♀️", "woman gesturing OK: medium-dark skin tone"),
                Emoji("🙆🏿‍♀️", "woman gesturing OK: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "💁",
            "person tipping hand",
            arrayOf(
                Emoji("💁🏻", "person tipping hand: light skin tone"),
                Emoji("💁🏼", "person tipping hand: medium-light skin tone"),
                Emoji("💁🏽", "person tipping hand: medium skin tone"),
                Emoji("💁🏾", "person tipping hand: medium-dark skin tone"),
                Emoji("💁🏿", "person tipping hand: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "💁‍♂️",
            "man tipping hand",
            arrayOf(
                Emoji("💁🏻‍♂️", "man tipping hand: light skin tone"),
                Emoji("💁🏼‍♂️", "man tipping hand: medium-light skin tone"),
                Emoji("💁🏽‍♂️", "man tipping hand: medium skin tone"),
                Emoji("💁🏾‍♂️", "man tipping hand: medium-dark skin tone"),
                Emoji("💁🏿‍♂️", "man tipping hand: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "💁‍♀️",
            "woman tipping hand",
            arrayOf(
                Emoji("💁🏻‍♀️", "woman tipping hand: light skin tone"),
                Emoji("💁🏼‍♀️", "woman tipping hand: medium-light skin tone"),
                Emoji("💁🏽‍♀️", "woman tipping hand: medium skin tone"),
                Emoji("💁🏾‍♀️", "woman tipping hand: medium-dark skin tone"),
                Emoji("💁🏿‍♀️", "woman tipping hand: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🙋",
            "person raising hand",
            arrayOf(
                Emoji("🙋🏻", "person raising hand: light skin tone"),
                Emoji("🙋🏼", "person raising hand: medium-light skin tone"),
                Emoji("🙋🏽", "person raising hand: medium skin tone"),
                Emoji("🙋🏾", "person raising hand: medium-dark skin tone"),
                Emoji("🙋🏿", "person raising hand: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🙋‍♂️",
            "man raising hand",
            arrayOf(
                Emoji("🙋🏻‍♂️", "man raising hand: light skin tone"),
                Emoji("🙋🏼‍♂️", "man raising hand: medium-light skin tone"),
                Emoji("🙋🏽‍♂️", "man raising hand: medium skin tone"),
                Emoji("🙋🏾‍♂️", "man raising hand: medium-dark skin tone"),
                Emoji("🙋🏿‍♂️", "man raising hand: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🙋‍♀️",
            "woman raising hand",
            arrayOf(
                Emoji("🙋🏻‍♀️", "woman raising hand: light skin tone"),
                Emoji("🙋🏼‍♀️", "woman raising hand: medium-light skin tone"),
                Emoji("🙋🏽‍♀️", "woman raising hand: medium skin tone"),
                Emoji("🙋🏾‍♀️", "woman raising hand: medium-dark skin tone"),
                Emoji("🙋🏿‍♀️", "woman raising hand: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🧏",
            "deaf person",
            arrayOf(
                Emoji("🧏🏻", "deaf person: light skin tone"),
                Emoji("🧏🏼", "deaf person: medium-light skin tone"),
                Emoji("🧏🏽", "deaf person: medium skin tone"),
                Emoji("🧏🏾", "deaf person: medium-dark skin tone"),
                Emoji("🧏🏿", "deaf person: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🧏‍♂️",
            "deaf man",
            arrayOf(
                Emoji("🧏🏻‍♂️", "deaf man: light skin tone"),
                Emoji("🧏🏼‍♂️", "deaf man: medium-light skin tone"),
                Emoji("🧏🏽‍♂️", "deaf man: medium skin tone"),
                Emoji("🧏🏾‍♂️", "deaf man: medium-dark skin tone"),
                Emoji("🧏🏿‍♂️", "deaf man: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🧏‍♀️",
            "deaf woman",
            arrayOf(
                Emoji("🧏🏻‍♀️", "deaf woman: light skin tone"),
                Emoji("🧏🏼‍♀️", "deaf woman: medium-light skin tone"),
                Emoji("🧏🏽‍♀️", "deaf woman: medium skin tone"),
                Emoji("🧏🏾‍♀️", "deaf woman: medium-dark skin tone"),
                Emoji("🧏🏿‍♀️", "deaf woman: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🙇",
            "person bowing",
            arrayOf(
                Emoji("🙇🏻", "person bowing: light skin tone"),
                Emoji("🙇🏼", "person bowing: medium-light skin tone"),
                Emoji("🙇🏽", "person bowing: medium skin tone"),
                Emoji("🙇🏾", "person bowing: medium-dark skin tone"),
                Emoji("🙇🏿", "person bowing: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🙇‍♂️",
            "man bowing",
            arrayOf(
                Emoji("🙇🏻‍♂️", "man bowing: light skin tone"),
                Emoji("🙇🏼‍♂️", "man bowing: medium-light skin tone"),
                Emoji("🙇🏽‍♂️", "man bowing: medium skin tone"),
                Emoji("🙇🏾‍♂️", "man bowing: medium-dark skin tone"),
                Emoji("🙇🏿‍♂️", "man bowing: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🙇‍♀️",
            "woman bowing",
            arrayOf(
                Emoji("🙇🏻‍♀️", "woman bowing: light skin tone"),
                Emoji("🙇🏼‍♀️", "woman bowing: medium-light skin tone"),
                Emoji("🙇🏽‍♀️", "woman bowing: medium skin tone"),
                Emoji("🙇🏾‍♀️", "woman bowing: medium-dark skin tone"),
                Emoji("🙇🏿‍♀️", "woman bowing: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🤦",
            "person facepalming",
            arrayOf(
                Emoji("🤦🏻", "person facepalming: light skin tone"),
                Emoji("🤦🏼", "person facepalming: medium-light skin tone"),
                Emoji("🤦🏽", "person facepalming: medium skin tone"),
                Emoji("🤦🏾", "person facepalming: medium-dark skin tone"),
                Emoji("🤦🏿", "person facepalming: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🤦‍♂️",
            "man facepalming",
            arrayOf(
                Emoji("🤦🏻‍♂️", "man facepalming: light skin tone"),
                Emoji("🤦🏼‍♂️", "man facepalming: medium-light skin tone"),
                Emoji("🤦🏽‍♂️", "man facepalming: medium skin tone"),
                Emoji("🤦🏾‍♂️", "man facepalming: medium-dark skin tone"),
                Emoji("🤦🏿‍♂️", "man facepalming: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🤦‍♀️",
            "woman facepalming",
            arrayOf(
                Emoji("🤦🏻‍♀️", "woman facepalming: light skin tone"),
                Emoji("🤦🏼‍♀️", "woman facepalming: medium-light skin tone"),
                Emoji("🤦🏽‍♀️", "woman facepalming: medium skin tone"),
                Emoji("🤦🏾‍♀️", "woman facepalming: medium-dark skin tone"),
                Emoji("🤦🏿‍♀️", "woman facepalming: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🤷",
            "person shrugging",
            arrayOf(
                Emoji("🤷🏻", "person shrugging: light skin tone"),
                Emoji("🤷🏼", "person shrugging: medium-light skin tone"),
                Emoji("🤷🏽", "person shrugging: medium skin tone"),
                Emoji("🤷🏾", "person shrugging: medium-dark skin tone"),
                Emoji("🤷🏿", "person shrugging: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🤷‍♂️",
            "man shrugging",
            arrayOf(
                Emoji("🤷🏻‍♂️", "man shrugging: light skin tone"),
                Emoji("🤷🏼‍♂️", "man shrugging: medium-light skin tone"),
                Emoji("🤷🏽‍♂️", "man shrugging: medium skin tone"),
                Emoji("🤷🏾‍♂️", "man shrugging: medium-dark skin tone"),
                Emoji("🤷🏿‍♂️", "man shrugging: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🤷‍♀️",
            "woman shrugging",
            arrayOf(
                Emoji("🤷🏻‍♀️", "woman shrugging: light skin tone"),
                Emoji("🤷🏼‍♀️", "woman shrugging: medium-light skin tone"),
                Emoji("🤷🏽‍♀️", "woman shrugging: medium skin tone"),
                Emoji("🤷🏾‍♀️", "woman shrugging: medium-dark skin tone"),
                Emoji("🤷🏿‍♀️", "woman shrugging: dark skin tone")
            )
        ),
        //subgroup: person-role
        EmojiWithSkinTone(
            "🧑‍⚕️",
            "health worker",
            arrayOf(
                Emoji("🧑🏻‍⚕️", "health worker: light skin tone"),
                Emoji("🧑🏼‍⚕️", "health worker: medium-light skin tone"),
                Emoji("🧑🏽‍⚕️", "health worker: medium skin tone"),
                Emoji("🧑🏾‍⚕️", "health worker: medium-dark skin tone"),
                Emoji("🧑🏿‍⚕️", "health worker: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👨‍⚕️",
            "man health worker",
            arrayOf(
                Emoji("👨🏻‍⚕️", "man health worker: light skin tone"),
                Emoji("👨🏼‍⚕️", "man health worker: medium-light skin tone"),
                Emoji("👨🏽‍⚕️", "man health worker: medium skin tone"),
                Emoji("👨🏾‍⚕️", "man health worker: medium-dark skin tone"),
                Emoji("👨🏿‍⚕️", "man health worker: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👩‍⚕️",
            "woman health worker",
            arrayOf(
                Emoji("👩🏻‍⚕️", "woman health worker: light skin tone"),
                Emoji("👩🏼‍⚕️", "woman health worker: medium-light skin tone"),
                Emoji("👩🏽‍⚕️", "woman health worker: medium skin tone"),
                Emoji("👩🏾‍⚕️", "woman health worker: medium-dark skin tone"),
                Emoji("👩🏿‍⚕️", "woman health worker: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🧑‍🎓",
            "student",
            arrayOf(
                Emoji("🧑🏻‍🎓", "student: light skin tone"),
                Emoji("🧑🏼‍🎓", "student: medium-light skin tone"),
                Emoji("🧑🏽‍🎓", "student: medium skin tone"),
                Emoji("🧑🏾‍🎓", "student: medium-dark skin tone"),
                Emoji("🧑🏿‍🎓", "student: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👨‍🎓",
            "man student",
            arrayOf(
                Emoji("👨🏻‍🎓", "man student: light skin tone"),
                Emoji("👨🏼‍🎓", "man student: medium-light skin tone"),
                Emoji("👨🏽‍🎓", "man student: medium skin tone"),
                Emoji("👨🏾‍🎓", "man student: medium-dark skin tone"),
                Emoji("👨🏿‍🎓", "man student: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👩‍🎓",
            "woman student",
            arrayOf(
                Emoji("👩🏻‍🎓", "woman student: light skin tone"),
                Emoji("👩🏼‍🎓", "woman student: medium-light skin tone"),
                Emoji("👩🏽‍🎓", "woman student: medium skin tone"),
                Emoji("👩🏾‍🎓", "woman student: medium-dark skin tone"),
                Emoji("👩🏿‍🎓", "woman student: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🧑‍🏫",
            "teacher",
            arrayOf(
                Emoji("🧑🏻‍🏫", "teacher: light skin tone"),
                Emoji("🧑🏼‍🏫", "teacher: medium-light skin tone"),
                Emoji("🧑🏽‍🏫", "teacher: medium skin tone"),
                Emoji("🧑🏾‍🏫", "teacher: medium-dark skin tone"),
                Emoji("🧑🏿‍🏫", "teacher: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👨‍🏫",
            "man teacher",
            arrayOf(
                Emoji("👨🏻‍🏫", "man teacher: light skin tone"),
                Emoji("👨🏼‍🏫", "man teacher: medium-light skin tone"),
                Emoji("👨🏽‍🏫", "man teacher: medium skin tone"),
                Emoji("👨🏾‍🏫", "man teacher: medium-dark skin tone"),
                Emoji("👨🏿‍🏫", "man teacher: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👩‍🏫",
            "woman teacher",
            arrayOf(
                Emoji("👩🏻‍🏫", "woman teacher: light skin tone"),
                Emoji("👩🏼‍🏫", "woman teacher: medium-light skin tone"),
                Emoji("👩🏽‍🏫", "woman teacher: medium skin tone"),
                Emoji("👩🏾‍🏫", "woman teacher: medium-dark skin tone"),
                Emoji("👩🏿‍🏫", "woman teacher: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🧑‍⚖️",
            "judge",
            arrayOf(
                Emoji("🧑🏻‍⚖️", "judge: light skin tone"),
                Emoji("🧑🏼‍⚖️", "judge: medium-light skin tone"),
                Emoji("🧑🏽‍⚖️", "judge: medium skin tone"),
                Emoji("🧑🏾‍⚖️", "judge: medium-dark skin tone"),
                Emoji("🧑🏿‍⚖️", "judge: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👨‍⚖️",
            "man judge",
            arrayOf(
                Emoji("👨🏻‍⚖️", "man judge: light skin tone"),
                Emoji("👨🏼‍⚖️", "man judge: medium-light skin tone"),
                Emoji("👨🏽‍⚖️", "man judge: medium skin tone"),
                Emoji("👨🏾‍⚖️", "man judge: medium-dark skin tone"),
                Emoji("👨🏿‍⚖️", "man judge: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👩‍⚖️",
            "woman judge",
            arrayOf(
                Emoji("👩🏻‍⚖️", "woman judge: light skin tone"),
                Emoji("👩🏼‍⚖️", "woman judge: medium-light skin tone"),
                Emoji("👩🏽‍⚖️", "woman judge: medium skin tone"),
                Emoji("👩🏾‍⚖️", "woman judge: medium-dark skin tone"),
                Emoji("👩🏿‍⚖️", "woman judge: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🧑‍🌾",
            "farmer",
            arrayOf(
                Emoji("🧑🏻‍🌾", "farmer: light skin tone"),
                Emoji("🧑🏼‍🌾", "farmer: medium-light skin tone"),
                Emoji("🧑🏽‍🌾", "farmer: medium skin tone"),
                Emoji("🧑🏾‍🌾", "farmer: medium-dark skin tone"),
                Emoji("🧑🏿‍🌾", "farmer: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👨‍🌾",
            "man farmer",
            arrayOf(
                Emoji("👨🏻‍🌾", "man farmer: light skin tone"),
                Emoji("👨🏼‍🌾", "man farmer: medium-light skin tone"),
                Emoji("👨🏽‍🌾", "man farmer: medium skin tone"),
                Emoji("👨🏾‍🌾", "man farmer: medium-dark skin tone"),
                Emoji("👨🏿‍🌾", "man farmer: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👩‍🌾",
            "woman farmer",
            arrayOf(
                Emoji("👩🏻‍🌾", "woman farmer: light skin tone"),
                Emoji("👩🏼‍🌾", "woman farmer: medium-light skin tone"),
                Emoji("👩🏽‍🌾", "woman farmer: medium skin tone"),
                Emoji("👩🏾‍🌾", "woman farmer: medium-dark skin tone"),
                Emoji("👩🏿‍🌾", "woman farmer: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🧑‍🍳",
            "cook",
            arrayOf(
                Emoji("🧑🏻‍🍳", "cook: light skin tone"),
                Emoji("🧑🏼‍🍳", "cook: medium-light skin tone"),
                Emoji("🧑🏽‍🍳", "cook: medium skin tone"),
                Emoji("🧑🏾‍🍳", "cook: medium-dark skin tone"),
                Emoji("🧑🏿‍🍳", "cook: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👨‍🍳",
            "man cook",
            arrayOf(
                Emoji("👨🏻‍🍳", "man cook: light skin tone"),
                Emoji("👨🏼‍🍳", "man cook: medium-light skin tone"),
                Emoji("👨🏽‍🍳", "man cook: medium skin tone"),
                Emoji("👨🏾‍🍳", "man cook: medium-dark skin tone"),
                Emoji("👨🏿‍🍳", "man cook: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👩‍🍳",
            "woman cook",
            arrayOf(
                Emoji("👩🏻‍🍳", "woman cook: light skin tone"),
                Emoji("👩🏼‍🍳", "woman cook: medium-light skin tone"),
                Emoji("👩🏽‍🍳", "woman cook: medium skin tone"),
                Emoji("👩🏾‍🍳", "woman cook: medium-dark skin tone"),
                Emoji("👩🏿‍🍳", "woman cook: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🧑‍🔧",
            "mechanic",
            arrayOf(
                Emoji("🧑🏻‍🔧", "mechanic: light skin tone"),
                Emoji("🧑🏼‍🔧", "mechanic: medium-light skin tone"),
                Emoji("🧑🏽‍🔧", "mechanic: medium skin tone"),
                Emoji("🧑🏾‍🔧", "mechanic: medium-dark skin tone"),
                Emoji("🧑🏿‍🔧", "mechanic: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👨‍🔧",
            "man mechanic",
            arrayOf(
                Emoji("👨🏻‍🔧", "man mechanic: light skin tone"),
                Emoji("👨🏼‍🔧", "man mechanic: medium-light skin tone"),
                Emoji("👨🏽‍🔧", "man mechanic: medium skin tone"),
                Emoji("👨🏾‍🔧", "man mechanic: medium-dark skin tone"),
                Emoji("👨🏿‍🔧", "man mechanic: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👩‍🔧",
            "woman mechanic",
            arrayOf(
                Emoji("👩🏻‍🔧", "woman mechanic: light skin tone"),
                Emoji("👩🏼‍🔧", "woman mechanic: medium-light skin tone"),
                Emoji("👩🏽‍🔧", "woman mechanic: medium skin tone"),
                Emoji("👩🏾‍🔧", "woman mechanic: medium-dark skin tone"),
                Emoji("👩🏿‍🔧", "woman mechanic: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🧑‍🏭",
            "factory worker",
            arrayOf(
                Emoji("🧑🏻‍🏭", "factory worker: light skin tone"),
                Emoji("🧑🏼‍🏭", "factory worker: medium-light skin tone"),
                Emoji("🧑🏽‍🏭", "factory worker: medium skin tone"),
                Emoji("🧑🏾‍🏭", "factory worker: medium-dark skin tone"),
                Emoji("🧑🏿‍🏭", "factory worker: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👨‍🏭",
            "man factory worker",
            arrayOf(
                Emoji("👨🏻‍🏭", "man factory worker: light skin tone"),
                Emoji("👨🏼‍🏭", "man factory worker: medium-light skin tone"),
                Emoji("👨🏽‍🏭", "man factory worker: medium skin tone"),
                Emoji("👨🏾‍🏭", "man factory worker: medium-dark skin tone"),
                Emoji("👨🏿‍🏭", "man factory worker: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👩‍🏭",
            "woman factory worker",
            arrayOf(
                Emoji("👩🏻‍🏭", "woman factory worker: light skin tone"),
                Emoji("👩🏼‍🏭", "woman factory worker: medium-light skin tone"),
                Emoji("👩🏽‍🏭", "woman factory worker: medium skin tone"),
                Emoji("👩🏾‍🏭", "woman factory worker: medium-dark skin tone"),
                Emoji("👩🏿‍🏭", "woman factory worker: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🧑‍💼",
            "office worker",
            arrayOf(
                Emoji("🧑🏻‍💼", "office worker: light skin tone"),
                Emoji("🧑🏼‍💼", "office worker: medium-light skin tone"),
                Emoji("🧑🏽‍💼", "office worker: medium skin tone"),
                Emoji("🧑🏾‍💼", "office worker: medium-dark skin tone"),
                Emoji("🧑🏿‍💼", "office worker: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👨‍💼",
            "man office worker",
            arrayOf(
                Emoji("👨🏻‍💼", "man office worker: light skin tone"),
                Emoji("👨🏼‍💼", "man office worker: medium-light skin tone"),
                Emoji("👨🏽‍💼", "man office worker: medium skin tone"),
                Emoji("👨🏾‍💼", "man office worker: medium-dark skin tone"),
                Emoji("👨🏿‍💼", "man office worker: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👩‍💼",
            "woman office worker",
            arrayOf(
                Emoji("👩🏻‍💼", "woman office worker: light skin tone"),
                Emoji("👩🏼‍💼", "woman office worker: medium-light skin tone"),
                Emoji("👩🏽‍💼", "woman office worker: medium skin tone"),
                Emoji("👩🏾‍💼", "woman office worker: medium-dark skin tone"),
                Emoji("👩🏿‍💼", "woman office worker: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🧑‍🔬",
            "scientist",
            arrayOf(
                Emoji("🧑🏻‍🔬", "scientist: light skin tone"),
                Emoji("🧑🏼‍🔬", "scientist: medium-light skin tone"),
                Emoji("🧑🏽‍🔬", "scientist: medium skin tone"),
                Emoji("🧑🏾‍🔬", "scientist: medium-dark skin tone"),
                Emoji("🧑🏿‍🔬", "scientist: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👨‍🔬",
            "man scientist",
            arrayOf(
                Emoji("👨🏻‍🔬", "man scientist: light skin tone"),
                Emoji("👨🏼‍🔬", "man scientist: medium-light skin tone"),
                Emoji("👨🏽‍🔬", "man scientist: medium skin tone"),
                Emoji("👨🏾‍🔬", "man scientist: medium-dark skin tone"),
                Emoji("👨🏿‍🔬", "man scientist: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👩‍🔬",
            "woman scientist",
            arrayOf(
                Emoji("👩🏻‍🔬", "woman scientist: light skin tone"),
                Emoji("👩🏼‍🔬", "woman scientist: medium-light skin tone"),
                Emoji("👩🏽‍🔬", "woman scientist: medium skin tone"),
                Emoji("👩🏾‍🔬", "woman scientist: medium-dark skin tone"),
                Emoji("👩🏿‍🔬", "woman scientist: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🧑‍💻",
            "technologist",
            arrayOf(
                Emoji("🧑🏻‍💻", "technologist: light skin tone"),
                Emoji("🧑🏼‍💻", "technologist: medium-light skin tone"),
                Emoji("🧑🏽‍💻", "technologist: medium skin tone"),
                Emoji("🧑🏾‍💻", "technologist: medium-dark skin tone"),
                Emoji("🧑🏿‍💻", "technologist: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👨‍💻",
            "man technologist",
            arrayOf(
                Emoji("👨🏻‍💻", "man technologist: light skin tone"),
                Emoji("👨🏼‍💻", "man technologist: medium-light skin tone"),
                Emoji("👨🏽‍💻", "man technologist: medium skin tone"),
                Emoji("👨🏾‍💻", "man technologist: medium-dark skin tone"),
                Emoji("👨🏿‍💻", "man technologist: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👩‍💻",
            "woman technologist",
            arrayOf(
                Emoji("👩🏻‍💻", "woman technologist: light skin tone"),
                Emoji("👩🏼‍💻", "woman technologist: medium-light skin tone"),
                Emoji("👩🏽‍💻", "woman technologist: medium skin tone"),
                Emoji("👩🏾‍💻", "woman technologist: medium-dark skin tone"),
                Emoji("👩🏿‍💻", "woman technologist: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🧑‍🎤",
            "singer",
            arrayOf(
                Emoji("🧑🏻‍🎤", "singer: light skin tone"),
                Emoji("🧑🏼‍🎤", "singer: medium-light skin tone"),
                Emoji("🧑🏽‍🎤", "singer: medium skin tone"),
                Emoji("🧑🏾‍🎤", "singer: medium-dark skin tone"),
                Emoji("🧑🏿‍🎤", "singer: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👨‍🎤",
            "man singer",
            arrayOf(
                Emoji("👨🏻‍🎤", "man singer: light skin tone"),
                Emoji("👨🏼‍🎤", "man singer: medium-light skin tone"),
                Emoji("👨🏽‍🎤", "man singer: medium skin tone"),
                Emoji("👨🏾‍🎤", "man singer: medium-dark skin tone"),
                Emoji("👨🏿‍🎤", "man singer: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👩‍🎤",
            "woman singer",
            arrayOf(
                Emoji("👩🏻‍🎤", "woman singer: light skin tone"),
                Emoji("👩🏼‍🎤", "woman singer: medium-light skin tone"),
                Emoji("👩🏽‍🎤", "woman singer: medium skin tone"),
                Emoji("👩🏾‍🎤", "woman singer: medium-dark skin tone"),
                Emoji("👩🏿‍🎤", "woman singer: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🧑‍🎨",
            "artist",
            arrayOf(
                Emoji("🧑🏻‍🎨", "artist: light skin tone"),
                Emoji("🧑🏼‍🎨", "artist: medium-light skin tone"),
                Emoji("🧑🏽‍🎨", "artist: medium skin tone"),
                Emoji("🧑🏾‍🎨", "artist: medium-dark skin tone"),
                Emoji("🧑🏿‍🎨", "artist: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👨‍🎨",
            "man artist",
            arrayOf(
                Emoji("👨🏻‍🎨", "man artist: light skin tone"),
                Emoji("👨🏼‍🎨", "man artist: medium-light skin tone"),
                Emoji("👨🏽‍🎨", "man artist: medium skin tone"),
                Emoji("👨🏾‍🎨", "man artist: medium-dark skin tone"),
                Emoji("👨🏿‍🎨", "man artist: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👩‍🎨",
            "woman artist",
            arrayOf(
                Emoji("👩🏻‍🎨", "woman artist: light skin tone"),
                Emoji("👩🏼‍🎨", "woman artist: medium-light skin tone"),
                Emoji("👩🏽‍🎨", "woman artist: medium skin tone"),
                Emoji("👩🏾‍🎨", "woman artist: medium-dark skin tone"),
                Emoji("👩🏿‍🎨", "woman artist: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🧑‍✈️",
            "pilot",
            arrayOf(
                Emoji("🧑🏻‍✈️", "pilot: light skin tone"),
                Emoji("🧑🏼‍✈️", "pilot: medium-light skin tone"),
                Emoji("🧑🏽‍✈️", "pilot: medium skin tone"),
                Emoji("🧑🏾‍✈️", "pilot: medium-dark skin tone"),
                Emoji("🧑🏿‍✈️", "pilot: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👨‍✈️",
            "man pilot",
            arrayOf(
                Emoji("👨🏻‍✈️", "man pilot: light skin tone"),
                Emoji("👨🏼‍✈️", "man pilot: medium-light skin tone"),
                Emoji("👨🏽‍✈️", "man pilot: medium skin tone"),
                Emoji("👨🏾‍✈️", "man pilot: medium-dark skin tone"),
                Emoji("👨🏿‍✈️", "man pilot: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👩‍✈️",
            "woman pilot",
            arrayOf(
                Emoji("👩🏻‍✈️", "woman pilot: light skin tone"),
                Emoji("👩🏼‍✈️", "woman pilot: medium-light skin tone"),
                Emoji("👩🏽‍✈️", "woman pilot: medium skin tone"),
                Emoji("👩🏾‍✈️", "woman pilot: medium-dark skin tone"),
                Emoji("👩🏿‍✈️", "woman pilot: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🧑‍🚀",
            "astronaut",
            arrayOf(
                Emoji("🧑🏻‍🚀", "astronaut: light skin tone"),
                Emoji("🧑🏼‍🚀", "astronaut: medium-light skin tone"),
                Emoji("🧑🏽‍🚀", "astronaut: medium skin tone"),
                Emoji("🧑🏾‍🚀", "astronaut: medium-dark skin tone"),
                Emoji("🧑🏿‍🚀", "astronaut: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👨‍🚀",
            "man astronaut",
            arrayOf(
                Emoji("👨🏻‍🚀", "man astronaut: light skin tone"),
                Emoji("👨🏼‍🚀", "man astronaut: medium-light skin tone"),
                Emoji("👨🏽‍🚀", "man astronaut: medium skin tone"),
                Emoji("👨🏾‍🚀", "man astronaut: medium-dark skin tone"),
                Emoji("👨🏿‍🚀", "man astronaut: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👩‍🚀",
            "woman astronaut",
            arrayOf(
                Emoji("👩🏻‍🚀", "woman astronaut: light skin tone"),
                Emoji("👩🏼‍🚀", "woman astronaut: medium-light skin tone"),
                Emoji("👩🏽‍🚀", "woman astronaut: medium skin tone"),
                Emoji("👩🏾‍🚀", "woman astronaut: medium-dark skin tone"),
                Emoji("👩🏿‍🚀", "woman astronaut: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🧑‍🚒",
            "firefighter",
            arrayOf(
                Emoji("🧑🏻‍🚒", "firefighter: light skin tone"),
                Emoji("🧑🏼‍🚒", "firefighter: medium-light skin tone"),
                Emoji("🧑🏽‍🚒", "firefighter: medium skin tone"),
                Emoji("🧑🏾‍🚒", "firefighter: medium-dark skin tone"),
                Emoji("🧑🏿‍🚒", "firefighter: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👨‍🚒",
            "man firefighter",
            arrayOf(
                Emoji("👨🏻‍🚒", "man firefighter: light skin tone"),
                Emoji("👨🏼‍🚒", "man firefighter: medium-light skin tone"),
                Emoji("👨🏽‍🚒", "man firefighter: medium skin tone"),
                Emoji("👨🏾‍🚒", "man firefighter: medium-dark skin tone"),
                Emoji("👨🏿‍🚒", "man firefighter: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👩‍🚒",
            "woman firefighter",
            arrayOf(
                Emoji("👩🏻‍🚒", "woman firefighter: light skin tone"),
                Emoji("👩🏼‍🚒", "woman firefighter: medium-light skin tone"),
                Emoji("👩🏽‍🚒", "woman firefighter: medium skin tone"),
                Emoji("👩🏾‍🚒", "woman firefighter: medium-dark skin tone"),
                Emoji("👩🏿‍🚒", "woman firefighter: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👮",
            "police officer",
            arrayOf(
                Emoji("👮🏻", "police officer: light skin tone"),
                Emoji("👮🏼", "police officer: medium-light skin tone"),
                Emoji("👮🏽", "police officer: medium skin tone"),
                Emoji("👮🏾", "police officer: medium-dark skin tone"),
                Emoji("👮🏿", "police officer: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👮‍♂️",
            "man police officer",
            arrayOf(
                Emoji("👮🏻‍♂️", "man police officer: light skin tone"),
                Emoji("👮🏼‍♂️", "man police officer: medium-light skin tone"),
                Emoji("👮🏽‍♂️", "man police officer: medium skin tone"),
                Emoji("👮🏾‍♂️", "man police officer: medium-dark skin tone"),
                Emoji("👮🏿‍♂️", "man police officer: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👮‍♀️",
            "woman police officer",
            arrayOf(
                Emoji("👮🏻‍♀️", "woman police officer: light skin tone"),
                Emoji("👮🏼‍♀️", "woman police officer: medium-light skin tone"),
                Emoji("👮🏽‍♀️", "woman police officer: medium skin tone"),
                Emoji("👮🏾‍♀️", "woman police officer: medium-dark skin tone"),
                Emoji("👮🏿‍♀️", "woman police officer: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🕵️",
            "detective",
            arrayOf(
                Emoji("🕵🏻", "detective: light skin tone"),
                Emoji("🕵🏼", "detective: medium-light skin tone"),
                Emoji("🕵🏽", "detective: medium skin tone"),
                Emoji("🕵🏾", "detective: medium-dark skin tone"),
                Emoji("🕵🏿", "detective: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🕵️‍♂️",
            "man detective",
            arrayOf(
                Emoji("🕵🏻‍♂️", "man detective: light skin tone"),
                Emoji("🕵🏼‍♂️", "man detective: medium-light skin tone"),
                Emoji("🕵🏽‍♂️", "man detective: medium skin tone"),
                Emoji("🕵🏾‍♂️", "man detective: medium-dark skin tone"),
                Emoji("🕵🏿‍♂️", "man detective: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🕵️‍♀️",
            "woman detective",
            arrayOf(
                Emoji("🕵🏻‍♀️", "woman detective: light skin tone"),
                Emoji("🕵🏼‍♀️", "woman detective: medium-light skin tone"),
                Emoji("🕵🏽‍♀️", "woman detective: medium skin tone"),
                Emoji("🕵🏾‍♀️", "woman detective: medium-dark skin tone"),
                Emoji("🕵🏿‍♀️", "woman detective: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "💂",
            "guard",
            arrayOf(
                Emoji("💂🏻", "guard: light skin tone"),
                Emoji("💂🏼", "guard: medium-light skin tone"),
                Emoji("💂🏽", "guard: medium skin tone"),
                Emoji("💂🏾", "guard: medium-dark skin tone"),
                Emoji("💂🏿", "guard: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "💂‍♂️",
            "man guard",
            arrayOf(
                Emoji("💂🏻‍♂️", "man guard: light skin tone"),
                Emoji("💂🏼‍♂️", "man guard: medium-light skin tone"),
                Emoji("💂🏽‍♂️", "man guard: medium skin tone"),
                Emoji("💂🏾‍♂️", "man guard: medium-dark skin tone"),
                Emoji("💂🏿‍♂️", "man guard: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "💂‍♀️",
            "woman guard",
            arrayOf(
                Emoji("💂🏻‍♀️", "woman guard: light skin tone"),
                Emoji("💂🏼‍♀️", "woman guard: medium-light skin tone"),
                Emoji("💂🏽‍♀️", "woman guard: medium skin tone"),
                Emoji("💂🏾‍♀️", "woman guard: medium-dark skin tone"),
                Emoji("💂🏿‍♀️", "woman guard: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👷",
            "construction worker",
            arrayOf(
                Emoji("👷🏻", "construction worker: light skin tone"),
                Emoji("👷🏼", "construction worker: medium-light skin tone"),
                Emoji("👷🏽", "construction worker: medium skin tone"),
                Emoji("👷🏾", "construction worker: medium-dark skin tone"),
                Emoji("👷🏿", "construction worker: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👷‍♂️",
            "man construction worker",
            arrayOf(
                Emoji("👷🏻‍♂️", "man construction worker: light skin tone"),
                Emoji("👷🏼‍♂️", "man construction worker: medium-light skin tone"),
                Emoji("👷🏽‍♂️", "man construction worker: medium skin tone"),
                Emoji("👷🏾‍♂️", "man construction worker: medium-dark skin tone"),
                Emoji("👷🏿‍♂️", "man construction worker: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👷‍♀️",
            "woman construction worker",
            arrayOf(
                Emoji("👷🏻‍♀️", "woman construction worker: light skin tone"),
                Emoji("👷🏼‍♀️", "woman construction worker: medium-light skin tone"),
                Emoji("👷🏽‍♀️", "woman construction worker: medium skin tone"),
                Emoji("👷🏾‍♀️", "woman construction worker: medium-dark skin tone"),
                Emoji("👷🏿‍♀️", "woman construction worker: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🤴",
            "prince",
            arrayOf(
                Emoji("🤴🏻", "prince: light skin tone"),
                Emoji("🤴🏼", "prince: medium-light skin tone"),
                Emoji("🤴🏽", "prince: medium skin tone"),
                Emoji("🤴🏾", "prince: medium-dark skin tone"),
                Emoji("🤴🏿", "prince: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👸",
            "princess",
            arrayOf(
                Emoji("👸🏻", "princess: light skin tone"),
                Emoji("👸🏼", "princess: medium-light skin tone"),
                Emoji("👸🏽", "princess: medium skin tone"),
                Emoji("👸🏾", "princess: medium-dark skin tone"),
                Emoji("👸🏿", "princess: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👳",
            "person wearing turban",
            arrayOf(
                Emoji("👳🏻", "person wearing turban: light skin tone"),
                Emoji("👳🏼", "person wearing turban: medium-light skin tone"),
                Emoji("👳🏽", "person wearing turban: medium skin tone"),
                Emoji("👳🏾", "person wearing turban: medium-dark skin tone"),
                Emoji("👳🏿", "person wearing turban: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👳‍♂️",
            "man wearing turban",
            arrayOf(
                Emoji("👳🏻‍♂️", "man wearing turban: light skin tone"),
                Emoji("👳🏼‍♂️", "man wearing turban: medium-light skin tone"),
                Emoji("👳🏽‍♂️", "man wearing turban: medium skin tone"),
                Emoji("👳🏾‍♂️", "man wearing turban: medium-dark skin tone"),
                Emoji("👳🏿‍♂️", "man wearing turban: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👳‍♀️",
            "woman wearing turban",
            arrayOf(
                Emoji("👳🏻‍♀️", "woman wearing turban: light skin tone"),
                Emoji("👳🏼‍♀️", "woman wearing turban: medium-light skin tone"),
                Emoji("👳🏽‍♀️", "woman wearing turban: medium skin tone"),
                Emoji("👳🏾‍♀️", "woman wearing turban: medium-dark skin tone"),
                Emoji("👳🏿‍♀️", "woman wearing turban: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👲",
            "man with skullcap",
            arrayOf(
                Emoji("👲🏻", "man with skullcap: light skin tone"),
                Emoji("👲🏼", "man with skullcap: medium-light skin tone"),
                Emoji("👲🏽", "man with skullcap: medium skin tone"),
                Emoji("👲🏾", "man with skullcap: medium-dark skin tone"),
                Emoji("👲🏿", "man with skullcap: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🧕",
            "woman with headscarf",
            arrayOf(
                Emoji("🧕🏻", "woman with headscarf: light skin tone"),
                Emoji("🧕🏼", "woman with headscarf: medium-light skin tone"),
                Emoji("🧕🏽", "woman with headscarf: medium skin tone"),
                Emoji("🧕🏾", "woman with headscarf: medium-dark skin tone"),
                Emoji("🧕🏿", "woman with headscarf: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🤵",
            "man in tuxedo",
            arrayOf(
                Emoji("🤵🏻", "man in tuxedo: light skin tone"),
                Emoji("🤵🏼", "man in tuxedo: medium-light skin tone"),
                Emoji("🤵🏽", "man in tuxedo: medium skin tone"),
                Emoji("🤵🏾", "man in tuxedo: medium-dark skin tone"),
                Emoji("🤵🏿", "man in tuxedo: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👰",
            "bride with veil",
            arrayOf(
                Emoji("👰🏻", "bride with veil: light skin tone"),
                Emoji("👰🏼", "bride with veil: medium-light skin tone"),
                Emoji("👰🏽", "bride with veil: medium skin tone"),
                Emoji("👰🏾", "bride with veil: medium-dark skin tone"),
                Emoji("👰🏿", "bride with veil: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🤰",
            "pregnant woman",
            arrayOf(
                Emoji("🤰🏻", "pregnant woman: light skin tone"),
                Emoji("🤰🏼", "pregnant woman: medium-light skin tone"),
                Emoji("🤰🏽", "pregnant woman: medium skin tone"),
                Emoji("🤰🏾", "pregnant woman: medium-dark skin tone"),
                Emoji("🤰🏿", "pregnant woman: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🤱",
            "breast-feeding",
            arrayOf(
                Emoji("🤱🏻", "breast-feeding: light skin tone"),
                Emoji("🤱🏼", "breast-feeding: medium-light skin tone"),
                Emoji("🤱🏽", "breast-feeding: medium skin tone"),
                Emoji("🤱🏾", "breast-feeding: medium-dark skin tone"),
                Emoji("🤱🏿", "breast-feeding: dark skin tone")
            )
        ),
        //subgroup: person-fantasy
        EmojiWithSkinTone(
            "👼",
            "baby angel",
            arrayOf(
                Emoji("👼🏻", "baby angel: light skin tone"),
                Emoji("👼🏼", "baby angel: medium-light skin tone"),
                Emoji("👼🏽", "baby angel: medium skin tone"),
                Emoji("👼🏾", "baby angel: medium-dark skin tone"),
                Emoji("👼🏿", "baby angel: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🎅",
            "Santa Claus",
            arrayOf(
                Emoji("🎅🏻", "Santa Claus: light skin tone"),
                Emoji("🎅🏼", "Santa Claus: medium-light skin tone"),
                Emoji("🎅🏽", "Santa Claus: medium skin tone"),
                Emoji("🎅🏾", "Santa Claus: medium-dark skin tone"),
                Emoji("🎅🏿", "Santa Claus: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🤶",
            "Mrs. Claus",
            arrayOf(
                Emoji("🤶🏻", "Mrs. Claus: light skin tone"),
                Emoji("🤶🏼", "Mrs. Claus: medium-light skin tone"),
                Emoji("🤶🏽", "Mrs. Claus: medium skin tone"),
                Emoji("🤶🏾", "Mrs. Claus: medium-dark skin tone"),
                Emoji("🤶🏿", "Mrs. Claus: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🦸",
            "superhero",
            arrayOf(
                Emoji("🦸🏻", "superhero: light skin tone"),
                Emoji("🦸🏼", "superhero: medium-light skin tone"),
                Emoji("🦸🏽", "superhero: medium skin tone"),
                Emoji("🦸🏾", "superhero: medium-dark skin tone"),
                Emoji("🦸🏿", "superhero: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🦸‍♂️",
            "man superhero",
            arrayOf(
                Emoji("🦸🏻‍♂️", "man superhero: light skin tone"),
                Emoji("🦸🏼‍♂️", "man superhero: medium-light skin tone"),
                Emoji("🦸🏽‍♂️", "man superhero: medium skin tone"),
                Emoji("🦸🏾‍♂️", "man superhero: medium-dark skin tone"),
                Emoji("🦸🏿‍♂️", "man superhero: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🦸‍♀️",
            "woman superhero",
            arrayOf(
                Emoji("🦸🏻‍♀️", "woman superhero: light skin tone"),
                Emoji("🦸🏼‍♀️", "woman superhero: medium-light skin tone"),
                Emoji("🦸🏽‍♀️", "woman superhero: medium skin tone"),
                Emoji("🦸🏾‍♀️", "woman superhero: medium-dark skin tone"),
                Emoji("🦸🏿‍♀️", "woman superhero: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🦹",
            "supervillain",
            arrayOf(
                Emoji("🦹🏻", "supervillain: light skin tone"),
                Emoji("🦹🏼", "supervillain: medium-light skin tone"),
                Emoji("🦹🏽", "supervillain: medium skin tone"),
                Emoji("🦹🏾", "supervillain: medium-dark skin tone"),
                Emoji("🦹🏿", "supervillain: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🦹‍♂️",
            "man supervillain",
            arrayOf(
                Emoji("🦹🏻‍♂️", "man supervillain: light skin tone"),
                Emoji("🦹🏼‍♂️", "man supervillain: medium-light skin tone"),
                Emoji("🦹🏽‍♂️", "man supervillain: medium skin tone"),
                Emoji("🦹🏾‍♂️", "man supervillain: medium-dark skin tone"),
                Emoji("🦹🏿‍♂️", "man supervillain: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🦹‍♀️",
            "woman supervillain",
            arrayOf(
                Emoji("🦹🏻‍♀️", "woman supervillain: light skin tone"),
                Emoji("🦹🏼‍♀️", "woman supervillain: medium-light skin tone"),
                Emoji("🦹🏽‍♀️", "woman supervillain: medium skin tone"),
                Emoji("🦹🏾‍♀️", "woman supervillain: medium-dark skin tone"),
                Emoji("🦹🏿‍♀️", "woman supervillain: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🧙",
            "mage",
            arrayOf(
                Emoji("🧙🏻", "mage: light skin tone"),
                Emoji("🧙🏼", "mage: medium-light skin tone"),
                Emoji("🧙🏽", "mage: medium skin tone"),
                Emoji("🧙🏾", "mage: medium-dark skin tone"),
                Emoji("🧙🏿", "mage: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🧙‍♂️",
            "man mage",
            arrayOf(
                Emoji("🧙🏻‍♂️", "man mage: light skin tone"),
                Emoji("🧙🏼‍♂️", "man mage: medium-light skin tone"),
                Emoji("🧙🏽‍♂️", "man mage: medium skin tone"),
                Emoji("🧙🏾‍♂️", "man mage: medium-dark skin tone"),
                Emoji("🧙🏿‍♂️", "man mage: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🧙‍♀️",
            "woman mage",
            arrayOf(
                Emoji("🧙🏻‍♀️", "woman mage: light skin tone"),
                Emoji("🧙🏼‍♀️", "woman mage: medium-light skin tone"),
                Emoji("🧙🏽‍♀️", "woman mage: medium skin tone"),
                Emoji("🧙🏾‍♀️", "woman mage: medium-dark skin tone"),
                Emoji("🧙🏿‍♀️", "woman mage: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🧚",
            "fairy",
            arrayOf(
                Emoji("🧚🏻", "fairy: light skin tone"),
                Emoji("🧚🏼", "fairy: medium-light skin tone"),
                Emoji("🧚🏽", "fairy: medium skin tone"),
                Emoji("🧚🏾", "fairy: medium-dark skin tone"),
                Emoji("🧚🏿", "fairy: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🧚‍♂️",
            "man fairy",
            arrayOf(
                Emoji("🧚🏻‍♂️", "man fairy: light skin tone"),
                Emoji("🧚🏼‍♂️", "man fairy: medium-light skin tone"),
                Emoji("🧚🏽‍♂️", "man fairy: medium skin tone"),
                Emoji("🧚🏾‍♂️", "man fairy: medium-dark skin tone"),
                Emoji("🧚🏿‍♂️", "man fairy: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🧚‍♀️",
            "woman fairy",
            arrayOf(
                Emoji("🧚🏻‍♀️", "woman fairy: light skin tone"),
                Emoji("🧚🏼‍♀️", "woman fairy: medium-light skin tone"),
                Emoji("🧚🏽‍♀️", "woman fairy: medium skin tone"),
                Emoji("🧚🏾‍♀️", "woman fairy: medium-dark skin tone"),
                Emoji("🧚🏿‍♀️", "woman fairy: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🧛",
            "vampire",
            arrayOf(
                Emoji("🧛🏻", "vampire: light skin tone"),
                Emoji("🧛🏼", "vampire: medium-light skin tone"),
                Emoji("🧛🏽", "vampire: medium skin tone"),
                Emoji("🧛🏾", "vampire: medium-dark skin tone"),
                Emoji("🧛🏿", "vampire: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🧛‍♂️",
            "man vampire",
            arrayOf(
                Emoji("🧛🏻‍♂️", "man vampire: light skin tone"),
                Emoji("🧛🏼‍♂️", "man vampire: medium-light skin tone"),
                Emoji("🧛🏽‍♂️", "man vampire: medium skin tone"),
                Emoji("🧛🏾‍♂️", "man vampire: medium-dark skin tone"),
                Emoji("🧛🏿‍♂️", "man vampire: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🧛‍♀️",
            "woman vampire",
            arrayOf(
                Emoji("🧛🏻‍♀️", "woman vampire: light skin tone"),
                Emoji("🧛🏼‍♀️", "woman vampire: medium-light skin tone"),
                Emoji("🧛🏽‍♀️", "woman vampire: medium skin tone"),
                Emoji("🧛🏾‍♀️", "woman vampire: medium-dark skin tone"),
                Emoji("🧛🏿‍♀️", "woman vampire: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🧜",
            "merperson",
            arrayOf(
                Emoji("🧜🏻", "merperson: light skin tone"),
                Emoji("🧜🏼", "merperson: medium-light skin tone"),
                Emoji("🧜🏽", "merperson: medium skin tone"),
                Emoji("🧜🏾", "merperson: medium-dark skin tone"),
                Emoji("🧜🏿", "merperson: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🧜‍♂️",
            "merman",
            arrayOf(
                Emoji("🧜🏻‍♂️", "merman: light skin tone"),
                Emoji("🧜🏼‍♂️", "merman: medium-light skin tone"),
                Emoji("🧜🏽‍♂️", "merman: medium skin tone"),
                Emoji("🧜🏾‍♂️", "merman: medium-dark skin tone"),
                Emoji("🧜🏿‍♂️", "merman: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🧜‍♀️",
            "mermaid",
            arrayOf(
                Emoji("🧜🏻‍♀️", "mermaid: light skin tone"),
                Emoji("🧜🏼‍♀️", "mermaid: medium-light skin tone"),
                Emoji("🧜🏽‍♀️", "mermaid: medium skin tone"),
                Emoji("🧜🏾‍♀️", "mermaid: medium-dark skin tone"),
                Emoji("🧜🏿‍♀️", "mermaid: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🧝",
            "elf",
            arrayOf(
                Emoji("🧝🏻", "elf: light skin tone"),
                Emoji("🧝🏼", "elf: medium-light skin tone"),
                Emoji("🧝🏽", "elf: medium skin tone"),
                Emoji("🧝🏾", "elf: medium-dark skin tone"),
                Emoji("🧝🏿", "elf: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🧝‍♂️",
            "man elf",
            arrayOf(
                Emoji("🧝🏻‍♂️", "man elf: light skin tone"),
                Emoji("🧝🏼‍♂️", "man elf: medium-light skin tone"),
                Emoji("🧝🏽‍♂️", "man elf: medium skin tone"),
                Emoji("🧝🏾‍♂️", "man elf: medium-dark skin tone"),
                Emoji("🧝🏿‍♂️", "man elf: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🧝‍♀️",
            "woman elf",
            arrayOf(
                Emoji("🧝🏻‍♀️", "woman elf: light skin tone"),
                Emoji("🧝🏼‍♀️", "woman elf: medium-light skin tone"),
                Emoji("🧝🏽‍♀️", "woman elf: medium skin tone"),
                Emoji("🧝🏾‍♀️", "woman elf: medium-dark skin tone"),
                Emoji("🧝🏿‍♀️", "woman elf: dark skin tone")
            )
        ),
        Emoji("🧞", "genie"),
        Emoji("🧞‍♂️", "man genie"),
        Emoji("🧞‍♀️", "woman genie"),
        Emoji("🧟", "zombie"),
        Emoji("🧟‍♂️", "man zombie"),
        Emoji("🧟‍♀️", "woman zombie"),
        //subgroup: person-activity
        EmojiWithSkinTone(
            "💆",
            "person getting massage",
            arrayOf(
                Emoji("💆🏻", "person getting massage: light skin tone"),
                Emoji("💆🏼", "person getting massage: medium-light skin tone"),
                Emoji("💆🏽", "person getting massage: medium skin tone"),
                Emoji("💆🏾", "person getting massage: medium-dark skin tone"),
                Emoji("💆🏿", "person getting massage: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "💆‍♂️",
            "man getting massage",
            arrayOf(
                Emoji("💆🏻‍♂️", "man getting massage: light skin tone"),
                Emoji("💆🏼‍♂️", "man getting massage: medium-light skin tone"),
                Emoji("💆🏽‍♂️", "man getting massage: medium skin tone"),
                Emoji("💆🏾‍♂️", "man getting massage: medium-dark skin tone"),
                Emoji("💆🏿‍♂️", "man getting massage: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "💆‍♀️",
            "woman getting massage",
            arrayOf(
                Emoji("💆🏻‍♀️", "woman getting massage: light skin tone"),
                Emoji("💆🏼‍♀️", "woman getting massage: medium-light skin tone"),
                Emoji("💆🏽‍♀️", "woman getting massage: medium skin tone"),
                Emoji("💆🏾‍♀️", "woman getting massage: medium-dark skin tone"),
                Emoji("💆🏿‍♀️", "woman getting massage: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "💇",
            "person getting haircut",
            arrayOf(
                Emoji("💇🏻", "person getting haircut: light skin tone"),
                Emoji("💇🏼", "person getting haircut: medium-light skin tone"),
                Emoji("💇🏽", "person getting haircut: medium skin tone"),
                Emoji("💇🏾", "person getting haircut: medium-dark skin tone"),
                Emoji("💇🏿", "person getting haircut: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "💇‍♂️",
            "man getting haircut",
            arrayOf(
                Emoji("💇🏻‍♂️", "man getting haircut: light skin tone"),
                Emoji("💇🏼‍♂️", "man getting haircut: medium-light skin tone"),
                Emoji("💇🏽‍♂️", "man getting haircut: medium skin tone"),
                Emoji("💇🏾‍♂️", "man getting haircut: medium-dark skin tone"),
                Emoji("💇🏿‍♂️", "man getting haircut: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "💇‍♀️",
            "woman getting haircut",
            arrayOf(
                Emoji("💇🏻‍♀️", "woman getting haircut: light skin tone"),
                Emoji("💇🏼‍♀️", "woman getting haircut: medium-light skin tone"),
                Emoji("💇🏽‍♀️", "woman getting haircut: medium skin tone"),
                Emoji("💇🏾‍♀️", "woman getting haircut: medium-dark skin tone"),
                Emoji("💇🏿‍♀️", "woman getting haircut: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🚶",
            "person walking",
            arrayOf(
                Emoji("🚶🏻", "person walking: light skin tone"),
                Emoji("🚶🏼", "person walking: medium-light skin tone"),
                Emoji("🚶🏽", "person walking: medium skin tone"),
                Emoji("🚶🏾", "person walking: medium-dark skin tone"),
                Emoji("🚶🏿", "person walking: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🚶‍♂️",
            "man walking",
            arrayOf(
                Emoji("🚶🏻‍♂️", "man walking: light skin tone"),
                Emoji("🚶🏼‍♂️", "man walking: medium-light skin tone"),
                Emoji("🚶🏽‍♂️", "man walking: medium skin tone"),
                Emoji("🚶🏾‍♂️", "man walking: medium-dark skin tone"),
                Emoji("🚶🏿‍♂️", "man walking: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🚶‍♀️",
            "woman walking",
            arrayOf(
                Emoji("🚶🏻‍♀️", "woman walking: light skin tone"),
                Emoji("🚶🏼‍♀️", "woman walking: medium-light skin tone"),
                Emoji("🚶🏽‍♀️", "woman walking: medium skin tone"),
                Emoji("🚶🏾‍♀️", "woman walking: medium-dark skin tone"),
                Emoji("🚶🏿‍♀️", "woman walking: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🧍",
            "person standing",
            arrayOf(
                Emoji("🧍🏻", "person standing: light skin tone"),
                Emoji("🧍🏼", "person standing: medium-light skin tone"),
                Emoji("🧍🏽", "person standing: medium skin tone"),
                Emoji("🧍🏾", "person standing: medium-dark skin tone"),
                Emoji("🧍🏿", "person standing: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🧍‍♂️",
            "man standing",
            arrayOf(
                Emoji("🧍🏻‍♂️", "man standing: light skin tone"),
                Emoji("🧍🏼‍♂️", "man standing: medium-light skin tone"),
                Emoji("🧍🏽‍♂️", "man standing: medium skin tone"),
                Emoji("🧍🏾‍♂️", "man standing: medium-dark skin tone"),
                Emoji("🧍🏿‍♂️", "man standing: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🧍‍♀️",
            "woman standing",
            arrayOf(
                Emoji("🧍🏻‍♀️", "woman standing: light skin tone"),
                Emoji("🧍🏼‍♀️", "woman standing: medium-light skin tone"),
                Emoji("🧍🏽‍♀️", "woman standing: medium skin tone"),
                Emoji("🧍🏾‍♀️", "woman standing: medium-dark skin tone"),
                Emoji("🧍🏿‍♀️", "woman standing: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🧎",
            "person kneeling",
            arrayOf(
                Emoji("🧎🏻", "person kneeling: light skin tone"),
                Emoji("🧎🏼", "person kneeling: medium-light skin tone"),
                Emoji("🧎🏽", "person kneeling: medium skin tone"),
                Emoji("🧎🏾", "person kneeling: medium-dark skin tone"),
                Emoji("🧎🏿", "person kneeling: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🧎‍♂️",
            "man kneeling",
            arrayOf(
                Emoji("🧎🏻‍♂️", "man kneeling: light skin tone"),
                Emoji("🧎🏼‍♂️", "man kneeling: medium-light skin tone"),
                Emoji("🧎🏽‍♂️", "man kneeling: medium skin tone"),
                Emoji("🧎🏾‍♂️", "man kneeling: medium-dark skin tone"),
                Emoji("🧎🏿‍♂️", "man kneeling: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🧎‍♀️",
            "woman kneeling",
            arrayOf(
                Emoji("🧎🏻‍♀️", "woman kneeling: light skin tone"),
                Emoji("🧎🏼‍♀️", "woman kneeling: medium-light skin tone"),
                Emoji("🧎🏽‍♀️", "woman kneeling: medium skin tone"),
                Emoji("🧎🏾‍♀️", "woman kneeling: medium-dark skin tone"),
                Emoji("🧎🏿‍♀️", "woman kneeling: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🧑‍🦯",
            "person with probing cane",
            arrayOf(
                Emoji("🧑🏻‍🦯", "person with probing cane: light skin tone"),
                Emoji("🧑🏼‍🦯", "person with probing cane: medium-light skin tone"),
                Emoji("🧑🏽‍🦯", "person with probing cane: medium skin tone"),
                Emoji("🧑🏾‍🦯", "person with probing cane: medium-dark skin tone"),
                Emoji("🧑🏿‍🦯", "person with probing cane: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👨‍🦯",
            "man with probing cane",
            arrayOf(
                Emoji("👨🏻‍🦯", "man with probing cane: light skin tone"),
                Emoji("👨🏼‍🦯", "man with probing cane: medium-light skin tone"),
                Emoji("👨🏽‍🦯", "man with probing cane: medium skin tone"),
                Emoji("👨🏾‍🦯", "man with probing cane: medium-dark skin tone"),
                Emoji("👨🏿‍🦯", "man with probing cane: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👩‍🦯",
            "woman with probing cane",
            arrayOf(
                Emoji("👩🏻‍🦯", "woman with probing cane: light skin tone"),
                Emoji("👩🏼‍🦯", "woman with probing cane: medium-light skin tone"),
                Emoji("👩🏽‍🦯", "woman with probing cane: medium skin tone"),
                Emoji("👩🏾‍🦯", "woman with probing cane: medium-dark skin tone"),
                Emoji("👩🏿‍🦯", "woman with probing cane: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🧑‍🦼",
            "person in motorized wheelchair",
            arrayOf(
                Emoji("🧑🏻‍🦼", "person in motorized wheelchair: light skin tone"),
                Emoji("🧑🏼‍🦼", "person in motorized wheelchair: medium-light skin tone"),
                Emoji("🧑🏽‍🦼", "person in motorized wheelchair: medium skin tone"),
                Emoji("🧑🏾‍🦼", "person in motorized wheelchair: medium-dark skin tone"),
                Emoji("🧑🏿‍🦼", "person in motorized wheelchair: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👨‍🦼",
            "man in motorized wheelchair",
            arrayOf(
                Emoji("👨🏻‍🦼", "man in motorized wheelchair: light skin tone"),
                Emoji("👨🏼‍🦼", "man in motorized wheelchair: medium-light skin tone"),
                Emoji("👨🏽‍🦼", "man in motorized wheelchair: medium skin tone"),
                Emoji("👨🏾‍🦼", "man in motorized wheelchair: medium-dark skin tone"),
                Emoji("👨🏿‍🦼", "man in motorized wheelchair: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👩‍🦼",
            "woman in motorized wheelchair",
            arrayOf(
                Emoji("👩🏻‍🦼", "woman in motorized wheelchair: light skin tone"),
                Emoji("👩🏼‍🦼", "woman in motorized wheelchair: medium-light skin tone"),
                Emoji("👩🏽‍🦼", "woman in motorized wheelchair: medium skin tone"),
                Emoji("👩🏾‍🦼", "woman in motorized wheelchair: medium-dark skin tone"),
                Emoji("👩🏿‍🦼", "woman in motorized wheelchair: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🧑‍🦽",
            "person in manual wheelchair",
            arrayOf(
                Emoji("🧑🏻‍🦽", "person in manual wheelchair: light skin tone"),
                Emoji("🧑🏼‍🦽", "person in manual wheelchair: medium-light skin tone"),
                Emoji("🧑🏽‍🦽", "person in manual wheelchair: medium skin tone"),
                Emoji("🧑🏾‍🦽", "person in manual wheelchair: medium-dark skin tone"),
                Emoji("🧑🏿‍🦽", "person in manual wheelchair: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👨‍🦽",
            "man in manual wheelchair",
            arrayOf(
                Emoji("👨🏻‍🦽", "man in manual wheelchair: light skin tone"),
                Emoji("👨🏼‍🦽", "man in manual wheelchair: medium-light skin tone"),
                Emoji("👨🏽‍🦽", "man in manual wheelchair: medium skin tone"),
                Emoji("👨🏾‍🦽", "man in manual wheelchair: medium-dark skin tone"),
                Emoji("👨🏿‍🦽", "man in manual wheelchair: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👩‍🦽",
            "woman in manual wheelchair",
            arrayOf(
                Emoji("👩🏻‍🦽", "woman in manual wheelchair: light skin tone"),
                Emoji("👩🏼‍🦽", "woman in manual wheelchair: medium-light skin tone"),
                Emoji("👩🏽‍🦽", "woman in manual wheelchair: medium skin tone"),
                Emoji("👩🏾‍🦽", "woman in manual wheelchair: medium-dark skin tone"),
                Emoji("👩🏿‍🦽", "woman in manual wheelchair: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🏃",
            "person running",
            arrayOf(
                Emoji("🏃🏻", "person running: light skin tone"),
                Emoji("🏃🏼", "person running: medium-light skin tone"),
                Emoji("🏃🏽", "person running: medium skin tone"),
                Emoji("🏃🏾", "person running: medium-dark skin tone"),
                Emoji("🏃🏿", "person running: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🏃‍♂️",
            "man running",
            arrayOf(
                Emoji("🏃🏻‍♂️", "man running: light skin tone"),
                Emoji("🏃🏼‍♂️", "man running: medium-light skin tone"),
                Emoji("🏃🏽‍♂️", "man running: medium skin tone"),
                Emoji("🏃🏾‍♂️", "man running: medium-dark skin tone"),
                Emoji("🏃🏿‍♂️", "man running: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🏃‍♀️",
            "woman running",
            arrayOf(
                Emoji("🏃🏻‍♀️", "woman running: light skin tone"),
                Emoji("🏃🏼‍♀️", "woman running: medium-light skin tone"),
                Emoji("🏃🏽‍♀️", "woman running: medium skin tone"),
                Emoji("🏃🏾‍♀️", "woman running: medium-dark skin tone"),
                Emoji("🏃🏿‍♀️", "woman running: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "💃",
            "woman dancing",
            arrayOf(
                Emoji("💃🏻", "woman dancing: light skin tone"),
                Emoji("💃🏼", "woman dancing: medium-light skin tone"),
                Emoji("💃🏽", "woman dancing: medium skin tone"),
                Emoji("💃🏾", "woman dancing: medium-dark skin tone"),
                Emoji("💃🏿", "woman dancing: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🕺",
            "man dancing",
            arrayOf(
                Emoji("🕺🏻", "man dancing: light skin tone"),
                Emoji("🕺🏼", "man dancing: medium-light skin tone"),
                Emoji("🕺🏽", "man dancing: medium skin tone"),
                Emoji("🕺🏾", "man dancing: medium-dark skin tone"),
                Emoji("🕺🏿", "man dancing: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🕴️",
            "man in suit levitating",
            arrayOf(
                Emoji("🕴🏻", "man in suit levitating: light skin tone"),
                Emoji("🕴🏼", "man in suit levitating: medium-light skin tone"),
                Emoji("🕴🏽", "man in suit levitating: medium skin tone"),
                Emoji("🕴🏾", "man in suit levitating: medium-dark skin tone"),
                Emoji("🕴🏿", "man in suit levitating: dark skin tone")
            )
        ),
        Emoji("👯", "people with bunny ears"),
        Emoji("👯‍♂️", "men with bunny ears"),
        Emoji("👯‍♀️", "women with bunny ears"),
        EmojiWithSkinTone(
            "🧖",
            "person in steamy room",
            arrayOf(
                Emoji("🧖🏻", "person in steamy room: light skin tone"),
                Emoji("🧖🏼", "person in steamy room: medium-light skin tone"),
                Emoji("🧖🏽", "person in steamy room: medium skin tone"),
                Emoji("🧖🏾", "person in steamy room: medium-dark skin tone"),
                Emoji("🧖🏿", "person in steamy room: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🧖‍♂️",
            "man in steamy room",
            arrayOf(
                Emoji("🧖🏻‍♂️", "man in steamy room: light skin tone"),
                Emoji("🧖🏼‍♂️", "man in steamy room: medium-light skin tone"),
                Emoji("🧖🏽‍♂️", "man in steamy room: medium skin tone"),
                Emoji("🧖🏾‍♂️", "man in steamy room: medium-dark skin tone"),
                Emoji("🧖🏿‍♂️", "man in steamy room: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🧖‍♀️",
            "woman in steamy room",
            arrayOf(
                Emoji("🧖🏻‍♀️", "woman in steamy room: light skin tone"),
                Emoji("🧖🏼‍♀️", "woman in steamy room: medium-light skin tone"),
                Emoji("🧖🏽‍♀️", "woman in steamy room: medium skin tone"),
                Emoji("🧖🏾‍♀️", "woman in steamy room: medium-dark skin tone"),
                Emoji("🧖🏿‍♀️", "woman in steamy room: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🧗",
            "person climbing",
            arrayOf(
                Emoji("🧗🏻", "person climbing: light skin tone"),
                Emoji("🧗🏼", "person climbing: medium-light skin tone"),
                Emoji("🧗🏽", "person climbing: medium skin tone"),
                Emoji("🧗🏾", "person climbing: medium-dark skin tone"),
                Emoji("🧗🏿", "person climbing: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🧗‍♂️",
            "man climbing",
            arrayOf(
                Emoji("🧗🏻‍♂️", "man climbing: light skin tone"),
                Emoji("🧗🏼‍♂️", "man climbing: medium-light skin tone"),
                Emoji("🧗🏽‍♂️", "man climbing: medium skin tone"),
                Emoji("🧗🏾‍♂️", "man climbing: medium-dark skin tone"),
                Emoji("🧗🏿‍♂️", "man climbing: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🧗‍♀️",
            "woman climbing",
            arrayOf(
                Emoji("🧗🏻‍♀️", "woman climbing: light skin tone"),
                Emoji("🧗🏼‍♀️", "woman climbing: medium-light skin tone"),
                Emoji("🧗🏽‍♀️", "woman climbing: medium skin tone"),
                Emoji("🧗🏾‍♀️", "woman climbing: medium-dark skin tone"),
                Emoji("🧗🏿‍♀️", "woman climbing: dark skin tone")
            )
        ),
        //subgroup: person-sport
        Emoji("🤺", "person fencing"),
        EmojiWithSkinTone(
            "🏇",
            "horse racing",
            arrayOf(
                Emoji("🏇🏻", "horse racing: light skin tone"),
                Emoji("🏇🏼", "horse racing: medium-light skin tone"),
                Emoji("🏇🏽", "horse racing: medium skin tone"),
                Emoji("🏇🏾", "horse racing: medium-dark skin tone"),
                Emoji("🏇🏿", "horse racing: dark skin tone")
            )
        ),
        Emoji("⛷️", "skier"),
        EmojiWithSkinTone(
            "🏂",
            "snowboarder",
            arrayOf(
                Emoji("🏂🏻", "snowboarder: light skin tone"),
                Emoji("🏂🏼", "snowboarder: medium-light skin tone"),
                Emoji("🏂🏽", "snowboarder: medium skin tone"),
                Emoji("🏂🏾", "snowboarder: medium-dark skin tone"),
                Emoji("🏂🏿", "snowboarder: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🏌️",
            "person golfing",
            arrayOf(
                Emoji("🏌🏻", "person golfing: light skin tone"),
                Emoji("🏌🏼", "person golfing: medium-light skin tone"),
                Emoji("🏌🏽", "person golfing: medium skin tone"),
                Emoji("🏌🏾", "person golfing: medium-dark skin tone"),
                Emoji("🏌🏿", "person golfing: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🏌️‍♂️",
            "man golfing",
            arrayOf(
                Emoji("🏌🏻‍♂️", "man golfing: light skin tone"),
                Emoji("🏌🏼‍♂️", "man golfing: medium-light skin tone"),
                Emoji("🏌🏽‍♂️", "man golfing: medium skin tone"),
                Emoji("🏌🏾‍♂️", "man golfing: medium-dark skin tone"),
                Emoji("🏌🏿‍♂️", "man golfing: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🏌️‍♀️",
            "woman golfing",
            arrayOf(
                Emoji("🏌🏻‍♀️", "woman golfing: light skin tone"),
                Emoji("🏌🏼‍♀️", "woman golfing: medium-light skin tone"),
                Emoji("🏌🏽‍♀️", "woman golfing: medium skin tone"),
                Emoji("🏌🏾‍♀️", "woman golfing: medium-dark skin tone"),
                Emoji("🏌🏿‍♀️", "woman golfing: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🏄",
            "person surfing",
            arrayOf(
                Emoji("🏄🏻", "person surfing: light skin tone"),
                Emoji("🏄🏼", "person surfing: medium-light skin tone"),
                Emoji("🏄🏽", "person surfing: medium skin tone"),
                Emoji("🏄🏾", "person surfing: medium-dark skin tone"),
                Emoji("🏄🏿", "person surfing: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🏄‍♂️",
            "man surfing",
            arrayOf(
                Emoji("🏄🏻‍♂️", "man surfing: light skin tone"),
                Emoji("🏄🏼‍♂️", "man surfing: medium-light skin tone"),
                Emoji("🏄🏽‍♂️", "man surfing: medium skin tone"),
                Emoji("🏄🏾‍♂️", "man surfing: medium-dark skin tone"),
                Emoji("🏄🏿‍♂️", "man surfing: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🏄‍♀️",
            "woman surfing",
            arrayOf(
                Emoji("🏄🏻‍♀️", "woman surfing: light skin tone"),
                Emoji("🏄🏼‍♀️", "woman surfing: medium-light skin tone"),
                Emoji("🏄🏽‍♀️", "woman surfing: medium skin tone"),
                Emoji("🏄🏾‍♀️", "woman surfing: medium-dark skin tone"),
                Emoji("🏄🏿‍♀️", "woman surfing: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🚣",
            "person rowing boat",
            arrayOf(
                Emoji("🚣🏻", "person rowing boat: light skin tone"),
                Emoji("🚣🏼", "person rowing boat: medium-light skin tone"),
                Emoji("🚣🏽", "person rowing boat: medium skin tone"),
                Emoji("🚣🏾", "person rowing boat: medium-dark skin tone"),
                Emoji("🚣🏿", "person rowing boat: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🚣‍♂️",
            "man rowing boat",
            arrayOf(
                Emoji("🚣🏻‍♂️", "man rowing boat: light skin tone"),
                Emoji("🚣🏼‍♂️", "man rowing boat: medium-light skin tone"),
                Emoji("🚣🏽‍♂️", "man rowing boat: medium skin tone"),
                Emoji("🚣🏾‍♂️", "man rowing boat: medium-dark skin tone"),
                Emoji("🚣🏿‍♂️", "man rowing boat: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🚣‍♀️",
            "woman rowing boat",
            arrayOf(
                Emoji("🚣🏻‍♀️", "woman rowing boat: light skin tone"),
                Emoji("🚣🏼‍♀️", "woman rowing boat: medium-light skin tone"),
                Emoji("🚣🏽‍♀️", "woman rowing boat: medium skin tone"),
                Emoji("🚣🏾‍♀️", "woman rowing boat: medium-dark skin tone"),
                Emoji("🚣🏿‍♀️", "woman rowing boat: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🏊",
            "person swimming",
            arrayOf(
                Emoji("🏊🏻", "person swimming: light skin tone"),
                Emoji("🏊🏼", "person swimming: medium-light skin tone"),
                Emoji("🏊🏽", "person swimming: medium skin tone"),
                Emoji("🏊🏾", "person swimming: medium-dark skin tone"),
                Emoji("🏊🏿", "person swimming: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🏊‍♂️",
            "man swimming",
            arrayOf(
                Emoji("🏊🏻‍♂️", "man swimming: light skin tone"),
                Emoji("🏊🏼‍♂️", "man swimming: medium-light skin tone"),
                Emoji("🏊🏽‍♂️", "man swimming: medium skin tone"),
                Emoji("🏊🏾‍♂️", "man swimming: medium-dark skin tone"),
                Emoji("🏊🏿‍♂️", "man swimming: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🏊‍♀️",
            "woman swimming",
            arrayOf(
                Emoji("🏊🏻‍♀️", "woman swimming: light skin tone"),
                Emoji("🏊🏼‍♀️", "woman swimming: medium-light skin tone"),
                Emoji("🏊🏽‍♀️", "woman swimming: medium skin tone"),
                Emoji("🏊🏾‍♀️", "woman swimming: medium-dark skin tone"),
                Emoji("🏊🏿‍♀️", "woman swimming: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "⛹️",
            "person bouncing ball",
            arrayOf(
                Emoji("⛹🏻", "person bouncing ball: light skin tone"),
                Emoji("⛹🏼", "person bouncing ball: medium-light skin tone"),
                Emoji("⛹🏽", "person bouncing ball: medium skin tone"),
                Emoji("⛹🏾", "person bouncing ball: medium-dark skin tone"),
                Emoji("⛹🏿", "person bouncing ball: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "⛹️‍♂️",
            "man bouncing ball",
            arrayOf(
                Emoji("⛹🏻‍♂️", "man bouncing ball: light skin tone"),
                Emoji("⛹🏼‍♂️", "man bouncing ball: medium-light skin tone"),
                Emoji("⛹🏽‍♂️", "man bouncing ball: medium skin tone"),
                Emoji("⛹🏾‍♂️", "man bouncing ball: medium-dark skin tone"),
                Emoji("⛹🏿‍♂️", "man bouncing ball: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "⛹️‍♀️",
            "woman bouncing ball",
            arrayOf(
                Emoji("⛹🏻‍♀️", "woman bouncing ball: light skin tone"),
                Emoji("⛹🏼‍♀️", "woman bouncing ball: medium-light skin tone"),
                Emoji("⛹🏽‍♀️", "woman bouncing ball: medium skin tone"),
                Emoji("⛹🏾‍♀️", "woman bouncing ball: medium-dark skin tone"),
                Emoji("⛹🏿‍♀️", "woman bouncing ball: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🏋️",
            "person lifting weights",
            arrayOf(
                Emoji("🏋🏻", "person lifting weights: light skin tone"),
                Emoji("🏋🏼", "person lifting weights: medium-light skin tone"),
                Emoji("🏋🏽", "person lifting weights: medium skin tone"),
                Emoji("🏋🏾", "person lifting weights: medium-dark skin tone"),
                Emoji("🏋🏿", "person lifting weights: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🏋️‍♂️",
            "man lifting weights",
            arrayOf(
                Emoji("🏋🏻‍♂️", "man lifting weights: light skin tone"),
                Emoji("🏋🏼‍♂️", "man lifting weights: medium-light skin tone"),
                Emoji("🏋🏽‍♂️", "man lifting weights: medium skin tone"),
                Emoji("🏋🏾‍♂️", "man lifting weights: medium-dark skin tone"),
                Emoji("🏋🏿‍♂️", "man lifting weights: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🏋️‍♀️",
            "woman lifting weights",
            arrayOf(
                Emoji("🏋🏻‍♀️", "woman lifting weights: light skin tone"),
                Emoji("🏋🏼‍♀️", "woman lifting weights: medium-light skin tone"),
                Emoji("🏋🏽‍♀️", "woman lifting weights: medium skin tone"),
                Emoji("🏋🏾‍♀️", "woman lifting weights: medium-dark skin tone"),
                Emoji("🏋🏿‍♀️", "woman lifting weights: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🚴",
            "person biking",
            arrayOf(
                Emoji("🚴🏻", "person biking: light skin tone"),
                Emoji("🚴🏼", "person biking: medium-light skin tone"),
                Emoji("🚴🏽", "person biking: medium skin tone"),
                Emoji("🚴🏾", "person biking: medium-dark skin tone"),
                Emoji("🚴🏿", "person biking: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🚴‍♂️",
            "man biking",
            arrayOf(
                Emoji("🚴🏻‍♂️", "man biking: light skin tone"),
                Emoji("🚴🏼‍♂️", "man biking: medium-light skin tone"),
                Emoji("🚴🏽‍♂️", "man biking: medium skin tone"),
                Emoji("🚴🏾‍♂️", "man biking: medium-dark skin tone"),
                Emoji("🚴🏿‍♂️", "man biking: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🚴‍♀️",
            "woman biking",
            arrayOf(
                Emoji("🚴🏻‍♀️", "woman biking: light skin tone"),
                Emoji("🚴🏼‍♀️", "woman biking: medium-light skin tone"),
                Emoji("🚴🏽‍♀️", "woman biking: medium skin tone"),
                Emoji("🚴🏾‍♀️", "woman biking: medium-dark skin tone"),
                Emoji("🚴🏿‍♀️", "woman biking: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🚵",
            "person mountain biking",
            arrayOf(
                Emoji("🚵🏻", "person mountain biking: light skin tone"),
                Emoji("🚵🏼", "person mountain biking: medium-light skin tone"),
                Emoji("🚵🏽", "person mountain biking: medium skin tone"),
                Emoji("🚵🏾", "person mountain biking: medium-dark skin tone"),
                Emoji("🚵🏿", "person mountain biking: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🚵‍♂️",
            "man mountain biking",
            arrayOf(
                Emoji("🚵🏻‍♂️", "man mountain biking: light skin tone"),
                Emoji("🚵🏼‍♂️", "man mountain biking: medium-light skin tone"),
                Emoji("🚵🏽‍♂️", "man mountain biking: medium skin tone"),
                Emoji("🚵🏾‍♂️", "man mountain biking: medium-dark skin tone"),
                Emoji("🚵🏿‍♂️", "man mountain biking: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🚵‍♀️",
            "woman mountain biking",
            arrayOf(
                Emoji("🚵🏻‍♀️", "woman mountain biking: light skin tone"),
                Emoji("🚵🏼‍♀️", "woman mountain biking: medium-light skin tone"),
                Emoji("🚵🏽‍♀️", "woman mountain biking: medium skin tone"),
                Emoji("🚵🏾‍♀️", "woman mountain biking: medium-dark skin tone"),
                Emoji("🚵🏿‍♀️", "woman mountain biking: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🤸",
            "person cartwheeling",
            arrayOf(
                Emoji("🤸🏻", "person cartwheeling: light skin tone"),
                Emoji("🤸🏼", "person cartwheeling: medium-light skin tone"),
                Emoji("🤸🏽", "person cartwheeling: medium skin tone"),
                Emoji("🤸🏾", "person cartwheeling: medium-dark skin tone"),
                Emoji("🤸🏿", "person cartwheeling: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🤸‍♂️",
            "man cartwheeling",
            arrayOf(
                Emoji("🤸🏻‍♂️", "man cartwheeling: light skin tone"),
                Emoji("🤸🏼‍♂️", "man cartwheeling: medium-light skin tone"),
                Emoji("🤸🏽‍♂️", "man cartwheeling: medium skin tone"),
                Emoji("🤸🏾‍♂️", "man cartwheeling: medium-dark skin tone"),
                Emoji("🤸🏿‍♂️", "man cartwheeling: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🤸‍♀️",
            "woman cartwheeling",
            arrayOf(
                Emoji("🤸🏻‍♀️", "woman cartwheeling: light skin tone"),
                Emoji("🤸🏼‍♀️", "woman cartwheeling: medium-light skin tone"),
                Emoji("🤸🏽‍♀️", "woman cartwheeling: medium skin tone"),
                Emoji("🤸🏾‍♀️", "woman cartwheeling: medium-dark skin tone"),
                Emoji("🤸🏿‍♀️", "woman cartwheeling: dark skin tone")
            )
        ),
        Emoji("🤼", "people wrestling"),
        Emoji("🤼‍♂️", "men wrestling"),
        Emoji("🤼‍♀️", "women wrestling"),
        EmojiWithSkinTone(
            "🤽",
            "person playing water polo",
            arrayOf(
                Emoji("🤽🏻", "person playing water polo: light skin tone"),
                Emoji("🤽🏼", "person playing water polo: medium-light skin tone"),
                Emoji("🤽🏽", "person playing water polo: medium skin tone"),
                Emoji("🤽🏾", "person playing water polo: medium-dark skin tone"),
                Emoji("🤽🏿", "person playing water polo: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🤽‍♂️",
            "man playing water polo",
            arrayOf(
                Emoji("🤽🏻‍♂️", "man playing water polo: light skin tone"),
                Emoji("🤽🏼‍♂️", "man playing water polo: medium-light skin tone"),
                Emoji("🤽🏽‍♂️", "man playing water polo: medium skin tone"),
                Emoji("🤽🏾‍♂️", "man playing water polo: medium-dark skin tone"),
                Emoji("🤽🏿‍♂️", "man playing water polo: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🤽‍♀️",
            "woman playing water polo",
            arrayOf(
                Emoji("🤽🏻‍♀️", "woman playing water polo: light skin tone"),
                Emoji("🤽🏼‍♀️", "woman playing water polo: medium-light skin tone"),
                Emoji("🤽🏽‍♀️", "woman playing water polo: medium skin tone"),
                Emoji("🤽🏾‍♀️", "woman playing water polo: medium-dark skin tone"),
                Emoji("🤽🏿‍♀️", "woman playing water polo: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🤾",
            "person playing handball",
            arrayOf(
                Emoji("🤾🏻", "person playing handball: light skin tone"),
                Emoji("🤾🏼", "person playing handball: medium-light skin tone"),
                Emoji("🤾🏽", "person playing handball: medium skin tone"),
                Emoji("🤾🏾", "person playing handball: medium-dark skin tone"),
                Emoji("🤾🏿", "person playing handball: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🤾‍♂️",
            "man playing handball",
            arrayOf(
                Emoji("🤾🏻‍♂️", "man playing handball: light skin tone"),
                Emoji("🤾🏼‍♂️", "man playing handball: medium-light skin tone"),
                Emoji("🤾🏽‍♂️", "man playing handball: medium skin tone"),
                Emoji("🤾🏾‍♂️", "man playing handball: medium-dark skin tone"),
                Emoji("🤾🏿‍♂️", "man playing handball: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🤾‍♀️",
            "woman playing handball",
            arrayOf(
                Emoji("🤾🏻‍♀️", "woman playing handball: light skin tone"),
                Emoji("🤾🏼‍♀️", "woman playing handball: medium-light skin tone"),
                Emoji("🤾🏽‍♀️", "woman playing handball: medium skin tone"),
                Emoji("🤾🏾‍♀️", "woman playing handball: medium-dark skin tone"),
                Emoji("🤾🏿‍♀️", "woman playing handball: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🤹",
            "person juggling",
            arrayOf(
                Emoji("🤹🏻", "person juggling: light skin tone"),
                Emoji("🤹🏼", "person juggling: medium-light skin tone"),
                Emoji("🤹🏽", "person juggling: medium skin tone"),
                Emoji("🤹🏾", "person juggling: medium-dark skin tone"),
                Emoji("🤹🏿", "person juggling: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🤹‍♂️",
            "man juggling",
            arrayOf(
                Emoji("🤹🏻‍♂️", "man juggling: light skin tone"),
                Emoji("🤹🏼‍♂️", "man juggling: medium-light skin tone"),
                Emoji("🤹🏽‍♂️", "man juggling: medium skin tone"),
                Emoji("🤹🏾‍♂️", "man juggling: medium-dark skin tone"),
                Emoji("🤹🏿‍♂️", "man juggling: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🤹‍♀️",
            "woman juggling",
            arrayOf(
                Emoji("🤹🏻‍♀️", "woman juggling: light skin tone"),
                Emoji("🤹🏼‍♀️", "woman juggling: medium-light skin tone"),
                Emoji("🤹🏽‍♀️", "woman juggling: medium skin tone"),
                Emoji("🤹🏾‍♀️", "woman juggling: medium-dark skin tone"),
                Emoji("🤹🏿‍♀️", "woman juggling: dark skin tone")
            )
        ),
        //subgroup: person-resting
        EmojiWithSkinTone(
            "🧘",
            "person in lotus position",
            arrayOf(
                Emoji("🧘🏻", "person in lotus position: light skin tone"),
                Emoji("🧘🏼", "person in lotus position: medium-light skin tone"),
                Emoji("🧘🏽", "person in lotus position: medium skin tone"),
                Emoji("🧘🏾", "person in lotus position: medium-dark skin tone"),
                Emoji("🧘🏿", "person in lotus position: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🧘‍♂️",
            "man in lotus position",
            arrayOf(
                Emoji("🧘🏻‍♂️", "man in lotus position: light skin tone"),
                Emoji("🧘🏼‍♂️", "man in lotus position: medium-light skin tone"),
                Emoji("🧘🏽‍♂️", "man in lotus position: medium skin tone"),
                Emoji("🧘🏾‍♂️", "man in lotus position: medium-dark skin tone"),
                Emoji("🧘🏿‍♂️", "man in lotus position: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🧘‍♀️",
            "woman in lotus position",
            arrayOf(
                Emoji("🧘🏻‍♀️", "woman in lotus position: light skin tone"),
                Emoji("🧘🏼‍♀️", "woman in lotus position: medium-light skin tone"),
                Emoji("🧘🏽‍♀️", "woman in lotus position: medium skin tone"),
                Emoji("🧘🏾‍♀️", "woman in lotus position: medium-dark skin tone"),
                Emoji("🧘🏿‍♀️", "woman in lotus position: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🛀",
            "person taking bath",
            arrayOf(
                Emoji("🛀🏻", "person taking bath: light skin tone"),
                Emoji("🛀🏼", "person taking bath: medium-light skin tone"),
                Emoji("🛀🏽", "person taking bath: medium skin tone"),
                Emoji("🛀🏾", "person taking bath: medium-dark skin tone"),
                Emoji("🛀🏿", "person taking bath: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "🛌",
            "person in bed",
            arrayOf(
                Emoji("🛌🏻", "person in bed: light skin tone"),
                Emoji("🛌🏼", "person in bed: medium-light skin tone"),
                Emoji("🛌🏽", "person in bed: medium skin tone"),
                Emoji("🛌🏾", "person in bed: medium-dark skin tone"),
                Emoji("🛌🏿", "person in bed: dark skin tone")
            )
        ),
        //subgroup: family
        EmojiWithSkinTone(
            "🧑‍🤝‍🧑", "people holding hands", arrayOf(
                Emoji("🧑🏻‍🤝‍🧑🏻", "people holding hands: light skin tone"),
                Emoji(
                    "🧑🏻‍🤝‍🧑🏼",
                    "people holding hands: light skin tone, medium-light skin tone"
                ),
                Emoji("🧑🏻‍🤝‍🧑🏽", "people holding hands: light skin tone, medium skin tone"),
                Emoji(
                    "🧑🏻‍🤝‍🧑🏾",
                    "people holding hands: light skin tone, medium-dark skin tone"
                ),
                Emoji("🧑🏻‍🤝‍🧑🏿", "people holding hands: light skin tone, dark skin tone"),
                Emoji(
                    "🧑🏼‍🤝‍🧑🏻",
                    "people holding hands: medium-light skin tone, light skin tone"
                ),
                Emoji("🧑🏼‍🤝‍🧑🏼", "people holding hands: medium-light skin tone"),
                Emoji(
                    "🧑🏼‍🤝‍🧑🏽",
                    "people holding hands: medium-light skin tone, medium skin tone"
                ),
                Emoji(
                    "🧑🏼‍🤝‍🧑🏾",
                    "people holding hands: medium-light skin tone, medium-dark skin tone"
                ),
                Emoji(
                    "🧑🏼‍🤝‍🧑🏿",
                    "people holding hands: medium-light skin tone, dark skin tone"
                ),
                Emoji("🧑🏽‍🤝‍🧑🏻", "people holding hands: medium skin tone, light skin tone"),
                Emoji(
                    "🧑🏽‍🤝‍🧑🏼",
                    "people holding hands: medium skin tone, medium-light skin tone"
                ),
                Emoji("🧑🏽‍🤝‍🧑🏽", "people holding hands: medium skin tone"),
                Emoji(
                    "🧑🏽‍🤝‍🧑🏾",
                    "people holding hands: medium skin tone, medium-dark skin tone"
                ),
                Emoji("🧑🏽‍🤝‍🧑🏿", "people holding hands: medium skin tone, dark skin tone"),
                Emoji(
                    "🧑🏾‍🤝‍🧑🏻",
                    "people holding hands: medium-dark skin tone, light skin tone"
                ),
                Emoji(
                    "🧑🏾‍🤝‍🧑🏼",
                    "people holding hands: medium-dark skin tone, medium-light skin tone"
                ),
                Emoji(
                    "🧑🏾‍🤝‍🧑🏽",
                    "people holding hands: medium-dark skin tone, medium skin tone"
                ),
                Emoji("🧑🏾‍🤝‍🧑🏾", "people holding hands: medium-dark skin tone"),
                Emoji(
                    "🧑🏾‍🤝‍🧑🏿",
                    "people holding hands: medium-dark skin tone, dark skin tone"
                ),
                Emoji("🧑🏿‍🤝‍🧑🏻", "people holding hands: dark skin tone, light skin tone"),
                Emoji(
                    "🧑🏿‍🤝‍🧑🏼",
                    "people holding hands: dark skin tone, medium-light skin tone"
                ),
                Emoji("🧑🏿‍🤝‍🧑🏽", "people holding hands: dark skin tone, medium skin tone"),
                Emoji(
                    "🧑🏿‍🤝‍🧑🏾",
                    "people holding hands: dark skin tone, medium-dark skin tone"
                ),
                Emoji("🧑🏿‍🤝‍🧑🏿", "people holding hands: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👭", "women holding hands", arrayOf(
                Emoji("👭🏻", "women holding hands: light skin tone"),
                Emoji(
                    "👩🏻‍🤝‍👩🏼",
                    "women holding hands: light skin tone, medium-light skin tone"
                ),
                Emoji("👩🏻‍🤝‍👩🏽", "women holding hands: light skin tone, medium skin tone"),
                Emoji(
                    "👩🏻‍🤝‍👩🏾",
                    "women holding hands: light skin tone, medium-dark skin tone"
                ),
                Emoji("👩🏻‍🤝‍👩🏿", "women holding hands: light skin tone, dark skin tone"),
                Emoji(
                    "👩🏼‍🤝‍👩🏻",
                    "women holding hands: medium-light skin tone, light skin tone"
                ),
                Emoji("👭🏼", "women holding hands: medium-light skin tone"),
                Emoji(
                    "👩🏼‍🤝‍👩🏽",
                    "women holding hands: medium-light skin tone, medium skin tone"
                ),
                Emoji(
                    "👩🏼‍🤝‍👩🏾",
                    "women holding hands: medium-light skin tone, medium-dark skin tone"
                ),
                Emoji(
                    "👩🏼‍🤝‍👩🏿",
                    "women holding hands: medium-light skin tone, dark skin tone"
                ),
                Emoji("👩🏽‍🤝‍👩🏻", "women holding hands: medium skin tone, light skin tone"),
                Emoji(
                    "👩🏽‍🤝‍👩🏼",
                    "women holding hands: medium skin tone, medium-light skin tone"
                ),
                Emoji("👭🏽", "women holding hands: medium skin tone"),
                Emoji(
                    "👩🏽‍🤝‍👩🏾",
                    "women holding hands: medium skin tone, medium-dark skin tone"
                ),
                Emoji("👩🏽‍🤝‍👩🏿", "women holding hands: medium skin tone, dark skin tone"),
                Emoji(
                    "👩🏾‍🤝‍👩🏻",
                    "women holding hands: medium-dark skin tone, light skin tone"
                ),
                Emoji(
                    "👩🏾‍🤝‍👩🏼",
                    "women holding hands: medium-dark skin tone, medium-light skin tone"
                ),
                Emoji(
                    "👩🏾‍🤝‍👩🏽",
                    "women holding hands: medium-dark skin tone, medium skin tone"
                ),
                Emoji("👭🏾", "women holding hands: medium-dark skin tone"),
                Emoji("👩🏾‍🤝‍👩🏿", "women holding hands: medium-dark skin tone, dark skin tone"),
                Emoji("👩🏿‍🤝‍👩🏻", "women holding hands: dark skin tone, light skin tone"),
                Emoji(
                    "👩🏿‍🤝‍👩🏼",
                    "women holding hands: dark skin tone, medium-light skin tone"
                ),
                Emoji("👩🏿‍🤝‍👩🏽", "women holding hands: dark skin tone, medium skin tone"),
                Emoji("👩🏿‍🤝‍👩🏾", "women holding hands: dark skin tone, medium-dark skin tone"),
                Emoji("👭🏿", "women holding hands: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👫", "woman and man holding hands", arrayOf(
                Emoji("👫🏻", "woman and man holding hands: light skin tone"),
                Emoji(
                    "👩🏻‍🤝‍👨🏼",
                    "woman and man holding hands: light skin tone, medium-light skin tone"
                ),
                Emoji(
                    "👩🏻‍🤝‍👨🏽",
                    "woman and man holding hands: light skin tone, medium skin tone"
                ),
                Emoji(
                    "👩🏻‍🤝‍👨🏾",
                    "woman and man holding hands: light skin tone, medium-dark skin tone"
                ),
                Emoji(
                    "👩🏻‍🤝‍👨🏿",
                    "woman and man holding hands: light skin tone, dark skin tone"
                ),
                Emoji(
                    "👩🏼‍🤝‍👨🏻",
                    "woman and man holding hands: medium-light skin tone, light skin tone"
                ),
                Emoji("👫🏼", "woman and man holding hands: medium-light skin tone"),
                Emoji(
                    "👩🏼‍🤝‍👨🏽",
                    "woman and man holding hands: medium-light skin tone, medium skin tone"
                ),
                Emoji(
                    "👩🏼‍🤝‍👨🏾",
                    "woman and man holding hands: medium-light skin tone, medium-dark skin tone"
                ),
                Emoji(
                    "👩🏼‍🤝‍👨🏿",
                    "woman and man holding hands: medium-light skin tone, dark skin tone"
                ),
                Emoji(
                    "👩🏽‍🤝‍👨🏻",
                    "woman and man holding hands: medium skin tone, light skin tone"
                ),
                Emoji(
                    "👩🏽‍🤝‍👨🏼",
                    "woman and man holding hands: medium skin tone, medium-light skin tone"
                ),
                Emoji("👫🏽", "woman and man holding hands: medium skin tone"),
                Emoji(
                    "👩🏽‍🤝‍👨🏾",
                    "woman and man holding hands: medium skin tone, medium-dark skin tone"
                ),
                Emoji(
                    "👩🏽‍🤝‍👨🏿",
                    "woman and man holding hands: medium skin tone, dark skin tone"
                ),
                Emoji(
                    "👩🏾‍🤝‍👨🏻",
                    "woman and man holding hands: medium-dark skin tone, light skin tone"
                ),
                Emoji(
                    "👩🏾‍🤝‍👨🏼",
                    "woman and man holding hands: medium-dark skin tone, medium-light skin tone"
                ),
                Emoji(
                    "👩🏾‍🤝‍👨🏽",
                    "woman and man holding hands: medium-dark skin tone, medium skin tone"
                ),
                Emoji("👫🏾", "woman and man holding hands: medium-dark skin tone"),
                Emoji(
                    "👩🏾‍🤝‍👨🏿",
                    "woman and man holding hands: medium-dark skin tone, dark skin tone"
                ),
                Emoji(
                    "👩🏿‍🤝‍👨🏻",
                    "woman and man holding hands: dark skin tone, light skin tone"
                ),
                Emoji(
                    "👩🏿‍🤝‍👨🏼",
                    "woman and man holding hands: dark skin tone, medium-light skin tone"
                ),
                Emoji(
                    "👩🏿‍🤝‍👨🏽",
                    "woman and man holding hands: dark skin tone, medium skin tone"
                ),
                Emoji(
                    "👩🏿‍🤝‍👨🏾",
                    "woman and man holding hands: dark skin tone, medium-dark skin tone"
                ),
                Emoji("👫🏿", "woman and man holding hands: dark skin tone")
            )
        ),
        EmojiWithSkinTone(
            "👬", "men holding hands", arrayOf(
                Emoji("👬🏻", "men holding hands: light skin tone"),
                Emoji("👨🏻‍🤝‍👨🏼", "men holding hands: light skin tone, medium-light skin tone"),
                Emoji("👨🏻‍🤝‍👨🏽", "men holding hands: light skin tone, medium skin tone"),
                Emoji("👨🏻‍🤝‍👨🏾", "men holding hands: light skin tone, medium-dark skin tone"),
                Emoji("👨🏻‍🤝‍👨🏿", "men holding hands: light skin tone, dark skin tone"),
                Emoji("👨🏼‍🤝‍👨🏻", "men holding hands: medium-light skin tone, light skin tone"),
                Emoji("👬🏼", "men holding hands: medium-light skin tone"),
                Emoji(
                    "👨🏼‍🤝‍👨🏽",
                    "men holding hands: medium-light skin tone, medium skin tone"
                ),
                Emoji(
                    "👨🏼‍🤝‍👨🏾",
                    "men holding hands: medium-light skin tone, medium-dark skin tone"
                ),
                Emoji("👨🏼‍🤝‍👨🏿", "men holding hands: medium-light skin tone, dark skin tone"),
                Emoji("👨🏽‍🤝‍👨🏻", "men holding hands: medium skin tone, light skin tone"),
                Emoji(
                    "👨🏽‍🤝‍👨🏼",
                    "men holding hands: medium skin tone, medium-light skin tone"
                ),
                Emoji("👬🏽", "men holding hands: medium skin tone"),
                Emoji("👨🏽‍🤝‍👨🏾", "men holding hands: medium skin tone, medium-dark skin tone"),
                Emoji("👨🏽‍🤝‍👨🏿", "men holding hands: medium skin tone, dark skin tone"),
                Emoji("👨🏾‍🤝‍👨🏻", "men holding hands: medium-dark skin tone, light skin tone"),
                Emoji(
                    "👨🏾‍🤝‍👨🏼",
                    "men holding hands: medium-dark skin tone, medium-light skin tone"
                ),
                Emoji("👨🏾‍🤝‍👨🏽", "men holding hands: medium-dark skin tone, medium skin tone"),
                Emoji("👬🏾", "men holding hands: medium-dark skin tone"),
                Emoji("👨🏾‍🤝‍👨🏿", "men holding hands: medium-dark skin tone, dark skin tone"),
                Emoji("👨🏿‍🤝‍👨🏻", "men holding hands: dark skin tone, light skin tone"),
                Emoji("👨🏿‍🤝‍👨🏼", "men holding hands: dark skin tone, medium-light skin tone"),
                Emoji("👨🏿‍🤝‍👨🏽", "men holding hands: dark skin tone, medium skin tone"),
                Emoji("👨🏿‍🤝‍👨🏾", "men holding hands: dark skin tone, medium-dark skin tone"),
                Emoji("👬🏿", "men holding hands: dark skin tone")
            )
        ),
        Emoji("💏", "kiss"),
        Emoji("👩‍❤️‍💋‍👨", "kiss: woman, man"),
        Emoji("👨‍❤️‍💋‍👨", "kiss: man, man"),
        Emoji("👩‍❤️‍💋‍👩", "kiss: woman, woman"),
        Emoji("💑", "couple with heart"),
        Emoji("👩‍❤️‍👨", "couple with heart: woman, man"),
        Emoji("👨‍❤️‍👨", "couple with heart: man, man"),
        Emoji("👩‍❤️‍👩", "couple with heart: woman, woman"),
        Emoji("👪", "family"),
        Emoji("👨‍👩‍👦", "family: man, woman, boy"),
        Emoji("👨‍👩‍👧", "family: man, woman, girl"),
        Emoji("👨‍👩‍👧‍👦", "family: man, woman, girl, boy"),
        Emoji("👨‍👩‍👦‍👦", "family: man, woman, boy, boy"),
        Emoji("👨‍👩‍👧‍👧", "family: man, woman, girl, girl"),
        Emoji("👨‍👨‍👦", "family: man, man, boy"),
        Emoji("👨‍👨‍👧", "family: man, man, girl"),
        Emoji("👨‍👨‍👧‍👦", "family: man, man, girl, boy"),
        Emoji("👨‍👨‍👦‍👦", "family: man, man, boy, boy"),
        Emoji("👨‍👨‍👧‍👧", "family: man, man, girl, girl"),
        Emoji("👩‍👩‍👦", "family: woman, woman, boy"),
        Emoji("👩‍👩‍👧", "family: woman, woman, girl"),
        Emoji("👩‍👩‍👧‍👦", "family: woman, woman, girl, boy"),
        Emoji("👩‍👩‍👦‍👦", "family: woman, woman, boy, boy"),
        Emoji("👩‍👩‍👧‍👧", "family: woman, woman, girl, girl"),
        Emoji("👨‍👦", "family: man, boy"),
        Emoji("👨‍👦‍👦", "family: man, boy, boy"),
        Emoji("👨‍👧", "family: man, girl"),
        Emoji("👨‍👧‍👦", "family: man, girl, boy"),
        Emoji("👨‍👧‍👧", "family: man, girl, girl"),
        Emoji("👩‍👦", "family: woman, boy"),
        Emoji("👩‍👦‍👦", "family: woman, boy, boy"),
        Emoji("👩‍👧", "family: woman, girl"),
        Emoji("👩‍👧‍👦", "family: woman, girl, boy"),
        Emoji("👩‍👧‍👧", "family: woman, girl, girl"),
        //subgroup: person-symbol
        Emoji("🗣️", "speaking head"),
        Emoji("👤", "bust in silhouette"),
        Emoji("👥", "busts in silhouette"),
        Emoji("👣", "footprints")
    )
    val symbols = arrayOf(
        //group: Symbols
        //subgroup: transport-sign
        Emoji("🏧", "ATM sign"),
        Emoji("🚮", "litter in bin sign"),
        Emoji("🚰", "potable water"),
        Emoji("♿", "wheelchair symbol"),
        Emoji("🚹", "men’s room"),
        Emoji("🚺", "women’s room"),
        Emoji("🚻", "restroom"),
        Emoji("🚼", "baby symbol"),
        Emoji("🚾", "water closet"),
        Emoji("🛂", "passport control"),
        Emoji("🛃", "customs"),
        Emoji("🛄", "baggage claim"),
        Emoji("🛅", "left luggage"),
        //subgroup: warning
        Emoji("⚠️", "warning"),
        Emoji("🚸", "children crossing"),
        Emoji("⛔", "no entry"),
        Emoji("🚫", "prohibited"),
        Emoji("🚳", "no bicycles"),
        Emoji("🚭", "no smoking"),
        Emoji("🚯", "no littering"),
        Emoji("🚱", "non-potable water"),
        Emoji("🚷", "no pedestrians"),
        Emoji("📵", "no mobile phones"),
        Emoji("🔞", "no one under eighteen"),
        Emoji("☢️", "radioactive"),
        Emoji("☣️", "biohazard"),
        //subgroup: arrow
        Emoji("⬆️", "up arrow"),
        Emoji("↗️", "up-right arrow"),
        Emoji("➡️", "right arrow"),
        Emoji("↘️", "down-right arrow"),
        Emoji("⬇️", "down arrow"),
        Emoji("↙️", "down-left arrow"),
        Emoji("⬅️", "left arrow"),
        Emoji("↖️", "up-left arrow"),
        Emoji("↕️", "up-down arrow"),
        Emoji("↔️", "left-right arrow"),
        Emoji("↩️", "right arrow curving left"),
        Emoji("↪️", "left arrow curving right"),
        Emoji("⤴️", "right arrow curving up"),
        Emoji("⤵️", "right arrow curving down"),
        Emoji("🔃", "clockwise vertical arrows"),
        Emoji("🔄", "counterclockwise arrows button"),
        Emoji("🔙", "BACK arrow"),
        Emoji("🔚", "END arrow"),
        Emoji("🔛", "ON! arrow"),
        Emoji("🔜", "SOON arrow"),
        Emoji("🔝", "TOP arrow"),
        //subgroup: religion
        Emoji("🛐", "place of worship"),
        Emoji("⚛️", "atom symbol"),
        Emoji("🕉️", "om"),
        Emoji("✡️", "star of David"),
        Emoji("☸️", "wheel of dharma"),
        Emoji("☯️", "yin yang"),
        Emoji("✝️", "latin cross"),
        Emoji("☦️", "orthodox cross"),
        Emoji("☪️", "star and crescent"),
        Emoji("☮️", "peace symbol"),
        Emoji("🕎", "menorah"),
        Emoji("🔯", "dotted six-pointed star"),
        //subgroup: zodiac
        Emoji("♈", "Aries"),
        Emoji("♉", "Taurus"),
        Emoji("♊", "Gemini"),
        Emoji("♋", "Cancer"),
        Emoji("♌", "Leo"),
        Emoji("♍", "Virgo"),
        Emoji("♎", "Libra"),
        Emoji("♏", "Scorpio"),
        Emoji("♐", "Sagittarius"),
        Emoji("♑", "Capricorn"),
        Emoji("♒", "Aquarius"),
        Emoji("♓", "Pisces"),
        Emoji("⛎", "Ophiuchus"),
        //subgroup: av-symbol
        Emoji("🔀", "shuffle tracks button"),
        Emoji("🔁", "repeat button"),
        Emoji("🔂", "repeat single button"),
        Emoji("▶️", "play button"),
        Emoji("⏩", "fast-forward button"),
        Emoji("⏭️", "next track button"),
        Emoji("⏯️", "play or pause button"),
        Emoji("◀️", "reverse button"),
        Emoji("⏪", "fast reverse button"),
        Emoji("⏮️", "last track button"),
        Emoji("🔼", "upwards button"),
        Emoji("⏫", "fast up button"),
        Emoji("🔽", "downwards button"),
        Emoji("⏬", "fast down button"),
        Emoji("⏸️", "pause button"),
        Emoji("⏹️", "stop button"),
        Emoji("⏺️", "record button"),
        Emoji("⏏️", "eject button"),
        Emoji("🎦", "cinema"),
        Emoji("🔅", "dim button"),
        Emoji("🔆", "bright button"),
        Emoji("📶", "antenna bars"),
        Emoji("📳", "vibration mode"),
        Emoji("📴", "mobile phone off"),
        //subgroup: gender
        Emoji("♀️", "female sign"),
        Emoji("♂️", "male sign"),
        //subgroup: other-symbol
        Emoji("⚕️", "medical symbol"),
        Emoji("♾️", "infinity"),
        Emoji("♻️", "recycling symbol"),
        Emoji("⚜️", "fleur-de-lis"),
        Emoji("🔱", "trident emblem"),
        Emoji("📛", "name badge"),
        Emoji("🔰", "Japanese symbol for beginner"),
        Emoji("⭕", "hollow red circle"),
        Emoji("✅", "check mark button"),
        Emoji("☑️", "check box with check"),
        Emoji("✔️", "check mark"),
        Emoji("✖️", "multiplication sign"),
        Emoji("❌", "cross mark"),
        Emoji("❎", "cross mark button"),
        Emoji("➕", "plus sign"),
        Emoji("➖", "minus sign"),
        Emoji("➗", "division sign"),
        Emoji("➰", "curly loop"),
        Emoji("➿", "double curly loop"),
        Emoji("〽️", "part alternation mark"),
        Emoji("✳️", "eight-spoked asterisk"),
        Emoji("✴️", "eight-pointed star"),
        Emoji("❇️", "sparkle"),
        Emoji("‼️", "double exclamation mark"),
        Emoji("⁉️", "exclamation question mark"),
        Emoji("❓", "question mark"),
        Emoji("❔", "white question mark"),
        Emoji("❕", "white exclamation mark"),
        Emoji("❗", "exclamation mark"),
        Emoji("〰️", "wavy dash"),
        Emoji("©️", "copyright"),
        Emoji("®️", "registered"),
        Emoji("™️", "trade mark"),
        //subgroup: keycap
        Emoji("#️⃣", "keycap: #"),
        Emoji("*️⃣", "keycap: *"),
        Emoji("0️⃣", "keycap: 0"),
        Emoji("1️⃣", "keycap: 1"),
        Emoji("2️⃣", "keycap: 2"),
        Emoji("3️⃣", "keycap: 3"),
        Emoji("4️⃣", "keycap: 4"),
        Emoji("5️⃣", "keycap: 5"),
        Emoji("6️⃣", "keycap: 6"),
        Emoji("7️⃣", "keycap: 7"),
        Emoji("8️⃣", "keycap: 8"),
        Emoji("9️⃣", "keycap: 9"),
        Emoji("🔟", "keycap: 10"),
        //subgroup: alphanum
        Emoji("🔠", "input latin uppercase"),
        Emoji("🔡", "input latin lowercase"),
        Emoji("🔢", "input numbers"),
        Emoji("🔣", "input symbols"),
        Emoji("🔤", "input latin letters"),
        Emoji("🅰️", "A button (blood type)"),
        Emoji("🆎", "AB button (blood type)"),
        Emoji("🅱️", "B button (blood type)"),
        Emoji("🆑", "CL button"),
        Emoji("🆒", "COOL button"),
        Emoji("🆓", "FREE button"),
        Emoji("ℹ️", "information"),
        Emoji("🆔", "ID button"),
        Emoji("Ⓜ️", "circled M"),
        Emoji("🆕", "NEW button"),
        Emoji("🆖", "NG button"),
        Emoji("🅾️", "O button (blood type)"),
        Emoji("🆗", "OK button"),
        Emoji("🅿️", "P button"),
        Emoji("🆘", "SOS button"),
        Emoji("🆙", "UP! button"),
        Emoji("🆚", "VS button"),
        Emoji("🈁", "Japanese “here” button"),
        Emoji("🈂️", "Japanese “service charge” button"),
        Emoji("🈷️", "Japanese “monthly amount” button"),
        Emoji("🈶", "Japanese “not free of charge” button"),
        Emoji("🈯", "Japanese “reserved” button"),
        Emoji("🉐", "Japanese “bargain” button"),
        Emoji("🈹", "Japanese “discount” button"),
        Emoji("🈚", "Japanese “free of charge” button"),
        Emoji("🈲", "Japanese “prohibited” button"),
        Emoji("🉑", "Japanese “acceptable” button"),
        Emoji("🈸", "Japanese “application” button"),
        Emoji("🈴", "Japanese “passing grade” button"),
        Emoji("🈳", "Japanese “vacancy” button"),
        Emoji("㊗️", "Japanese “congratulations” button"),
        Emoji("㊙️", "Japanese “secret” button"),
        Emoji("🈺", "Japanese “open for business” button"),
        Emoji("🈵", "Japanese “no vacancy” button"),
        //subgroup: geometric
        Emoji("🔴", "red circle"),
        Emoji("🟠", "orange circle"),
        Emoji("🟡", "yellow circle"),
        Emoji("🟢", "green circle"),
        Emoji("🔵", "blue circle"),
        Emoji("🟣", "purple circle"),
        Emoji("🟤", "brown circle"),
        Emoji("⚫", "black circle"),
        Emoji("⚪", "white circle"),
        Emoji("🟥", "red square"),
        Emoji("🟧", "orange square"),
        Emoji("🟨", "yellow square"),
        Emoji("🟩", "green square"),
        Emoji("🟦", "blue square"),
        Emoji("🟪", "purple square"),
        Emoji("🟫", "brown square"),
        Emoji("⬛", "black large square"),
        Emoji("⬜", "white large square"),
        Emoji("◼️", "black medium square"),
        Emoji("◻️", "white medium square"),
        Emoji("◾", "black medium-small square"),
        Emoji("◽", "white medium-small square"),
        Emoji("▪️", "black small square"),
        Emoji("▫️", "white small square"),
        Emoji("🔶", "large orange diamond"),
        Emoji("🔷", "large blue diamond"),
        Emoji("🔸", "small orange diamond"),
        Emoji("🔹", "small blue diamond"),
        Emoji("🔺", "red triangle pointed up"),
        Emoji("🔻", "red triangle pointed down"),
        Emoji("💠", "diamond with a dot"),
        Emoji("🔘", "radio button"),
        Emoji("🔳", "white square button"),
        Emoji("🔲", "black square button")
    )
    val travel = arrayOf(
        //group: Travel & Places
        //subgroup: place-map
        Emoji("🌍", "globe showing Europe-Africa"),
        Emoji("🌎", "globe showing Americas"),
        Emoji("🌏", "globe showing Asia-Australia"),
        Emoji("🌐", "globe with meridians"),
        Emoji("🗺️", "world map"),
        Emoji("🗾", "map of Japan"),
        Emoji("🧭", "compass"),
        //subgroup: place-geographic
        Emoji("🏔️", "snow-capped mountain"),
        Emoji("⛰️", "mountain"),
        Emoji("🌋", "volcano"),
        Emoji("🗻", "mount fuji"),
        Emoji("🏕️", "camping"),
        Emoji("🏖️", "beach with umbrella"),
        Emoji("🏜️", "desert"),
        Emoji("🏝️", "desert island"),
        Emoji("🏞️", "national park"),
        //subgroup: place-building
        Emoji("🏟️", "stadium"),
        Emoji("🏛️", "classical building"),
        Emoji("🏗️", "building construction"),
        Emoji("🧱", "brick"),
        Emoji("🏘️", "houses"),
        Emoji("🏚️", "derelict house"),
        Emoji("🏠", "house"),
        Emoji("🏡", "house with garden"),
        Emoji("🏢", "office building"),
        Emoji("🏣", "Japanese post office"),
        Emoji("🏤", "post office"),
        Emoji("🏥", "hospital"),
        Emoji("🏦", "bank"),
        Emoji("🏨", "hotel"),
        Emoji("🏩", "love hotel"),
        Emoji("🏪", "convenience store"),
        Emoji("🏫", "school"),
        Emoji("🏬", "department store"),
        Emoji("🏭", "factory"),
        Emoji("🏯", "Japanese castle"),
        Emoji("🏰", "castle"),
        Emoji("💒", "wedding"),
        Emoji("🗼", "Tokyo tower"),
        Emoji("🗽", "Statue of Liberty"),
        //subgroup: place-religious
        Emoji("⛪", "church"),
        Emoji("🕌", "mosque"),
        Emoji("🛕", "hindu temple"),
        Emoji("🕍", "synagogue"),
        Emoji("⛩️", "shinto shrine"),
        Emoji("🕋", "kaaba"),
        //subgroup: place-other
        Emoji("⛲", "fountain"),
        Emoji("⛺", "tent"),
        Emoji("🌁", "foggy"),
        Emoji("🌃", "night with stars"),
        Emoji("🏙️", "cityscape"),
        Emoji("🌄", "sunrise over mountains"),
        Emoji("🌅", "sunrise"),
        Emoji("🌆", "cityscape at dusk"),
        Emoji("🌇", "sunset"),
        Emoji("🌉", "bridge at night"),
        Emoji("♨️", "hot springs"),
        Emoji("🎠", "carousel horse"),
        Emoji("🎡", "ferris wheel"),
        Emoji("🎢", "roller coaster"),
        Emoji("💈", "barber pole"),
        Emoji("🎪", "circus tent"),
        //subgroup: transport-ground
        Emoji("🚂", "locomotive"),
        Emoji("🚃", "railway car"),
        Emoji("🚄", "high-speed train"),
        Emoji("🚅", "bullet train"),
        Emoji("🚆", "train"),
        Emoji("🚇", "metro"),
        Emoji("🚈", "light rail"),
        Emoji("🚉", "station"),
        Emoji("🚊", "tram"),
        Emoji("🚝", "monorail"),
        Emoji("🚞", "mountain railway"),
        Emoji("🚋", "tram car"),
        Emoji("🚌", "bus"),
        Emoji("🚍", "oncoming bus"),
        Emoji("🚎", "trolleybus"),
        Emoji("🚐", "minibus"),
        Emoji("🚑", "ambulance"),
        Emoji("🚒", "fire engine"),
        Emoji("🚓", "police car"),
        Emoji("🚔", "oncoming police car"),
        Emoji("🚕", "taxi"),
        Emoji("🚖", "oncoming taxi"),
        Emoji("🚗", "automobile"),
        Emoji("🚘", "oncoming automobile"),
        Emoji("🚙", "sport utility vehicle"),
        Emoji("🚚", "delivery truck"),
        Emoji("🚛", "articulated lorry"),
        Emoji("🚜", "tractor"),
        Emoji("🏎️", "racing car"),
        Emoji("🏍️", "motorcycle"),
        Emoji("🛵", "motor scooter"),
        Emoji("🦽", "manual wheelchair"),
        Emoji("🦼", "motorized wheelchair"),
        Emoji("🛺", "auto rickshaw"),
        Emoji("🚲", "bicycle"),
        Emoji("🛴", "kick scooter"),
        Emoji("🛹", "skateboard"),
        Emoji("🚏", "bus stop"),
        Emoji("🛣️", "motorway"),
        Emoji("🛤️", "railway track"),
        Emoji("🛢️", "oil drum"),
        Emoji("⛽", "fuel pump"),
        Emoji("🚨", "police car light"),
        Emoji("🚥", "horizontal traffic light"),
        Emoji("🚦", "vertical traffic light"),
        Emoji("🛑", "stop sign"),
        Emoji("🚧", "construction"),
        //subgroup: transport-water
        Emoji("⚓", "anchor"),
        Emoji("⛵", "sailboat"),
        Emoji("🛶", "canoe"),
        Emoji("🚤", "speedboat"),
        Emoji("🛳️", "passenger ship"),
        Emoji("⛴️", "ferry"),
        Emoji("🛥️", "motor boat"),
        Emoji("🚢", "ship"),
        //subgroup: transport-air
        Emoji("✈️", "airplane"),
        Emoji("🛩️", "small airplane"),
        Emoji("🛫", "airplane departure"),
        Emoji("🛬", "airplane arrival"),
        Emoji("🪂", "parachute"),
        Emoji("💺", "seat"),
        Emoji("🚁", "helicopter"),
        Emoji("🚟", "suspension railway"),
        Emoji("🚠", "mountain cableway"),
        Emoji("🚡", "aerial tramway"),
        Emoji("🛰️", "satellite"),
        Emoji("🚀", "rocket"),
        Emoji("🛸", "flying saucer"),
        //subgroup: hotel
        Emoji("🛎️", "bellhop bell"),
        Emoji("🧳", "luggage"),
        //subgroup: time
        Emoji("⌛", "hourglass done"),
        Emoji("⏳", "hourglass not done"),
        Emoji("⌚", "watch"),
        Emoji("⏰", "alarm clock"),
        Emoji("⏱️", "stopwatch"),
        Emoji("⏲️", "timer clock"),
        Emoji("🕰️", "mantelpiece clock"),
        Emoji("🕛", "twelve o’clock"),
        Emoji("🕧", "twelve-thirty"),
        Emoji("🕐", "one o’clock"),
        Emoji("🕜", "one-thirty"),
        Emoji("🕑", "two o’clock"),
        Emoji("🕝", "two-thirty"),
        Emoji("🕒", "three o’clock"),
        Emoji("🕞", "three-thirty"),
        Emoji("🕓", "four o’clock"),
        Emoji("🕟", "four-thirty"),
        Emoji("🕔", "five o’clock"),
        Emoji("🕠", "five-thirty"),
        Emoji("🕕", "six o’clock"),
        Emoji("🕡", "six-thirty"),
        Emoji("🕖", "seven o’clock"),
        Emoji("🕢", "seven-thirty"),
        Emoji("🕗", "eight o’clock"),
        Emoji("🕣", "eight-thirty"),
        Emoji("🕘", "nine o’clock"),
        Emoji("🕤", "nine-thirty"),
        Emoji("🕙", "ten o’clock"),
        Emoji("🕥", "ten-thirty"),
        Emoji("🕚", "eleven o’clock"),
        Emoji("🕦", "eleven-thirty"),
        //subgroup: sky & weather
        Emoji("🌑", "new moon"),
        Emoji("🌒", "waxing crescent moon"),
        Emoji("🌓", "first quarter moon"),
        Emoji("🌔", "waxing gibbous moon"),
        Emoji("🌕", "full moon"),
        Emoji("🌖", "waning gibbous moon"),
        Emoji("🌗", "last quarter moon"),
        Emoji("🌘", "waning crescent moon"),
        Emoji("🌙", "crescent moon"),
        Emoji("🌚", "new moon face"),
        Emoji("🌛", "first quarter moon face"),
        Emoji("🌜", "last quarter moon face"),
        Emoji("🌡️", "thermometer"),
        Emoji("☀️", "sun"),
        Emoji("🌝", "full moon face"),
        Emoji("🌞", "sun with face"),
        Emoji("🪐", "ringed planet"),
        Emoji("⭐", "star"),
        Emoji("🌟", "glowing star"),
        Emoji("🌠", "shooting star"),
        Emoji("🌌", "milky way"),
        Emoji("☁️", "cloud"),
        Emoji("⛅", "sun behind cloud"),
        Emoji("⛈️", "cloud with lightning and rain"),
        Emoji("🌤️", "sun behind small cloud"),
        Emoji("🌥️", "sun behind large cloud"),
        Emoji("🌦️", "sun behind rain cloud"),
        Emoji("🌧️", "cloud with rain"),
        Emoji("🌨️", "cloud with snow"),
        Emoji("🌩️", "cloud with lightning"),
        Emoji("🌪️", "tornado"),
        Emoji("🌫️", "fog"),
        Emoji("🌬️", "wind face"),
        Emoji("🌀", "cyclone"),
        Emoji("🌈", "rainbow"),
        Emoji("🌂", "closed umbrella"),
        Emoji("☂️", "umbrella"),
        Emoji("☔", "umbrella with rain drops"),
        Emoji("⛱️", "umbrella on ground"),
        Emoji("⚡", "high voltage"),
        Emoji("❄️", "snowflake"),
        Emoji("☃️", "snowman"),
        Emoji("⛄", "snowman without snow"),
        Emoji("☄️", "comet"),
        Emoji("🔥", "fire"),
        Emoji("💧", "droplet"),
        Emoji("🌊", "water wave")
    )
}