package dontTouchTheWhiteTile;


public class Tile
{

	public int x, y;

	public int animateY;

	public boolean black;

	public Tile(int x, int y, boolean black)
	{
		this.x = x;
		this.y = y;
		this.black = black;
	}

	public boolean pointInTile(int x, int y)
	{
		int width = DontTouchTheWhiteTile.TILE_WIDTH;
		int height = DontTouchTheWhiteTile.TILE_HEIGHT;
		
		return x > this.x * width && x < this.x * width + width && y > this.y * height && y < this.y * height + height;
	}

}
