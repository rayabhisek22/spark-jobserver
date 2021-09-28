resolvers += Classpaths.sbtPluginReleases

resolvers += "Typesafe Releases" at "https://repo.typesafe.com/typesafe/releases/"

resolvers ++= Seq(
  "Typesafe" at "https://repo.typesafe.com/typesafe/releases/",
  "Java.net Maven2 Repository" at "https://download.java.net/maven/2/",
  "Artifactory" at "https://sparkjobserver.jfrog.io/artifactory/jobserver/",
  "Typesafe Releases" at "https://repo.typesafe.com/typesafe/releases/"
)

addSbtPlugin("com.github.sbt" % "sbt-pgp" % "2.1.2")

addSbtPlugin("com.jsuereth" % "sbt-pgp" % "2.1.1")

addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.3.4")

addSbtPlugin("io.spray" % "sbt-revolver" % "0.9.1")       // For quick restarts for web development

addSbtPlugin("org.scalariform" % "sbt-scalariform" % "1.8.2")

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.7")

addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "1.0.0")

addSbtPlugin("org.scoverage" %% "sbt-scoverage" % "1.5.1")

addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.9")
