import Foundation
import Capacitor

/**
 * Please read the Capacitor iOS Plugin Development Guide
 * here: https://capacitorjs.com/docs/plugins/ios
 */
@objc(BluetoothPairedDevices)
public class BluetoothPairedDevices: CAPPlugin {

    @objc func getPairedDevices(_ call: CAPPluginCall) {
        call.unimplemented("Not implemented on iOS.")
    }
    
}
