import kotlinx.serialization.Serializable

@Serializable
data class Account(
    val userId: Long,
    val amount: Double
)