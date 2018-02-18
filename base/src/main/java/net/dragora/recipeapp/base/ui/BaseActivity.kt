package net.dragora.recipeapp.base.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import net.dragora.recipeapp.base.RecipeApplication
import net.dragora.recipeapp.base.di.ApplicationProvider

/**
 * Created by luigipapino on 18/02/2018.
 */
abstract class BaseActivity(private val layoutId: Int? = null) : AppCompatActivity(),
        ApplicationProvider {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        layoutId?.let {
            setContentView(it)
        }
    }

    override fun provideApp(): RecipeApplication = application as RecipeApplication
}