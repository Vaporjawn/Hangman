package com.hangman.backend.listeners;

import com.hangman.backend.events.ThreadEvent;

public interface ThreadListener {
	public void threadAction(ThreadEvent t);
}
