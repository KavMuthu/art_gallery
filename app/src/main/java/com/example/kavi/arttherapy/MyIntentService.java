package com.example.kavi.arttherapy;

import android.app.IntentService;
import android.content.Intent;
import android.graphics.Paint;
import android.media.MediaPlayer;

/**
 * Created by Kavi on 2/25/16.
 */
public class MyIntentService extends IntentService {
    public MediaPlayer mp;

    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     *
     */

    public MyIntentService() {
        super("MyIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {

        //play eraser audio
            mp = MediaPlayer.create(MyIntentService.this,
                    R.raw.eraser);
            mp.setLooping(false);
            mp.start();
    }

}
