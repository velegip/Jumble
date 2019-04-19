package com.morlunk.jumble.util;

/**
 * Called when a
 */

public class JumbleDisconnectedException extends RuntimeException {
    public JumbleDisconnectedException() {
        super("Caller attempted to use the protocol while disconnected.");
    }

    public JumbleDisconnectedException(String reason) {
        super(reason);
    }
}
