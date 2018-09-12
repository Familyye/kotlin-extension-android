package cn.maizz.kotlin.extension.android.widget

import android.view.KeyEvent
import android.view.inputmethod.EditorInfo
import android.widget.EditText
import android.widget.TextView

interface KIExtensionEditView : KIExtensionTextView {

    fun EditText.onImeAction(actionListener: (textView: TextView, actionId: Int, keyEvent: KeyEvent?) -> Boolean) = this.setOnEditorActionListener { v, actionId, event -> return@setOnEditorActionListener actionListener(v, actionId, event) }
    fun EditText.onImeAction(actionListener: TextView.OnEditorActionListener) = this.onImeActionDone { textView, actionId, keyEvent -> actionListener.onEditorAction(textView, actionId, keyEvent) }

    fun EditText.onImeActionDone(actionListener: (textView: TextView, actionId: Int, keyEvent: KeyEvent?) -> Boolean) = this.setOnEditorActionListener { v, actionId, event -> return@setOnEditorActionListener if (actionId == EditorInfo.IME_ACTION_DONE) actionListener(v, actionId, event) else false }
    fun EditText.onImeActionDone(actionListener: TextView.OnEditorActionListener) = this.onImeActionDone { textView, actionId, keyEvent -> actionListener.onEditorAction(textView, actionId, keyEvent) }

    fun EditText.onImeActionNext(actionListener: (textView: TextView, actionId: Int, keyEvent: KeyEvent?) -> Boolean) = this.setOnEditorActionListener { v, actionId, event -> return@setOnEditorActionListener if (actionId == EditorInfo.IME_ACTION_NEXT) actionListener(v, actionId, event) else false }
    fun EditText.onImeActionNext(actionListener: TextView.OnEditorActionListener) = this.onImeActionDone { textView, actionId, keyEvent -> actionListener.onEditorAction(textView, actionId, keyEvent) }

    fun EditText.onImeActionSend(actionListener: (textView: TextView, actionId: Int, keyEvent: KeyEvent?) -> Boolean) = this.setOnEditorActionListener { v, actionId, event -> return@setOnEditorActionListener if (actionId == EditorInfo.IME_ACTION_SEND) actionListener(v, actionId, event) else false }
    fun EditText.onImeActionSend(actionListener: TextView.OnEditorActionListener) = this.onImeActionDone { textView, actionId, keyEvent -> actionListener.onEditorAction(textView, actionId, keyEvent) }

    fun EditText.onImeActionSearch(actionListener: (textView: TextView, actionId: Int, keyEvent: KeyEvent?) -> Boolean) = this.setOnEditorActionListener { v, actionId, event -> return@setOnEditorActionListener if (actionId == EditorInfo.IME_ACTION_SEARCH) actionListener(v, actionId, event) else false }
    fun EditText.onImeActionSearch(actionListener: TextView.OnEditorActionListener) = this.onImeActionDone { textView, actionId, keyEvent -> actionListener.onEditorAction(textView, actionId, keyEvent) }

    fun EditText.onImeActionGo(actionListener: (textView: TextView, actionId: Int, keyEvent: KeyEvent?) -> Boolean) = this.setOnEditorActionListener { v, actionId, event -> return@setOnEditorActionListener if (actionId == EditorInfo.IME_ACTION_GO) actionListener(v, actionId, event) else false }
    fun EditText.onImeActionGo(actionListener: TextView.OnEditorActionListener) = this.onImeActionDone { textView, actionId, keyEvent -> actionListener.onEditorAction(textView, actionId, keyEvent) }

}