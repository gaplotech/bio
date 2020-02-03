package kotlin

import java.util.concurrent.CompletableFuture

abstract class Human {
    fun releaseEnergy(): CompletableFuture<Energy> = TODO()
}

open class SoftwareEngineer: Human()

interface Passion

// programming related
interface ProgrammingLanguage {
    operator fun plus(lang: ProgrammingLanguage): ProgrammingLanguage { TODO() }
}

object Kotlin: ProgrammingLanguage
object Swift: ProgrammingLanguage
object Scala: ProgrammingLanguage
object Javascript: ProgrammingLanguage


interface Experience {
    infix fun `for`(purpose: Any): Experience { TODO() }
}
class Experiences(vararg e: Experience): Experience

data class Inspiration(val source: Experience)
data class Article(val inspiration: Inspiration)


class Energy(val type: EnergyType) {
    infix fun on(sth: EnergyConsumption): Energy { TODO() }
    infix fun withLanguage(lang: ProgrammingLanguage): Experience { TODO() }
    infix fun withTool(tool: SoftwareEngineeringComponent): Experience { TODO() }
}

sealed class EnergyType
object Work: EnergyType()
object Leisure: EnergyType()

interface EnergyConsumption
interface SoftwareEngineeringComponent: EnergyConsumption  {
    operator fun plus(lang: SoftwareEngineeringComponent): SoftwareEngineeringComponent { TODO() }
}

object FunctionalProgramming: EnergyConsumption
object ReactiveProgramming : EnergyConsumption
object SideProject: EnergyConsumption
object Akka: EnergyConsumption
object Coroutine: EnergyConsumption
object Ops: EnergyConsumption
object ModernWeb: EnergyConsumption
object Mobile: EnergyConsumption {
    infix fun withPattern(pattern: SoftwareEngineeringComponent): EnergyConsumption { TODO() }
}

object RxKotlin: SoftwareEngineeringComponent
object RxSwift: SoftwareEngineeringComponent
object Docker: SoftwareEngineeringComponent
object Kubernetes: SoftwareEngineeringComponent
object GitLabCI: SoftwareEngineeringComponent
object MVVM: SoftwareEngineeringComponent
object React: SoftwareEngineeringComponent
object Vue: SoftwareEngineeringComponent
object Babel: SoftwareEngineeringComponent
object Webpack: SoftwareEngineeringComponent

class GapShouldGoSleepException: Exception()
