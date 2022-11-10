package com.example.wondriumcodingchallenge.domain.model

import android.net.Uri
import androidx.media2.common.MediaItem

data class VideoItem(
    val contentUri: Uri,
    val mediaItem: MediaItem,
    val name: String
)
