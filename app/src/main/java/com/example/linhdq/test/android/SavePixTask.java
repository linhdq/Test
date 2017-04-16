package com.example.linhdq.test.android;

import android.os.AsyncTask;

import com.example.linhdq.test.util.Util;
import com.googlecode.leptonica.android.Pix;

import java.io.File;
import java.io.IOException;

/**
 * @author renard
 */
class SavePixTask extends AsyncTask<Void, Void, File> {
    private final Pix mPix;
    private final File mDir;

    SavePixTask(Pix pix, File dir) {
        mPix = pix;
        mDir = dir;
    }

    @Override
    protected File doInBackground(Void... params) {
        try {
            return Util.savePixToDir(mPix, OCR.ORIGINAL_PIX_NAME, mDir);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            mPix.recycle();
        }

        return null;
    }

}
