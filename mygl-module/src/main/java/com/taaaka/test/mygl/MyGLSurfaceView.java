package com.taaaka.test.mygl;

import android.content.Context;
import android.opengl.GLSurfaceView;

/**
 * Created by taaaka on 2017/10/07.
 */

public class MyGLSurfaceView extends GLSurfaceView {

    public MyGLSurfaceView(Context context) {
        super(context);

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void onPause() {
        super.onPause();
    }
}
