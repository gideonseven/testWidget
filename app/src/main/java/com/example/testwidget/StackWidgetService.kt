package com.example.testwidget

import android.content.Intent
import android.widget.RemoteViewsService


/**
 * Created by gideon on 31 October 2022
 * gideon@cicil.co.id
 * https://www.cicil.co.id/
 */
class StackWidgetService : RemoteViewsService() {
    override fun onGetViewFactory(intent: Intent): RemoteViewsFactory =
        StackRemoteViewsFactory(this.applicationContext)


}