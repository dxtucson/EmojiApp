package com.test.emoji

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.test.emoji.emojis.Emoji
import com.test.emoji.emojis.EmojiWithSkinTone
import com.test.emoji.emojis.Emojis
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_emoji.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = EmojiAdapter()
    }

    internal class EmojiAdapter() : RecyclerView.Adapter<EmojiHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmojiHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item_emoji, parent, false)
            return EmojiHolder(view)
        }

        override fun getItemCount() = Emojis.people.size

        override fun onBindViewHolder(holder: EmojiHolder, position: Int) {
            holder.emoji.text = if (  Emojis.people[position] is EmojiWithSkinTone)  {
                (Emojis.people[position] as EmojiWithSkinTone).variations[3].emoji
            } else {
                Emojis.people[position].emoji
            }
        }
    }

    class EmojiHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val emoji = itemView.emoji
    }
}
