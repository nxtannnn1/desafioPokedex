package com.natan.pokedexapp.domain.model

import com.natan.pokedexapp.domain.enums.ELEMENT

data class Pokemon(
    val id: Long? = null,
    val name: String = "",
    val element: ELEMENT = ELEMENT.NORMAL,
    val url: String? = null
) {


}