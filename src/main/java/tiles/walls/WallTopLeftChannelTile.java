package main.java.tiles.walls;

import main.java.gfx.Assets;
import main.java.tiles.Tile;

public class WallTopLeftChannelTile extends Tile {

	public WallTopLeftChannelTile(int id) {
		super(Assets.wallTopLeftChannel, id);
	}
	
	@Override
	public boolean isSolid() {
		return true;
	}

}