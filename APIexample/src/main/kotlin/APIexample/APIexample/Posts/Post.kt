package APIexample.APIexample.Posts

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Post(
        var userId: Long? = null,
        var ids: Long? = null,
        var title: String? = null,
        var body: String? = null
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null
}