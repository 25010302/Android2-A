package com.example.weak11;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class StaticReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action != null) {
            if (action.equals(Intent.ACTION_POWER_CONNECTED)) {
                BatteryFragement.textView.setText(BatteryFragement.textView.getText() +
                        "\n [정적] 전원 연결됨");
            } else if (action.equals(Intent.ACTION_POWER_DISCONNECTED)) {
                BatteryFragement.textView.setText(BatteryFragement.textView.getText() +
                        "\n [정적] 전원 해제됨");
            }
        }
    }
}