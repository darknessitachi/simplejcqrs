package simplejcqrs.events;

public final class HouseEvents {
	public static class HouseCreated extends Event {
		private final String address;

		public HouseCreated(String address) {
			super();
			this.address = address;
		}		
	}
}
