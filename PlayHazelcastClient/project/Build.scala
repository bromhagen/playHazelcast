import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "playHazelcastClient"
  val appVersion      = "3.1.6"

  val appDependencies = Seq(
    "com.hazelcast" % "hazelcast-client" % "3.1.6",
    "com.hazelcast" % "hazelcast-cloud" % "3.1.6"
  )


  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here      
  )

}
