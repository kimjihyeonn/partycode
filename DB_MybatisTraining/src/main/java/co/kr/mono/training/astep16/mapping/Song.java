package co.kr.mono.training.astep16.mapping;

public class Song {
	private String albumId;
	private Album album;
	private String songName ;
	private Float playTime ;
	
	
	public Song() {
		
	}


	public Song(String albumId, Album album, String songName, Float playTime) {
		super();
		this.albumId = albumId;
		this.album = album;
		this.songName = songName;
		this.playTime = playTime;
	}


	public String getAlbumId() {
		return albumId;
	}


	public void setAlbumId(String albumId) {
		this.albumId = albumId;
	}


	public Album getAlbum() {
		return album;
	}


	public void setAlbum(Album album) {
		this.album = album;
	}


	public String getSongName() {
		return songName;
	}


	public void setSongName(String songName) {
		this.songName = songName;
	}


	public Float getPlayTime() {
		return playTime;
	}


	public void setPlayTime(Float playTime) {
		this.playTime = playTime;
	}


	@Override
	public String toString() {
		return "Song [albumId=" + albumId + ", album=" + album + ", songName=" + songName + ", playTime=" + playTime
				+ "]";
	}
	
	
	
	
}
