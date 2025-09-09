package com.kotlin.guide

import android.content.Context
import java.io.IOException

object GuideRepository {


    private val SECTION_DATA = listOf(
        Triple(1, "Introduction", "guides/section1_introduction.md"),
        Triple(2, "Getting Started", "guides/section2_getting_started.md"),
        Triple(3, "Basic Syntax", "guides/section3_basic_syntax.md"),
        Triple(4, "Control Flow", "guides/section4_control_flow.md"),
        Triple(5, "Functions", "guides/section5_functions.md"),
        Triple(6, "Classes and Objects", "guides/section6_classes_and_objects.md"),
        Triple(7, "Collections", "guides/section7_collections.md"),
        Triple(8, "Coroutines", "guides/section8_coroutines.md"),
        Triple(9, "Best Practices", "guides/section9_best_practices.md"),
        Triple(10, "Resources", "guides/section10_resources.md"),
        Triple(11, "Conclusion", "guides/section11_conclusion.md")
    )

    fun getGuideSections(context: Context, loadContent: Boolean = true): List<GuideSection> {
        return SECTION_DATA.map { (id, title, filePath) ->
            GuideSection(
                id = id,
                title = title,
                content = if (loadContent) loadMarkdown(context, filePath) else null
            )
        }
    }

    private fun loadMarkdown(context: Context, fileName: String): String {
        return try {
            context.assets.open(fileName).bufferedReader().use { it.readText() }
        } catch (e: IOException) {
            "Error loading content for $fileName: ${e.message}"
        }
    }

    fun getSectionById(context: Context, id: Int): GuideSection? {
        val sectionData = SECTION_DATA.find { it.first == id }
        return sectionData?.let { (sectionId, title, filePath) ->
            GuideSection(
                id = sectionId,
                title = title,
                content = loadMarkdown(context, filePath)
            )
        }
    }
}