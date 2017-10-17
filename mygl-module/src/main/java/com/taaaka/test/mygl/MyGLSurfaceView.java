package com.taaaka.test.mygl;

import android.content.Context;
import android.opengl.GLSurfaceView;

import com.taaaka.test.mygl.renderer.MyGLRenderer;

/**
 * Created by taaaka on 2017/10/07.
 */

public class MyGLSurfaceView extends GLSurfaceView {

    private MyGLRenderer mRenderer;

    public MyGLSurfaceView(Context context) {
        super(context);

        mRenderer = new MyGLRenderer();
        setRenderer(mRenderer);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void onPause() {
        super.onPause();
    }
}
