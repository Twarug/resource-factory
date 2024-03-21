package xyz.jpenilla.resourcefactory

import org.gradle.api.provider.ListProperty

fun <T> ListProperty<T>.nullIfEmpty(): List<T>? = if (get().isEmpty()) null else get().toList()
