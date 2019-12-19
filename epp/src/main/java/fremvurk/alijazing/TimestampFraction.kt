package fremvurk.alijazing

import java.util.concurrent.TimeUnit
import kotlin.math.roundToLong

sealed class TimestampFraction {
    abstract val timestamp: String
    abstract val secondFraction: Float

    class ByTimestamp(override val timestamp: String) : TimestampFraction() {
        override val secondFraction: Float
            get() {
                val fractionList = timestamp.split(":").map { it.toFloat() }

                val (hours, minutes, seconds) = if (fractionList.size > 2) {
                    fractionList
                } else {
                    fractionList.toMutableList().apply { add(0, 0f) }
                }
                return hours * HOURS_FRACTION + minutes * MINUTES_FRACTION + seconds
            }
    }

    class ByFraction(override val secondFraction: Float) : TimestampFraction() {
        override val timestamp: String
            get() {
                val roundedSecondFraction = secondFraction.roundToLong()
                val hours = TimeUnit.SECONDS.toHours(roundedSecondFraction)
                val minutes =
                    TimeUnit.SECONDS.toMinutes(roundedSecondFraction) - MINUTES_FRACTION * hours
                val seconds = TimeUnit.SECONDS.toSeconds(roundedSecondFraction) -
                        HOURS_FRACTION * hours -
                        MINUTES_FRACTION * minutes
                return formatTimestamp(
                    hours,
                    minutes.toLong(),
                    seconds.toLong()
                )
            }
    }

    protected fun formatTimestamp(hours: Long, minutes: Long, seconds: Long): String =
        if (hours > 0) {
            "$hours:${minutes.padZeros(2)}:${seconds.padZeros(2)}"
        } else {
            "$minutes:${seconds.padZeros(2)}"
        }

    private fun Number.padZeros(zeroAmount: Int): String = toString().padStart(zeroAmount, '0')

    companion object {
        private const val HOURS_FRACTION = 3600f
        private const val MINUTES_FRACTION = 60f
    }
}

@Suppress("FunctionName")
fun TimestampFraction(timestamp: String) = TimestampFraction.ByTimestamp(timestamp)

@Suppress("FunctionName")
fun TimestampFraction(secondFraction: Float) = TimestampFraction.ByFraction(secondFraction)