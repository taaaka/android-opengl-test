package com.taaaka.sample.opengl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.taaaka.test.mygl.MyGLSurfaceView;

/**
 * Created by taaaka on 2017/10/07.
 */
public class MainActivity extends AppCompatActivity {

    private MyGLSurfaceView mGLView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mGLView = new MyGLSurfaceView(this);
        setContentView(mGLView);
    }
}
