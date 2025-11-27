package ClassTest

fun main() {
    val toyota: Car = Car(
        nameOfCar = "Toyota",
        maxSpeed = 220,
        speed = 0,
        gasTank = 60,
        passangerSeat = 5,
        bluetoothPlayer = true,
        )
    val bmw: Car = Car(
        nameOfCar = "BMW",
        maxSpeed = 250,
        speed = 0,
        gasTank = 70,
        passangerSeat = 4,
        )


    println(toyota.gasTank)
    println(bmw.speed)
    bmw.bluetoothPlayer = true
    println("Bletooth BMW: ${bmw.bluetoothPlayer}")

    println("Following Toyota")
    toyota.driveNormally()
    println(toyota.speed)

    println("Following BMW")
    bmw.driveFast()
    println(bmw.speed)


}
