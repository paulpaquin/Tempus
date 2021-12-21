package main.java.tiles.walls;

import main.java.gfx.Assets;
import main.java.tiles.Tile;

public class WallTopRightChannelTile extends Tile {

	public WallTopRightChannelTile(int id) {
		super(Assets.wallTopRightChannel, id);
	}
	
	@Override
	public boolean isSolid() {
		return true;
	}

}