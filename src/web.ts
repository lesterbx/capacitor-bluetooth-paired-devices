import { registerWebPlugin, WebPlugin } from '@capacitor/core'
import { BluetoothPairedDevicesPlugin, PairedDevices } from './definitions'

export class BluetoothPairedDevicesWeb extends WebPlugin implements BluetoothPairedDevicesPlugin {
  constructor() {
    super({
      name: 'BluetoothPairedDevices',
      platforms: ['web'],
    })
  }

  getPairedDevices(): PairedDevices {
    throw new Error('Not implemented on web.')
  }
}

const BluetoothPairedDevices = new BluetoothPairedDevicesWeb()

export { BluetoothPairedDevices }

registerWebPlugin(BluetoothPairedDevices)
