interface Bucket {
    fun fill()
    fun drainAway()
    fun pourTo(that: Bucket)

    val capacity: Int
    var quantity: Int
}

class BucketImpl(_capacity: Int) : Bucket {
    override val capacity = _capacity

    override var quantity: Int = 0

    override fun fill() {
        quantity = capacity
    }

    override fun drainAway() {
        quantity = 0
    }

    override fun pourTo(that: Bucket) {
        val thatVacuity = that.capacity - that.quantity
        if (capacity <= thatVacuity) {
            that.quantity += capacity
            drainAway()
        }
        else {
            that.fill()
            quantity -= thatVacuity
        }
    }
}
