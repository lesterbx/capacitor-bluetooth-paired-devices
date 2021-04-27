package com.capacitor.paired;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;

import com.getcapacitor.JSArray;
import com.getcapacitor.JSObject;
import com.getcapacitor.NativePlugin;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;

import java.util.ArrayList;
import java.util.List;

@NativePlugin
public class BluetoothPairedDevices extends Plugin {

    @PluginMethod
    public void getPairedDevices(PluginCall call) {
        List<BluetoothDevice> devices = new ArrayList<>(BluetoothAdapter.getDefaultAdapter().getBondedDevices());

        JSArray jsDevices = new JSArray();
        for (BluetoothDevice device : devices) {
            JSObject jsDevice = new JSObject();
            jsDevice.put("name", device.getName());
            jsDevice.put("address", device.getAddress());

            jsDevices.put(jsDevice);
        }

        JSObject response = new JSObject();
        response.put("devices", jsDevices);
        call.resolve(response);
    }
}
