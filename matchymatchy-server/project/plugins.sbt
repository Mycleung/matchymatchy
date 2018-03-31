resolvers += Classpaths.sbtPluginReleases

// Workaround: coursier has an issue with sbt-native-packager
// https://github.com/coursier/coursier/issues/450
classpathTypes += "maven-plugin"

addSbtPlugin("com.geirsson" % "sbt-scalafmt" % "1.3.0")
addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "1.0.0")
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.5.1")
addSbtPlugin("io.spray" %% "sbt-revolver" % "0.9.0")
addSbtPlugin("com.typesafe.sbt" %% "sbt-native-packager" % "1.2.2")
