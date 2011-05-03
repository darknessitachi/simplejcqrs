package simplejcqrs.commands;

public final class InventoryCommands {
	@SuppressWarnings("serial")
	private static abstract class InventoryCommand extends Command {
		private final String inventoryId;
		public InventoryCommand(String inventoryId) {
			super();
			this.inventoryId = inventoryId;
		}
		public String getInventoryId() {
			return inventoryId;
		}				
	}
	@SuppressWarnings("serial")
	public static class CreateInventoryItem extends InventoryCommand {
		private final String name;

		public CreateInventoryItem(String inventoryId, String name) {
			super(inventoryId);
			this.name = name;
		}

		public String getName() {
			return name;
		}
		
	}
}
