package main.java.tiles.walls;

import main.java.gfx.Assets;
import main.java.tiles.Tile;

public class WallShadedTile extends Tile {

	public WallShadedTile(int id) {
		super(Assets.wallShaded, id);
	}
	
	@Override
	public boolean isSolid() {
		return true;
	}

}