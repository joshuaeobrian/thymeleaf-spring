package com.tiy.match;

/**
 * Created by josh on 4/11/17.
 */
public class Image {
	private String imageName;
	private String fileType;

	public Image(String imageName, String fileType) {
		this.imageName = imageName;
		this.fileType = fileType;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
}
