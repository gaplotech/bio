import java.util.concurrent.Future

/**
 * Created By Gary Lo on 30/3/2018
 * FacebookCoverPhoto.kt
 */
object GapLoTech: SoftwareEngineer(), Passion, ProgrammingLanguage by (Kotlin + Swift + Scala + Javascript) {

    fun write(): Future<Article> {
        return releaseEnergy()
            .exceptionally { throw GapShouldGoSleepException() }
            .thenApply { energy ->
                when(energy.type) {
                    is Work -> Experiences(
                        energy on FunctionalProgramming withLanguage Scala `for` "training declarative mindset",
                        energy on ReactiveProgramming withLanguage (Kotlin + Swift) `for` "training reactive mindset",
                        energy on Akka withLanguage Scala `for` "building highly concurrent & fault tolerant & distributed system",
                        energy on Coroutine withLanguage Kotlin `for` "building low latency & efficient application",
                        energy on (Mobile withPattern MVVM)
                            withTool (RxKotlin + RxSwift) `for` "building reactive mobile apps"
                    )

                    is Leisure -> Experiences(
                        energy on SideProject withLanguage Javascript `for` "fun",
                        energy on ModernWeb withTool (React + Vue + Babel + Webpack) `for` "progressive web app",
                        energy on Ops withTool (Docker + Kubernetes + GitLabCI) `for` "scaling & automation"
                    )
                }
            }
            .thenApply { experience -> Inspiration(source = experience) }
            .thenApply { inspiration -> Article(inspiration) }
    }

}

fun main(args: Array<String>){
    GapLoTech.write()
}