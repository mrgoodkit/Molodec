package ClassTest

class Car(
    val nameOfCar: String,
    val maxSpeed: Int,
    var speed: Int,
    val gasTank: Int,
    val passangerSeat: Int,
    var bluetoothPlayer: Boolean = false,
) {
    fun driveNormally() {
        println("car $nameOfCar driving normally")
        speed = 60

    }

    fun driveFast() {
        println("flying $nameOfCar")
        speed = maxSpeed
    }

    fun addBluetoothAdapter() {
        bluetoothPlayer = true


    }


}




