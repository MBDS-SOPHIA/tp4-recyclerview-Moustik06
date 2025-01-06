package com.openclassrooms.magicgithub.utils

interface ItemTouchHelperAdapter {
    fun onItemMove(fromPosition: Int, toPosition: Int): Boolean
    fun onItemSwiped(position: Int)
}