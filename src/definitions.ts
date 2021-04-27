declare module '@capacitor/core' {
  interface PluginRegistry {
    BluetoothPairedDevices: BluetoothPairedDevicesPlugin;
  }
}

export interface BluetoothPairedDevicesPlugin {
  getPairedDevices(): Promise<PairedDevices>
}

export interface PairedDevices {
  devices: BluetoothDevice[]
}

export interface BluetoothDevice {
  address: string
  name: string
}

