package com.example.notestakingapp.ui.fragments

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.notestakingapp.R
import kotlin.Int

public class NoteListFragmentDirections private constructor() {
  private data class ActionNoteListFragmentToNoteDetailFragment(
    public val noteId: Int = -1,
  ) : NavDirections {
    public override val actionId: Int = R.id.action_noteListFragment_to_noteDetailFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putInt("noteId", this.noteId)
        return result
      }
  }

  public companion object {
    public fun actionNoteListFragmentToAddNoteFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_noteListFragment_to_addNoteFragment)

    public fun actionNoteListFragmentToNoteDetailFragment(noteId: Int = -1): NavDirections =
        ActionNoteListFragmentToNoteDetailFragment(noteId)
  }
}
