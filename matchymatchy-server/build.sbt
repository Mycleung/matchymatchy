name := "matchymatchy-server"
organization := "io.github.mycleung"
version := "0.0.1"
scalaVersion := "2.12.4"
scalacOptions := Seq("-unchecked", "-feature", "-deprecation", "-encoding", "utf8")

resolvers += Resolver.jcenterRepo

libraryDependencies ++= {
  val catsV          = "1.0.1"
  val akkaHttpV      = "10.1.0-RC2"
  val akkaHttpCirceV = "1.20.0-RC2"
  val circeV         = "0.9.1"
  val ficusV         = "1.4.3"
  val scalaMockV     = "3.6.0"
  val catsScalatestV = "2.3.1"

  Seq(
    "org.typelevel"     %% "cats-core"                   % catsV,
    "com.iheart"        %% "ficus"                       % ficusV,
    "com.typesafe.akka" %% "akka-http"                   % akkaHttpV,
    "de.heikoseeberger" %% "akka-http-circe"             % akkaHttpCirceV,
    "io.circe"          %% "circe-core"                  % circeV,
    "io.circe"          %% "circe-generic"               % circeV,
    "io.circe"          %% "circe-parser"                % circeV,
    "org.scalamock"     %% "scalamock-scalatest-support" % scalaMockV     % "it,test",
    "com.ironcorelabs"  %% "cats-scalatest"              % catsScalatestV % "it,test",
    "com.typesafe.akka" %% "akka-http-testkit"           % akkaHttpV      % "it,test"
  )
}

lazy val root = project.in(file(".")).configs(IntegrationTest)
Defaults.itSettings
enablePlugins(JavaAppPackaging)
coverageEnabled := true

initialCommands := """
  import cats._
  import cats.data._
  import cats.implicits._
  import akka.actor._
  import akka.pattern._
  import akka.util._
  import scala.concurrent._
  import scala.concurrent.duration._
""".stripMargin
