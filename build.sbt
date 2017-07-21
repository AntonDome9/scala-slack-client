organization := "com.igeolise"

name := "slack-client"

scalacOptions ++= Seq(
  "-feature",
  "-deprecation",
  "-unchecked",
  "-Xfatal-warnings",
  "-Xlint",
  "-Yno-adapted-args",
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Ywarn-value-discard"
)

libraryDependencies ++= Seq(
  "com.typesafe.play"       %% "play-json"     % "2.6.2",
  "net.databinder.dispatch" %% "dispatch-core" % "0.13.1",
  "org.apache.commons"      %  "commons-lang3" % "3.6",
  "org.scalatest"           %% "scalatest"     % "3.0.3"    % Test,
  "org.scalacheck"          %% "scalacheck"    % "1.13.5"   % Test
)