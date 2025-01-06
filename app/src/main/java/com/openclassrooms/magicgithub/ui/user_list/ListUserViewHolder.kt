package com.openclassrooms.magicgithub.ui.user_list

import android.graphics.Color
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.openclassrooms.magicgithub.R
import com.openclassrooms.magicgithub.databinding.ItemListUserBinding
import com.openclassrooms.magicgithub.model.User

class ListUserViewHolder(private val binding: ItemListUserBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(user: User, callback: UserListAdapter.Listener) {
        // Background selon l'état
        binding.root.setBackgroundColor(
            if (user.isActive)
                Color.WHITE
            else
                Color.parseColor("#FFCDD2") // Rouge clair
        )

        // Image de profil
        Glide.with(itemView.context)
            .load(user.avatarUrl)
            .apply(RequestOptions.circleCropTransform())
            .into(binding.itemListUserAvatar)

        // Nom d'utilisateur
        binding.itemListUserUsername.text = user.login

        // Bouton supprimer
        binding.itemListUserDeleteButton.setOnClickListener {
            callback.onClickDelete(user)
        }
    }
}