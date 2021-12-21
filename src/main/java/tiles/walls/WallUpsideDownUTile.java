package main.java.tiles.walls;

import main.java.gfx.Assets;
import main.java.tiles.Tile;

public class WallUpsideDownUTile extends Tile {

	public WallUpsideDownUTile(int id) {
		super(Assets.wallUpsideDownU, id);
	}
	
	@Override
	public boolean isSolid() {
		return true;
	}

}