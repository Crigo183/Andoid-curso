package net.warmling.aula2;

import android.graphics.Bitmap;

public class RssItem {
	
	private String title;
	
	private String description;
	
	private String date;
	
	private String imageUrl;
	
	private String link;
	
	private Bitmap image;

	public Bitmap getImage() {
		return image;
	}

	public void setImage(Bitmap image) {
		this.image = image;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String iageUrl) {
		this.imageUrl = iageUrl;
	}
	
	

}
