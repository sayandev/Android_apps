package com.example.prelim_template;

import java.io.File;
import android.os.Environment;

public final class BaseAlbumDirFactory extends AlbumStorageDirFactory {
	// Standard storage location for digital camera files
	private static final String CAMERA_DIR = "/dcim/";
	@Override
	public File getAlbumStorageDir(String albumName) {
		// TODO Auto-generated method stub
		return new File (
				Environment.getExternalStorageDirectory()
				+ CAMERA_DIR
				+ albumName
		);
	}

}
