package pl.edu.pw.elka.gatekeeper.db.dto.event;


public enum ServerEvent {

	CONNECTED("connected"), DISCONNECTED("disconnected"),

	UNLOCK_DOOR("unlock_door"), LOCK_DOOR("lock_door"),

	UNLOCKED_DOOR("unlocked_door"), LOCKED_DOOR("locked_door");

	public final String event;

	ServerEvent(String event) {
		this.event = event;
	}
}
