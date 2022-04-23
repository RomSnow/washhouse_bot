import sbt._

object Dependencies {
  lazy val catsEffects = "org.typelevel" %% "cats-effect" % "3.3.9"

  lazy val doobie = Seq(
    // Start with this one
    "org.tpolecat" %% "doobie-core"      % "1.0.0-RC1",

    // And add any of these as needed
    "org.tpolecat" %% "doobie-h2"        % "1.0.0-RC1",          // H2 driver 1.4.200 + type mappings.
    "org.tpolecat" %% "doobie-hikari"    % "1.0.0-RC1",          // HikariCP transactor.
    "org.tpolecat" %% "doobie-postgres"  % "1.0.0-RC1",          // Postgres driver 42.3.1 + type mappings.
    "org.tpolecat" %% "doobie-specs2"    % "1.0.0-RC1" % "test", // Specs2 support for typechecking statements.
    "org.tpolecat" %% "doobie-scalatest" % "1.0.0-RC1" % "test"  // ScalaTest support for typechecking statements.
  )

  lazy val pureConfig = "com.github.pureconfig" %% "pureconfig" % "0.17.1"
}
