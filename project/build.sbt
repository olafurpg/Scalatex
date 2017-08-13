unmanagedSources in Compile ++= {
  val root = baseDirectory.value.getParentFile
  (root / "scalatexSbtPlugin" ** "*.scala").get
}

addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.1.0-M1")

addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.19")

addSbtPlugin("com.typesafe.sbt" % "sbt-ghpages" % "0.6.2")

